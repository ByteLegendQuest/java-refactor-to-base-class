package com.bytelegend;

import com.github.blindpirate.extensions.CaptureSystemOutput;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

public class DogTest {
    @Test
    @CaptureSystemOutput
    public void testWoof(CaptureSystemOutput.OutputCapture capture) {
        capture.expect(Matchers.containsString("woof, my name is: ABC"));
        new Dog("ABC").woof();
    }
}
