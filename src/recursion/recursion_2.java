package recursion;

public class recursion_2 {
    public static void printnumber(int n) {
        if (n == 6) { // base condition
            return;
        }
        System.out.println(n);
        printnumber(n + 1); // recursion
    }

    public static void main(String args[]) {
        int n = 1;
        printnumber(n);

    }
}
