import java.util.*;
class TheBlockGame
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++) {
            int n = sc.nextInt();
            int temp = n;
            int rev = 0;
            while(temp>0) {
                int rem = temp%10;
                rev = rev*10 + rem;
                temp = temp/10;
            }
            if(rev==n) {
                System.out.println("wins");
            }
            else {
                System.out.println("loses");
            }
        }
        sc.close();
    }
}