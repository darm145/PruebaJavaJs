package com.scotia.controller;

import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.scotia.service.SumaService;

@RestController
public class SumaController {
	
	@Autowired
	private SumaService sumaService;
	
	@GetMapping("/suma")
	@Async
	public CompletableFuture<Integer> suma(@RequestParam("a") int a, @RequestParam("b") int b) {
		return sumaService.suma(a, b);
    }

}
