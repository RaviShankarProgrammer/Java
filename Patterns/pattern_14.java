public class pattern_14 {
    public static void main(String[] args) {
        for(int i=5; i>=1; i--){
            int k=i;
            for(int j=1; j<=5; j++){
                System.out.printf("%2d ",k);
                k+=5;
            }
            System.out.println();
        }
    }
}
