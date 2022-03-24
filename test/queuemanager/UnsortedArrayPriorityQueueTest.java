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
public class UnsortedArrayPriorityQueueTest {
    
    public UnsortedArrayPriorityQueueTest() {
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
     * Test of head method, of class UnsortedArrayPriorityQueue.
     */
    @Test
    public void testHead() throws Exception {
        System.out.println("head");
        UnsortedArrayPriorityQueue instance = new UnsortedArrayPriorityQueue(8);
        instance.add("bob", 1);
        instance.add("Andrew", 2);
        Object expResult = "Andrew";
        Object result = instance.head();
        assertEquals(expResult, result);

    }

    /**
     * Test of add method, of class UnsortedArrayPriorityQueue.
     */
    @Test
    public void testAdd() throws Exception {
        System.out.println("add");
        Object item = "Andrew";
        int priority = 1;
        UnsortedArrayPriorityQueue instance = new UnsortedArrayPriorityQueue(8);
        instance.add("Andrew", 1);

    }

    /**
     * Test of remove method, of class UnsortedArrayPriorityQueue.
     */
    @Test
    public void testRemove() throws Exception {
        System.out.println("remove");
        UnsortedArrayPriorityQueue instance = new UnsortedArrayPriorityQueue(8);
        instance.add("Andrew", 1);
        instance.remove();

    }

    /**
     * Test of isEmpty method, of class UnsortedArrayPriorityQueue.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        UnsortedArrayPriorityQueue instance = new UnsortedArrayPriorityQueue(8);
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class UnsortedArrayPriorityQueue.
     */
    @Test
    public void testToString() throws QueueOverflowException {
        System.out.println("toString");
        UnsortedArrayPriorityQueue instance = new UnsortedArrayPriorityQueue(8);
        instance.add("Andrew", 1);
        String expResult = "[(Andrew, 1)]";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
