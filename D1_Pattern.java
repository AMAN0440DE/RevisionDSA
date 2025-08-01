import java.util.*;
public class D1_Pattern {
    public static void p1(int a){
        for(int i =1; i<=a; i++){
            for(int j =1; j<= a-i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void p2(int a){
        char ch = 'A';
        for(int i = 1; i<= a; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    public static void p3(int a){
        for(int i = 1; i<= a; i++){
            for(char ch = 'A'; ch < 'A'+i; ch++ ){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner K = new Scanner(System.in);
        int a = K.nextInt();
        p1(a);
        p2(a);
        p3(a);
    }
}
