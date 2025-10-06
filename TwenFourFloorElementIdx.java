import java.util.*;
public class TwenFourFloorElementIdx{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
      int target=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
          arr[i]=sc.nextInt();
        }
        int l=0,r=n-1,res=-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(arr[m]<=target){
              res=arr[m];
              l=m+1;
            }
            else {
              r=m-1;
            }
        }
        System.out.println(res);
    }
}
