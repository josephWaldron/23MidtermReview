package MidtermReview;

public class flag {
    public static void main(String[] args) {
        //create a flag controlled loop
        //where if total reaches 100, the loop ends
        int i = 0;
        int total = 0;
        boolean flag = true;
        while (flag) {
            total += i;
            if (total >= 100) {
                flag = false;
            }
            i++;
        }
    }
    
}
