import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.*;

public class L37 {
    public static void main(String[] args){
        System.out.println("関数型インターフェース");

        // Consumer<T> void accept(T t)
        Consumer<String> cs = s -> System.out.println(s);
        cs.accept("consumer test");

        // Function<T, R> R apply(T t)
        Function<String, String> fc = s -> { return "functions:" + s; };
        System.out.println(fc.apply("function test"));

        // BiPredicate<T,U> boolean test(T t, U u)
        BiPredicate<Integer, Integer> bp = (a, b) -> {
            if (a > b){
                return true;
            }
            return false;
        };
        System.out.println(bp.test(3,2));

        // Supplier<T> T get()
        Supplier<String> sp = () -> { return "aaa";};
        System.out.println(sp.get());

        Supplier<String> sp2 = () -> "bbb";
        System.out.println(sp2.get());

        //静的メソッド参照 39
        String str = String.valueOf(123);

        Function<Integer, String> fc2 = String::valueOf;
        System.out.println(fc2.apply(111));

        Function<Integer,String> fc3 = i -> { return String.valueOf(i);};
        System.out.println(fc3.apply(222));


        //40 インスタンスメソッド参照
        String word = "cat";
        System.out.println(word.toUpperCase());

        UnaryOperator<String> uo = String::toUpperCase;
        System.out.println(uo.apply("abc"));

        //41
        Supplier<String> sp01 = String::new;
        String str21 = sp01.get();
        System.out.println(str21);

        Supplier<ArrayList<String>> sp22 = ArrayList<String>::new;
        ArrayList<String> al22 = sp22.get();
        System.out.println(al22.size());

        UnaryOperator<String> uo41 = String::new;
        System.out.println(uo41.apply("unaryOp"));


        //43
        List<String> list = new ArrayList<>();
        list = Arrays.asList("aaa","bbb","ccc");
        list.forEach(s -> System.out.println(s));

        list.forEach(System.out::println); //静的メソッド参照

        //44 ラムダ式
        String baseString = " CAT dog Fox Cow ";
        //
        String r71 = baseString.trim();
        UnaryOperator<String> uo44 = s -> s.trim();
        uo44.apply(baseString);

        //45 lambda
    }
}
