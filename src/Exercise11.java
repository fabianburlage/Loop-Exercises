import java.lang.Math;

public class Exercise11 {

    public static void main(String[] args){

        int start = 25;
        int end = 50;



        System.out.println("Prime numbers between " + start + " and " + end + " are: ");

        while(start < end) {
            boolean isPrime = false;

            for(int x = 2; x <= start/2; ++x){
                if(start % x == 0) {
                    isPrime = true;

                }

            }

            if(!isPrime && start != 0 && start != 1)
                System.out.println(start);

            ++start;

        }
    }
}
