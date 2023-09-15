package org.jankidudel.eu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Problem4Test {

    @Test
    public void run() {
        Assertions.assertEquals(9009, new Problem4(2).run());
        Assertions.assertEquals(906609, new Problem4(3).run());
    }
}
