package ref.ex;


public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder[] orderArr = new ProductOrder[3];

        orderArr[0] = createOrder("두부", 2000, 2);
        orderArr[1] = createOrder("김치", 5000, 1);
        orderArr[2] = createOrder("콜라", 1500, 2);

        printOrder(orderArr);
        System.out.println("총가격: "+getTotalAmount(orderArr)+"원");

    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
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
