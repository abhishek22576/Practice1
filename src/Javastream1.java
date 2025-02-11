import java.util.ArrayList;
import java.util.stream.Stream;

public class Javastream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ArrayList<String> name = new ArrayList();
         name.add("Abhishek");
         name.add("Rakesh");
         name.add("Pankaj");
         name.add("Suman");
         name.add("Rahul");
         name.add("Ranvijay");
         name.add("Deepak");
         name.add("Akash");
         
        Long c=name.stream().filter(s->s.startsWith("A")).count();
        System.out.println(c);
        Long d=name.stream().filter(s->s.endsWith("k")).count();
        System.out.println(d);
        streamfilter();
	}
     public static void streamfilter()  
     {
      Long f=  Stream.of("abhishek","saket","deepak","vaibhaw","vikash","aniket","sameer","rishabh","anubhaw","amit","rajeev","prince","raghunandan")
        .filter(s->s.startsWith("a")).count();
       
      System.out.println(f);
     
     }
     //System.out.println(f);
	}

