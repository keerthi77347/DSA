public class Print{
    public static <T> void demo(T value){
        System.out.println(value);
    }
    public static void main(String[] args){
        demo(10);
        demo("kirri");
    }
}