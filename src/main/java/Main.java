import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        int sum = 0;
        int mode = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i=0;i<n;i++){
            int value = sc.nextInt();
            sum += value;
            list.add(value);
            hashMap.put(value, hashMap.getOrDefault(value, 0)+1);

            if(min > value){
                min = value;
            }
            if(max < value){
                max = value;
            }
        }

        int avg = (int)Math.round((double)sum/n);
        Collections.sort(list);
        int median = list.get(n/2);

        int numbers = 0;
        for(int key : hashMap.values()) {
            numbers = Math.max(numbers, key);
        }

        list.clear();
        for(int key : hashMap.keySet()) {
            if(hashMap.get(key) == numbers) {
                list.add(key);
            }
        }

        Collections.sort(list);

        if(list.size() >= 2) {
            mode = list.get(1);
        }
        else {
            mode = list.get(0);
        }

        System.out.println(avg);
        System.out.println(median);
        System.out.println(mode);
        System.out.println(max-min);
    }
}