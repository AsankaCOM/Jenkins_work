package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest

{


   @Test
    public void testString(){
        App app = new App();
        assertEquals("Asanka", app.checkString());
    }
}
