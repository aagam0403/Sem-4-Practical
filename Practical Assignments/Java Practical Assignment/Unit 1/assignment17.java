class assignment17 {
    public static void main(String[] args) 
    {
        System.out.println("Prime odd numbers between 50 and 100:");
        for (int number = 51; number <= 99; number += 2) 
        {
            if (isPrime(number)) 
            {
                System.out.println(number);
            }
        }
    }
    private static boolean isPrime(int num) 
    {
        for (int i = 2; i < num; i++) 
        {
            if (num % i == 0) 
            {
                return false;
            }
        }
        return true;
    }
}