package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    public  void dummyTest(){
        Assertions.assertTrue(true);
    }
    @Test
    public void dummyTest2(){
        Assertions.assertEquals(2,3);
    }
    @Test
    public void dummyTest3(){
        Assertions.assertFalse(false);
    }


}

