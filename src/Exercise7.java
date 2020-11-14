public class Exercise7 {

    static int[][] increasingNumbers = {
            {5,4,3,2,1},
            {4,3,2,1},
            {3,2,1},
            {2,1},
            {1},

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












