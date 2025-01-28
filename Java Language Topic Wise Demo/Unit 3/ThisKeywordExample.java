class ThisExample {
    int n;
    ThisExample(int n) {
        this.n = n; // 'this' keyword accesses the instance variable
    }

    void display() 
    {
        System.out.println(n);
    }
}

public class ThisKeywordExample {
    public static void main(String args[]) 
    {
        ThisExample example = new ThisExample(12);
        example.display();
    }
}
