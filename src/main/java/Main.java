import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i=0;i<t;i++){
            String s = sc.next();
            char start = s.charAt(0);
            char end = s.charAt(s.length()-1);

            System.out.print(start);
            System.out.println(end);
        }
    }
}