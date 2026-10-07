public class First{
    public static <T> T demo(T[] arr){
        return arr[0];
    }
    public static void main(String[] args){
        Integer[] num={10,20,30};

        System.out.println(demo(num));
    }
}