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
public class UnsortedLinkedPriorityQueueTest {
    
    public UnsortedLinkedPriorityQueueTest() {
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
     * Test of head method, of class UnsortedLinkedPriorityQueue.
     */
    @Test
    public void testHead() throws Exception {
        System.out.println("head");
        UnsortedLinkedPriorityQueue instance = new UnsortedLinkedPriorityQueue();
        instance.add("Andrew", 1);
        instance.add("Bob", 2);
        instance.add("John", 3);
        Object expResult = "John";
        Object result = instance.head();
        assertEquals(expResult, result);

    }

    /**
     * Test of add method, of class UnsortedLinkedPriorityQueue.
     */
    @Test
    public void testAdd() throws Exception {
        System.out.println("add");
        Object item = "Andrew";
        int priority = 1;
        UnsortedLinkedPriorityQueue instance = new UnsortedLinkedPriorityQueue();
        instance.add("Andrew", 1);
    }

    /**
     * Test of remove method, of class UnsortedLinkedPriorityQueue.
     */
    @Test
    public void testRemove() throws Exception {
        System.out.println("remove");
        UnsortedLinkedPriorityQueue instance = new UnsortedLinkedPriorityQueue();
        instance.add("Andrew", 1);
        instance.remove();
    }

    /**
     * Test of isEmpty method, of class UnsortedLinkedPriorityQueue.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        UnsortedLinkedPriorityQueue instance = new UnsortedLinkedPriorityQueue();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);

    }

    /**
     * Test of toString method, of class UnsortedLinkedPriorityQueue.
     */
    @Test
    public void testToString() throws QueueOverflowException {
        System.out.println("toString");
        UnsortedLinkedPriorityQueue instance = new UnsortedLinkedPriorityQueue();
        instance.add("Andrew", 1);
        String expResult = " LinkedList: size 1[Andrew, 1]";
        String result = instance.toString();
        assertEquals(expResult, result);
        System.out.println("Expected:" + expResult + "actual " + result);

    }
    
}
