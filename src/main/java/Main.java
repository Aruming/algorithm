import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int answer = 0;
        Scanner sc = new Scanner(System.in);

        String dice = sc.nextLine();
        String[] result = dice.split(" ");
        Arrays.sort(result);

        if(result[0].equals(result[2])){
            answer = 10000 + 1000 * Integer.parseInt(result[2]);
        } else if (result[0].equals(result[1]) || result[1].equals(result[2])) {
            answer = 1000 + 100 * Integer.parseInt(result[1]);
        }else {
            answer = 100 * Integer.parseInt(result[2]);
        }


        System.out.println(answer);
    }
}
