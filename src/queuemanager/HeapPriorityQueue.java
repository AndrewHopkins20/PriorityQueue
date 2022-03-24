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
    
    private Object[] Heap;
    private int capacity;
    private int tailIndex;
    
    
   
    
    public HeapPriorityQueue(int size){
       Heap = new Object[size];
       capacity = size;
       tailIndex = -1;
        
        
    }
    
 
    

  

    @Override
    public void add(T item, int priority) throws QueueOverflowException {
        Object[] temp = new Object[1]; 
        tailIndex = tailIndex + 1;
        int element = tailIndex;
        int parent = (element -1)/2;        
        temp[0] = parent;
        if (tailIndex >= capacity) {           
            tailIndex = tailIndex - 1;
            throw new QueueOverflowException();
        } else if (((PriorityItem<T>) Heap[element]).getPriority() > ((PriorityItem<T>) Heap[parent]).getPriority()){
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
            return ((PriorityItem<T>) Heap[0]).getItem();
    }
    }
    @Override
    public void remove() throws QueueUnderflowException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
