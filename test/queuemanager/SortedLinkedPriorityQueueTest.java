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
public class SortedLinkedPriorityQueueTest {
    
    public SortedLinkedPriorityQueueTest() {
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
     * Test of head method, of class SortedLinkedPriorityQueue.
     */
    @Test
    public void testHead() throws Exception {
        System.out.println("head");
        SortedLinkedPriorityQueue instance = new SortedLinkedPriorityQueue();
        instance.add("Andrew", 1);
        instance.add("John", 2);
        Object expResult = "John";
        Object result = instance.head();
        assertEquals(expResult, result);

    }

    /**
     * Test of add method, of class SortedLinkedPriorityQueue.
     */
    @Test
    public void testAdd() throws Exception {
        System.out.println("add");
        Object item = "Andrew";
        int priority = 1;
        SortedLinkedPriorityQueue instance = new SortedLinkedPriorityQueue();
        instance.add("Andrew",1);
    }

    /**
     * Test of remove method, of class SortedLinkedPriorityQueue.
     */
    @Test
    public void testRemove() throws Exception {
        System.out.println("remove");
        SortedLinkedPriorityQueue instance = new SortedLinkedPriorityQueue();
        instance.add("Andrew", 1);
        instance.remove();
    }

    /**
     * Test of isEmpty method, of class SortedLinkedPriorityQueue.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        SortedLinkedPriorityQueue instance = new SortedLinkedPriorityQueue();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);

    }

    /**
     * Test of toString method, of class SortedLinkedPriorityQueue.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        SortedLinkedPriorityQueue instance = new SortedLinkedPriorityQueue();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
