package test70;

import java.util.Arrays;
import java.util.Scanner;

public class test13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 初始化Scanner
        System.out.print("輸入一字元為: ");
        String ostr=scanner.nextLine();
        StringBuilder strb = new StringBuilder(ostr);
		String str = strb.reverse().toString();
        
        boolean status = ostr.contains(strb);
 
        if(status){
            System.out.println("YES");
 
        }else{
            System.out.println("NO");
        }

        
    }
}
