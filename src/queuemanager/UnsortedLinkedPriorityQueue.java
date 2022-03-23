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
        
        for(ListNode<T> max = head; max != null; max = max.getNext()){
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
        

