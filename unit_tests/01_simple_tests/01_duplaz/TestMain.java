public class TestMain
{
    public static void main(String[] args)
    {
        test_duplaz();
        //
        System.out.println("done");
    }

    private static void test_duplaz()
    {
        assert Main.duplaz(0) == 0;
        assert Main.duplaz(1) == 2;
        assert Main.duplaz(2) == 4;
        assert Main.duplaz(5) == 10;
        assert Main.duplaz(-1) == -2;
        assert Main.duplaz(-6) == -12;
    }
}
