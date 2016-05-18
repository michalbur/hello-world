/**
 * Created by miba on 2016-05-17.
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("Hello World");
        new Test2().doSmth();
    }

}

class Test2 {
    public void doSmth(){
        System.out.println("Do very complicated things");
    }
}