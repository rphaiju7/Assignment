public class array {
    public static void main(String[] args) {
        int[][] firstArrayMatrix ={{1,1,1,},
                                 {1,1,1}};
        int[][] secondArrayMatrix ={{2,2,2},
                             {2,2,2}};
        System.out.println("First matrix ");
        displayArray(firstArrayMatrix);
        System.out.println("Second matrix ");
        displayArray(secondArrayMatrix);
        System.out.println("Sum of two matrix:");
        sumMatrix(firstArrayMatrix,secondArrayMatrix);

    }
    public static void displayArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void sumMatrix(int[][] matrix1, int[][] matrix2){
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix1[i][j]+matrix2[i][j]+" ");
            }
            System.out.println();
        } }
}
