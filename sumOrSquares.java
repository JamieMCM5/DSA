public class sumOrSquares 
{

    public static void main(String[] args) 
    {
        int start = 12;
        int limit = 7;
        int collector = 100;
        int i = start;
        while (i > limit) {
            collector = collector-2*i;
            i--;
        }

        System.out.println("Collector: " + collector);
    }
}