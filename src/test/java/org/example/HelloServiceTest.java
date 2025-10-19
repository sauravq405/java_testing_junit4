package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Done using Junit 5
 */
public class HelloServiceTest {

    private HelloService helloService;

    @BeforeEach
    public void setUp() {
        helloService = new HelloService();
    }

    @Test
    public void shouldSayHello(){
        String hello = helloService.sayHello("Siva");
        assertEquals("Hello Siva", hello);
    }

}
