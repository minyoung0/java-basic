package ref.ex;


import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("입력할 주문의 개수를 입력하세요: ");
        int count=scanner.nextInt();

        ProductOrder[] orderArr = new ProductOrder[count];

        for(int i=0;i<orderArr.length;i++){
            System.out.println((i+1)+"번째 주문 정보를 입력하세요");
            System.out.print("상품명: ");
            String name=scanner.nextLine();
            scanner.nextLine();

            System.out.print("가격: ");
            int price=scanner.nextInt();

            System.out.print("개수: ");
            int quantity=scanner.nextInt();

            orderArr[i]= createOrder(name,price,quantity);

        }

        printOrder(orderArr);
        System.out.println("총가격: "+getTotalAmount(orderArr)+"원");

    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order1 = new ProductOrder();
        order1.productName = productName;
        order1.price = price;
        order1.quantity = quantity;
        return order1;
    }

    static void printOrder(ProductOrder[] orders) {
        for (int i = 0; i < orders.length; i++) {
            System.out.println("상품명: " + orders[i].productName + " 가격:" + orders[i].price + " 개수: " + orders[i].quantity);
        }

    }

    static int getTotalAmount(ProductOrder[] orders) {
        int total = 0;
        for (int i = 0; i < orders.length; i++) {
            total += orders[i].price * orders[i].quantity;
        }
        return total;
    }


}
