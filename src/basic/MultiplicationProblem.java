package basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultiplicationProblem {
    public static void main(String[] args) {
        /*
        *      7 x x
        *        4 x
        *  ----------
        * 3 x, x x x
        *
        * 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
        * 0, 1, 2, 3, 5, 6, 8, 9
        * */

        Integer x= null;
        Integer y = null;
        Integer z = null;

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(0, 1, 2, 3, 5, 5, 6, 8, 9));

        Integer operand1 = 7;
        String operend1AsString =  operand1.toString();
        String expectedOperand1AsString = operend1AsString + x + y;

        Integer operand2 = 4;
        String operand2AsString = operand2.toString();
        String expectedOperand2AsString = operand2AsString + z;

        Integer result = operand1 * operand2;
        System.out.println(result);
        String resultAsString = result.toString();









    }
}
