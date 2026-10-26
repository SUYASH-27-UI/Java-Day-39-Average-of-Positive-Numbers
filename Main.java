public class Main
{
    public static void main(String[] args)
    {
        int[] numbers = {10, -5, 20, 0, 30, -2};

        int sum = 0;
        int count = 0;

        for (int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] > 0)
            {
                sum = sum + numbers[i];
                count++;
            }
        }

        if (count > 0)
        {
            double average = (double) sum / count;
            System.out.println("Average = " + average);
        }
        else
        {
            System.out.println("No positive numbers found.");
        }
    }
}
