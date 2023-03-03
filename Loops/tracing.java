package MidtermReview.Loops;

public class tracing {
    public static void main(String[] args) {
        int num = 7;
        for (int i=0; i<3; i++) {
            num *= 2;
            if (num % 3 == 0) {
                num -= 5;
            } else {
                num += 3;
            }
        }
        System.out.println(num);
    }
}
