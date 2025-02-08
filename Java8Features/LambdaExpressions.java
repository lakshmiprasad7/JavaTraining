package Java8Features;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@FunctionalInterface
interface Maths{
	int operate(int a,int b);
}
public class LambdaExpressions{
public static void main(String[] args) {
	
	
	Maths add= (a,b)-> a+b;
	System.out.println(add.operate(23,120));
	
	var names=Arrays.asList("name1","name2","name3");
	names.sort((s1,s2)->s2.compareTo(s1));
	System.out.println(names);
	names.forEach(name->System.out.println(name));
	var numbers=List.of(1,2,3,4,5,6,7,8);
	var evennumbers=numbers.stream().filter(n->n%2==0)
			.collect(Collectors.toList());
	var innumbers=numbers.stream().map(n->n+10)
			.collect(Collectors.toList());
	int resultSum = numbers.stream()
			.map(n->n*2)
			.mapToInt(Integer::intValue)
			.sum();
	System.out.println(evennumbers);
	System.out.println(resultSum);
	System.out.println(innumbers);
	}
}
