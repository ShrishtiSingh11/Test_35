import java.util.*;
public class TwenSix2DIndex{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), m=sc.nextInt(), target=sc.nextInt();
        int[][] mat=new int[n][m];
        for(int i=0;i<n;i++){
          for(int j=0;j<m;j++) {
            mat[i][j]=sc.nextInt();
          }
        }
        int r=-1,c=-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==target){
                  r=i;
                  c=j;
                  break;
                }
            }
        }
        System.out.println("("+r+","+c+")");
    }
}
