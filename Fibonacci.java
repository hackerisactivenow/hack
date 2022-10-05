import java.util.*;
public class Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=1, b=0, c=0;
        System.out.println(b);
        n--;
        while(n--!=0){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;

        }
    }
}
