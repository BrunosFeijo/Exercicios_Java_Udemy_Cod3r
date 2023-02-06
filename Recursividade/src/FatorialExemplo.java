public class FatorialExemplo {
    public static void main(String[] args) {
        System.out.println(fatorial(5));
    }
    public static int fatorial(int num){
        if(num == 0){
            return 1;
        }
        return num * fatorial(num -1);
    }

}
