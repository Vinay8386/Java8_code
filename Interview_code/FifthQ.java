package Java8.InterviewQuestion;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

//Java program to find a first repeated element from a given String.
public class FifthQ {
    public static void main(String[] args) {
        String str="iLoveJava";
        //Use LinkedHashMap so insertion order will be preserved, and you will get the correct answer
        String first_repeated_element=Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream()
                .filter(input->input.getValue()>1)
                .findFirst().get().getKey();
        System.out.println(first_repeated_element);
    }
}
/*
In groupingBy method, we have used constructor reference of LinkedHashMap to create LinkedHashMap object. If you don't
use LinkedHashMap, then groupingBy method will consider this as HashMap object and insertion order not preserve in
HashMap. So, In place of the first repeated string maybe you will get second or different repeated String.
 */
