import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[9];
        for(int i=0;i<9;i++){
            num[i] = sc.nextInt();
        }
        int max = num[0];
        int result = 0;
        for(int i=0;i<9;i++){
            if(num[i]>max) {
                max = num[i];
                result = i;
            }
        }
        System.out.println(max+"\n"+(result+1));

    }
}
