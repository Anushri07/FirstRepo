package recursion;

public class recursion_1 {

    public static void printnumber(int n) {
        if (n == 0) { // base condition
            return;
        }
        System.out.println(n);
        printnumber(n - 2); // recursion
    }

    public static void main(String args[]) {
        int n = 20;
        printnumber(n);

    }
}
