package com.ejemplo.calculadora;
import java.util.Scanner;
public class Calculadora {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double num1,num2;
		System.out.println("Introduce un número");
		num1=sc.nextDouble();
		System.out.println("Introduce otro número");
		num2=sc.nextDouble();
		

		
	}
	public static double Sumar(double num1,double num2) {
		return num1+num2;
	}
	public static double Restar(double num1,double num2) {
		return num1-num2;
	}
	
		
	
	
}
