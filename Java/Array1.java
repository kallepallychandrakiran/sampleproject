public class Array1 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        int[][][] a = new int[4][][];
        a[0] = new int[3][];
        a[1] = new int[4][];
        a[2] = new int[2][];
        a[3] = new int[1][];
        a[0][0] = new int[] { 10, 20, 30, 40 };
        a[0][1] = new int[] { 10, 20, 30, 40 };
        a[0][2] = new int[] { 10, 20, 30, 40 };
        a[1][0] = new int[] { 1, 2, 3 };
        a[1][1] = new int[] { 5, 6, 7 };
        a[1][2] = new int[] { 9, 10, 11, 12 };
        a[1][3] = new int[] { 13, 14, 15, 16 };
        a[2][0] = new int[] { 33, 44, 55, 66 };
        a[2][1] = new int[] { 77, 88, 99, 00 };
        a[3][0] = new int[] { 7, 2, 3, 8 };

        for (int i = 0; i <= a.length - 1; i++) {
            for (int j = 0; j <= a[i].length - 1; j++) {
                for (int k = 0; k <= a[i][j].length - 1; k++) {
                    System.out.print(a[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        int b[] = { 10, 20, 30, 40 };
        int[] c = new int[] { 12, 40, 50, 60 };
        int[] d = new int[5];
        int e[] = new int[6];

        // for (int x : c) {
        // System.out.print(x + " ");
        // }

    }
}
