package Java8.InterviewQuestion;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Given a list of integers, find the minimum value element present in it using Stream functions?
public class FifteenthQ {
    public static void main(String[] args) {
        List<Integer> numList= Arrays.asList(2,4,5,6,1);

        //Approach-1
        Integer ans=numList.stream().sorted().findFirst().get();
        System.out.println(ans);

        //Approach-1
        Integer ans2=numList.stream().min(Comparator.naturalOrder()).get();
        System.out.println(ans2);

        //Approach-2
        Integer val=numList.stream().min(Integer::compare).get();
        System.out.println(val);

    }
}
