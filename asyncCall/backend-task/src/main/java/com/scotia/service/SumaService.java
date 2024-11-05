package com.scotia.service;

import java.util.concurrent.CompletableFuture;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class SumaService {
	
	@Async
	public CompletableFuture<Integer> suma(int a,int b){
		try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return CompletableFuture.completedFuture(null);
        }
        return CompletableFuture.completedFuture(a+b);
	}

}
