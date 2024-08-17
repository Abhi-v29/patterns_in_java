package pattern;
import java.util.Scanner;

public class pattern_1 {
    public static void main(String[] args) {
        System.out.println("Enter the size of pattern (n)");
        Scanner scan = new Scanner(System.in);
        scan.close();
        int n = scan.nextInt();
        for(int row=1; row<=n;row++ ){
            for(int col=1;col<=row;col++){
                System.err.print("* ");
            }
            System.err.println();
        }
    }
}
