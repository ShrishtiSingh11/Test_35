import java.util.*;
public class eighteenBsTar{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
          arr[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        int l=0,r=n-1,result=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==key){
              result=mid;
              break;
            }
            else if(arr[mid]<key) {
              l=mid+1;
            }
            else {
              r=mid-1;
            }
        }
        System.out.println(result);
    }
}
