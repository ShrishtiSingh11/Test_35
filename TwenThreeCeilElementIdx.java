import java.util.*;
public class TwenThreeCeilElementIdx{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), target=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
        }
        int l=0,r=n-1,res=-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(arr[m]>=target){
              res=arr[m];
              r=m-1;
            }
            else {
              l=m+1;
            }
        }
        System.out.println(res);
    }
}
