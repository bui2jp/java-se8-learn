import com.company.myclass.*;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class L11 {
    public static void main(String[] args) {
        System.out.println("test");

        Base01<String> b01 = new Base01<>("Base01 String");
        System.out.println(b01.get());

        Base01<Integer> b02 = new Base01<>(123);
        System.out.println(b02.get());

        Base02<Super01> b03 = new Base02<>(new Super01());
        System.out.println(b03.get());

        System.out.println(b01);
        System.out.println(b02);
        System.out.println(b03);

        //
        Base02 <Super01> b04 = new Base02<>(new Super01());
        Base02 <Sub01> b05 = new Base02<>(new Sub01());
        Base02 <Sub02> b06 = new Base02<>(new Sub02());
        System.out.println(b04.get());
        System.out.println(b05.get());
        System.out.println(b06.get());

        List<Super01> list01 = new ArrayList<>();
        list01.add(new Super01());
        list01.add(new Sub01());
        list01.add(new Sub02());
        System.out.println(list01);
        System.out.println(list01.get(0));
        System.out.println(list01.get(1));
        System.out.println(list01.get(2));

        //lesson 16
        BaseList01 <String> bl01 = new BaseList01<>();
        bl01.create();
        bl01.add("test1");
        bl01.add("test2");
        bl01.add("test3");
        System.out.println(bl01);

        BaseList01 <Integer> bl02 = new BaseList01<>();
        bl02.create();
        bl02.add(123);
        bl02.add(456);
        bl02.add(789);
        System.out.println(bl02);

        BaseList01 <Super01> bl03 = new BaseList01<>();
        bl03.create();
        bl03.add(new Super01());
        bl03.add(new Sub01());
        bl03.add(new Sub02());
        System.out.println(bl03);

        //17 parameter ?
        printList(bl01);
        printList(bl02);
        printList(bl03);

        //26 interfaceの利用
        SampleInterface.printStatic();
        //SampleInterface si1 = new SampleInterface();
        SampleInterface si2 = new SampleInterface() {
            @Override
            public void printAbstract(String instr) {
                System.out.println(instr);
            }
        };
        si2.printDefault();
        si2.printDefault2();
        si2.printAbstract("abc");

        SampleMyClass si3 = new SampleMyClass();
        si3.printAbstract("");


        //28
        CheckWonLottery cw = new CheckWonLottery() {
            @Override
            public String check(Integer inNo, Integer winNo) {
                if (inNo.equals(winNo)){
                    return "ok";
                }else{
                    return "ng";
                }
            }
        };
        System.out.println(cw.check(1,123));

        Consumer<String> cs1 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("111111");
            }
        };
        Consumer<String> cs2 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("222222");
            }
        };
        cs1.accept("");
        cs2.accept("");

        Consumer<String> cs3 = cs1.andThen(cs2);
        cs3.accept("test");
    }

    static private void printList(BaseList01<?> pData){
        System.out.println(pData);

    }
}

class SampleMyClass implements SampleInterface{
    @Override
    public void printAbstract(String instr){
        System.out.println("cccc");
    }
}
