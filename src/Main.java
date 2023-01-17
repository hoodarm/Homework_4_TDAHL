public class Main {
    public static void main(String[] args) {
        int[][] A = {{2, -6, 14, 7, 0}, {1, 78, 8, -4, 6}, {-19, 1, 2, 6, 18},
                    {17, 0, 7, 0, 0}, {1, 6, 90, 12, -45}, {1, 11, 0, 22, 0}};

        //sums of rows
        int finalSum = 0;
        for (int[] element : A) {
            int S = 0;
            for (int i : element) {
                S += i;
                finalSum += i;
            }
            System.out.println(S);
        }

        System.out.println();

        //sums of columns
        for (int i = 0; i <= 4; i++) {
            int S = 0;
            for (int[] element : A)
                S += element[i];
            System.out.println(S);
        }

        System.out.println();

        //sum of all elements
        System.out.println(finalSum);
    }
}