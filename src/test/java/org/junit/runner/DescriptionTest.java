package org.junit.runner;

import org.junit.Test;

public class DescriptionTest {

    @Test
    public void testNoStackOverflow() {
        Description d = Description.TEST_MECHANISM;
        d.addChild(d);
        d.testCount();
    }

}
