package pattern;
import java.util.Scanner;

public class pattern_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of pattern : ");
        int n = scan.nextInt();
        scan.close();
        int space = n ;
        int  st =1;
        for(int row=1; row<=n;row++){
            for(int col =1;col<=space;col++){
                System.out.print("\t"+"*");
            }
            // for(int col =1;col<=st;col++){
            //     System.out.print("*");
            // }
            space--;
            st++;
            System.out.println();
        }
    }
}
