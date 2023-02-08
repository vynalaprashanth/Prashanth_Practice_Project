import java.util.ArrayList;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class javastreams {
	
	

		//@Test
		public void test1() {
		ArrayList<String> names = new ArrayList<String>();

		names.add("prashanth");
		names.add("praneet");
		names.add("udith");
		names.add("raju");
		names.add("prakash");
		int count = 0;
		for (int i = 0; i < names.size(); i++) {
			String actual = names.get(i);
			if (actual.startsWith("p")) {
				count++;

			}

		}
		System.out.println(count);

	}
	@Test
public void test2() {
		
		ArrayList<String> names = new ArrayList<String>();

		names.add("prashanth");
		names.add("praneet");
		names.add("udith");
		names.add("raju");
		names.add("prakash");
		
//		Long c=names.stream().filter(s->s.startsWith("p")).count();
//System.out.println(c);
	
System.out.println(Stream.of("prashanth","raju","praneet","udith").filter(s->s.startsWith("p")).count());

names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));


	}
}

