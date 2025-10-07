import java.util.*;
public class MagicPortal{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), m=sc.nextInt(), target=sc.nextInt();
        int[][] mat=new int[n][m];
        for(int i=0;i<n;i++) for(int j=0;j<m;j++) grid[i][j]=sc.nextInt();
        int l=0,r=n*m-1; boolean found=false;
        while(l<=r){
            int mid=(l+r)/2;
            int val=grid[mid/m][mid%m];
            if(val==target){found=true;break;}
            else if(val<target) l=mid+1;
            else r=mid-1;
        }
        System.out.println(found?"Activated":"Failed");
    }
}
