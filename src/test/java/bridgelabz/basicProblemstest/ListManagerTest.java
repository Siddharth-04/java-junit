package bridgelabz.basicProblemstest;

import java.util.ArrayList;

import bridgelabz.basicJunitTest.ListManager;
import org.junit.jupiter.api.*;
import static org.junit.Assert.*;

public class ListManagerTest {
    static ListManager listManager;
    ArrayList<Integer> list =new ArrayList<>();

    @BeforeAll
    public static void initialize() {
        listManager = new ListManager();
    }

    @Test
    public void addElementTest() {
        ArrayList<Integer> newArr = new ArrayList<>();
        newArr.add(1);
        assertArrayEquals(newArr.toArray(),listManager.addElement(list,1).toArray());
    }

    @Test
    public void removeElementTest() {
        ArrayList<Integer> newArr = new ArrayList<>();
        newArr.add(1);

        listManager.addElement(list,1);
        listManager.addElement(list,2);

        assertArrayEquals(newArr.toArray(),listManager.removeElement(list,1).toArray());
    }

    @Test
    public void getSizeTest() {
        listManager.addElement(list,1);
        listManager.addElement(list,2);

        assertEquals(2,listManager.getSize(list));
    }



}
