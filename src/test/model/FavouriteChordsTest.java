package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FavouriteChordsTest {
    private MajorChord cMajor;
    private MajorChord dMajor;
    private MajorChord eMajor;
    private FavouriteChords fc;

   @BeforeEach
    public void setup() {
       cMajor = new MajorChord("CMajor", "C", "E", "G");
       dMajor = new MajorChord("DMajor", "D", "F#", "A");
       eMajor = new MajorChord("EMajor", "E", "G#", "B");
       fc = new FavouriteChords();
   }

   @Test
   public void testConstructor() {
       FavouriteChords myFaves = new FavouriteChords();
       assertEquals(0, myFaves.length());
   }


   @Test
    public void testAddOne(){
       fc.addToFavourites(cMajor);
       assertEquals(1, fc.length());
       assertTrue(fc.includes(cMajor));
   }

   @Test
    public void testAddMultiple() {
      fc.addToFavourites(cMajor);
      fc.addToFavourites(dMajor);
      fc.addToFavourites(eMajor);
      assertEquals(3, fc.length());
      assertTrue(fc.includes(cMajor));
      assertTrue(fc.includes(dMajor));
      assertTrue(fc.includes(eMajor));
   }

   @Test
    public void testRemoveOne() {
       fc.addToFavourites(cMajor);
       assertEquals(1, fc.length());
       fc.removeFromFavourites(cMajor);
       assertEquals(0, fc.length());
   }

   @Test
    public void testRemoveOneFromMany() {
       fc.addToFavourites(cMajor);
       fc.addToFavourites(dMajor);
       fc.addToFavourites(eMajor);
       assertEquals(3,fc.length());
       fc.removeFromFavourites(dMajor);
       assertEquals(2, fc.length());
       assertTrue(!fc.includes(dMajor));
   }

   @Test
    public void testRemoveMoreThanOne() {
       fc.addToFavourites(cMajor);
       fc.addToFavourites(dMajor);
       fc.addToFavourites(eMajor);
       assertEquals(3, fc.length());
       fc.removeFromFavourites(cMajor);
       fc.removeFromFavourites(eMajor);
       assertEquals(1, fc.length());
       assertTrue (fc.includes(dMajor));
   }

   @Test
    public void testLengthEmpty() {
       assertEquals(0, fc.length());
   }

   @Test
    public void testNonEmptyList() {
       fc.addToFavourites(cMajor);
       fc.addToFavourites(dMajor);
       fc.addToFavourites(eMajor);
       assertEquals(3, fc.length());
   }

   @Test
    public void testIncludesNotIncluded (){
       fc.addToFavourites(cMajor);
       assertFalse(fc.includes(dMajor));
   }

   @Test
    public void testIncludesIncluded() {
       fc.addToFavourites(cMajor);
       fc.addToFavourites(eMajor);
       assertTrue(fc.includes(eMajor));
   }

   @Test
    public void testGetAllNames() {
       fc.addToFavourites(cMajor);
       fc.addToFavourites(dMajor);
       fc.addToFavourites(eMajor);
       assertEquals("CMajor", fc.getAllNames().get(0));
       assertEquals("DMajor", fc.getAllNames().get(1));
       assertEquals("EMajor", fc.getAllNames().get(2));
   }

   @Test
    public void testGetAllNamesEmpty() {
       assertEquals("Empty", fc.getAllNames().get(0));
   }

}