public class Main
{
    public static void main(String[] args)
    {
        System.out.println(PyUtils.range(4, 20, 2));
        System.out.println(PyUtils.range(4, 10, 1));
        System.out.println(PyUtils.range(10, 4, 1));
        System.out.println(PyUtils.range(0, 5));
        System.out.println(PyUtils.range(3, 7));
        System.out.println(PyUtils.range(3, 4));
        System.out.println(PyUtils.range(3, 3));
        System.out.println(PyUtils.range(10));

        for (char c : "hello".toCharArray())
        {
            System.out.println(c);
        }
    }
}
