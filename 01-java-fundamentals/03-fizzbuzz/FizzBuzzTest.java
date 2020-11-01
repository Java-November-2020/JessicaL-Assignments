public class FizzBuzzTest {
    public static void main(String[] args){
        FizzBuzz fB = new FizzBuzz();
        for(int i=0; i<16; i++){
            String result = fB.fizzBuzz(i);
            System.out.println(result);
        }
        

        
    }
}
