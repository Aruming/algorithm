import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int[] cards = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            cards[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(cards);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i=0;i<m;i++){
            int num = Integer.parseInt(st.nextToken());
            boolean result = binarySearch(cards, num);

            if(result == true){
                bw.write("1 ");
            }else{
                bw.write("0 ");
            }
        }

        bw.close();
        br.close();
    }

    public static boolean binarySearch(int[] cards, int num){
        int start = 0;
        int end = cards.length - 1;
        int mid = (start + end) / 2;

        while (start <= end){
            if(cards[mid] == num){
                return true;
            }

            if(cards[mid] > num){
                end = mid - 1;
            }else {
                start = mid + 1;
            }

            mid = (start + end) / 2;
        }
        return false;
    }
}