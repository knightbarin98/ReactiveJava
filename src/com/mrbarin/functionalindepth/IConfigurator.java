package com.mrbarin.functionalindepth;

@FunctionalInterface
public interface IConfigurator<T,R> {
	R configure(T t);
}
