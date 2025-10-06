import java.util.*;
public class sevenSpiral{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] library=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                library[i][j]=sc.nextInt();
            }
        }
        ArrayList<Integer> result=new ArrayList<>();
        int startRow=0,endRow=r-1,startCol=0,endCol=c-1;
        while(startRow<=endRow&&startCol<=endCol){
            for(int j=startCol;j<=endCol;j++) 
              result.add(library[startRow][j]);
            startRow++;
            for(int i=startRow;i<=endRow;i++) 
              result.add(library[i][endCol]);
            endCol--;
            if(startRow<=endRow){
                for(int j=endCol;j>=startCol;j--) 
                  result.add(library[endRow][j]);
                endRow--;
            }
            if(startCol<=endCol){
                for(int i=endRow;i>=startRow;i--) 
                  result.add(library[i][startCol]);
                startCol++;
            }
        }
        System.out.println(result);
    }
}
