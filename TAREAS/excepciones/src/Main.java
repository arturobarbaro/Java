public class Main
{
    public static void main(String[] args)
    {
        try {
            throwException();
         }
         catch (Exception exception) // exception thrown by throwException
        {
            System.err.println("Exception handled in main");
         }
         doesNotThrowException();
         }

        // demonstrate try...catch...finally
    public static void throwException() throws Exception
    {
        try // throw an exception and immediately catch it
        { System.out.println("Method throwException");

        }
        catch (Exception exception) // catch exception thrown in try
        {
            System.err.println("Exception handled in method throwException");
        }
    }

    public static void doesNotThrowException() {
        try // try block does not throw an exception
        {
             System.out.println("Method doesNotThrowException");
         }
        catch (Exception exception) // does not execute
        {
             System.err.println(exception);
        }
        System.out.println("End of method doesNotThrowException");
        }
}