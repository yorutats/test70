package course;

public class hw {
    public static void main(String[] args) {
        char[][][] midterm;
        midterm=new char[2][][];

        midterm[0]=new char[5][];
        midterm[1]=new char[2][];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= 5-i; j++) {
                midterm[0][i]=new char[j];
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j <= 2-i; j++) {
                midterm[1][i]=new char[j];
            }
        }

        
        int aa=(int)'z';
        for (int i = 0; i < midterm.length; i++) {
            for (int j = 0; j < midterm[i].length; j++) {
                for (int k = 0; k < midterm[i][j].length; k++) {
                    midterm[i][j][k]=(char)aa;
                    aa-=1; 
                    System.out.println(midterm[i][j][k]);
                }
            }
        }
        System.out.println(midterm[1][0][1]);
    }
    



}
