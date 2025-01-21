

public class Main {

    public static void main(String[] args) {
//        BoxWhitMaxWeight coffeeBox = new BoxWhitMaxWeight(10);
//        coffeeBox.add(new Item("Saludo", 5));
//        coffeeBox.add(new Item("Pirkka", 5));
//        coffeeBox.add(new Item("Kopi Luwak", 5));
//        // You can test your program here
//
//        System.out.println(coffeeBox.isInBox(new Item("Saludo")));
//        System.out.println(coffeeBox.isInBox(new Item("Pirkka")));
//        System.out.println(coffeeBox.isInBox(new Item("Kopi Luwak")));

        MisplacingBox box = new MisplacingBox();
        box.add(new Item("Saludo", 5));
        box.add(new Item("Pirkka", 5));

        System.out.println(box.isInBox(new Item("Saludo")));
        System.out.println(box.isInBox(new Item("Pirkka")));
    }
}
