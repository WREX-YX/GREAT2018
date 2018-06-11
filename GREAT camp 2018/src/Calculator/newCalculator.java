package Calculator;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class newCalculator
{

    public static void main(String[] args) 
    {
        double num1;
        double num2;
        String operation;


        Scanner input = new Scanner(System.in);

        
        System.out.println("please enter the first number");
        num1 = input.nextDouble();

        
        System.out.println("please enter the second number");
        num2 = input.nextDouble();

        
        Scanner op = new Scanner(System.in);

        System.out.println("Please enter operation");
        operation = op.next();

        if (operation.equals( "+"))
        {
            System.out.println("your answer is " + (num1 + num2));
        }
        if  (operation.equals( "-"))
        {
            System.out.println("your answer is " + (num1 - num2));
        }
        
        if (operation.equals( "/"))
       {
           System.out.println("your answer is " + (num1 / num2));
       }      
        
        if (operation.equals( "*"))
        {
            System.out.println("your answer is " + (num1 * num2));
        }
    }
}
