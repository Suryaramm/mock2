package mock_2;

import java.util.HashSet;
import java.util.OptionalInt;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
	Set<Integer> set=new HashSet<>();
	set.add(1);
	set.add(34);
	set.add(54);
	set.add(76);

	 OptionalInt total=set.stream().filter(s->s>30).mapToInt(Integer::intValue).max();
       System.out.println(total);

	}

}
