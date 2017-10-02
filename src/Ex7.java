public class Ex7 {
    public static void main(String[] args){
        long num=18;
        System.out.println(loopFactorial(num));
        System.out.println(recursiveFactorial(num));
    }

    public static long loopFactorial(long num) {
        long f = 1;
        while (num>0) {
            f *= num;
            num--;
        }
        return f;
    }

    public static long recursiveFactorial(long num) {

        if (num == 0)
            return 1;
        else
            return num * recursiveFactorial(num-1);
    }
}


