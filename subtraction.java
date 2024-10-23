import java.util.Scanner;

class Subtraction {  
  public static void main(String args[]) {  
    Scanner scanner = new Scanner(System.in); 
    
    System.out.print("Enter the first number: ");
    int n1 = scanner.nextInt();
    
    System.out.print("Enter the second number: ");
    int n2 = scanner.nextInt();

    int subtraction = n1 - n2;  
    System.out.println("The subtraction of numbers is: " + subtraction);  
  }  
}
