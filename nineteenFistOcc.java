import java.util.*;
public class nineteenFistOcc{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
          arr[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        int l=0,h=n-1,result=-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(arr[m]==key){
              result=m;
              h=m-1;
            }
            else if(arr[m]<key) {
              l=m+1;
                                }
            else h=m-1;
        }
        System.out.println(result);
    }
}
