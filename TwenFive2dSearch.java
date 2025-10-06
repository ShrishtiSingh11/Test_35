import java.util.*;
public class TwenFive2dSearch{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), m=sc.nextInt(), 
          int target=sc.nextInt();
        int[][] mat=new int[n][m];
        for(int i=0;i<n;i++) {
          for(int j=0;j<m;j++){
            mat[i][j]=sc.nextInt();
          }
        }
        boolean found=false;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==target) {
                  found=true;
                }
        System.out.println(found?"Yes":"No");
            }
        }
    }
}
