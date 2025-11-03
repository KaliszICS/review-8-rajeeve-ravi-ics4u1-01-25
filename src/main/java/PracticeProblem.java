public class PracticeProblem {

    public static void main(String args[]) {
        // You can add code here to test your methods if needed
    }
    // Method: Pluralize a word
    public static String pluralize(String word) {
        String lowerWord = word.toLowerCase();
        if (lowerWord.endsWith("ife")) {
            return "ives";
        } else if (lowerWord.endsWith("ey")) {
            return "eys";
        } else if (lowerWord.endsWith("y")) {
            return "ies";
        } else {
            return "s";
        }
    }
    // Method: Find minimum of three integers
    public static int min(int num1, int num2, int num3) {
        int smallest = num1;
        if (num2 < smallest) {
            smallest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        }
        return smallest;
    }
    // Method: Check if year is a leap year
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
