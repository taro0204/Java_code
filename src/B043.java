/**
 * 
 */

/**
 * @author ytaro
 *
 */
import java.util.Scanner;


public class B043 {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt()-1;
        int y = sc.nextInt()-1;
        int direction = 0;
        String[] home = new String[n];
        for(int i=0;i<n;i++){
            home[i] = sc.next();
        }
        int limit = 0;
        while(limit < 2000){
            if(x < 0 || x > n-1 || y < 0 || y > m-1) break;
            String[] s = home[x].split("");
            home[x] = "";
            if(direction==4) direction = 0;
            if(direction==-1) direction = 3;
            if(s[y].equals("*")){
                s[y] = ".";
                
                
                for(int i=0;i<m;i++){
                    home[x] += s[i];
                }
                if(direction == 0) y--;
                else if(direction == 1) x--;
                else if(direction == 2) y++;
                else if(direction == 3) x++;
                direction--;
            }
            else{
                s[y] = "*";
                
                for(int i=0;i<m;i++){
                    home[x] += s[i];
                }
                
                if(direction == 0) y++;
                else if(direction == 1) x++;
                else if(direction == 2) y--;
                else if(direction == 3) x--;
                direction++;
            }
            
            limit++;
        }
        for(int i=0;i<n;i++){
            System.out.println(home[i]);
        }
        sc.close();
    }
}
