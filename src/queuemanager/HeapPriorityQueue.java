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
public class HeapPriorityQueue<T> implements PriorityQueue<T>{
    private final Object[] Heap;
    private final int capacity;
    private int tailIndex;
    
    
   
    
    public HeapPriorityQueue(int size){
       //Heap stores the data, capacity is the size of the heap, and tail index is equal to the number of items minus 1, same as sorted array
       Heap = new Object[size];
       capacity = size;
       tailIndex = -1;
        
        
    }
    
 
    

  

    @Override
    public void add(T item, int priority) throws QueueOverflowException {       
        Object[] temp = new Object[1]; 
        tailIndex = tailIndex + 1;
        int element = tailIndex;
        //calculates the position of the parent
        int parent = (element -1)/2;        
        temp[0] = parent;
        if (tailIndex >= capacity) {           
            tailIndex = tailIndex - 1;
            throw new QueueOverflowException();
        } else if (((PriorityItem<T>) Heap[element]).getPriority() > ((PriorityItem<T>) Heap[parent]).getPriority()){
            //swaps the elements around with the parent based on priority
            while(Heap[parent] != null && ((PriorityItem<T>) Heap[element]).getPriority() > ((PriorityItem<T>) Heap[parent]).getPriority()){              
                temp[0] = Heap[parent];
                Heap[parent] = Heap[element];
                Heap[parent] = temp[0];       
            }
                    
           
            
    }
        
    }
    @Override
    public T head() throws QueueUnderflowException {
        if (isEmpty()) {
            throw new QueueUnderflowException();
        } else {
            //gets the item at position 0 in the Heap, if the swapping works it should be the item with max 
            return ((PriorityItem<T>) Heap[0]).getItem();
    }
    }
    @Override
    public void remove() throws QueueUnderflowException {
        
    }

    @Override
    public boolean isEmpty() {
        return tailIndex < 0;
    }
    
    
     public String toString() {
        String result = "[";
        for (int i = 0; i <= tailIndex; i++) {
            if (i > 0) {
                result = result + ", ";
            }
            result = result + Heap[i];
        }
        result = result + "]";
        return result;
    }
}
