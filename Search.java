public class Search{
    public static <T> boolean demo(T[] arr,T key){
        for (T element: arr){
            if(element.equals(key)){
                return true;
            }
        }
        return false;
    }
    public static  void main(String[] args){
        Integer[] num={10,20,30,40,50};

        System.out.println(demo(num,50));
    }
}