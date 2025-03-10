public class assignment25 
{
    public static void main(String[] args) 
    {
        String intString = "100";
        String doubleString = "99.99";
        String booleanString = "true";

        int intValue = Integer.parseInt(intString);
        double doubleValue = Double.parseDouble(doubleString);
        boolean booleanValue = Boolean.parseBoolean(booleanString);

        System.out.println("String to int: " + intValue);
        System.out.println("String to double: " + doubleValue);
        System.out.println("String to boolean: " + booleanValue);
    }
}
