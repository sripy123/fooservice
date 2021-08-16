package com.reactive.fooemitter.controller;

import java.time.Duration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reactive.fooemitter.model.Foo;
import com.reactive.fooemitter.service.FooService;

import reactor.core.publisher.Flux;

@RestController
public class FooController {

	@Autowired
	private FooService fooService;
	
	@GetMapping(value = "/foo", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	public Flux<Foo> getSpeech() {
		return Flux.fromArray(fooService.getObjects()).delayElements(Duration.ofSeconds(1)).repeat().log();
	}
}