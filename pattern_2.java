package patterns_in_java;
import java.util.Scanner;

public class pattern_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();
        System.out.print("Enter the size of Pattern : ");
        int n= scan.nextInt();
        for(int row=n; row>=1; row--){
            for(int col=1; col<=row; col++){
                System.out.print("*");
            }
            System.err.println();
        }
    }
        
}
