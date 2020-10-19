package com.mycompany.patterns.strategy;

import com.mycompany.patterns.singleton.MathTools;

interface PayMethod {

    public void pay(double... values);

}

class PayWithMoney implements PayMethod {

    @Override
    public void pay(double... values) {
        System.out.println("It's going to be paid with money. ");
    }

}

class PayWithCreditCard implements PayMethod {

    @Override
    public void pay(double... values) {
        System.out.println("It's going to be paid with credit card. ");
    }

}

class Payment implements PayMethod {

    private PayMethod payMethod;

    public void setPayMethod(PayMethod payMethod) {
        this.payMethod = payMethod;
    }

    @Override
    public void pay(double... values) {
        if (this.payMethod != null) {
            this.payMethod.pay(values);
            System.out.println("amount-> R$" + MathTools.getInstance().sum(values)+"\n");
        } else {
            System.err.println("Set a PayMethod to continue...\n");
        }
    }

}

class Strategy {

    public static void main(String[] args) {
        double[] values = {45.99, 59.99, 19.99, 34.49};
        Payment pay = new Payment();
        pay.pay(values);
        pay.setPayMethod(new PayWithMoney());
        pay.pay(values);
        pay.setPayMethod(new PayWithCreditCard());
        pay.pay(values);
    }
}
