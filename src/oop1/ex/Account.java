package oop1.ex;

public class Account {
    int balance;

    void deposit(int amount){
        System.out.println(amount+"원 입금되었습니다");
        balance+=amount;
        System.out.println("잔액: "+balance);
    }

    void withdraw(int amount){
        if (balance<amount){
            System.out.println( "잔액 부족");
            System.out.println("잔액: "+balance);
        }
        else{
            System.out.println(amount+"원 출금하였습니다");
            balance-=amount;
            System.out.println("잔액: "+balance);
        }

    }
}
