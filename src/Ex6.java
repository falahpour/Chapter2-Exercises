public class Ex6 {

    public static void main(String[] args){
        int num=16;
        star(num);
    }
    public static void star(int num) {
        for (int i = 1; i <=num ; i++) {
            if (i <= num/2)
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            else
                for (int r = 1; r <= num -i+1; r++)
                    System.out.print("*");
            System.out.println("");
        }

    }

}
