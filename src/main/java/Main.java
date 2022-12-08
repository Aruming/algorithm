import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String answer = "";
        Scanner sc = new Scanner(System.in);
        String pieces = sc.nextLine();

        String[] piece = pieces.split(" ");
        int[] num = {1, 1, 2, 2, 2, 8};

        int own = 0;
        for(int i=0;i<piece.length;i++){
            own = Integer.parseInt(piece[i]);
            answer += num[i]-own;
            if(i == piece.length-1){
                break;
            }
            answer += " ";
        }

        System.out.println(answer);
    }
}
