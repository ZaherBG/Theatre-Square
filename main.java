import java.util.Scanner;
public class TheatreSquare {
    public static void main(String[] args) {
         int a,m,n, l;
        Scanner s = new Scanner(System.in);
        m= s.nextInt();
        n= s.nextInt();
        a= s.nextInt();
        System.out.println(flag(m,n,a));
    }
     public static int flag(int a, int b, int c){
         int f=0;
       for(int i=1;i<10;i++){
            if(((i*area(c,c)-area(a,b))/c)>c){
                f=i;
            break;
            }
        }
       return f;
    }
    public static int area (int a, int b){
        int c;
        c= a*b;
        return c;
    }
}
