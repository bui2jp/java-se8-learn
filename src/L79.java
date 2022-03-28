import com.company.myclass.NewStudents;
import com.company.myclass.PrintStudent;
import com.company.myclass.Student;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class L79 {
    public static void main(String[] args) {
        System.out.println("List");

        PrintStudent ps = new PrintStudent();

        List<Student> lstd1 = (new NewStudents()).getStd();
        ps.printStudent("1111", lstd1);

        List<Student> stds2 = lstd1.stream().
                collect(Collectors.mapping(
                        s -> {
                            if (s.getMark() >= 70){
                                s.setResult("合格");
                            }else{
                                s.setResult("不合格");
                            }
                            return s;
                        }
                        , Collectors.toList()));
        ps.printStudent("2222", stds2);

        List<Student> stds3 = lstd1.stream().
                filter(s -> {
                    if (s.getMark() >= 70) {
                        return true;
                    }
                    return false;
                }).
                sorted((s1, s2)->{
                    //return s1.getMark() - s2.getMark();

                    return s2.getMark() - s1.getMark();
                }).
                collect(Collectors.mapping(
                        s -> {
                            if (s.getMark() >= 70){
                                s.setResult("合格");
                            }else{
                                s.setResult("不合格");
                            }
                            return s;
                        }
                        , Collectors.toList())
                )
                ;
        ps.printStudent("333", stds3);


        //total sum
        int total = lstd1.stream().collect(
                Collectors.summingInt(s->s.getMark())
        );
        System.out.println("total: " + total);
        //avg
        double avg = lstd1.stream().collect(
                Collectors.averagingDouble(s->s.getMark())
        );
        System.out.println("avg: " + avg);

        //max
        Optional<Student> max_st = lstd1.stream().collect(
                Collectors.maxBy((s1, s2) -> { return s1.getMark() - s2.getMark();})
        );
        System.out.println("max: " + max_st.get().getMark());

        //min
        Optional<Student> min_st = lstd1.stream().collect(
                Collectors.minBy((s1, s2) -> { return s1.getMark() - s2.getMark();})
        );
        if ( min_st.isPresent() ){
            System.out.println("min: " + min_st.get().getMark());
        }else{
            System.out.println("min: not present");
        }

        //map
        String allName = lstd1.stream().
                map(s -> s.getName()).
                collect(Collectors.joining(" + "));
        System.out.println(allName);

        //list to set
        Set<Student> setStudent = lstd1.stream().collect(Collectors.toSet());
        ps.printStudent(setStudent);

        //list
        //set ()
        //map (key, value)
        Map<String, Student> map1 = lstd1.stream().collect(Collectors.toMap(
                s -> s.getKey(), s -> s)
        );
        ps.printStudent(map1);


        //83
        Map<String, Optional<Student>> map01 = lstd1.stream()
                .collect(
                        Collectors.groupingBy( s -> s.getKey().substring(0,1),
                        Collectors.maxBy( (s1, s2) -> s1.getMark() - s2.getMark())));
        ps.printStudent2(map01);
    }
}
