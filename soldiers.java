import java.util.Arrays;

public class soldier{
  public static void main(String[] args){
    int n=5;
    System.out.println("n="+n);
    int[] arr={0,1,2,4,5};
    System.out.println("arr="+Arrays.toString(arr));
    int expectedSum= n*(n+1)/2;
    int actualSum=0;
    for(int i=0;i<n;i++){
      actualSum+=arr[i];
    }
   System.out.println("missing number="+ (expectedSum-actualSum));
   
  }
}
    
    
