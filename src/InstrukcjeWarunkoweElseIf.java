public class InstrukcjeWarunkoweElseIf {

    public static void main(String[] args) {
        int number = -3;


        if (number == 0){
            System.out.println("Libczba równa zero: " + number);
        }else if (number > 0){
            System.out.println("Libczba większa od zera: " + number);
        }else if (number < -5){
            System.out.println("Liczka mniejsza o -5: " + number);
        }else{
            System.out.println("Żaden warunek nie zsotał spełniony: " + number);
        }
    }
}
