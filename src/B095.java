/**
 * 
 */

/**
 * @author ytaro
 *
 */
import java.util.Scanner;


public class B095 {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[m];
        for(int i=0;i<m;i++){
            a[i] = sc.nextInt();
        }
        int[] b = new int[m];
        int max = 0;
        int fast;
        for(int i=0;i<n;i++){
            fast = 100;
            for(int j =0;j<m;j++){
                b[j] = sc.nextInt();
                int s = b[j] - a[j];
                s = Math.abs(s);
                if(s <=5){
                    fast -= 0;
                }else if(s > 5 && s <=10){
                    fast -= 1;
                }else if(s > 10 && s <=20){
                    fast -= 2;
                }else if(s >20 && s <= 30){
                    fast -= 3; 
                }else{
                    fast -= 5;
                }
            }
            if(max < fast){
                max = fast;
            }
        }System.out.println(max);
        sc.close();
    }
}
