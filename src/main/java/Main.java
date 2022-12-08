import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int answer = 0;
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        int findNum = sc.nextInt();
        for(int i=0;i<n;i++){
            if(nums[i] == findNum) answer++;
        }


        System.out.println(answer);
    }
}
