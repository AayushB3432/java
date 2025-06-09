import java.util.Scanner;
class factorial {

    public static void main(String[] args) {
        Scanner var1 = new Scanner(System.in);
        System.out.println("enter the no.");
        int var2= var1.nextInt();
        int var3 = 1;

        for(int var4 = 1;var4< var2; var4++){
            var3=var3*var4;

        }
        System.out.println(var3);
    }

}
