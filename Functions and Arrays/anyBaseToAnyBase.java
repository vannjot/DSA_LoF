import java.util.*;
public class anyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int destBase = scn.nextInt();
        int d = anyBase(n, sourceBase, destBase);
        System.out.println(d);
    }

    public static int anyBase(int n, int source, int dest){
        int rv = 0;
        int p = 1;
        while(n > 0){
            int dig = n % dest;
            rv += dig * p;
            p = p * source;
            n /= dest;
        }
        return rv;
    }
}
