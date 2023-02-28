package com.mrbarin.functionalindepth;

@FunctionalInterface
public interface IFactory<T> {
	T create();
}
