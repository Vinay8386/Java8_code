package Java8.InterviewQuestion;

import java.util.Arrays;

//Java program to find the longest String from a given array
public class SeventhQ {
    public static void main(String[] args) {
        String[] strArray={"Java","SpringBoot","Microservices","Golang"};
        String longest_String=Arrays.stream(strArray)
                .reduce((word1,word2)->word1.length()>word2.length()?word1:word2)
                .get();
        System.out.println(longest_String);

        String smallest_String=Arrays.stream(strArray)
                .reduce((word1,word2)->word1.length()<word2.length()?word1:word2)
                .get();
        System.out.println(smallest_String);
    }
}
