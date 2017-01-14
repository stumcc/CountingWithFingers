import java.util.Arrays;

import static java.lang.System.out;

/**
 * Created by stuar_000 on 1/14/2017.
 */
public class Counting {

    public static void main(String args[]){

    public String[] Fingers = {"00000",
                                "01000",
                                "01100",
                                "01110",
                                "01111",
                                "10000",
                                "11000",
                                "11100",
                                "11110",
                                "11111"};

    String myFingers = "01000";

    int Position = Arrays.asList(Fingers).indexOf(myFingers);
    out.println(Position);


    }

}
