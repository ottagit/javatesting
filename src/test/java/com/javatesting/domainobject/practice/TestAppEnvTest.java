package com.javatesting.domainobject.practice;

import static com.javatesting.domainobject.TestAppEnv.*;

import org.junit.Assert;
import org.junit.Test;

import org.junit.Assert.*;

public class TestAppEnvTest {
    @Test
    public void canGetUrlStatically() {
        Assert.assertEquals("Returns Hard Coded URL",
                "http://192.123.0.3:67",
                getUrl());
    }

    @Test
    public void canGetDomainAndPortStatically() {
        Assert.assertEquals("Just the domain",
                "192.123.0.3",
                DOMAIN);
        Assert.assertEquals("Just the port", "67", PORT);
    }
}
