class assignment18 {
    public static void main(String[] args) {
        int intVal = 10;
        double doubleVal = 25.5;
        char charVal = 'A';
        boolean boolVal = true;

        Integer intObj = Integer.valueOf(intVal);
        Double doubleObj = Double.valueOf(doubleVal);
        Character charObj = Character.valueOf(charVal);
        Boolean boolObj = Boolean.valueOf(boolVal);

        System.out.println("Integer object: " + intObj);
        System.out.println("Double object: " + doubleObj);
        System.out.println("Character object: " + charObj);
        System.out.println("Boolean object: " + boolObj);
    }
}
