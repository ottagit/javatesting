package com.javatesting.domainobject.practice;

import com.javatesting.domainobject.TestAppEnv;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestAppEnvTest {
    @Test
    public void canGetUrlStatically() {
        assertEquals("Returns Hard Coded URL", "http://192.123.0.3:67", TestAppEnv.getUrl());
    }

    @Test
    public void canGetDomainAndPortStatically() {
        assertEquals("Just the domain", "192.123.0.3",TestAppEnv.DOMAIN);
        assertEquals("Just the port", "67", TestAppEnv.PORT);
    }
}
