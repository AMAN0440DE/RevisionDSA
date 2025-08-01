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
    public static void main(String args[]){
        Scanner K = new Scanner(System.in);
        int a = K.nextInt();
        p1(a);
    }
}
