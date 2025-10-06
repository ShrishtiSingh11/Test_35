import java.util.*;
public class sixMaxElementGrid{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int r= sc.nextInt();
      int c= sc.nextInt();
    int[][] gold= new int[r][c];
    for(int i=0;i<r;i++){
      for (int j=0;j<c;j++){
        gold[i][j]=sc.nextInt();
      }
  }
    int maxRow=0;
    int maxSum=Integer.MIN_VALUE;
    for(int i=0;i<r;i++){
      int sum=0;
      for(int j=0;j<c;j++){
        sum+=gold[i][j];
      }
      if(sum>maxSum){
      maxSum=sum;
        maxRow=i;
      }
      }
    System.out.println("Row"+(maxRow+1)+"(sum="+maxSum+")");
  }
    }
