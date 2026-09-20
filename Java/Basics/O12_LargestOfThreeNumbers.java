public class O12_LargestOfThreeNumbers{
    public static void main(String[] args){

        int a = 12;
        int b = 23;
        int c = 15;

        if( a >= b && a >= c ){
            System.out.println("Largest = " + a );

        }else if( b >= a && b >=c ){
            System.out.println("Largest = " + b );

        }else{
            System.out.println("Largest = " + c);
        }
         

    }
}