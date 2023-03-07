/**
 * 
 */

/**
 * @author ytaro
 * Paiza Bランク099問題
 *
 */
import java.util.Scanner;


public class B099 {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int limit = sc.nextInt();
        int[][] rain = new int[n][n];
        int[] c = new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                rain[i][j] = sc.nextInt();
                if(rain[i][j] >= limit) c[j]++;
            }
        }int t =0;
        int count = 0;
        for(int i=0;i<n;i++){
            if(c[i] == 0){
                if(i > 0 && count !=0) System.out.print(" ");
                System.out.print(i+1);
                count++;
            }
            else t++;
        }
        if(t==n) System.out.print("wait");
        sc.close();
    }
}
