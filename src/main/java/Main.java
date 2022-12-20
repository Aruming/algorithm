import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] sortedArr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sortedArr[i] = sc.nextInt();
        }
        Arrays.sort(sortedArr);

        Map<Integer, Integer> rankingMap = new HashMap<>();
        int rank = 0;
        for(int i=0;i<n;i++){
            if(!rankingMap.containsKey(sortedArr[i])){
                rankingMap.put(sortedArr[i], rank);
                rank++;
            }
        }

        for(int i=0;i<n;i++){
            sb.append(rankingMap.get(arr[i])).append(" ");
        }

        System.out.println(sb);
    }
}