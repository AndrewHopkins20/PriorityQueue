
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
        
        queue = new ListNode<>(item, priority, queue);
        
    }

    @Override
    public void remove() throws QueueUnderflowException {
        if(isEmpty()){
            throw new QueueUnderflowException();
        }
        queue = queue.getNext();
    }

    @Override
    public boolean isEmpty() {
          return queue == null;
    }
    

    
    
     @Override
    public String toString() {
    
        String result = " LinkedList: size " + size();
        result += "[";
        for(ListNode<T> node = queue; node != null; node = node.getNext()){
            if(node != queue){
                result += ", ";
            }
            result +=  node.getItem();
        
        result += ", " + node.getPriority();
        }
        result += "]";
        
       
        return result;
    }
    
        private int size(){
        ListNode<T> node = queue;
        int result = 0;
        while (node!=null){
            result = result + 1;
            node = node.getNext();
        }
            return result;
    
}
    
    
    
}
        
    
