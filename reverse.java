import java.util.*;
public class reverse {
    public static void rev(int a){
        int num = 0;
        while(a>0){
            num = a%10;
            a /= 10;
            System.out.print(num);
        }
        
    }
    public static void rev2(int a){
        int rev = 0;
        while(a>0){
            int num = a%10;
            a /= 10;
            rev = rev*10 + num;
        }
        System.out.print(rev);
    }
    public static void prime(int a){
        if(a==2){
            System.out.println("Prime");
        }
        else{
            boolean isPrime = true;
            for(int i =2; i <= Math.sqrt(a); i++){
                if(a%i == 0){
                    isPrime = false;
                }
            }
            if(isPrime == true){
                System.out.println("Prime");
            }
            else{
                System.out.println("Not Prime");
            }
        }
    }
    public static void main(String args[]){
        Scanner K = new Scanner(System.in);
        int a = K.nextInt();
        rev(a);
        System.out.println();
        rev2(a);
        System.out.println();
        prime(a);
        // int arr[] = new int[a];
        // for(int i =0; i<a; i++){
        //     K.nextInt(arr[i]);
        // }
        // rev(arr);

    }
}
