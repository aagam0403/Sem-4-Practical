//String buffer class
class StringBufferDemo2
{
	public static void main(String args[])
	{
		StringBuffer sb = new StringBuffer();
		System.out.println("Capacity is :" + sb.capacity());
		System.out.println("Appended string:" + sb.append("Hello"));
		System.out.println("Current capacity :" + sb.capacity());
		System.out.println("Appended string:" + sb.append("	SYBCA DIV A SEM III"));
		System.out.println("Length:"+sb.length());
		System.out.println("Current capacity :" + sb.capacity());
		System.out.println(sb);
		System.out.println("Appended string:" + sb.append("SYBCA DIV A SEM III SYBCA DIV A SEM III "));
		System.out.println("Length:"+sb.length());
		System.out.println("Current capacity :" + sb.capacity());
		System.out.println(sb);
	}
	
}