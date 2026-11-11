public class TestFactorial{
    public static void main(String[] args){
        int fact= Factorial.factorial(5);
        System.out.println(fact);
        if(fact==120){
            System.out. println("test passed");
        }
        else{
            System.out.println("test failed");
        }
    }
}