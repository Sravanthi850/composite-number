public class CompositeCheck {
    public static void main(String[] args) {
        int number = 15; // Change this number to test other values

        if (isComposite(number)) {
            System.out.println(number + " is a composite number.");
        } else {
            System.out.println(number + " is not a composite number.");
        }
    }

    public static boolean isComposite(int num) {
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are not composite
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return true; // If num is divisible by i, it's composite
            }
        }

        return false; // If no divisors were found, num is not composite
    }
}

