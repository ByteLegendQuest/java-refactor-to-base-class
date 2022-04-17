package com.bytelegend;

import com.github.blindpirate.extensions.CaptureSystemOutput;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

public class CatTest {
    @Test
    @CaptureSystemOutput
    public void testMeow(CaptureSystemOutput.OutputCapture capture) {
        capture.expect(Matchers.containsString("meow, my name is: Tom"));
        new Cat("Tom").meow();
    }
}
