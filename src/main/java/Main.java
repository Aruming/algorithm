import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] basket = new int[n];

        for(int i=0;i<basket.length;i++){
            basket[i] = i+1;
        }

        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int tmp = 0;

            tmp = basket[a-1];
            basket[a-1] = basket[b-1];
            basket[b-1] = tmp;
        }

        for(int i=0;i<basket.length;i++){
            System.out.print(basket[i]+" ");
        }
    }
}