package com.mrbarin.functionalindepth;

import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
public interface MyConsumer<T> {
	void accept(T t);
	default MyConsumer<T> thenAccept(MyConsumer<T> next){
		Objects.requireNonNull(next);
		return (T t) -> {
			this.accept(t);
			next.accept(t);
		};
	}
}
