import java.util.HashMap;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();
        HashMap<Integer, Integer> cards = new HashMap<>();
        for(int i=0;i<n;i++){
            int num = sc.nextInt();

            if(cards.containsKey(num)){
                cards.put(num, cards.get(num)+1);
            }else{
                cards.put(num, 1);
            }
        }

        int m = sc.nextInt();

        for(int i=0;i<m;i++){
            int print = sc.nextInt();
            if(cards.containsKey(print)){
                sb.append(cards.get(print)).append(" ");
            }else {
                sb.append(0).append(" ");;
            }
        }

        System.out.println(sb);
        sc.close();
    }
}