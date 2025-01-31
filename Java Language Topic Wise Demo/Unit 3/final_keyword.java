//Final Keyword
/*
 Final Variable - PI
 Final Method - Cannot over-ridden
 Final CLass - Cannot Inherit
 */

 class FinalKeyword
 {
    final int PI = 3;
    void display(int r)
    {
        System.out.println("Area "+(r*r*PI));
    }
 }
 class final_keyword
 {
    public static void main(String[] args) 
    {
        FinalKeyword fk = new FinalKeyword();
        fk.display(5);    
    }
 }