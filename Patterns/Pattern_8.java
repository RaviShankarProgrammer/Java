public class Pattern_8 {
    public static void main(String[] args){
        int k=2;
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
                System.out.printf("%2d ",k);
                k+=2;
            }
            System.out.println();
        }
    }
}
