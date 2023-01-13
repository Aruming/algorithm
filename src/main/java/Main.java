import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] words = new String[n];

        for(int i=0;i<n;i++){
            words[i] = sc.next();
        }

        int cnt = 0;
        for(int i=0;i<m;i++){
            String check = sc.next();
            for(int j=0;j<n;j++){
                if(words[j].equals(check)) cnt++;
            }
        }

        System.out.println(cnt);
    }
}