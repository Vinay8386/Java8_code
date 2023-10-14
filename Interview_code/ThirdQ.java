package Java8.InterviewQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Java program to find unique element in a given String
public class ThirdQ {
    public static void main(String[] args) {
        String str="abcad";
        List<String> uniqueString =Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream()
                .filter(input->input.getValue()==1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(uniqueString);
    }
}