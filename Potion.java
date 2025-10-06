import java.util.*;
public class Potion{
  public static void main(String[] args){
  int n=4;
    int[] arr= {3,2,4,7};
    int one=-1,two=-1;
    Scanner sc= new Scanner(System.in);
    int target = sc.nextInt();
    for(int i=0;i<n;i++){
      for (int j=i+1;j<n;j++){
        if(arr[i]+arr[j]==target){
          one=i;
          two=j;
          break;
        }
      }  
      if (one!=-1)
      break;
    }
       if (one != -1)
            System.out.println("Indices: (" + one + "," + two + ")");
  }
  }
