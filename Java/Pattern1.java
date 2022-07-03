public class Pattern1 {
    public static void main(String[]args){
        int i,j;
        for(i=1;i<=5;i++){
            for(j=1;j<=5;j++){
                System.out.print("* ");
            }
            if(i==1 && j==5){
                System.out.print("* ");
            }
            else{
                System.out.println(" ");
            }
            System.out.println();
        }
    }
    
}
