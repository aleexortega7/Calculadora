package com.ejemplo.calculadora;
import java.util.Scanner;
public class Calculadora {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double num1,num2;
		int suma, resta, multiplicaion, division;
		System.out.println("Introduce un número");
		num1=sc.nextDouble();
		System.out.println("Introduce otro número");
		num2=sc.nextDouble();
		suma=Sumar(num1,num2);

		
	}
	public static double Sumar(double num1,double num2) {
		return num1+num2;
	}
	public static double Restar(double num1,double num2) {
		return num1-num2;
	}
	public static double Multiplicar(double num1,double num2) {
		return num1*num2;
	}
	
	public static double Dividir(double num1,double num2) {
		if (num2 == 0) {
			throw new IllegalArgumentException("No se puede dividir entre cero");
			}
		return num1/num2;
	}
	
	
}
