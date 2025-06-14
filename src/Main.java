import Entity.Employee;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Main {
    public static void main(String[] args) {

        String str = " Hai   bro  ";
        String[] stringArr = new String[]{"Hi", "Be", "bye", "see", "hello", "Hello", "DoRa", "  ", " ", "",
                new String("hello")};
        int[] nums = new int[]{2, 4, 5, 3, 6, 7, 8, 9, 2, 9};

        //// ------- Streams qns --------
        ///  easy
        // sum of all numbers in a list
//        System.out.println(Arrays.stream(nums).sum());

        // convert a list of strings to their lengths
//        System.out.println(Arrays.stream(stringArr).map(String::length).toList());

        // get unique strings
//        System.out.println(Arrays.stream(stringArr).distinct().toList());
//        System.out.println(Arrays.stream(stringArr).filter(x -> !x.isEmpty()).collect(Collectors.toSet()));

        // get duplicate strings
//        Set<String> seen = new HashSet<>();
//        System.out.println(Arrays.stream(stringArr).filter(x -> !seen.add(x)).collect(Collectors.toSet()));

        // remove duplicates from a list using distinct
//        System.out.println(Arrays.stream(nums).distinct().boxed().toList());

        // find minimum and maximum in list
//        System.out.println("Minimum: " + Arrays.stream(nums).boxed().min(Integer::compare));
//        System.out.println("Maximum: " + Arrays.stream(nums).boxed().max(Integer::compare));

        // find min and max length non-empty string
//        System.out.println(Arrays.stream(stringArr).filter(x -> !x.isEmpty())
//                .min(Comparator.comparingInt(String::length)).orElse(null));
//        System.out.println(Arrays.stream(stringArr).filter(x -> !x.isEmpty())
//                .max(Comparator.comparingInt(String::length)).orElse(null));

        // find min and max length non-empty strings
//        int minLength = Arrays.stream(stringArr).filter(x -> !x.trim().isEmpty())
//                .mapToInt(String::length).min().orElse(0);
//        int maxLength = Arrays.stream(stringArr).filter(x -> !x.trim().isEmpty()).mapToInt(String::length)
//                .max().orElse(0);
//        System.out.println("Strings with same min length: " + Arrays.stream(stringArr)
//                .filter(x -> !x.trim().isEmpty() && x.length() == minLength).toList());
//        System.out.println("Strings with same max length: " + Arrays.stream(stringArr)
//                .filter(x -> !x.trim().isEmpty() && x.length() == maxLength).toList());

        // filter non-empty strings from a list
//        System.out.println("non-empty strings: " + Arrays.stream(stringArr).filter(x -> !x.isEmpty()).toList());

        // finding list of all strings starts with "h" or "H"
//        System.out.println(Arrays.stream(stringArr).filter(x -> x.startsWith("h") || x.startsWith("H")).toList());

        // find first element starting with 'h'
//        System.out.println(Arrays.stream(stringArr).filter(x -> x.startsWith("h") || x.startsWith("H"))
//                .findFirst().orElse(null));

        // finding even numbers from a list
//        System.out.println(Arrays.stream(nums).filter(x -> (x & 1) == 0).boxed().toList());

        // count elements in list
//        System.out.println(Arrays.stream(nums).count());

        // Sorting list of strings alphabetically
//        System.out.println(Arrays.stream(stringArr).filter(x -> !x.trim().isEmpty()).sorted().toList());

        // Sorting strings based on string length
//        System.out.println("length(asc) and alphabetic(asc)");
//        System.out.println(Arrays.stream(stringArr).filter(x -> !x.trim().isEmpty())
//                .sorted(Comparator.comparingInt(String::length)
//                        .thenComparing(String::compareTo)).toList());
//        System.out.println("length(asc) and alphabetic(desc)");
//        System.out.println(Arrays.stream(stringArr).filter(x -> !x.trim().isEmpty())
//                .sorted(Comparator.comparingInt(String::length)
//                        .thenComparing(Comparator.reverseOrder())).toList());
//        System.out.println("length(desc) and alphabetic(desc)");
//        System.out.println(Arrays.stream(stringArr).filter(x -> !x.trim().isEmpty())
//                .sorted(Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.reverseOrder()))
//                .toList());
//        System.out.println("length(desc) and alphabetic(asc)");
//        System.out.println(Arrays.stream(stringArr).filter(x -> !x.trim().isEmpty())
//                .sorted(Comparator.comparingInt(String::length).reversed().thenComparing(String::compareTo)).toList());

        // finding distinct elements in stream
//        System.out.println(Arrays.stream(nums).distinct());

        // finding unique elements in stream with set
//        Set<Integer> set = new HashSet<>();
//        System.out.println(Arrays.stream(nums).boxed().filter(set::add).toList());

        // finding duplicate elements
//        Set<Integer> set = new HashSet<>();
//        System.out.println(Arrays.stream(nums).filter(x -> !set.add(x)).boxed().collect(Collectors.toSet()));

        // finding frequency map using streams
        // -- Long count --
//        Map<Integer, Long> freq = Arrays.stream(nums).boxed().collect(Collectors.groupingBy(n -> n,
//                Collectors.counting()));
        //  -- to Integer
//        Map<Integer, Integer> freq = Arrays.stream(nums).boxed().collect(Collectors.groupingBy(n -> n,
//                Collectors.collectingAndThen(Collectors.counting(), Long::intValue)));
//        freq = Arrays.stream(nums).boxed().collect(Collectors.groupingBy(n -> n,
//                Collectors.counting()));
//        System.out.println(freq.entrySet().stream().filter(x -> x.getValue() > 1).toList());
//        Map<Integer, Integer> finalFreq = freq.entrySet().stream().filter(x -> x.getValue() > 1)
//                .collect(Collectors.toMap(Map.Entry::getKey,
//                        Map.Entry::getValue));
//        System.out.println(finalFreq);

        // group a list of objects by a field eg., group employee objects by department
//        List<Employee> employees = new ArrayList<>();
//        Employee employee1 = new Employee(1, "IT");
//        Employee employee2 = new Employee(2, "CSE");
//        Employee employee3 = new Employee(3, "IT");
//        Employee employee4 = new Employee(4, "CSE");
//        Employee employee5 = new Employee(5, "MECH");
//        Employee employee6 = new Employee(6, "BIO");
//        Employee employee7 = new Employee(7, "IT");
//        Employee employee8 = new Employee(8, "IT");
//        employees.add(employee1);
//        employees.add(employee2);
//        employees.add(employee3);
//        employees.add(employee4);
//        employees.add(employee5);
//        employees.add(employee6);
//        employees.add(employee7);
//        employees.add(employee8);
//        Map<String, Integer> employeeFreqMapByDepartment = employees.stream()
//                .collect(Collectors.groupingBy(Employee::getDepartment,
//                        Collectors.collectingAndThen(Collectors.counting(), Long::intValue)));
//        System.out.println(employeeFreqMapByDepartment);

//        Map<String, List<Employee>> employeesMapByDepartment = employees.stream()
//                .collect(Collectors.groupingBy(Employee::getDepartment,
//                        Collectors.toList()));
//        System.out.println(employeesMapByDepartment);

        // get departments which have more than one employee
//        Map<String, Integer> freqMapWithMoreThanOneEmployeeDept = employeeFreqMapByDepartment
//                .entrySet().stream().filter(x -> x.getValue() > 1)
//                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
//        System.out.println(freqMapWithMoreThanOneEmployeeDept);

        // find second largest number in the list
//        System.out.println(Arrays.stream(nums).sorted().boxed().skip(1).findFirst().orElse(null));

        // find n-th largest number in the list
//        int n = 3;
//        System.out.println("Number array: " +  Arrays.toString(nums));
//        System.out.println("Sorted number array: " + Arrays.stream(nums).sorted().boxed().toList());
//        System.out.println(n + "th largest number: " + Arrays.stream(nums).distinct().sorted().boxed().skip(n - 1)
//                .findFirst().orElse(null));

        // check if all elements match a condition
//        System.out.println(Arrays.stream(nums).allMatch(x -> x % 2 == 0));

        // convert a list of strings to a map (string -> length)
        System.out.println("String array: " + Arrays.toString(stringArr));
        Map<String, Integer> stringWithLength = Arrays.stream(stringArr).collect(
                Collectors.toMap(
                        word -> word,
                        String::length,
                        (existing, replacement) -> existing
                )
        );
        System.out.println(stringWithLength);

        // flatten a lists

        // remove null or empty strings from a list

        /// hard level
        // find the longest string in a list

        // top n elements from a list

        // custom collector to join strings with delimiters, prefixes, and suffixes

        // partition a list into two (even / odd) using Collectors.partitioningBy

        // parallel stream performance test (compare stream and parallel stream)

        // calculate frequency of each character in a string

        // chain multiple stream operations efficiently

        // implement own collector (Collector interface)
    }
}