
package queuemanager;


public class SortedLinkedPriorityQueue<T> implements PriorityQueue<T> {
    
     
    private final Object[] storage;
    private final int capacity;
    private int tailIndex;
    
    
    public SortedLinkedPriorityQueue(int size) {
        storage = new Object[size];
        capacity = size;
        tailIndex = -1;
}

    @Override
    public void add(T item, int priority) throws QueueOverflowException {
        
    }

    @Override
    public T head() throws QueueUnderflowException {
       
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
        
    
