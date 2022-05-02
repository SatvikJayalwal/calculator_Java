import java.util.Scanner;


public class calculator {
  
  
    static int op;
    
    public static void main(String[] args){
        
        

            System.out.print("\n WELCOME TO CALCULATOR \n");
            Scanner sc = new Scanner(System.in);
            System.out.println("\nAvailable Operators"
		    + " are::  (+ - * / #)\n");
            System.out.print("\nEnter operator: \n");
            op = sc.next().charAt(0);
           
        
            while(true){
           
                switch(op){

                
            
                    case '+':
                    
                    add();
                    break;


                    case '-':
                    sub();
                    break;

                    case '*':
                    mul();
                    break;

                    case '/':
                    div();
                    break;


                    case '#':
                    while(1<2){

                        System.out.print("\n THANKS FOR USING CALCULATOR \n");
                        break;
                    }
                    System.exit(0);
                
                
                                
                    default :
                    System.out.println("\nInput is invalid\n"); 
                    break; 
                }         
                        
            }
                        
    
    }    

    static void add(){
        int num1;
        int num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter two numbers: \n");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        System.out.println("\n RESULT = "+(num1+num2));

        System.out.println("\nAvailable Operators"
		            + " are::  (+ - * / #)\n");
        System.out.print("\nEnter operator: \n");
        op = sc.next().charAt(0);
    }

    static void sub(){
        int num1;
        int num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter two numbers: \n");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        System.out.println("\n RESULT = "+(num1-num2));

        System.out.println("\nAvailable Operators"
		            + " are::  (+ - * / #)\n");
        System.out.print("\nEnter operator: \n");
        op = sc.next().charAt(0);
    }
    static void mul(){
        int num1;
        int num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter two numbers: \n");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        System.out.println("\n RESULT = "+(num1*num2));

        System.out.println("\nAvailable Operators"
		            + " are::  (+ - * / #)\n");
        System.out.print("\nEnter operator: \n");
        op = sc.next().charAt(0);
    }
    static void div(){
        int num1;
        int num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter two numbers: \n");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        System.out.println("\n RESULT = "+(num1/num2));

        System.out.println("\nAvailable Operators"
		            + " are::  (+ - * / #)\n");
        System.out.print("\nEnter operator: \n");
        op = sc.next().charAt(0);
    }
    
}
