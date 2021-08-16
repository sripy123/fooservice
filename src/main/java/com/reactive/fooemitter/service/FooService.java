package com.reactive.fooemitter.service;

import org.springframework.stereotype.Service;

import com.reactive.fooemitter.model.Foo;

@Service
public class FooService {
	public Foo[] getObjects() {
		Foo foo1 = new Foo(1l,"Java");
		Foo foo2 = new Foo(2l,"Flutter");
		Foo foo3 = new Foo(3l,"Android");
		Foo foo4 = new Foo(4l,"GoLang");
		Foo foo5 = new Foo(5l,"Rust");
		Foo[] array = new Foo[] {foo1,foo2,foo3,foo4,foo5};
		return array;
	}
}
