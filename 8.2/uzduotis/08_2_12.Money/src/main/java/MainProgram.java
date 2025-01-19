
public class MainProgram {

    public static void main(String[] args) {
        Money a = new Money(10, 0);
        Money b = new Money(3, 50);
        Money d = new Money(5, 0);

        Money c = a.plus(b);
        Money e = a.minus(b);

//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);

//        a = a.plus(c);
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);

        // test your class here

//        System.out.println(a.lessThan(b));
//        System.out.println(b.lessThan(d));

        e = e.minus(a);
        System.out.println(e);
    }


}
