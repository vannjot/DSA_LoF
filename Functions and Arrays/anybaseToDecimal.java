import java.util.*;
public class anybaseToDecimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int d = getValueIndecimal(n, b);
        System.out.println(d);
    }

    public static int getValueIndecimal(int n, int b) {
        int rv = 0;
        int p = 0;
        while(n > 0){
            rv += n%10 * Math.pow(b, p);
            n /= 10;
            ++p;
        }
        return rv;
    }
}
