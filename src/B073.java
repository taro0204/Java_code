/**
 * 
 */

/**
 * @author ytaro
 *
 */
import java.util.Scanner;


public class B073 {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] light = new int[n];
        for(int i=0;i<n;i++){
            light[i] = sc.nextInt();
        }
        int l = sc.nextInt();
        for(int i=0;i<l;i++){
            int s = sc.nextInt()-1;
            int t = sc.nextInt();
            int b = t - s;
            int sum =0;
            for(int j=s;j<t;j++){
                sum += light[j];
            }
            sum = sum/b;
            if(sum < m){
                int p = m - sum;
                for(int j=s;j<t;j++){
                    light[j] += p;
                }
            }
        }for(int i=0;i<n;i++){
            System.out.print(light[i]);
            if(i != n-1){
                System.out.print(" ");
            }
        }
    sc.close();
    }
}