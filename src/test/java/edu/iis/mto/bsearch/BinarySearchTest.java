package edu.iis.mto.bsearch;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void search() {
    }

    @Test
    public void testElementExistingInSequence(){
        int[] seq ={3};
        int itemtoFind=3;
        SearchResult searchResult =BinarySearch.search(itemtoFind,seq);
        Assert.assertTrue(searchResult.isFound());
        Assert.assertEquals(0,searchResult.getPosition());

    }

    @Test
    public void testElementNotExistingInSequence(){
        int[] seq ={2};
        int itemtoFind=3;
        SearchResult searchResult =BinarySearch.search(itemtoFind,seq);
        Assert.assertFalse(searchResult.isFound());
        Assert.assertEquals(-1,searchResult.getPosition());

    }
    @Test
    public void testElementNExistingFirstSequence(){
        int[] seq ={3,5,6};
        int itemtoFind=3;
        SearchResult searchResult =BinarySearch.search(itemtoFind,seq);
        Assert.assertTrue(searchResult.isFound());
        Assert.assertEquals(0,searchResult.getPosition());

    }
    @Test
    public void testElementNExistingLastSequence(){
        int[] seq ={1,6,7,8};
        int itemtoFind=8;
        SearchResult searchResult =BinarySearch.search(itemtoFind,seq);
        Assert.assertTrue(searchResult.isFound());
        Assert.assertEquals(seq.length -1,searchResult.getPosition());

    }

}