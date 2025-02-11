public class Condi3 {
    public static void main (String[] args) {
    	
    	String s1 = "Abhishek Kumar Singh";
    	String s2 = "Rajeshwar singh";
    
    	String s3 = new String("Neelam");
    	String s4 = new String("Nani");
    	
    	String [] splitstring = s1.split(" ");
    	
    	//System.out.println(splitstring[0]);
    	//System.out.println(splitstring[1]);
    	//System.out.println(splitstring[2]);
    	
    	for(int i=0;i<s1.length();i++)
    	{
    		System.out.println(s1.charAt(i));
    	}
    	
    	for(int i=s3.length()-1;i>=0;i--)
    	{
    		System.out.println(s3.charAt(i));
    	}
    }
}

