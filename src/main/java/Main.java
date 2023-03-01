import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

       while (true){
           int n = sc.nextInt();
           int num = 1;
           int sum = 0;

           if(n == -1){
               break;
           }

           List<Integer> divs = new ArrayList<>();
           while (num<n){
               if(n%num == 0){
                   divs.add(num);
                   sum+=num;
               }
               num++;
           }

           if(sum == n){
               System.out.print(n + " = ");
               for(int i=0;i<divs.size();i++){
                   if (i == divs.size()-1){
                       System.out.println(divs.get(i));
                   }else{
                       System.out.print(divs.get(i) + " + ");
                   }
               }
           }else{
               System.out.println(n + " is NOT perfect.");
           }
       }

        sc.close();
    }
}