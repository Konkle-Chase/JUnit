/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;
import JUnit.JUnit;

/**
 *
 * @author Konkles
 */
public class JUnitTest {
    
    public JUnitTest() {
    }
    
    //Passes if arrays l1 and l2 are equal 
    @Test
    public void arrayIsEqualTest(){        
        String[] l1 = {"car", "truck", "suv"};    
        String[] l2 = {"car", "truck", "suv"};
        assertArrayEquals(l1, l2);
    }
    
    //Passes if both functions return the same value, either both true or both false
    @Test
    public void isEqualTest() {
        JUnit ju = new JUnit();
        assertEquals(ju.oddOrEven(3), ju.oddOrEven(1));
    }
    
    //Passes if function returns true
    @Test
    public void isTrueTest() {
        JUnit ju = new JUnit();
        assertTrue(ju.oddOrEven(10));
    }
    
    //Passes if function returns false
    @Test
    public void isFalseTest() {
        JUnit ju = new JUnit();
        assertFalse(ju.oddOrEven(5));
    }
    
    //Passes if each key references a different value
    @Test
    public void isNotSameTest(){         
        JUnit ju = new JUnit();
        assertNotSame(ju.getKeyVal("k1"), ju.getKeyVal("k2"));
    }
    
    //Passes if both keys reference the same value
    @Test
    public void isSameTest(){     
        JUnit ju = new JUnit();
        assertSame(ju.getKeyVal("k1"), ju.getKeyVal("k3"));
    }
    
    //Passes if the key references a none null value 
    @Test
    public void isNotNullTest(){     
        JUnit ju = new JUnit();
        assertNotNull(ju.getKeyVal("k1"));
    }
    
    //Passes if the key references a null value
    @Test
    public void isNullTest(){     
        JUnit ju = new JUnit();
        assertNull(ju.getKeyVal("k4"));
    }
    
    //Passes if the test value matches the expected value
    @Test
    public void isThatTest(){
        JUnit ju = new JUnit();
        assertThat(ju.getValue(1), is(ju.getValue(3)));
    }
}
