package com.pavan;

public class Account {
    private double balance;
    private long accNo;
    private String bankName;
    private static String city;

    public Account(long accNo, double balance, String bankName, String city) {
        this.balance = balance;
        this.accNo = accNo;
        this.bankName = bankName;
        Account.city = city;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getAccNo() {
        return accNo;
    }

    public void setAccNo(long accNo) {
        this.accNo = accNo;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public static String getCity() {
        return city;
    }

    public static void setCity(String city) {
        Account.city = city;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", accNo=" + accNo +
                ", bankName='" + bankName + '\'' +
                '}';
    }
}
