public class Exercise14 {

    public static void main(String[] args){

        int num = 47098;
        int reversedNumber = 0;

        while(num != 0){
            int x = num % 10;

            reversedNumber = reversedNumber * 10 + x;
            num /= 10;

        }

        System.out.println(reversedNumber);

    }
}
