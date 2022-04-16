import java.util.Scanner;

public class Pattern{
    public static void main(String[] args) {
        System.out.println("Hello!!! I am here to help you!! Enter the number you like");
        Scanner scan = new Scanner(System.in);
        int numOfStars = scan.nextInt();
        // Pring out stars from the top to buttom one to the n number giver
        for(int i = 1; i<=numOfStars; i++){
            for(int k = 0; k < i; k++){
                System.out.print("x");
            }
            System.out.println();
        }

        // pring out starts from the buttom to the top of a giver n number 
        for(int i = numOfStars-1; i > 0; i--){
            for(int k = 0; k < i; k++){
                System.out.print("x");
            }
            System.out.println();
        } 
    }
}