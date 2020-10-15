public class V2
{
    private final static int N = 10_000;

    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; ++i)
        {
            sb.append(i);
        }
        String s = sb.toString();
        System.out.println(s.length());
    }
}
