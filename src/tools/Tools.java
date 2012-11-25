package tools;

public class Tools
{
    public static void main(String[] args) throws Exception
    {
        if (args.length == 0)
        {
            Generator.main(args);
        }
        else if (args[0].equals("-compare"))
        {
            String[] rest = new String[args.length-1];
            System.arraycopy(args, 1, rest, 0, rest.length);
            Comparison.main(rest);
        }
        else if (args[0].equals("-fuzz"))
        {
            String[] rest = new String[args.length-1];
            System.arraycopy(args, 1, rest, 0, rest.length);
            Fuzzer.main(rest);
        }
    }
}