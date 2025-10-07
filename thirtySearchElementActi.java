import java.util.*;
public class twenNineSearch2D{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), m=sc.nextInt(), target=sc.nextInt();
        int[][] mat=new int[n][m];
        for(int i=0;i<n;i++){
          for(int j=0;j<m;j++){ 
            mat[i][j]=sc.nextInt();
          }
        }
        int l=0,h=n*m-1; 
        boolean found=false;
        while(l<=h){
            int mid=(l+h)/2;
            int value=mat[mid/m][mid%m];
            if(value==target){
                found=true;
                break;
            }
            else if(value<target) {
                l=mid+1;
            }
            else {
                h=mid-1;
            }
        }
        if(found){
            System.out.println("Activated");
        }else{
             System.out.println("Failed");
        }
       
    }
}
