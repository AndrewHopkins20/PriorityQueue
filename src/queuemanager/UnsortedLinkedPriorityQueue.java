/*
 * File Name: UnsortedLinkedPriorityQueue
 * Last Edited: 24/03/22
 * Note: My Attempt at Making a priority queue using a unsorted linked list
 */
package queuemanager;

/**
 *
 * @author Andrew Hopkins
 */
public class UnsortedLinkedPriorityQueue<T> implements PriorityQueue<T> {
      // creates the list and calls it head
      private ListNode<T> head; 
    
    public UnsortedLinkedPriorityQueue() {
        {
            //sets head to be null
            head = null;
            
            
        }
       
    }
    
  
    @Override
    public T head() throws QueueUnderflowException {
       if(isEmpty()){
           throw new QueueUnderflowException();
       }
       //scans through nodes saving as max and then if then checks next node. if the next node has higher priority it sets it as max
       //when its checked all the nodes it sets the temp value to be the node at max which will be the highest priority and then displays it
       int maxPriority = 0;
       ListNode<T> temp = head;
       for(ListNode<T> max = head; max != null; max = max.getNext()){
       
       if(max.getPriority() > maxPriority){
           maxPriority = max.getPriority();
           temp = max;
       }
       }
       return temp.getItem();
    }

    
    @Override
    public void add(T item, int priority) throws QueueOverflowException {
       //adds new item to list at the first position as it is unsorted
            head = new ListNode<>(item, priority, head);
        
        }
    
                    

    @Override
    public void remove() throws QueueUnderflowException {
        if(isEmpty()){
            throw new QueueUnderflowException();
        }        
        ListNode<T> temp = head;
        ListNode<T> current = null;
        int i = 0;
        int maxPriority = 0;
        //scans each node for highest priority same as head
        for(ListNode<T> max = head; max != null; max = max.getNext()){
            //keeps track of the node behind the one being removed as temp so when we remove it we can move the temp node up
            if(i >= 2){
                temp = temp.next;
            }
            if(max.getPriority() > maxPriority){
                maxPriority = max.getPriority();
                if(i != 0){
                    current = temp;
                }
                
            }
            i++;
        }
        if(current == null){
            head = head.next;
        }
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
        

