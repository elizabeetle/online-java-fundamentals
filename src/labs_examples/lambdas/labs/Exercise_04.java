package labs_examples.lambdas.labs;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Lambdas Exercise 4:
 *
 *      Stream API Labs
 *
 *      1) Demonstrate the use of the range function to print out the numbers 1 through 15 (inclusive)
 *      2) Demonstrate the use of the sum function to determine the range of a set of numbers.
 *      3) Demonstrate the use of the map() function to alter each int in a List of Integers, then use the sum function
 *          to get the sum of the modified list
 *      4) Demontrate the filter function by filtering out all Integers that are less than 10 - then use the average
 *          function to average the remaining numbers, assign this result to an int variable.
 *      5) Demonstrate the reduce() function to determine the sum of a list of Integers
 *      6) Demontsrate how to Stream a text file and print out each line
 *      7) Demonstrate how to Stream the stream_text_lab.csv file in this package. Split the lines into String arrays,
 *          the print out the element at the 1 index for each array.
 *      8) Demonstrate how to Stream the stream_text_lab.csv file in this package. Split the lines into String arrays,
 *          the print out the sum of all elements at index 2.
 *      9) Demonstrate the anyMatch() function.
 *      10) Demonstrate the allMatch() function.
 *      11) Demonstrate the collect() terminal operation to store resulting values into a List
 *      
 */

class Example {
    static List nums = new ArrayList();

    public static void main(String[] args) throws IOException {

        System.out.println("1.)");
        IntStream.range(1, 16).forEach(x -> System.out.print(x + ""));
        //not sure why I need the extra print statement
        //if I don't use it, line 44 becomes part of line 39
        System.out.println();

        System.out.println("-------------------------------------------------------");

        System.out.println("2.)");
        System.out.println(IntStream.range(1, 80).sum());

        System.out.println("-------------------------------------------------------");

        System.out.println("3.)");
        System.out.println(Arrays.stream(new int[]{21, 67, 8, 35, 6, 9, 2})
                .map(i -> i + i)
                .sum());

        System.out.println("-------------------------------------------------------");

        System.out.println("4.)");
        Arrays.stream(new int[] {2, 5, 6, 34, 10, 12})
                .filter(x -> x >= 10)
                .average()
                .ifPresent(System.out::println);

        System.out.println("-------------------------------------------------------");

        System.out.println("5.)");
        int sum = Arrays.stream(new int[]{3, 5, 67, 23})
                .reduce(0, (subtotal, element) -> subtotal + element);
        System.out.println(sum);

        System.out.println("-------------------------------------------------------");

        System.out.println("6.)");
        String streamFile = "/Users/beetle/Desktop/CodingProjects/online-java-fundamentals/src/labs_examples" +
                "/lambdas/labs/stream_text_lab.csv";
        Stream<String> csvData = Files.lines(Paths.get(streamFile));

        csvData
                .map(x -> x.split(","))
                .forEach(x -> System.out.println(x[0] + "  " + x[1] + "  " + x[2]));
        csvData.close();

        System.out.println("-------------------------------------------------------");

        System.out.println("7.)");
        //have to reopen csvData
        Stream<String> csvData2 = Files.lines(Paths.get(streamFile));
        csvData2
                .map(x -> x.split(","))
                .forEach(x -> System.out.println(x[1]));

        csvData2.close();

        System.out.println("-------------------------------------------------------");

        System.out.println("8.)");
        Stream<String> csvData3 = Files.lines(Paths.get(streamFile));
        List<Double> results = new ArrayList<>();
        csvData3
                .map(x -> x.split(","))
                .filter(x -> x[2].length() > 0.0)
                .forEach(x -> results.add(Double.parseDouble(x[2])));

        System.out.println(results.stream().reduce(0.0, (subtotal, element) -> subtotal + element));
        csvData3.close();

        System.out.println("-------------------------------------------------------");

        System.out.println("9.)");
        Stream<String> csvData4 = Files.lines(Paths.get(streamFile));
        boolean result = csvData4.anyMatch(x -> x.contains("World"));
        System.out.println(result);
        csvData4.close();

        System.out.println("-------------------------------------------------------");

        System.out.println("10.)");
        Stream<String> csvData5 = Files.lines(Paths.get(streamFile));
        boolean result2 = csvData5.allMatch(x -> x.startsWith("hello"));
        System.out.println(result2);
        csvData5.close();

        System.out.println("-------------------------------------------------------");

        System.out.println("11.)");
        Stream<String> csvData6 = Files.lines(Paths.get(streamFile));
        Map<Integer, String> map = new HashMap<>();
        map = csvData6
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .filter(x -> x[1].length() > 0)
                .collect(Collectors.toMap(
                        x -> Integer.parseInt(x[0]),
                        x -> x[1]));

        for (Integer key : map.keySet()) {
            System.out.println(key + "  " + map.get(key));
        }
        csvData6.close();

    }
    
}

