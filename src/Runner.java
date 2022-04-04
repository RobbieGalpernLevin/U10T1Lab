public class Runner
{
    public static void main(String[] args)
    {
        System.out.println(method(5));
        System.out.println(method(10));
        simpleRecursion(5);
        System.out.println(simpleRecursiveDivision(8));


    }

    public static int method(int num)
    {
        int i = num;
        int sum = num;
        while(i > 1)
        {
            i--;
            sum *= i;

        }
        return sum;
    }

        public static void simpleRecursion(int n)
        {
            System.out.println("Called, n = " + n);
            if (n > 2)
            {
                simpleRecursion(n - 1);
            }
            System.out.println("Ended, n = " + n);
        }

    public static int simpleRecursiveDivision(int num)
    {
        System.out.println("simpleRecursiveDivision called: num = " + num);
        if (num == 0)
        {
            System.out.println("Base case achieved, returning 0");
            return 0;
        }
        System.out.println("Making recursive call: " + num + " + simpleRecursiveDivision(" + num + " / 2)");
        int returnVal = num + simpleRecursiveDivision(num / 2);

        System.out.println("Returning " + returnVal);
        return returnVal;
    }

}
