import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] a = new int[n][m];
        int[][] b = new int[n][m];

        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j] = sc.nextInt();
            }
        }

        int[][] result = new int[n][m];

        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                b[i][j] = sc.nextInt();
                result[i][j] = a[i][j] + b[i][j];
            }
        }

        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println("");
        }
    }
}