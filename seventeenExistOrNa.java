import java.util.*;
public class seventeenExistOrNa.{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
          arr[i]=sc.nextInt();
        }
        int key=sc.nextInt(), no=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==key){
              no=i;
              break;
            }
        }
        System.out.println(no);
    }
}
