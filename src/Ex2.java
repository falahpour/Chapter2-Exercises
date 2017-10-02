public class Ex2 {
    public static void main(String[] args){
        int num=2365;
        System.out.println("Revers is :");
        System.out.println(revese(num));
        if (revese(num)==num)
            System.out.println("The number is palindrome.");
        else
            System.out.println("The number is not palindrome.");

    }
    static int revese(int a){
        int i=1;
        int re=0;
        int aa=a;
        while ((aa/10)>0){
            aa/=10;
            i++;
        }

        for (int d=1;d<=i;d++){
            re+=(int)((a%10)*Math.pow(10, (i-d)));
            a=a/10;
        }
        return re;
    }


}
