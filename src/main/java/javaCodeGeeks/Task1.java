package javaCodeGeeks;
/*

1. Given n and an array of strings, print the string that contains the digits (1, 2, 3),
if there are multiple strings that satisfies the conditions, print them in ascending order.

        Input  : 5
        1395
        1721298
        102030
        3215
        123

        Output : 123
        3215
        102030
*/


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        String[] arr = {"589213","1234","4321","0930012","0002", "" , "  "};
        List<Long> result = new ArrayList<>();

        for(String n : arr){
            if(checkIfCharactersExists(n)){
                result.add(Long.valueOf(n));
            }
        }

        List<Long> orderedResult = result.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("orderedResult : "  +orderedResult);
    }

    public static boolean checkIfCharactersExists(String test){
        return test.contains("1") && test.contains("2") && test.contains("3");
    }


}
