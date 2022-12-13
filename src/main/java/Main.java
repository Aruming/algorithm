import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();
        List<Integer> nums = new ArrayList<>();

        for(int i=0;i<n;i++){
            nums.add(sc.nextInt());
        }

        Collections.sort(nums);

        for(int i=0;i<nums.size();i++){
            sb.append(nums.get(i)).append("\n");
        }

        System.out.println(sb);
    }
}