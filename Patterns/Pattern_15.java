public class Pattern_15 {
    public static void main(String[] args) {
        int a=1, b=9;
        for(int i=5; i>=1; i--){
            int k=i;
            for(int j=1; j<=5; j++){
                if(j%2!=0){
                    System.out.printf("%2d ",k);
                    k=k+a;
                }
                else{
                    System.out.printf("%2d ",k);
                    k=k+b;
                }
            }
            System.out.println();
            a+=2;
            b-=2;
        }
    }
}
