class abc{
    abc(int x,int y)
    {
        System.out.println("Constructor of ABC class and printing values");
        System.out.println("No.1 = "+x);
        System.out.println("No.2 = "+y);
        xyz w=new xyz(x,y);
    }
}
class xyz{
    xyz(int x,int y)
    {
        System.out.println("Constructor of XYZ class and printing values");
        System.out.println("No.1 = "+x);
        System.out.println("No.2 = "+y);
    }
}
class assignment10 {
    public static void main(String[] args) {
        abc a=new abc(5,4);
    }
}