public class Pattern_17 {
    public static void main(String[] args){
        for(int i=1; i<=10; i+=2){
            int k=i;
            for(int j=1; j<=5; j++){
                System.out.printf("%2d ",k);
                k+=2;
            }
            System.out.println();
        }
    }
}
