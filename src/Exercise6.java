
public class Exercise6 {

    public static void main(String[] args){

        int num = 345987;
        int amountOfDigits = 0;

        do{
            num = num/10;
            ++amountOfDigits;

        }while(num != 0);
        System.out.println(amountOfDigits);


    }


}



