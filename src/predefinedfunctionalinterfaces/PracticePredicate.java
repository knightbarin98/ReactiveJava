package predefinedfunctionalinterfaces;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PracticePredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("Basics");
		list.add("");
		list.add("Strong");
		list.add("");
		list.add("BasicsStrong");
		
		Predicate<String> predicate = s -> !s.isEmpty();
		
		List<String> newList = filterList(list,predicate);
		
		Predicate<String> filter = s -> s.contains("Basics");
		
		List<String> filterList = filterList(list,filter);
		
		List<Integer> intList = List.of(1,2,3,4,5,6,7,8);
		
		Predicate<Integer> integerFilter = e -> e % 2 == 0;
		
		List<Integer> evens = filterList(intList, integerFilter);
		
		
//		List<String> newList = list.stream().filter(predicate).collect(Collectors.toList());
		System.out.println(newList);
		System.out.println(filterList);
		System.out.println(evens);
	}
	
	public static <T> List<T> filterList(List<T> list,Predicate<T> predicate){
		List<T> returnList = new ArrayList<>();
		for(T t: list) {
			if(predicate.test(t)) {
				returnList.add(t);
			}
		}
		return returnList;
	}

}
