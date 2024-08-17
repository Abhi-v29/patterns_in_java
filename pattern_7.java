package patterns_in_java;
import java.util.Scanner;
public class pattern_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of pattern : ");
        int n = scan.nextInt();
        scan.close();
        int space = n-1, star =1;
        for(int row=1;row<=n;row++){
            for(int col=1;col<=space;col++){
                System.out.print("  ");
            }
            for(int col=1;col<=star;col++){
                System.out.print("* ");
            }
            space--;
            star+=2;
            System.out.println();
        }
    }
}
