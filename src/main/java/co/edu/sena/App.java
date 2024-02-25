package co.edu.sena;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        // primer punto
        System.err.println("Calcular el área de un triángulo");
        System.err.println("ingresa la base del triángulo: ");

        Scanner src = new Scanner(System.in);
        double base = src.nextDouble();
        System.err.println("ingresa la altura del triángulo: ");
        double height = src.nextDouble();

        double result = (base * height) / 2;

        System.err.println("El área del triángulo es: " + result + "\n");

        // segundo punto
        System.err.println("Suma de dos números");
        System.err.println("Ingresa el primer número: ");

        float number1 = src.nextFloat();

        System.err.println("Ingresa el segundo número: ");
        float number2 = src.nextFloat();

        float result1 = number1 + number2 ;
        System.err.println("La suma de los 2 números es: " + result1 + "\n");

        // Tercer punto

        System.err.println("Número elevado al cuadrado");
        System.err.println("Ingrese un número: ");
        double number3 = src.nextDouble();

        double result3 = Math.pow(number3, 2);

        System.err.println("El resultado es:" + result3 + "\n");

        // Cuarto punto

        System.err.println("Conversión de euros a dólares");
        System.err.println("Ingrese la cantidad de euros a convertir en dólares:");
        double euro = src.nextDouble();

        double dolar = 1.08 ;
        double result4 = euro * dolar;

        System.err.println(euro + " euros es igual a " + result4 + " dólares" + "\n");
        
        // Quinto punto

        System.err.println("Hallar perímetro y área");
        System.err.println("Ingrese el valor de un lado: ");

        double side = src.nextDouble();

        double area = side * side ;
        double perimeter = 4 * side;
        
        System.err.println("El área del cuadrado es: " + area);
        System.err.println("El perímetro del cuadrado es: " + perimeter + "\n");

        // Sexto punto

        

    }
    
}
