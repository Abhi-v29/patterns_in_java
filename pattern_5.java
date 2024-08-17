package patterns_in_java;
import java.util.Scanner;

public class pattern_5 {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        //System.out.println((char)('a'+1));
        System.out.println("Enter the size on pattern : ");
        int n = scan.nextInt();
        scan.close();
        for(int row=1; row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print((char)('c'+col-1));
            }
            System.out.println();
        }
    }
}
