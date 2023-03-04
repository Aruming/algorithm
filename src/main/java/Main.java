import java.util.HashMap;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        HashMap<String, Integer> poketmons_si = new HashMap<>();
        HashMap<Integer, String> poketmons_is = new HashMap<>();

        for(int i=0;i<n;i++){
            String name = sc.next();
            poketmons_si.put(name, i+1);
            poketmons_is.put(i+1, name);
        }

        for(int i=0;i<m;i++){
            if(sc.hasNextInt()){
                System.out.println(poketmons_is.get(sc.nextInt()));
            }else{
                System.out.println(poketmons_si.get(sc.next()));
            }
        }

        sc.close();
    }
}