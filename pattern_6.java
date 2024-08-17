package patterns_in_java;
import java.util.Scanner;
public class pattern_6 {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the size of pattern : ");
        int size = scan.nextInt();
        scan.close();
        int  space = size/2;
        int str = 1;
        for(int row=1; row<=size; row++){
            for(int col=1;col<=space; col++){
                System.out.print("\t");
            }
            for(int col=1;col<=str;col++){
                System.out.print("*\t");
            }
           if(row<=space){
            space--;
            str+=2;
           }else{
            space++;
            str-=2;
           }  
            System.out.println();
        }
     }
}
