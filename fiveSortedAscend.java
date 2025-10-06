public class fiveSortedAscend{
  public static void main(String[] args){
  int []arr={1,2,3,6,9};
    int low=0;
    int high= arr.length-1;
    boolean sorted=true;
    while(low<high){
    if(arr[low]>arr[low+1]){
   sorted=false;
      break;
    }
    low++;
    }

  if(sorted)
     System.out.println("true");
else
       System.out.println("false");
}
}
