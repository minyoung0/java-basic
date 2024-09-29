package class1;

import java.util.Scanner;


public class ProductOrdermain {
    public static void main(String[] args) {

        ProductOrder[] Arr = new ProductOrder[3];
        int total=0;

        ProductOrder order1 = new ProductOrder();
        order1.productName = "두부";
        order1.price = 2000;
        order1.quantity = 2;
        Arr[0] = order1;

        ProductOrder order2 = new ProductOrder();
        order2.productName = "김치";
        order2.price = 5000;
        order2.quantity = 1;
        Arr[1] = order2;

        ProductOrder order3 = new ProductOrder();
        order3.productName = "콜라";
        order3.price = 1500;
        order3.quantity = 2;
        Arr[2] = order3;


        for(int i=0;i< Arr.length;i++){
            System.out.println("상품명: "+Arr[i].productName+", 가격: "+Arr[i].price+", 수량: "+Arr[i].quantity);
            total+=Arr[i].price*Arr[i].quantity;
        }

        System.out.println("총 결제 금액: "+total+"원");

    }

}
