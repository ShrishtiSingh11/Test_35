import java.util.*;
public class fifteenArrSum{
    static int sumArray(int[] arr,int n){
        if(n==0)return 0;
        return sumArray(arr,n-1)+arr[n-1];
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
        }
        System.out.println(sumArray(arr,n));
    }
}
