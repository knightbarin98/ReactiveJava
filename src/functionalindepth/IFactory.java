package functionalindepth;

@FunctionalInterface
public interface IFactory<T> {
	T create();
}
