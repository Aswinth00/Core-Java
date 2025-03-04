public class AmazonPaymentModule {

    // Method for general payment without any details
    public void payment() {
        System.out.println("Processing payment with default method.");
    }

    // Method for UPI payment
    public void payment(String upi) {
        System.out.println("Processing payment using UPI: " + upi);
        // Add further logic for handling UPI payment
    }

    // Method for card payment
    public void payment(long cardNo, int cvv) {
        System.out.println("Processing payment using Card Number: " + cardNo + " and CVV: " + cvv);
        // Add further logic for handling Card payment
    }

    // Method for payment using username and password
    public void payment(String username, String password) {
        System.out.println("Processing payment for user: " + username);
        // Add further logic for handling username and password payment
    }

    public static void main(String[] args) {
        // Creating an instance of AmazonPaymentModule
        AmazonPaymentModule paymentModule = new AmazonPaymentModule();

        // Testing different payment methods
        paymentModule.payment(); // Default payment
        paymentModule.payment("user@upi"); // UPI payment
        paymentModule.payment(1234567812345678L, 123); // Card payment
        paymentModule.payment("user123", "password123"); // Payment using username and password
    }
}