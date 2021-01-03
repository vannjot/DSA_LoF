import java.util.*;
public class anyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int destBase = scn.nextInt();
        int d = anybasetodecimal(n, sourceBase);
        int rv = decimaltoanybase(d, destBase);
        System.out.println(rv);
    }
    public static int anybasetodecimal(int n, int b) {
        int rv = 0;
        int p = 0;
        while(n > 0){
            rv += n%10 * Math.pow(b, p);
            n /= 10;
            ++p;
        }
        return rv;
    }
    public static int decimaltoanybase(int n, int b) {
        int rv = 0;
        int count = 0;
        while (n > 0){
            rv += (n % b) * Math.pow(10, count);
            ++count;
            n /= b;
        }
        return rv;
    }

    
}
