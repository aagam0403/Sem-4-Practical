//String buffer class
class StringBufferDemo3
{
	public static void main(String args[])
	{
		StringBuffer sb = new StringBuffer();
		System.out.println("Capacity is :" + sb.capacity());
		System.out.println("Appended string:" + sb.append("123456789"));
		System.out.println("Length string:" + sb.length());
		System.out.println("Appended string:" + sb.append("123456789"));
		System.out.println("Capacity is :" + sb.capacity());
		System.out.println("Length string:" + sb.length());
		
	}
	
}