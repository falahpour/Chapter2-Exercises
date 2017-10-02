public class Ex1 {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int c=a+b;
        System.out.println(b);
        do {
            System.out.println(c);
            a=b;
            b=c;
            c=a+b;
        }while (c<1000);

    }
}
