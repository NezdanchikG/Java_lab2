package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class MyArrayListTest {

    @Test
    public void add() {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Alpha");
        list.add("Beta");
        list.add("Gamma");

        assertEquals("Alpha", list.get(0));
        assertEquals("Beta", list.get(1));
        assertEquals("Gamma", list.get(2));
        assertEquals(3, list.size());
    }

    @Test
    public void insert() {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Alpha");
        list.add("Gamma");

        list.add(1, "Beta");

        assertEquals("Alpha", list.get(0));
        assertEquals("Beta", list.get(1));
        assertEquals("Gamma", list.get(2));
        assertEquals(3, list.size());
    }

    @Test
    public void set() {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Alpha");
        list.add("Beta");

        String oldElement = list.set(1, "NewBeta");

        assertEquals("Alpha", list.get(0));
        assertEquals("NewBeta", list.get(1));
        assertEquals("Beta", oldElement);
        assertEquals(2, list.size());
    }

    @Test
    public void remove() {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Alpha");
        list.add("Beta");
        list.add("Gamma");

        String removedElement = list.remove(1);

        assertEquals("Alpha", list.get(0));
        assertEquals("Gamma", list.get(1));
        assertEquals("Beta", removedElement);
        assertEquals(2, list.size());
    }

    @Test
    public void testRemove() {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Alpha");
        list.add("Beta");
        list.add("Gamma");

        boolean result = list.remove("Beta");

        assertTrue(result);
        assertEquals("Alpha", list.get(0));
        assertEquals("Gamma", list.get(1));
        assertEquals(2, list.size());
    }

    @Test
    public void get() {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Alpha");
        list.add("Beta");
        list.add("Gamma");

        assertEquals("Beta", list.get(1));
    }

    @Test
    public void size() {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Alpha");
        list.add("Beta");

        assertEquals(2, list.size());
    }

    @Test
    public void clear() {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Alpha");
        list.add("Beta");

        list.clear();

        assertEquals(0, list.size());
        assertFalse(list.contains("Alpha"));
        assertFalse(list.contains("Beta"));
    }

    @Test
    public void contains() {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Alpha");
        list.add("Beta");
        list.add("Gamma");

        assertTrue(list.contains("Beta"));
        assertFalse(list.contains("Delta"));
    }
}
