import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] nums = new int[9][9];

        int max = 0;
        int max_i = 0;
        int max_j = 0;
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                nums[i][j] = sc.nextInt();
                if(nums[i][j]>max){
                    max = nums[i][j];
                    max_i = i;
                    max_j = j;
                }
            }
        }

        System.out.println(max);
        System.out.println((max_i+1)+" "+(max_j+1));
    }
}