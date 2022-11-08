import java.util.ArrayList;
import java.util.List;

public class PyUtils
{
    public static List<Integer> range(int start, int end, int step)
    {
        List<Integer> result = new ArrayList<Integer>();

        for (int i = start; i < end; i += step) {
            result.add(i);
        }

        return result;
    }

    public static List<Integer> range(int start, int end) {
        return PyUtils.range(start, end, 1);
    }

    public static List<Integer> range(int end) {
        return PyUtils.range(0, end);
    }
}
