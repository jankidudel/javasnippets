package org.jankidudel.eu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Problem3Test {
    @Test
    public void run() {
        Assertions.assertEquals(29, new Problem3(13195).run());
        Assertions.assertEquals(6857, new Problem3(600851475143L).run());
    }
}
