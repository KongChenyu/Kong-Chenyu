/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication37;

/**
 *
 * @author KCY
 */
import java.util.Scanner;
public class JavaApplication37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1. Chicken Sandwich - RM 3.40");
        System.out.println("2. Tuna Sandwich - RM 3.70");
        System.out.println("3. Grill Chicken Burger - RM 4.50");
        System.out.println("4. Fried Rice - RM 3.80");
        System.out.print("Enter the menu number: ");
        int selection = scanner.nextInt();
        System.out.print("Enter the quantity: ");
        int quantity = scanner.nextInt();

        double totalAmount = calcOrder(selection, quantity);
        displayOrderAmt(totalAmount);
    }

    public static double calcOrder(int selection, int quantity) {
        double price = 0.0;
        switch (selection) {
            case 1:
                price = 3.40;
                break;
            case 2:
                price = 3.70;
                break;
            case 3:
                price = 4.50;
                break;
            case 4:
                price = 3.80;
                break;
            default:
                System.out.println("Invalid menu selection.");
                break;
        }
        return price * quantity;
    }

    public static void displayOrderAmt(double totalAmount) {
        System.out.printf("Total order amount: RM %.2f%n", totalAmount);
    }
}
        // TODO code application logic here
    
    

