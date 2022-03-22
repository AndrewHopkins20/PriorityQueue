
package queuemanager;


public class SortedLinkedPriorityQueue<T> implements PriorityQueue<T> {
    
   private ListNode<T> queue; 
   

    
    
    
    
    public SortedLinkedPriorityQueue() {
        {
            queue = null;
        }
       
}
    
  
    @Override
    public T head() throws QueueUnderflowException {
       if(isEmpty()){
           throw new QueueUnderflowException();
       }
       return queue.getItem();
    }

    
    @Override
    public void add(T item, int priority) throws QueueOverflowException {
        
    }

    @Override
    public void remove() throws QueueUnderflowException {
        
    }

    @Override
    public boolean isEmpty() {
          return queue == null;
    }
     @Override
    public String toString() {
    
    }
}
        
    
