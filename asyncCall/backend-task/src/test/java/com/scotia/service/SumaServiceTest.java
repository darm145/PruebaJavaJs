package com.scotia.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SumaServiceTest {
	@Autowired
    private SumaService sumaService;

    @Test
    public void testSuma() throws ExecutionException, InterruptedException {
        CompletableFuture<Integer> result = sumaService.suma(1, 2);
        Integer sum = result.get(); 
        assertNotNull(sum,"resultado no debe ser nulo");
        assertEquals(3, sum,"debe sumar correctamente los valores");
    }

}
