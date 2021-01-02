import java.util.*;
public class decimalToAnyBase {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
        scn.close();
    }

    public static int getValueInBase(int n, int b) {
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
