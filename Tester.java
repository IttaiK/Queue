public class Tester{
    public static void main(String[] args){
        //A queue is: First in, first out
        //same as Queue but push adds to back instead of top, and pop takes from front

        int TestCasesPassed = 0;
        int TotalTestCases = 0;

        //StackTestCases

        //test for initialization
        TotalTestCases++;
        Queue t1 = new Queue(25);
        TestCasesPassed++;

        //test for size zero (Should be legal)
        TotalTestCases++;
        Queue zero = new Queue(0);
        TestCasesPassed++;

        //test error for no given size
        TotalTestCases++;
        try{
            Queue noSize = new Queue();
        } catch(Exception RuntimeException){
            TestCasesPassed++;
        }

        //test push
        TotalTestCases++;
        Queue P = new Queue(5);
        P.push(5);
        TestCasesPassed++;

        //test pop
        TotalTestCases++;
        int temp = P.pop();
        if (temp == 5){
            TestCasesPassed++;
        }

        //test basic function
        TotalTestCases++;
        for(int i = 1; i<11; i++){
            t1.push(i);
        }
        String out = "";
        for(int i = 1; i<11; i++){
            out += t1.pop();
        }
        try{
            t1.pop();
        }catch(Exception RuntimeException){
            if(out.equals("12345678910")){
                TestCasesPassed++;
            }
        }
        out = "";

        //test for underflow
        TotalTestCases++;
        try{
            t1.pop();
        }catch(Exception RuntimeException){
            TestCasesPassed++;
        }

        //test overflow
        TotalTestCases++;
        try{
            for(int i = 1; i<30; i++){
                t1.push(i);
            }
        }catch(Exception runtimeException){
            TestCasesPassed++;
        }

        //test function right before overflow
        Queue t2 = new Queue(5);

        TotalTestCases++;
        for(int i = 1; i<6; i++){
            t2.push(i);
        }
        out = "";
        for(int i = 1; i<6; i++){
            out += t2.pop();
        }
        try{
            t2.pop();
        }catch(Exception RuntimeException){
            if(out.equals("12345")){
                TestCasesPassed++;
            }
        }
        out = "";

        //test for function when going back and forth
        TotalTestCases++;
        Queue t3 = new Queue(40);
        t3.push(5);
        t3.push(1225);
        t3.push(900);
        t3.push(51);
        t3.push(70);
        t3.push(1);
        t3.push(0);
        t3.push(-8);
        out += t3.pop();
        out += t3.pop();
        out += t3.pop();
        t3.push(70);
        t3.push(1);
        t3.push(89);
        out += t3.pop();
        out += t3.pop();
        out += t3.pop();
        if(out.equals("-80189170")){
            TestCasesPassed++;
        }
        out="";
        
        System.out.println("Tests passed: "+TestCasesPassed+"/"+TotalTestCases);
    }
}