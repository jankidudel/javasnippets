package org.jankidudel.eu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem1Test {
    @Test
    public void run() {
        Assertions.assertEquals(23, new Problem1(10).run());
        Assertions.assertEquals(233168, new Problem1(1000).run());
    }
}
