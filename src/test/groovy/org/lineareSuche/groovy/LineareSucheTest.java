package org.lineareSuche.groovy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class LineareSucheTest {

    LineareSuche lineareSuche;

    List<Integer> L;

    @BeforeEach
    void setUp() {
        System.out.println("Initializing");
        lineareSuche = new LineareSuche();

        L = Arrays.asList(1, 5, 7, 23, 44, 234);
    }

    @AfterEach
    void tearDown() {
        System.out.println("Tearing down");
        lineareSuche = null;
        L = null;
    }

    @Test
    void test() {
        assertTrue(lineareSuche.lineareSuche(44, L));
    }
}
