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
public class UnsortedArrayPriorityQueue<T> implements PriorityQueue<T> {
    
    private final Object[] storage;
    private final int capacity;
    private int tailIndex;
    
    
    
    
    
    
public UnsortedArrayPriorityQueue(int size) {
        storage = new Object[size];
        capacity = size;
        tailIndex = -1;
}


  @Override
    public T head() throws QueueUnderflowException {
        
        if (isEmpty()) {
            throw new QueueUnderflowException();
        } else{
            int i = 0;
            for (i = 0; i < tailIndex; i++)
                storage[i] = storage[i + 1];
               return ((PriorityItem<T>) storage[i]).getItem();
                }
            
        }
        




    @Override
    public void add(T item, int priority) throws QueueOverflowException {
       tailIndex = tailIndex + 1;
       if (tailIndex >= capacity) {
           tailIndex = tailIndex - 1;
           throw new QueueOverflowException();
       } else {            
                int i = tailIndex;                             
                storage[i] = new PriorityItem<>(item, priority);                  
    }
    }
  

    @Override
    public void remove() throws QueueUnderflowException {
        
    }

    @Override
    public boolean isEmpty() {
        return tailIndex < 0;
    }
     @Override
    public String toString() {
        String result = "[";
        for (int i = 0; i <= tailIndex; i++) {
            if (i > 0) {
                result = result + ", ";
            }
            result = result + storage[i];
        }
        result = result + "]";
        return result;
    }
}
