public class countSpaces 
{
    public static void main(String[] args) 
    {
        System.out.println(spaceCounter("I am jamie"));
        System.out.println(spaceCounter("55 grand a year aint bad bro"));
    }

    // Count the number of spaces in a string
    public static int spaceCounter(String s) 
    {
    int count=0;
    for (int i=0; i<s.length(); i++) 
    {
        char c=s.charAt(i);
        System.out.print("["+c+"]");
        if (c==' ')
        count++;
    }
    System.out.println("");
    return count;
   }
    
}
