package javaCodeGeeks;
/*

2. Given a sequence of M and N with M representing increasing and N representing decreasing,
output the smallest number that follows this pattern.



        Input    : MMMM
        Output   : 12345

        Input    : NNNN
        Output   : 54321

        Input    : MMNM
        Output   : 2314

*/

import java.util.ArrayList;
import java.util.List;

public class Task2 {

   public static List<String> resultList = new ArrayList<>();

    public static void main(String[] args) {

        String test = "MMMM MM";
        String test2 = "NNNN";

        Long startNumber = countOccurencesN(test2);
        checkLetterAndDoMathOperation(test2, startNumber);
    }

    private static void checkLetterAndDoMathOperation(String test2, Long startNumber) {
        resultList.add(String.valueOf(startNumber));

        for (Character c : test2.toCharArray()){
            if(c == 'N'){
                resultList.add(String.valueOf(--startNumber));
            }else{
                resultList.add(String.valueOf(++startNumber));
            }
        }

        System.out.println("result --" + resultList.toString());
    }

    private static Long countOccurencesN(String test) {
        return test.trim()
                .chars()
                .filter( ch -> ch == 'N')
                .count()+1;
    }
}
