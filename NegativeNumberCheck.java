class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class NegativeNumberCheck {
    static void square(int num) throws NegativeNumberException {
        if (num < 0) {
            throw new NegativeNumberException("Number cannot be negative: " + num);
        } else {
            System.out.println("Square of " + num + " is: " + (num * num));
        }
    }

    public static void main(String[] args) {
        try {
            square(-10); // Negative input
        } catch (NegativeNumberException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}