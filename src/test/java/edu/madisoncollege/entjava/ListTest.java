package edu.madisoncollege.entjava;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Practice working with JUnit by writing some test cases for the Interface List<E>:
 * 1.1 void add(int index, E e)
 * 1.2 void remove(int index)
 * 1.3 void get(int index)
 *
 * Add at least one test for an exception.
 */
public class ListTest {

    private List<String> myList;

    @Before
    public void setup() {
        myList = new ArrayList<String>();
        myList.add("Item 1");
        myList.add("Item 2");
        myList.add("Item 3");
    }

    @Test
    public void testAddSuccess() {
        String elementToInsert = "Item 4";

        myList.add(elementToInsert);
        assertEquals("List size is incorrect", 4, myList.size());
        assertTrue("List missing inserted element", myList.contains(elementToInsert));
    }

    @Test
    public void testRemoveSuccess() {
        String firstElement = myList.get(0);
        myList.remove(0);
        assertEquals("List size is incorrect", 2, myList.size());
        assertTrue("List deleted incorrect element", !myList.contains(firstElement));
    }

    @Test
    public void testGetSucess() {
        String testString = "Test";
        myList.add(0, testString);

        assertEquals("Failed to retrieve list item.", testString, myList.get(0));
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void testException() {
        myList.get(10);
    }
}