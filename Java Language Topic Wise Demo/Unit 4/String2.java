    public class String2
	{  
    public static void main(String args[])
	    {  
		    
		int a=10;  
		String s = new String();
		s=String.valueOf(a);  //converts to string
		System.out.println(s+10);  //1010
	
		String s1="my name is aava my name is java";  
		String replaceString=s1.replace("is","was");
		System.out.println(replaceString);  
		
		String s2="my name was aava my name is aava";  
		String replaceString2=s2.replace("aava","java");
		System.out.println(replaceString2);  
		//"my name was java my name is java";  
		    
		s="hello how are u??";    
		System.out.println(s);  
		System.out.println("String hashcode:" + s.hashCode()); 
    }}
