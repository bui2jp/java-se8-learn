@FunctionalInterface
interface MyInterface1 <T>{
    void accept(T t);
}

class MyClass01 implements MyInterface1<String>{
    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}

public class L34 {
    public static void main(String[] args) {
        System.out.println("test start");

        System.out.println("# 1");
        MyClass01 obj = new MyClass01();
        obj.accept("test1");

        System.out.println("# 2");
        MyInterface1<String> myInterface1 = new MyInterface1<String>() {
            @Override
            public void accept(String o) {
                System.out.println("test2");
            }
        };
        myInterface1.accept(null);


        System.out.println("# 3");
        //MyInterface1<String> cs = (String s) -> { System.out.println(s);};
        MyInterface1<String> cs = s -> System.out.println(s);
        cs.accept("lambda func");
    }
}
