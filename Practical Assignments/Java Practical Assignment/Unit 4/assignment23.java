import java.util.ArrayList;

class assignment23 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int num = 50;
        list.add(num);
        System.out.println("ArrayList contents: " + list);
        int retrievedNum = list.get(0);
        int result = retrievedNum * 2;
        System.out.println("Retrieved value: " + retrievedNum);
        System.out.println("Result after multiplication: " + result);
    }
}
