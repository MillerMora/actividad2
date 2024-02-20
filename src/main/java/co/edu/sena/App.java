package co.edu.sena;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        // primer punto
        System.err.println("Calcular el area de un triángulo");
        System.err.println("ingresa la base del triángulo: ");

        Scanner src = new Scanner(System.in);
        double base = src.nextDouble();
        System.err.println("ingresa la altura del triángulo: ");
        double height = src.nextDouble();

        double result = (base * height) / 2;

        System.err.println("El area del triángulo es: " + result);

        // segundo punto

        System.err.println("Suma de dos numeros");
        System.err.println("ingresa el primer numero: ");
        
        Scanner addition = new Scanner(System.in);
        float number1 = addition.nextFloat();
        System.err.println("Ingresa el segundo numero: ");
        float number2 = addition.nextFloat();

        float result1 = number1 + number2 ;

        System.err.println("La suma de los 2 numeros es: " + result1 );


    }
}
