public class Example1{
    public static <T> void  swap(T a ,T b){
        T temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println(a +" "+ b);
    }
    public static void main(String[]args){
        swap("Kirri","Seva");
        swap(90,100);
    }
}