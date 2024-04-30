import org.testng.annotations.Test;

public class Main {

    String a = "abcdefqwert";

    public static void main(String[] args) {
        System.out.println(metoda("abcedf"));
    }

    public static String metoda(String s){
        String[] arr = s.split("");
        for (int i = 0; i< arr.length; i++) {
            if ((i+1)%2==0 ) arr[i]=arr[i].toUpperCase();
        }
       return String.join("",arr);
    }

    @Test
    public void metodaTestowa(){
        String[] arr = a.split("");
        for (int i = 0; i< arr.length; i++) {
            if ((i+1)%2==0 ) arr[i]=arr[i].toUpperCase();
        }
        System.out.println(String.join("",arr));
    }
}