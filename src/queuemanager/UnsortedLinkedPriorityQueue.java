/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuemanager;

/**
 *
 * @author Andrew Hopkins
 */
public class UnsortedLinkedPriorityQueue<T> implements PriorityQueue<T> {
    
      private ListNode<T> head; 
    
    public UnsortedLinkedPriorityQueue() {
        {
            head = null;
            
            
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
       
            head = new ListNode<>(item, priority, head);
        
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
        

