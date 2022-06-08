public class Graph {
    public static void main(String[] args) {
        int A[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int sumd = 0;
        int small = 15;
        int great = -1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    sumd = A[7];
                    {
                        if (j == 2)
                            small = Math.min(small, A[i][j]);
                        great = Math.max(great, A[i][j]);

                    }
                }
                System.out.println("Average of diagonal = " + sumd / 3);
                System.out.println("Smallest in column 3 = " + small);
                System.out.println("greatest element in matrix A =" + great);
            }

        }
    }
}