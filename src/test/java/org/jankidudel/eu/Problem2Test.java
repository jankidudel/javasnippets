package org.jankidudel.eu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem2Test {
    @Test
    public void run() {
        Assertions.assertEquals(44, new Problem2(100).run());
        Assertions.assertEquals(4613732, new Problem2(4000000).run());
    }
}
