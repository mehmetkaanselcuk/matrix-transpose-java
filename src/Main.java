public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 3, 4},
                {5, 6, 4}
        };

        int[][] transpoze = new int[matrix[0].length][matrix.length];


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transpoze[j][i] = matrix[i][j];
            }
        }


        System.out.println("Matrix:");
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "    ");
            }
            System.out.println();
        }

        System.out.println("Transpoze:");
        for (int[] row : transpoze) {
            for (int val : row) {
                System.out.print(val + "    ");
            }
            System.out.println();
        }
    }
}
