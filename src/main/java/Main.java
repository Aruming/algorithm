import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        char[][] words = new char[5][15];

        for (int i=0;i<5;i++){
            String s = sc.next();
            int len = 0;

            for (int j=0;j<s.length();j++){
                words[i][j] = s.charAt(j);
            }
        }

        String answer = "";
        for(int i=0;i<15;i++){
            for(int j=0;j<5;j++){
                if(words[j][i] == '\0'){
                    continue;
                }else{
                    answer += words[j][i];
                }
            }
        }

        System.out.println(answer);

        sc.close();
    }
}