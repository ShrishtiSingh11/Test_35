import java.util.*;
public class TwenTwoUpperBound{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
      int target=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
          arr[i]=sc.nextInt();
        }
        int l=0,h=n-1,res=n;
        while(l<=h){
            int m=l+(h-l)/2;
            if(arr[m]>target){
              res=m;
              r=m-1;
            }
            else l=m+1;
        }
        System.out.println(res);
    }
}
