package io.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class OpenCloseCheckerTest {

    @Test

    public void testOpenClose(){

        String test = "a(b)c(d)e(f)g)";

        boolean expected = true;
        boolean actual = OpenCloseChecker.isMatching(test);

        Assert.assertEquals(expected, actual);

    }

    @Test

    public void testOpenClose2(){

        String test = ")";

        boolean expected = false;
        boolean actual = OpenCloseChecker.isMatching(test);

        Assert.assertEquals(expected, actual);

    }

    @Test

    public void testOpenClose3(){

        String test = "a(bcd(ef))";

        boolean expected = true;
        boolean actual = OpenCloseChecker.isMatching(test);

        Assert.assertEquals(expected, actual);

    }

    @Test

    public void testOpenClose4(){

        String test = "a(bc(d)))";

        boolean expected = false;
        boolean actual = OpenCloseChecker.isMatching(test);

        Assert.assertEquals(expected, actual);

    }


}