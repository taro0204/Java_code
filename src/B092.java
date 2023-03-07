import java.util.Scanner;


public class B092 {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int x = sc.nextInt();
        int save = sc.nextInt();
        int[][] point = new int[save][2];
        int[] mas = new int[save]; 
        String[] stage = new String[y];
        int[] my = new int[2];
        for(int i=0;i<y;i++){
            stage[i] = sc.next();
            String[] s = stage[i].split("");
            for(int j=0;j<x;j++){
                if(s[j].equals("N")){
                        my[0] = i;
                        my[1] = j;
                    }
                for(int num = 1;num<= save;num++){
                    String N = String.valueOf(num);
                    if(s[j].equals(N)) {
                        point[num-1][0] = i;
                        point[num-1][1] = j;
                    }
                }
            }
        }
        int min = x * y;
        for(int i=0;i<save;i++){
            for(int j=0;j<2;j++){
                mas[i] += Math.abs(point[i][j] - my[j]);
            }
            if(min > mas[i]) min = mas[i];
        }
        int count = 0;
        for(int i=0;i<save;i++){
            if(min == mas[i]) count++;
        }
        System.out.println(count);
        
        for(int i=0;i<save;i++){
            if(min == mas[i]) System.out.println(i+1);
        }
        sc.close();
    }
}
