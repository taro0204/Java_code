/**
 * 
 */

/**
 * @author ytaro
 *
 */
import java.util.Scanner;


public class B040 {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arf = sc.nextLine();
        String ar = "abcdefghijklmnopqrstuvwxyz";
        String[] af = ar.split("");
        String[] s = sc.nextLine().split(" ");
        for(int i=0;i<s.length;i++){
            String[] t = s[i].split("");
            for(int j=0;j<n;j++){
                for(int k =0;k<t.length;k++){
                    int index = arf.indexOf(t[k])-1;
                    t[k] = af[index];
                }
            }for(int k =0;k<t.length;k++){
                System.out.print(t[k]);
            }if(i+1 < s.length) System.out.print(" ");
        }
        sc.close();
    }
}

