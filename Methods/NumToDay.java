package MidtermReview.Methods;

public class NumToDay {
    public static void main(String[] args) {
        System.out.print(numToDay(5));
    }

    public static String numToDay(int numOfDay) {
        switch(numOfDay) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "Input invalid. Please enter a number 1-7.";
        }
    }
}
