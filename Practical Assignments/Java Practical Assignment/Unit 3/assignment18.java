public class assignment18 {
    public static void main(String[] args) {
        Integer num = Integer.valueOf(10); // Wrapping int
        Double dnum = Double.valueOf(5.5); // Wrapping double
        
        System.out.println("Wrapped Integer: " + num);
        System.out.println("Wrapped Double: " + dnum);
        
        int unwrappedInt = num.intValue(); // Unwrapping int
        double unwrappedDouble = dnum.doubleValue(); // Unwrapping double
        
        System.out.println("Unwrapped Integer: " + unwrappedInt);
        System.out.println("Unwrapped Double: " + unwrappedDouble);
    }
}
