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
    public void add(T item, int priority) throws QueueOverflowException {
       
    }

    @Override
    public T head() throws QueueUnderflowException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove() throws QueueUnderflowException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
