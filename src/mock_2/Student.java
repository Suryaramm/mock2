package mock_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student {
   int id;
   String name;
   
	public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

	@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + "]";
}

	public Student(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}

	public static void main(String[] args) {
		List<Student> std=new ArrayList<>();
		
            std.add(new Student(1,"surya"));
            std.add(new Student(2,"janu"));
            Collections.sort(std,(s1,s2)->s1.getName().compareTo(s2.getName()));
            std.forEach(s->System.out.println(s));
           int sum=0;
           for(Student s:std) {
        	   sum+=s.getId();
           }
           System.out.println(sum);
	}

}
