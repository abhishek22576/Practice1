import java.util.ArrayList;

public class Javastream2 {

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
        
          int count=0;
         
        for(int i=0;i<name.size();i++)
        {
        	 String required = name.get(i);
        	if(required.endsWith("k"))
        	 {
        		count++;
        	 }
        	 
         }
        System.out.println(count); 
       
	}
	
}
