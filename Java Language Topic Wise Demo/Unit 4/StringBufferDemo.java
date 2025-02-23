//String buffer class
class StringBufferDemo
{
	public static void main(String args[])
	{
		StringBuffer sb = new StringBuffer();
		System.out.println("Capacity is :" + sb.capacity());
		System.out.println("Appended string:" + sb.append("123456789"));
		System.out.println("Length string:" + sb.length());
		System.out.println("String replaced:" + sb.replace(2,4,"9999"));
		System.out.println("String reverse :" + sb.reverse());
		System.out.println("Current capacity :" + sb.capacity());
		System.out.println("Appended string:" + sb.append("123456789"));
		System.out.println("Length	 string:" + sb.length());
		System.out.println("Current capacity :" + sb.capacity());
		System.out.println("Character at position :" + sb.charAt(3));
		sb.setCharAt(3,'h');
		System.out.println("After set char" + sb);
	}
	
}