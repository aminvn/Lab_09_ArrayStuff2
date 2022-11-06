import java.util.Scanner;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        Random rnd = new Random();

        final int COUNT = 100;

        int[] dataPoints = new int[COUNT];

        for(int i = 0; i < COUNT; i++)
        {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        for(int i = 0; i < COUNT; i++)
        {
            if (i != 99)
                System.out.print( dataPoints[i] + "|" );
            else
                System.out.println( dataPoints[i] );
        }
        System.out.println("");


        int sum = 0;

            for(int i = 0; i < COUNT; i++)
            {
                sum = sum + dataPoints[i];
            }
            int ave = sum/COUNT;
            System.out.println("\nThe sum of the random array dataPoints is: " + sum);
            System.out.println("The average of the random array dataPoints is: " + ave);
            System.out.println("");

            Scanner in = new Scanner(System.in);
            int input = 0;

            input = SafeInput.getRangedInt(in, "Enter your number ", 1, 100);

            int times = 0;

            for(int i = 0; i < COUNT; i++)
            {
                if(dataPoints[i] == input)
                    times++;
            }
            System.out.println("The number you entered " + input + " shown " + times + " times in the random array dataPoints");
            System.out.println("");

            input = 0;
            input = SafeInput.getRangedInt(in, "Enter another number", 1, 100);

            int firstMatchingIndex = -1;
            for(int i = 0; i < COUNT; i++)
            {
                if(dataPoints[i] == input)
                {
                    firstMatchingIndex = -1;
                    break;
                }
            }
            if(firstMatchingIndex == -1)
                System.out.println("The value " + input + " was NOT FOUND at the dataPoints array.");
            else
                System.out.println("The value" + input + "was found at array index" + firstMatchingIndex);
            System.out.println("");

            int min = dataPoints[0];
            int max = dataPoints[0];

            for(int i = 0; i < COUNT; i++)
            {
                int currentData = dataPoints[i];
                if(currentData > max)
                    max = currentData;
                if(currentData < min)
                    min = currentData;
            }
            System.out.println("Minimum value in the dataPoints is: " + min);
            System.out.println("Maximum value in the dataPoints is: " + max);
            System.out.println("");

            double[] dblPoints;

            dblPoints = new double[COUNT];

            for(int i = 0; i < COUNT; i++)
            {
                dblPoints[i] = rnd.nextDouble() * 100;
            }

             for(int i = 0; i < COUNT; i++)
             {
                 if(i != 99)
                     System.out.print(dblPoints[i] + " | ");
                 else
                     System.out.println(dblPoints[i]);
             }
             System.out.println("");

             double avgData = getAverage(dblPoints);
             System.out.println("Average of the random double array dataPoints is: " + avgData);
             System.out.println("");

             sum = sum(dataPoints);
             System.out.println("The sum of the random array dataPoints is: " + sum);
             System.out.println("");

             min = min(dataPoints);
             System.out.println("Minimum value in the dataPoints is: " + min);
             System.out.println("");

             max = max(dataPoints);
             System.out.println("Maximum value in the dataPoints is: " + max);
             System.out.println("");

             input = 0;
             input = SafeInput.getRangedInt(in, "Enter your number", 1, 100);
             times = occurence(dataPoints, input);
             System.out.println("The number you entered " + input + " shown " + times + " times in the random array dataPoints");
             System.out.println("");

             input = 0;
             input = SafeInput.getRangedInt(in, "Enter another number", 1, 100);
             firstMatchingIndex = contains(dataPoints, input);
             if(firstMatchingIndex == -1)
                 System.out.println("The value " + input + " was NOT FOUND at the dataPoints array.");
             else
                 System.out.println("The value" + input + " was found at array index 99" +
                         "" + firstMatchingIndex);
             System.out.println("");
    }
    public static double getAverage(double values[])
    {
        double sum = 0;
        double avg = 0;

        for(int i = 0; i < 100; i++)
        {
            sum = sum + values[i];
        }
        avg = sum/100;

        return avg;
    }

    public static int min(int values[])
    {
        int min = 100;
        for(int i = 0; i < 100; i++)
        {
            if(values[i] < min)
            {
                min = values[i];
            }
        }
        return min;
    }

    public static int max(int values[])
    {
        int max = 0;
        for(int i = 0; i < 100; i++)
        {
            if(values[i] > max)
            {
                max = values[i];
            }
        }
        return max;
    }

    public static int sum(int values[])
    {
        int sum = 0;
        for(int i = 0; i < 100; i++)
        {
            sum = sum + values[i];
        }
        return sum;
    }

    public static int occurence(int values[], int target)
    {
        int times = 0;
        for(int i = 0; i < 100; i++)
        {
            if(values[i] == target)
                times++;
        }
        return times;
    }

    public static int contains(int values[], int target)
    {
        int firstMatchingIndex = -1;
        for(int i = 0; i < 100; i++)
        {
            if(values[i] == target)
            {
                firstMatchingIndex = i;
                break;
            }
        }
        return firstMatchingIndex;
    }

    }

