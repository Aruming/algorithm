import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String answer = "";
        Scanner sc = new Scanner(System.in);

        int totalPrice = sc.nextInt();
        int n = sc.nextInt();

        int calcPrice = 0;

        for(int i=0;i<n;i++){
            int price = sc.nextInt();
            int cnt = sc.nextInt();
            calcPrice += price * cnt;
        }

        if(calcPrice == totalPrice){
            answer = "Yes";
        }else{
            answer = "No";
        }


        System.out.println(answer);
    }
}
