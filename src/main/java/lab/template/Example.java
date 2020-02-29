package lab.template;


import java.util.logging.Logger;

/**
 * @author mihai.hulea
 */
public class Example {

    public static Logger LOG = Logger.getLogger( Example.class.getName() );

    /**
     * Add x and y.
     * @param x
     * @param y
     * @return result of the sum.
     */
    public static int add(int x, int y){
        return x + y;
    }


    public static void main(String[] args) {
        System.out.println("It works!");
    }
}
