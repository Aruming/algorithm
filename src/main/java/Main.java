import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String s = Integer.toString(n);
        String[] nums = s.split("");
        Arrays.sort(nums);

        s = "";
        for(int i = nums.length-1;i>=0;i--){
            s += nums[i];
        }

        int answer = Integer.parseInt(s);
        System.out.println(answer);
    }
}