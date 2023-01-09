public class Operators {
    public static void main(String args[]) {
        int sum1 = 100 + 50;
        int sum2 = sum1 + 250;
        int sum3 = sum2 + sum2;
        sum1++;
        sum1 *= 2;
        sum2 += 30;
        sum2 /= 3;
        sum2 %= 3;
        sum3 -= 40;
        sum3 &= 4;
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
    }
}
