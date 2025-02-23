    public class StringBufferDemo1
    {  
        public static void main(String[] args) {  
               StringBuffer sb = new StringBuffer("string buffer");  
                    
               // printing the current capacity of the string buffer i.e. 16 + 13  
               System.out.println("capacity: " + sb.capacity());  //29
		System.out.println("length:" + sb.length());
                   
               sb = new StringBuffer("A");  
                    
               // printing the current capacity of the string buffer i.e. 16 + 1  
               System.out.println("capacity: " + sb.capacity()); //17         
		System.out.println("length:" + sb.length());
        }  
    }  