package test70;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class test8 {
    
        
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); //初始化 Scanner 物件
            
        int a,counter;
        System.out.print("輸入第一行正整數為:");
        a = scanner.nextInt();
        System.out.print("第二行中數列中的數字為:");
        String b = scanner.next() ;
        String[] sn = b.split(",") ;
        Arrays.sort(sn);
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            numbers.add(i);
        }

        String n = b.replace(",", "");
        for (int i = 0; i < sn.length; i++) {
            String out = n.replace (""+i+"", "");
        }
        
        String out = n.replace ("1", "");
        int lenDiff = n.length () - out.length ();

        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0; i < sn.length; i++) {
            if (map.containsKey(a[i])) {
                int val = map.get(a[i]);
                map.put(a[i], null)
            }
        }

        System.out.println(b);
        System.out.println(out);
        System.out.println(lenDiff);

        // System.out.print(Arrays.toString(sn));




    }

    
}
