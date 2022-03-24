/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuemanager;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andrew Hopkins
 */
public class SortedArrayPriorityQueueTest {
 
    
    
    public SortedArrayPriorityQueueTest() {

    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
  
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of head method, of class SortedArrayPriorityQueue.
     */
    @Test
    public void testHead() throws Exception {
        System.out.println("head");
        SortedArrayPriorityQueue instance = new SortedArrayPriorityQueue(8);
        instance.add("Andrew", 2);
        instance.add("bob", 1);        
        Object expResult = "Andrew";
        Object result = instance.head();
        assertEquals(expResult, result);
    }

    /**
     * Test of add method, of class SortedArrayPriorityQueue.
     */
    @Test
    public void testAdd() throws Exception {
        System.out.println("add");
        Object item = "andrew";
        int priority = 1;
        SortedArrayPriorityQueue instance = new SortedArrayPriorityQueue(8);
        instance.add("andrew", 1);

    }

    /**
     * Test of remove method, of class SortedArrayPriorityQueue.
     */
    @Test
    public void testRemove() throws Exception {
        System.out.println("remove");
        SortedArrayPriorityQueue instance = new SortedArrayPriorityQueue(8);
        instance.add("Andrew", 1);
        instance.remove();

    }

    /**
     * Test of isEmpty method, of class SortedArrayPriorityQueue.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        SortedArrayPriorityQueue instance = new SortedArrayPriorityQueue(8);
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);

    }

    /**
     * Test of toString method, of class SortedArrayPriorityQueue.
     */
    @Test
    public void testToString() throws QueueOverflowException {
        System.out.println("toString");
        SortedArrayPriorityQueue instance = new SortedArrayPriorityQueue(8);
        instance.add("Andrew", 1);
        String expResult = "[(Andrew, 1)]";
        String result = instance.toString();
        assertEquals(expResult, result);

    }
    
}
