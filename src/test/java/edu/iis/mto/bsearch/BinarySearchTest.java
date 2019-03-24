package edu.iis.mto.bsearch;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.is;
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
        Assert.assertThat(searchResult.isFound(),is(true));
        Assert.assertThat( searchResult.getPosition(),is(0));

    }

    @Test
    public void testElementNotExistingInSequence(){
        int[] seq ={2};
        int itemtoFind=3;
        SearchResult searchResult =BinarySearch.search(itemtoFind,seq);
        Assert.assertThat(searchResult.isFound(),is(false));
        Assert.assertThat(searchResult.getPosition(),is(-1));

    }
    @Test
    public void testElementExistingFirstSequence(){
        int[] seq ={3,5,6};
        int itemtoFind=3;
        SearchResult searchResult =BinarySearch.search(itemtoFind,seq);
        Assert.assertThat(searchResult.isFound(),is(true));
        Assert.assertThat(searchResult.getPosition(),is(0));

    }
    @Test
    public void testElementExistingLastSequence(){
        int[] seq ={1,6,7,8};
        int itemtoFind=8;
        SearchResult searchResult =BinarySearch.search(itemtoFind,seq);
        Assert.assertThat(searchResult.isFound(),is(true));
        Assert.assertThat(searchResult.getPosition(),is(seq.length -1));

    }

    @Test
    public void testElementExistingMiddleSequence(){
        int[] seq ={1,6,7};
        int itemtoFind=6;
        SearchResult searchResult =BinarySearch.search(itemtoFind,seq);
        Assert.assertThat(searchResult.isFound(),is(true));
        Assert.assertThat(searchResult.getPosition(),is((seq.length -1)/2));

    }

    @Test
    public void testElementNotExistingSequence(){
        int[] seq ={1,6,7,9};
        int itemtoFind=2;
        SearchResult searchResult =BinarySearch.search(itemtoFind,seq);
        Assert.assertThat(searchResult.isFound(),is(false));
        Assert.assertThat(searchResult.getPosition(),is(-1));

    }

    @Test
    public void testElementNotExistingWithTabele0Sequence(){
        int[] seq =new int[0];
        int itemtoFind=2;
        SearchResult searchResult =BinarySearch.search(itemtoFind,seq);
        Assert.assertThat(searchResult.isFound(),is(false));
        Assert.assertThat(searchResult.getPosition(),is(-1));

    }
    @Test public void testElementIsNegativeNumberInSequence(){
        int[] seq = {-6, -3, 4, 5, 6};
        int itemtoFind = -3;

        SearchResult searchResult = BinarySearch.search(itemtoFind, seq);
        Assert.assertThat( searchResult.getPosition(),is(1));
    }

    @Test (expected = IllegalArgumentException.class)
    public void testElementNotExistingForTestV3Sequence(){
        int[] seq = {};
        int itemtoFind = 4;

        BinarySearch.search(itemtoFind, seq);
    }
}