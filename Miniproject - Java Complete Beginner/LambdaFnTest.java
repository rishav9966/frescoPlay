package com.fresco;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class LambdaFnTest {
    LambdaFn fn;
    FnCheck fc;
    public LambdaFnTest() {
    }
    
    @Before
    public void setUp() {
        fn = new LambdaFn();
        fc = new FnCheck();
    }
    
    long a,b;
    
    @Test
    public void testFunctionalProgramming1() throws IOException {
        if(fc.isFnProgrammingPresent())
        {
            a=46;
            b=1000;
            List<String> listOfIntegers = new ArrayList<>();
            for(long i=a;i<=b;i++)
            {
                listOfIntegers.add(i+"");
            }
            int actual = fn.functionalProgramming(listOfIntegers).hashCode();
            assertEquals(82680324, actual);
        }
        else
        {
            assertEquals(8394283, 76387468);
        }
    }
    
    @Test
    public void testFunctionalProgramming2() throws IOException {
        if(fc.isFnProgrammingPresent())
        {
            a=2000;
            b=150000;
            List<String> listOfIntegers = new ArrayList<>();
            for(long i=a;i<=b;i++)
            {
                listOfIntegers.add(i+"");
            }
            int actual = fn.functionalProgramming(listOfIntegers).hashCode();
            assertEquals(1855450601, actual);
        }
        else
        {
            assertEquals(8394283, 76387468);
        }
    }
    
    @Test
    public void testFunctionalProgramming3() throws IOException {
        if(fc.isFnProgrammingPresent())
        {
            a=7500;
            b=655000;
            List<String> listOfIntegers = new ArrayList<>();
            for(long i=a;i<=b;i++)
            {
                listOfIntegers.add(i+"");
            }
            int actual = fn.functionalProgramming(listOfIntegers).hashCode();
            assertEquals(942822240, actual);
        }
        else
        {
            assertEquals(8394283, 76387468);
        }
    }
    
    @Test
    public void testFunctionalProgramming4() throws IOException {
        if(fc.isFnProgrammingPresent())
        {
            a=100000;
            b=850000;
            List<String> listOfIntegers = new ArrayList<>();
            for(long i=a;i<=b;i++)
            {
                listOfIntegers.add(i+"");
            }
            int actual = fn.functionalProgramming(listOfIntegers).hashCode();
            assertEquals(1703923031, actual);
        }
        else
        {
            assertEquals(8394283, 76387468);
        }
    }
    
    @Test
    public void testFunctionalProgramming5() throws IOException {
        if(fc.isFnProgrammingPresent())
        {
            a=1;
            b=10000;
            List<String> listOfIntegers = new ArrayList<>();
            for(long i=a;i<=b;i++)
            {
                listOfIntegers.add(i+"");
            }
            int actual = fn.functionalProgramming(listOfIntegers).hashCode();
            assertEquals(1850074275, actual);
        }
        else
        {
            assertEquals(8394283, 76387468);
        }
    }
    
    @Test
    public void testFunctionalProgramming6() throws IOException {
        if(fc.isFnProgrammingPresent())
        {
            a=99;
            b=99999;
            List<String> listOfIntegers = new ArrayList<>();
            for(long i=a;i<=b;i++)
            {
                listOfIntegers.add(i+"");
            }
            int actual = fn.functionalProgramming(listOfIntegers).hashCode();
            assertEquals(787557259, actual);
        }
        else
        {
            assertEquals(8394283, 76387468);
        }
    }
    
    @Test
    public void testFunctionalProgramming7() throws IOException {
        if(fc.isFnProgrammingPresent())
        {
            a=100000;
            b=500000;
            List<String> listOfIntegers = new ArrayList<>();
            for(long i=a;i<=b;i++)
            {
                listOfIntegers.add(i+"");
            }
            int actual = fn.functionalProgramming(listOfIntegers).hashCode();
            assertEquals(290997410, actual);
        }
        else
        {
            assertEquals(8394283, 76387468);
        }
    }
    
    @Test
    public void testFunctionalProgramming8() throws IOException {
        if(fc.isFnProgrammingPresent())
        {
            a=813;
            b=75000;
            List<String> listOfIntegers = new ArrayList<>();
            for(long i=a;i<=b;i++)
            {
                listOfIntegers.add(i+"");
            }
            int actual = fn.functionalProgramming(listOfIntegers).hashCode();
            assertEquals(-1374584474, actual);
        }
        else
        {
            assertEquals(8394283, 76387468);
        }
    }
    
    @Test
    public void testFunctionalProgramming9() throws IOException {
        if(fc.isFnProgrammingPresent())
        {
            a=210000;
            b=310000;
            List<String> listOfIntegers = new ArrayList<>();
            for(long i=a;i<=b;i++)
            {
                listOfIntegers.add(i+"");
            }
            int actual = fn.functionalProgramming(listOfIntegers).hashCode();
            assertEquals(1, actual);
        }
        else
        {
            assertEquals(8394283, 76387468);
        }
    }
    
    @Test
    public void testFunctionalProgramming10() throws IOException {
        if(fc.isFnProgrammingPresent())
        {
            a=1;
            b=10000000;
            List<String> listOfIntegers = new ArrayList<>();
            for(long i=a;i<=b;i++)
            {
                listOfIntegers.add(i+"");
            }
            int actual = fn.functionalProgramming(listOfIntegers).hashCode();
            assertEquals(1905981783, actual);
        }
        else
        {
            assertEquals(8394283, 76387468);
        }
    }
    
    @Test
    public void testFunctionalProgramming11() throws IOException {
        if(fc.isFnProgrammingPresent())
        {
            a=1;
            b=100000;
            List<String> listOfIntegers = new ArrayList<>();
            for(long i=a;i<=b;i++)
            {
                listOfIntegers.add(i+"");
            }
            int actual = fn.functionalProgramming(listOfIntegers).hashCode();
            assertEquals(-1733885475, actual);
        }
        else
        {
            assertEquals(8394283, 76387468);
        }
    }
    
    @Test
    public void testFunctionalProgramming12() throws IOException {
        if(fc.isFnProgrammingPresent())
        {
            a=500000;
            b=510000;
            List<String> listOfIntegers = new ArrayList<>();
            for(long i=a;i<=b;i++)
            {
                listOfIntegers.add(i+"");
            }
            int actual = fn.functionalProgramming(listOfIntegers).hashCode();
            assertEquals(500531, actual);
        }
        else
        {
            assertEquals(8394283, 76387468);
        }
    }
    
    @Test
    public void testFunctionalProgramming13() throws IOException {
        if(fc.isFnProgrammingPresent())
        {
            a=1;
            b=1000000;
            List<String> listOfIntegers = new ArrayList<>();
            for(long i=a;i<=b;i++)
            {
                listOfIntegers.add(i+"");
            }
            int actual = fn.functionalProgramming(listOfIntegers).hashCode();
            assertEquals(-1006663718, actual);
        }
        else
        {
            assertEquals(8394283, 76387468);
        }
    }
    
}
