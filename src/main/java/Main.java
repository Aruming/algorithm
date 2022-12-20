import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        int[] sortedArr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0;i<n;i++){
            arr[i] = sortedArr[i] = Integer.parseInt(st.nextToken());
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