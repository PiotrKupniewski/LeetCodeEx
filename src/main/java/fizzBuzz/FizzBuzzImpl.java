package fizzBuzz;

public class FizzBuzzImpl {

    public static void fizzBuzz(){
        for(var i = 1000; i<= 1300; i++){

            String out =  i + "-- ";
            if(i%3 == 0){
                out += "Fizz";
            }
            if(i%5 == 0){
                out +="Buzz";
            }
            System.out.println("out : {} "+  out );
        }
    }

}
