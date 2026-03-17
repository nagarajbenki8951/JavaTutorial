package com.nagaraj.corejava.oopsconcepts.oops_abstraction;

public abstract  class Payments {

    abstract String payment(double payments, String paymentType);

    public void paymentStatus(String status){
        System.out.println("Payment Status "+status);
    }
}

class PaymentsDemo extends Payments {

    public static void main(String args[]){
        PaymentsDemo paymentsDemo = new PaymentsDemo();
        paymentsDemo.payment(56.00, "UPI");
        paymentsDemo.paymentStatus("Completed");
    }

    @Override
    String payment(double payments, String paymentType) {
        System.out.println("Recived payment of "+payments);
        return paymentType;
    }
}
