
package queuemanager;


public class SortedLinkedPriorityQueue<T> implements PriorityQueue<T> {
    
   private ListNode<T> head; 
   private ListNode<T> temp; 
   
   private int tailIndex;
   
   private int capacity;

    public SortedLinkedPriorityQueue() {
        {
            head = null;
            tailIndex = -1;
            capacity = size();
            
            
        }
       
}
    
  
    @Override
    public T head() throws QueueUnderflowException {
       if(isEmpty()){
           throw new QueueUnderflowException();
       }
       return head.getItem();
    }

    
    @Override
    public void add(T item, int priority) throws QueueOverflowException {
        if(isEmpty()){
            head = new ListNode<>(item, priority, head);
        } else if(!isEmpty()){
            ListNode<T> start = head;
            ListNode<T> last = start;
            head = new ListNode<>(item, priority, head);
            
            if(priority > start.getPriority()){
                head.next= start;
            } else if(priority < start.getPriority()) {
                while (start != null && priority < start.getPriority()){
                    head.next= last;
                    start = start.next;
                    if(start == null){
                        head.next = head;
                      
                    }else{
                        head.next= start;
                    }
                    head = last;
                }
                
            }                                                                         
            }
        
        }
    
                    
           
        
        
    

    @Override
    public void remove() throws QueueUnderflowException {
        if(isEmpty()){
            throw new QueueUnderflowException();
        }
        head = head.getNext();
    }

    @Override
    public boolean isEmpty() {
          return head == null;
    }
    

    
    
     @Override
    public String toString() {
    
        String result = " LinkedList: size " + size();
        result += "[";
        for(ListNode<T> node = head; node != null; node = node.getNext()){
            if(node != head){
                result += ", ";
            }
            result +=  node.getItem();
        
        result += ", " + node.getPriority();
        }
        result += "]";
        
       
        return result;
    }
    
        private int size(){
        ListNode<T> node = head;
        int result = 0;
        while (node!=null){
            result = result + 1;
            node = node.getNext();
        }
            return result;
    
}
    
    
    
}
        
    
