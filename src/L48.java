import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class L48 {
    public static void main(String[] args) {
        System.out.println("stream API");

        Stream<String> zoo = Stream.of("CAT","DOG","PIG","COW");

//        zoo.filter(a -> a.charAt(0) == 'C')
//                .forEach(a -> System.out.println(a));

        //zoo.sorted().limit(3).forEach(System.out::println);

        //boolean anyMatch
        //R collect
        //long count
        //Optional<T> findAny
        //void forEach
        //Optional<T> max
        //T reduce

        //Stream<T> filter, distinct, limit, skip, sorted, peek
        //Stream<R> map, flatmap

        List<String> animal = new ArrayList<>();
        animal = Arrays.asList("aaa","bbb","ccc");
        Stream<String> stream1 = animal.stream(); //streamを作成
        Stream<String> stream2 = animal.stream(); //streamを作成
        Stream<String> stream3 = animal.stream(); //streamを作成
        Stream<String> stream4 = animal.stream(); //streamを作成

        stream1.map(s -> s.charAt(0)).forEach(System.out::println);
        stream2.map(s -> { return s.charAt(0); }).forEach(a -> System.out.println(a));

        stream3.map(s -> {
            System.out.println("map...");
            return "";
        }).forEach(a -> {
            System.out.println("forEach...");
        });

        //allMatch
        //System.out.println(stream4.allMatch(a-> a.equals("aaa")));
        //anyMatch
        //System.out.println(stream4.anyMatch(a-> a.equals("aaa")));
        //nonMatch
        //System.out.println(stream4.noneMatch(a-> a.equals("aaa")));

        //reduce
        //System.out.println(stream4.reduce("",(a, b) -> a + b + ""));

        //collect (stream to list)
        //List<String> list = stream4.sorted().collect(Collectors.toList());
        //System.out.println(list);

        //flatMap 平坦化
        List<String> zoo1 = Arrays.asList("111","222","333");
        List<String> zoo2 = Arrays.asList("aaa","bbb","ccc");
        List<List<String>> allzoo = Arrays.asList(zoo1, zoo2);
        List<String> detailAnimal = allzoo.stream()
                .flatMap(a -> a.stream()).collect(Collectors.toList());
        detailAnimal.stream().forEach(System.out::println);

        List<String> mylist01 = Arrays.asList("111","222","333");
        String result = mylist01.stream()
                .peek(s -> {
                    System.out.print("peek.");
                    System.out.println(s);
                })
                .reduce("", (a, b) -> {
                    System.out.println("reduce... " + a + ":" + b);
                    return a + b;
                });


    }
}
