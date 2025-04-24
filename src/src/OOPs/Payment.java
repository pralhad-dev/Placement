package OOPs;

 interface Payment {
     void makePayment(double amount);
}

class CreditCards implements Payment {
     public void makePayment(double amount) {
         System.out.println("Credit cards payment:"+amount);
     }
}

class Paypal implements Payment {
     public void makePayment(double amount) {
         System.out.println("Paypal makes payment:"+amount);
     }
}
