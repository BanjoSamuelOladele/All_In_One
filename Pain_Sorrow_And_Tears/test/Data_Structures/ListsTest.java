package Data_Structures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ListsTest {
    Lists lists;
    @BeforeEach
    void setUp() {
        lists = new Lists(5);
    }
    @Test public void objectOfClassExist(){
        assertNotNull(lists);
    }
    @Test public void listOfElementsIsEmpty(){
        assertTrue(lists.isEmpty());
    }
    @Test
    public void listOfElementsIsNotEmptyWhenAnElementISAdded(){
        lists.add(0, "OOP");
        assertFalse(lists.isEmpty());
    }
    @Test public void elementCanBeAddedTheListWithoutTheIndexAndListNotEmpty(){
        lists.add("Ope");
        assertFalse(lists.isEmpty());
    }
    @Test public void sizeOFElementIncreaseAfterAdding(){
        lists.add("Ope");
        assertFalse(lists.isEmpty());
        assertEquals(1, lists.size());
    }
    @Test public void sizeIncreaseMoreThanOneAfterAddingTwice(){
        lists.add("Ope");
        lists.add(0, "OOP");
        assertFalse(lists.isEmpty());
        assertEquals(2, lists.size());
    }
    @Test public void sizeOfListDecreasesWhenRemovedFromTheLIst(){
        lists.add(0, "OOP");
        lists.remove(0);
        assertFalse(lists.isEmpty());
        assertEquals(0, lists.size());
    }
    @Test public void sizeOfListDecreasesWhenRemoveFromTheListWithTheElement(){
        lists.add(0, "OOP");
        lists.add(0, "Tayo");
        lists.remove("Tayo");
        assertFalse(lists.isEmpty());
        assertEquals(1, lists.size());
    }
    @Test public void elementInTheListCanBeObtained(){
        lists.add(0, "OOP");
        assertFalse(lists.isEmpty());
        assertEquals("OOP", lists.get(0));
    }
    @Test public void elementInTheListCanBeObtainedFromElements(){
        lists.add(0, "Tayo");
        lists.add(1, "OOP");
        assertFalse(lists.isEmpty());
        assertEquals("Tayo", lists.get(0));
    }
    @Test public void elementInTheListCanBeGottenAgain(){
        lists.add(1, "OOP");
        lists.add("Dele");
        lists.add("Ope");
        assertFalse(lists.isEmpty());
        assertEquals("Dele", lists.get(1));
    }
    @Test public void elementInTheListCanBeUpdated(){
        lists.add(0, "OOP");
        lists.add("Dele");
        lists.add("Ope");
        lists.set(1, "Samuel");
        assertFalse(lists.isEmpty());
        assertEquals("Samuel", lists.get(1));
    }
    @Test public void getElementsInTheListAfterRemoving(){
        lists.add(0, "OOP");
        lists.add("Dele");
        lists.add("Ope");
        lists.remove(1);
        assertFalse(lists.isEmpty());
        assertEquals("[OOP, Ope, null, null]", Arrays.toString(lists.getListElement()));
    }
    @Test public void getElementsInTheListAfterRemovingWithIndexTest(){
        lists.add(0, "OOP");
        lists.add("Dele");
        lists.add("Ope");
        lists.remove(0);
        assertFalse(lists.isEmpty());
        String[] array = lists.getListElement();
        assertEquals("[Dele, Ope, null, null]", Arrays.toString(array));
    }
    @Test public void getElementsInTheListAfterRemovingWithElementTest(){
        lists.add(0, "OOP");
        lists.add("Dele");
        lists.add("Ope");
        lists.remove("Dele");
        assertFalse(lists.isEmpty());
        String[] array = lists.getListElement();
        assertEquals("[OOP, Ope, null, null]", Arrays.toString(array));
    }
    @Test public void indexOfAnElementCanBeGottenInAList(){
        lists.add(0, "OOP");
        lists.add("Dele");
        lists.add("Ope");
        assertFalse(lists.isEmpty());
        assertEquals(1, lists.indexOf("Dele"));
    }
    @Test public void indexOfAnElementCanBeGottenInAListTest(){
        lists.add(0, "OOP");
        lists.add("Dele");
        lists.add("Ope");
        assertFalse(lists.isEmpty());
        assertEquals(0, lists.indexOf("OOP"));
    }
    @Test public void aListCanBeCheckedIfItContainsAnElement(){
        lists.add(0, "OOP");
        lists.add("Dele");
        lists.add("Ope");
        assertFalse(lists.isEmpty());
        assertTrue(lists.contains("OOP"));
    }
    @Test public void aListCanBeCheckedIfItContainsAnElementTest(){
        lists.add(0, "OOP");
        lists.add("Dele");
        lists.add("Ope");
        assertFalse(lists.isEmpty());
        assertFalse(lists.contains("Tayo"));
    }
//    @Test public void addElements(){
//        lists.add(0, "OOP");
//        lists.add("Dele");
//        lists.add("Ope");
//        lists.add("Dele");
//        assertFalse(lists.isEmpty());
//        assertEquals("[OOP, Dele, Ope, Dele]", Arrays.toString(lists.getListElement()));
//    }
}
