package oop1.ex;

public class RectangleOopMain {
    public static void main(String[] args) {
        //넓이,둘레, 정사각형 여부

        Rectangle rectangle=new Rectangle();
        rectangle.width=5;
        rectangle.height=8;

        int area= rectangle.calculateArea();
        System.out.println("넓이: "+area);

        int parimeter=rectangle.calculatePerimeter();
        System.out.println("둘레: "+parimeter);

        boolean isSquare= rectangle.isSquare();
        System.out.println("정사각형 여부: "+isSquare);
    }
}
