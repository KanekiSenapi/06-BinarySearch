package pl.aogiri.challenges.BinarySearch.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.aogiri.challenges.BinarySearch.BinarySearch;

public class TestBinarySearch {

    String[] strings = {"aloaf","bshiver","cpunishment","dcheap","epaltry","fvictorious"};

    @Test
    public void TestStrings0(){
        BinarySearch binarySearch = new BinarySearch();
        Assertions.assertEquals(0, binarySearch.search("aloaf", strings));
    }
    @Test
    public void TestStrings1(){
        BinarySearch binarySearch = new BinarySearch();
        Assertions.assertEquals(1, binarySearch.search("bshiver", strings));
    }

    @Test
    public void TestStrings2(){
        BinarySearch binarySearch = new BinarySearch();
        Assertions.assertEquals(2, binarySearch.search("cpunishment", strings));
    }

    @Test
    public void TestStrings3(){
        BinarySearch binarySearch = new BinarySearch();
        Assertions.assertEquals(3, binarySearch.search("dcheap", strings));
    }

    @Test
    public void TestStrings4(){
        BinarySearch binarySearch = new BinarySearch();
        Assertions.assertEquals(4, binarySearch.search("epaltry", strings));
    }

    @Test
    public void TestStrings5(){
        BinarySearch binarySearch = new BinarySearch();
        Assertions.assertEquals(5, binarySearch.search("fvictorious", strings));
    }

    @Test
    public void TestStrings01(){
        BinarySearch binarySearch = new BinarySearch();
        Assertions.assertEquals(-1, binarySearch.search("nothing", strings));
    }
}
