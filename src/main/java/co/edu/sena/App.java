package co.edu.sena;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        System.err.println("Calcular el area de un triángulo");
        System.err.println("ingresa la base del triángulo: ");

        Scanner src = new Scanner(System.in);
        double base = src.nextDouble();
        System.err.println("ingresa la altura del triángulo: ");
        double height = src.nextDouble();

        double result = (base * height) / 2;

        System.err.println("El area del triángulo es: " + result);
    }
}
