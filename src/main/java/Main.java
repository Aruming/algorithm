import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.nextLine();
        String[][] info = new String[n][2];

        for(int i=0;i<n;i++){
            info[i][0] = sc.next();
            info[i][1] = sc.next();
        }

        Arrays.sort(info, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });

        for(int i=0;i<n;i++){
            System.out.println(info[i][0]+" "+info[i][1]);
        }
    }
}