package course;

import javax.print.event.PrintEvent;

public class rank {
    public static void main(String[] args) {           
        /*
        byte byteA=100;
        byte byteB=80;
        byte byteC=70;
         if (byteA>byteB && byteB>byteC) {
            System.out.println("ABC");
        } else if (byteB>byteC && byteC>byteA) {
            System.out.println("BCA");
        } else if (byteC>byteB && byteB>byteA) {
            System.out.println("CBA");
        } else if (byteA>byteC && byteC>byteB) {
            System.out.println("ACB");
        } else if (byteB>byteA && byteA>byteC) {
            System.out.println("BAC");
        } else if (byteC>byteA && byteA>byteB) {
            System.out.println("CAB");
        }*/

        Byte[] tmp; //宣告Byte陣列，不要用Byte tmp[] 
        tmp=new Byte[3]; //陣列將分出三個位置給Byte(new3個元素給tmp)
        tmp[0]=100;
        tmp[1]=10;
        tmp[2]=90;
        int max=0;
        int min=100;
        for (int i = 0; i < tmp.length; i++) {
            if (tmp[i]>max) {
                max=tmp[i];
            }
            if (tmp[i]<min) {
                min=tmp[i];
            }
        }
            System.out.println(max);
            System.out.println(min);

        //3Byte+陣列會有length (int 4Byte),共7Byte

        char[] tmp1=new char[5];
        tmp1[0]='A';
        tmp1[1]='B';
        tmp1[2]='C';
        tmp1[3]='D';
        tmp1[4]='E';

        for (int i = 0; i < tmp1.length; i++) {
            System.out.println(tmp1[i]);
        }

        //10Byte+陣列會有length (int 4Byte),共14Byte

        long[] tmp2=new long[2];
        tmp2[0]='3';
        tmp2[1]='2';
        for (int i = 0; i < tmp2.length; i++) {
            System.out.println(tmp2[i]);
        }
        //16Byte+陣列會有length (int 4Byte),共20Byte

        //二維陣列-動態陣列
        int[][] kk1;
        kk1=new int[3][];
        kk1[0]=new int[2];
        kk1[1]=new int[4];
        kk1[2]=new int[1];

        for (int i = 0; i < kk1.length; i++) {
            for (int j = 0; j < kk1[i].length; j++) {
                kk1[i][j]=60;
            }
        }

        // char[][] midterm;
        // midterm=new char[5][];
        // midterm[0]=new char[5];
        // midterm[1]=new char[4];
        // midterm[2]=new char[3];
        // midterm[3]=new char[2];
        // midterm[4]=new char[1];

        char[][] midterm;
        midterm=new char[5][];

        for (int i = 0; i < midterm.length; i++) {
            midterm[i]=new char[5-i]; //可直接替代掉midterm[0]=new char[5]等

            }
        int aa=(int)'z';
        for (int i = 0; i < midterm.length; i++) {
            for (int j = 0; j < midterm[i].length; j++) {
                midterm[i][j]=(char)aa;
                aa=aa-1;
                System.out.println(midterm[i][j]);
            }
        }


        }

       
        
    }
/**
 * Person
 */
class Person {
    String name;
    int weigth;

    void eat()
    {
        weigth=weigth+1;
    }
    
}
