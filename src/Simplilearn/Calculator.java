package Simplilearn;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Calculator {

	public static void main(String[] args) {
		
		int num1;
        int num2;
        String operation;
        
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the first number  and hit 'Enter' ");
        num1 = input.nextInt();

        System.out.println("Please enter the second number and hit 'Enter' ");
        num2 = input.nextInt();

        Scanner op = new Scanner(System.in);

        System.out.println("Please enter operation ");
        operation = op.next();

        if (operation == "+");
        
        {
            System.out.println("Your answer is = " + "Addition " + (num1 + num2));
        }
        if  (operation == "-");
        {
            System.out.println("Your answer is = " + "Sustaction "+ (num1 - num2));
        }

        if (operation == "/");
        {
            System.out.println("your answer is " + "Division " + (num1 / num2));
        }
        if (operation == "*")
        {
            System.out.println("your answer is " + "Multiplication " + (num1 * num2));
        }
		

	}

}
