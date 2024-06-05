public class Pattern_13 {
    public static void main(String[] args) {
        int a = 9, b = 1;
        for (int i = 1; i <= 5; i++) {
            int k = i;
            for (int j = 1; j <= 5; j++) {
                if (j % 2 == 0) {
                    System.out.print(k + " ");
                    k = k + b;
                } else {
                    System.out.print(k + " ");
                    k = k + a;
                }
            }
            System.out.println();
            a -= 2;
            b += 2;
        }
    }
}
