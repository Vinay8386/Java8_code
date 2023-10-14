package Java8.InterviewQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Write a java program to find all duplicate element of a given String
public class SecondQ {
    public static void main(String[] args) {
        String str="abcadc";

        /*Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream()
                .filter(input->input.getValue()>1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);*/

        List<String> duplicateElement=Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))//group by based on identity & count
                .entrySet().stream()
                .filter(input->input.getValue()>1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(duplicateElement);
    }
}
