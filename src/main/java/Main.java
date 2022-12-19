import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] words = new String[n];
        sc.nextLine();

        for(int i=0;i<n;i++){
            words[i] = sc.nextLine();
        }

        Arrays.sort(words, new Comparator<String>() {
            public int compare(String s1, String s2) {
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                }else {
                    return s1.length() - s2.length();
                }
            }
        });

        System.out.println(words[0]);
        for (int i=1;i<n;i++) {
            if (!words[i].equals(words[i-1])) {
                System.out.println(words[i]);
            }
        }
    }
}