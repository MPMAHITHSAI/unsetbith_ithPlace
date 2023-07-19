package Unsetbit;
import java.util.Scanner;

public class Unsetbitpro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(bitsetter(a,b));
    }

    static int bitsetter(int a, int b) {
        int x=a;
        for(int i=0;i<b;i++){
            x>>=1;
        }
        if((x&1)==1){
            return a^(1<<b);
        }
        else{
            return a;
        }


    }
}