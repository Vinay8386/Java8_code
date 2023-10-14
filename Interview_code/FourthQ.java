package Java8.InterviewQuestion;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

//Java program to find a first non-repeated element from a given String.
public class FourthQ {
    public static void main(String[] args) {
        String str="iLoveJava";
        //Because of groupingBy method, Java will consider the whole expression as HashMap
        //In HashMap insertion order is not preserved, so below expression may give wrong answer
        String firstUnique=Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream()
                .filter(input->input.getValue()==1)
                .findFirst().get().getKey();
        System.out.println(firstUnique);

        //To resolve this, we will use LinkedHashMap object in groupingBy method
        //Insertion order is preserved in LinkedHashMap, and below code will give a first non_repeated element from a given String
        String first_non_repeated_element=Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream()
                .filter(input->input.getValue()==1)
                .findFirst().get().getKey();
        System.out.println(first_non_repeated_element);
    }
}
