import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);
        //CALCULATING THE AREA OF A RECTANGLE

        //ASK THE USER FOR THE LENGTH
        System.out.println( "Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        //ASK THE USER FOR THE WIDTH
        System.out.println("Enter the width of the rectangle: ");
        double width =scanner.nextDouble();

        //OPERATION TO CALCULATE THE AREA OF THE RECTANGLE

        double area= length*width;
        System.out.println("The area of the rectangle is "+area +" unit sq");


        scanner.close();
    }
}