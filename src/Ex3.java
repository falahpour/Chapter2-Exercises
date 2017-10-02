public class Ex3 {
    public static void main(String[] args){
        int num=6;
        if(isPowerOfTwo(num))
        System.out.println("The number is power of two.");
        else
        System.out.println("The number is not power of two.");
    }

    public static boolean isPowerOfTwo(int n)
    {
        if (n == 0)
            return false;
        while (n != 1)
        {
            if (n%2 != 0)
                return false;
            n = n/2;
        }
        return true;
    }
}
