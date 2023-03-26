package takehome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestDrillerTest {
    TestDriller driller = new TestDriller();

    @Test public void copiesAndPricesTest(){
        assertEquals(8_000, driller.pricesRange(4));
    }

    @Test public void copiesAndPricesATest(){
        assertEquals(6_000, driller.pricesRange(3));
    }

    @Test public void copiesAndPricesBTest(){
        assertEquals(9_000, driller.pricesRange(5));
    }
    @Test public void copiesAndPricesCTest(){
        assertEquals(14400, driller.pricesRange(8));
    }
    @Test public void copiesAndPricesDTest(){
        assertEquals(16000, driller.pricesRange(10));
    }
    @Test public void copiesAndPricesETest(){
        assertEquals(33600, driller.pricesRange(21));
    }
    @Test public void copiesAndPricesFTest(){
        assertEquals(46200,driller.pricesRange(33));
    }
    @Test public void copiesAndPricesGTest(){
        assertEquals(50400,driller.pricesRange(36));
    }
    @Test public void copiesAndPricesHTest(){
        assertEquals(63000,driller.pricesRange(45));
    }
    @Test public void copiesAndPriceIFTest(){
        assertEquals(127400,driller.pricesRange(98));
    }
    @Test public void copiesAndPriceJFTest(){
        assertEquals(91000, driller.pricesRange(70));
    }
    @Test public void copiesAndPriceKTest(){
        assertEquals(213600, driller.pricesRange(178));
    }
    @Test public void copiesAndPriceLTest(){
        assertEquals(180000, driller.pricesRange(150));
    }
    @Test public void copiesAndPriceMTest(){
        assertEquals(484000, driller.pricesRange(440));
    }
    @Test public void copiesAndPriceNTest() {
        assertEquals(284900, driller.pricesRange(259));
    }
    @Test public void copiesAndPriceOTest() {
        assertEquals(555000, driller.pricesRange(555));
    }
    @Test public void copiesAndPricePTest() {
        assertEquals(673000, driller.pricesRange(673));
    }
}
