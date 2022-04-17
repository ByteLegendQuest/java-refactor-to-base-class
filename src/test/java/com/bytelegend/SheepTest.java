package com.bytelegend;

import com.github.blindpirate.extensions.CaptureSystemOutput;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

public class SheepTest {
    @Test
    @CaptureSystemOutput
    public void testMeh(CaptureSystemOutput.OutputCapture capture) {
        capture.expect(Matchers.containsString("meh, my name is: sheep"));
        new Sheep("sheep").meh();
    }
}
