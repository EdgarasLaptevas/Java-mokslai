

public class Main {

    public static void main(String[] args) {
        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000);
        juice.takeFromWarehouse(11.3);
//        System.out.println(juice.getName());
        juice.addToWarehouse(1);
//        System.out.println(juice);

//        System.out.println(juice.history());
        juice.printAnalysis();
        // here you can write code to test your classes

    }

}
