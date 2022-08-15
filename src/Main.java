public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Circle circle = new Circle();

        circle.setPI(3.14159265359);
        circle.area(15,15);
        System.out.println();
        circle.circumference(45);
    }
}