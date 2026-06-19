public class Main {
    public static void main(String[] args) {

        System.out.println();
        
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9876-5432", "swyam");
        PaymentStrategy payPalPayment = new PayPalPayment("Swyam@gmail.com");

        
        PaymentContext paymentContext = new PaymentContext(creditCardPayment);
        paymentContext.executePayment(400);

        paymentContext = new PaymentContext(payPalPayment);
        paymentContext.executePayment(200);
    }
}
