import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Javastream3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//@Test
		ArrayList<String> name = new ArrayList();
        name.add("Abhishek");
        name.add("Rakesh");
        name.add("Pankaj");
        name.add("Suman");
        name.add("Rahul");
        name.add("Ranvijay");
        name.add("Deepak");
        name.add("Akash");
       
        name.stream().filter(s->s.length()>7).forEach(s->System.out.println(s));
        name.stream().filter(s->s.length()>7).limit(1).forEach(s->System.out.println(s));
        name.stream().filter(s->s.length()>5).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
        streamfilters();
	}
        public static void streamfilters()
        {
        	ArrayList<String> name1 = new ArrayList();
        	name1.add("simran");
        	name1.add("priya");
        	name1.add("pragya");
        	name1.add("priyanka");
        	
        	Stream.of("Rakesh","Pankaj","Suman","Rahul","Ranvijay","Deepak","Akash").filter(s->s.startsWith("A")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
        	List<String> l1=Arrays.asList("abhishek","saket","deepak","vaibhaw","vikash","aniket","sameer","rishabh","anubhaw","amit","rajeev","prince","raghunandan");
        	l1.stream().filter(s->s.length()>6).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
        	
        	Stream<String> s1=Stream.concat(name1.stream(), l1.stream());
        	s1.sorted().forEach(s->System.out.println(s));
        	streamCollect();
        }
        	public static void streamCollect()
        	{
        		List<String> r1=Stream.of("Rakesh","Pankaj","Suman","Rahul","Rishabh","anubhaw","amit","Rajeev","prince","raghunandan","simran","pragya","juhi")
        		.filter(s->s.startsWith("R")).sorted().map(s->s.toUpperCase()).collect(Collectors.toList());
        		System.out.println(r1);
        	}
        
        }
        
      



