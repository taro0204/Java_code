/**
 * 
 */

/**
 * @author ytaro
 *
 */
import java.util.Scanner;


public class B019{
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = n/m;
        int[][] num = new int[n][n];
        int[][] ave = new int[l][l];
        int M = m*m;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                num[i][j] = sc.nextInt();
                ave[i/m][j/m] += num[i][j];
            }
        }
        for(int i=0;i<l;i++){
            for(int j=0;j<l;j++){
                System.out.print(ave[i][j]/M);
                if(j+1<l) System.out.print(" ");
            }System.out.println();
        }
        sc.close();
    }
}
