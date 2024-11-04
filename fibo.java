
import java.util.Scanner;
public class fibo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a1=0,a2=1;
        System.out.println(a1);
        System.out.println(a2);
        int next = a1+a2;
       for (int i=3;i<=n;i++)
        {
            System.out.println(next);
            a1=a2;
            a2=next;
            next=a1+a2;

        }

    }
}
