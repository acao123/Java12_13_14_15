package com.rongda.feature;

/**
 * @class: Feature02.class
 * @description: 使用的NullPointerException的提示  -XX:+ShowCodeDetailsInExceptionMessages
 * @author: acao
 * @create: 2020-11-23 15:53
 **/
public class Feature02 {

    public static void main(String[] args) {

        /**
         * because the return value of "com.rongda.feature.Customer.getAccount()" is null
         */
        Bank bank = new Bank(new Customer());
        bank.getCustomer().getAccount().withdraw(200);
    }
}

class Bank {
    private Customer customer;

    public Bank(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }
}

class Customer {
    private Account account;

    public Account getAccount() {
        return account;
    }
}

class Account {
    private double balance;//余额

    public void withdraw(int amt) {
        if (balance >= amt) {
            balance -= amt;
            System.out.println("成功取款：" + amt);
        } else {
            System.out.println("余额不足，取款失败");
        }
    }
}
