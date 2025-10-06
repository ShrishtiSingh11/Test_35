import java.util.*;
public class oneMaxElement{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Number of plates:");
int n=sc.nextInt();
System.out.print("enter quantity of food in each :");
int[] arr=new int[n];
for(int i=0;i<n;i++) {
arr[i] = sc.nextInt();
}
int max=arr[0];
for(int j=1;j<n;j++){
if(max<arr[j]){
max=arr[j];
}
}
System.out.println("most food in a plate:"+max);
sc.close();
}
}
