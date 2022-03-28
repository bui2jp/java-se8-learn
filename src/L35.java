import java.util.function.Consumer;

public class L35 {
    public static void main(String[] args) {
        System.out.println("test start");

        Consumer<String> cs1 = s -> System.out.println(s);
        Consumer<String> cs2 = s -> System.out.println(s);
        Consumer<String> cs3 = (String s) -> System.out.println(s);

        cs1.accept("111");
        cs2.accept("222");
        cs3.accept("333");

        Consumer<String> cs4 = s -> {
            System.out.println("aaa");
            System.out.println("bbb");
            System.out.println(s);
        };
        cs4.accept("asdfasdf");
    }
}
