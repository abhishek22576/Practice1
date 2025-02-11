import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Condi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] d4 = {97, 45,77,44,90,40,91};
         
		 for(int i=0;i<d4.length;i++)
			 
			 if (d4[i] %2 ==0)
		 {
			 System.out.println(d4[i]);
			 break;
		 }
			 else
			 {
				 System.out.println(d4[i] + " is not the multiple of 2");
			 }
		 ArrayList<String> a=new ArrayList<String>();
		 a.add("rahul");
		 a.add("sankar");
		 a.add("khushboo");
		 a.add("abhishek");
		 //a.remove(1);
		 System.out.println(a.get(2));
		 
		 for (int i=0;i<a.size();i++) 
		 {
			 System.out.println(a.get(i));
		 }
		 System.out.println("@@@@@");
		 
		 for (String s1:a)
		 {
			 System.out.println(s1);
		 }
		 System.out.println(a.contains("abhishek"));
		 
		 String[] s11 = {"abhi","singh","kumar"};
		 int[] i1= {2,45,68,34,89,78};
		 
		 List<String> l1 = Arrays.asList(s11);
		 
	
		
		 
	}

}
