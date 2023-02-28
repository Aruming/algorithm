import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();
       int k = sc.nextInt();

       int num = 1;
       int cnt = 0;
       while (num <= n){
           if(n%num==0){
               cnt++;
           }

           if(cnt == k){
               break;
           }

           num++;
       }

       if(cnt < k){
           System.out.println(0);
       }else{
           System.out.println(num);
       }

        sc.close();
    }
}