package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Done using Junit 5
 */
public class EchoServiceTest {

    private EchoService echoService;

    @Before
    public void setUp() throws Exception{
         echoService = new EchoService();
    }

    @Test
    public void shouldEchoName(){
        String echo = echoService.echo("Siva");
        assertEquals("Siva...Siva", echo);
    }

}
