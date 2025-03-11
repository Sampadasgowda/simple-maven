package com.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import com.Service; // Ensure the correct path

public class ServiceTest {
 
    @Test
    public void testEmailOne() {
        Service service = new Service();
        assertTrue(service.validateEmail("abc@xyz.com")); // Fixed placement
    }

    @Test
    public void testEmailTwo() {
        Service service = new Service();
        assertFalse(service.validateEmail("abcxyz.com"));
    }
}
