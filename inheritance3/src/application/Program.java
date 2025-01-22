package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>(); //ler a quantidade N de funcionários e guardar em uma lista
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) { //criando a lista de funcionários com os dados digitados
			System.out.println("Employee #" + i + " data: ");
			System.out.print("Outsourced(y/n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
				if (ch == 'y') {
					System.out.print("Additional charge: ");
					double additionalCharge = sc.nextDouble();
					list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge)); //adicionando os dados para a lista
				}
				else { 
					list.add(new Employee(name, hours, valuePerHour)); //adicionando os dados para a lista 
				}
				
		}	
		
		System.out.println();
		System.out.println("PAYMENTS:");
		for (Employee emp : list) { //for each para percorrer a lista e entregar os resultados como nome e salário do funcionário
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));//nome e salário do funcionário
		}
		sc.close();
	}
}
