//Access Specifier
class BankDetails
{
    private int accno=12;
    int branchcode=1;

    void display()//Method to access Private variable
    {
        System.out.println("Account Num : "+accno);
        System.out.println("Branch Code : "+branchcode);
    }
}
class AccessSpecifier
{
    public static void main(String[] args) 
    {
        BankDetails b = new BankDetails();
        b.display();
        //System.out.println("Bank Account Num : "+b.accno);  //Can't be access because it is private
        //System.out.println("Branch Code : "+b.branchcode);  //Can be access because it is not private
    }
}