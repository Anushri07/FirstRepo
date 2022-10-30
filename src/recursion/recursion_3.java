package recursion;

public class recursion_3 {
    public static void printsum(int n, int sum, int i) {
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printsum(n, sum, i + 1);

    }

    public static void main(String args[]) {
        printsum(5, 0, 1);
    }
}
