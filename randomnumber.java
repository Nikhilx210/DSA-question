
import java.lang.*;
public class randomnumber {
    public static void main(String[] args) {
        
    
    int min = 1;
    int max =100;
    System.out.println("Random value of type double between"+ min + "to"+ max +":" );
    double a = Math.random()*(max-min+1)+min;
    System.out.println(a);
    System.out.println(Math.floor(a));
    System.out.println(Math.ceil(a));

    }
    
}
