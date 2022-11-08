public class Main
{
    public static void main(String[] args)
    {
        System.out.println(product());                      // 1
        System.out.println(product(2));            // 2
        System.out.println(product(2, 5));         // 10
        System.out.println(product(2, 5, 10));     // 100
        System.out.println(product(2, 5, 10, 3));  // 300
    }

    private static int product(int... args)
    {
        int p = 1;
        for (int n : args) {
            p *= n;
        }
        return p;
    }
}
