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
public class ListNode<T> {
    
    private T item;
    private final int priority;
    private ListNode<T> next;
    
    public ListNode(T item, int priority, ListNode<T> next){
        
        this.item = item;
        this.next = next;
        this.priority = priority;
        
    }
    
    public T getItem(){
        return item;
    }
    
     public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "(" + getItem() + ", " + getPriority() + ")";
    }


    
    public ListNode<T> getNext(){
        return next;
    }
}
