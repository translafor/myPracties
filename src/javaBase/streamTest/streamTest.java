package javaBase.streamTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static com.sun.org.apache.xerces.internal.util.PropertyState.is;

/**
 * @description:
 * @projectName:myPracties
 * @see:javaBase
 * @author:translafor
 * @createTime:2020/11/19 17:10
 * @version:1.0
 */
public class streamTest {
    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.setName("ss");
        List<Hello> list = new ArrayList<>();
        list.add(hello);
        System.out.println(list.get(0).getName());
        Optional<Hello> result = list.stream().filter(s->s.getName().equals("ss")).findFirst();
        result.get().setName("SSSSSSS");
        System.out.println(list.get(0).getName());
        System.out.println(result.isPresent());

    }
}
