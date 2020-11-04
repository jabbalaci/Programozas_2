import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        Verem v1 = new Verem();

        System.out.println(v1);               // [
        System.out.println(v1.size());        // 0
        System.out.println(v1.isEmpty());     // true
        v1.append(2);
        v1.append(4);
        v1.append(6);
        System.out.println(v1);               // [2, 4, 6
        System.out.println(v1.size());        // 3
        System.out.println(v1.isEmpty());     // false
        int top = v1.pop();
        System.out.println(top);              // 6
        System.out.println(v1);               // [2, 4
        System.out.println(v1.size());        // 2

        System.out.println("-------------");

        Verem v2 = new Verem(List.of(2, 4, 7));    // [2, 4, 7
        System.out.println(v2);
    }
}
