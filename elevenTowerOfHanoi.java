import java.util.*;
public class elevenTowerOfHanoi {
    static void move(int n, char from, char to, char aux) {
        if (n==0) return;
        move(n-1,from,aux,to);
        System.out.println("Move disk "+n+"from"+from+"to"+to);
        move(n-1,aux,to,from);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        move(n,'A','C','B');
    }
}
