public class Exercise15 {

    public static void main(String[] args){

        int[] numbers = {10 , 20 , 30 , 40 , 50 , 60 , 70 , 80 , 90 , 100};

        for(int index = 0; index < numbers.length; ++index) {

            if(index % 2 == 0){
                System.out.println(numbers[index]);
            }

        }


    }
}
