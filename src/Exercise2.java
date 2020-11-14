public class Exercise2 {

    static int[][] increasingNumbers = {
            {1},
            {1,2},
            {1,2,3},
            {1,2,3,4},
            {1,2,3,4,5,},

    };

    public static String printNumbers(int[][] board){
        String output = "";
        for(int[] row: increasingNumbers){
            for(int element: row){
                output += "" + element + " ";
            }
            output += "\n";
        }
        return output;
    }


    public static void main(String[] args){

        System.out.println(printNumbers(increasingNumbers));
    }
}




