package functionalindepth;

@FunctionalInterface
public interface IConfigurator<T,R> {
	R configure(T t);
}
