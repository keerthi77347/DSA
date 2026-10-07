public class Array{
    public static <T> void demo(T[] arr){

        for( T element : arr) {
            System.out.println(element);
        }
    }
    public static void main(String[] args){
         Integer[] num={10,20,30};
         String[] name={"kirri","seva","srinu"};

         demo(num);
         demo(name);
    }
}