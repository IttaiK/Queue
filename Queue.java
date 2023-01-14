public class Queue {

    //check that it kicks it back properly
    //careful of overflow/underflow
    
    private int[] Queue;
    private int index = 0;
    
        public Queue(){
            throw new RuntimeException("NoGivenSizeException");
        }
    
        public Queue(int size){
            Queue = new int[size];
        }
        
        public void push(int num){
            if(index+1 >= Queue.length){
                throw new RuntimeException("StackOverflowException");
            }
            for(int i = index+1; i>=0; i--){
                Queue[index+1] = Queue[index];
            }
            Queue[0] = num;
            index++;
        }
    
        public int pop(){
            if(index-1 < 0){
                throw new RuntimeException("StackUnderflowException");
            }
            return Queue[index--];
        }
}
