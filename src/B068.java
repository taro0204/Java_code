/**
 * 
 */

/**
 * @author ytaro
 *
 */
import java.util.Scanner;


public class B068 {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] cho = new int[n][m];
        String[][] AB = new String[n][m];
        for(int i=0;i<n;i++){
            int harf = 0;
            for(int j=0;j<m;j++){
                cho[i][j] = sc.nextInt();
                harf += cho[i][j];
            }
            harf = harf /2;
            int sum1 = 0;
            int sum2 = 0;
            int c =0;
            for(int j=0;j<m;j++){
                if(sum1 < harf){
                    sum1 += cho[i][j];
                    AB[i][j] = "A";
                }else if(sum1 == harf){
                    sum2 += cho[i][j];
                    AB[i][j] = "B";
                }
            }if(sum1 != sum2){
                System.out.println("No");
                System.exit(0);    
            }
        }System.out.println("Yes");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(AB[i][j]);
            }System.out.println();
        }
        sc.close();
    }
}
