import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] basket = new int[n];

        for(int i=0;i<basket.length;i++){
            basket[i] = 0;
        }

        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            for(int j = a-1; j<=b-1; j++){
                basket[j] = c;
            }
        }

        for(int i=0;i<basket.length;i++){
            System.out.print(basket[i]+" ");
        }
    }
}