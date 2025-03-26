package org.example;

import org.testng.annotations.Factory;

public class BrowserTestFactory {
    @Factory
    public Object[] createInstances() {
        return new Object[]{
                new LoginTest("chrome"),
                new LoginTest("edge")
        };
    }
}
