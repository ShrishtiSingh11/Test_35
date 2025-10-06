import java.util.*;
public class eightDiagonalSum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] hall=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                hall[i][j]=sc.nextInt();
            }
        }
        int first=0,second=0;
        for(int i=0;i<r;i++){
            first+=hall[i][i];
            second+=hall[i][c-1-i];
        }
        System.out.println(first+" , "+second);
    }
}
