package predefinedfunctionalinterfaces;

@FunctionalInterface
public interface FunctionalGenerics<T,R> {
//	String execute(String t);
	R execute(T t);
}
