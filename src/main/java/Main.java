import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //배열 크기 입력
        int n = sc.nextInt();
        double[] score = new double[n];
        double max = 0;

        //배열 값 입력, 배열 최댓값 구하기
        for(int i=0;i<n;i++){
            score[i] = sc.nextInt();
            if(max<score[i])
                max=score[i];
        }

        //수정된 배열 값의 합
        double sum=0;
        for(int i=0;i<n;i++){
            sum+=(score[i]/max)*100;
        }
        System.out.println(sum/n);

    }
}
