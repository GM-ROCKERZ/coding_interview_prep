package DesignPatterns.factorypattern;

import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        try
        {
            System.out.println("\n1. Addition(+)\n2. Subtraction(-)\n3. Multiplication(*).");
            System.out.println("\n\n Select your Operation(1-3)");
            int choice = scan.nextInt();
            System.out.println("Enter First operand : ");
            double operand1 = scan.nextDouble();
            System.out.println("Enter Second operand : ");
            double operand2 = scan.nextDouble();

            OperationFactory operationFactory = new OperationFactoryImpl();
            Operation operation = operationFactory.getInstance(choice);
            System.out.println("\n the result is "+operation.calculate(operand1,operand2));
        } catch (InvalidaOperationException e) {
            System.out.println(e.getMessage());;
        }
        scan.close();
    }
}
