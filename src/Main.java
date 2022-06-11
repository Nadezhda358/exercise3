public class Main {
    //Напишете метод, който приема две матрици и връща матрицата, получена от умножението им.
    //*приемаме, че подадените матрици са с подходящи
    //размери
    public static void multiplyTwoArrays(int[][] matrix1, int[][] matrix2){
        int[][] result = new int[matrix1.length][matrix2[0].length];

        for(int row = 0; row < matrix1.length; row++){
            for(int column = 0; column < matrix2[0].length;column++){
                result[row][column] = 0;
                for(int k = 0; k < matrix1[0].length;k++)
                {
                    result[row][column] += matrix1[row][k] * matrix2[k][column];
                }
                System.out.print(result[row][column] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] a = {
                {1, 9},
                {3, 12},
                {6, 15}
        };
        int[][] b={
                {1,3,6},
                {9,12,15}
        };

        multiplyTwoArrays(a, b);


    }
}