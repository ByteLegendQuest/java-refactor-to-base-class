package com.bytelegend;

import com.github.hcsp.test.helper.ClassInspector;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReflectionTest {
    @Test
    public void inspectFields() {
        ClassInspector.assertNoPublicFields(Cat.class, Dog.class, Sheep.class);
        ClassInspector.assertNoDeclaredFields(Cat.class, Dog.class, Sheep.class);
    }

    @Test
    public void inspectMethods() {
        Assertions.assertEquals(1, Cat.class.getDeclaredMethods().length);
        Assertions.assertEquals(1, Dog.class.getDeclaredMethods().length);
        Assertions.assertEquals(1, Sheep.class.getDeclaredMethods().length);
    }
}
