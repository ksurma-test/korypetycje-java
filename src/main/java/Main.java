import javafx.css.Match;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        //zad1();

        String fileContents = new String(Files.readAllBytes(Paths.get("text.txt")));
        //List<String> lines = Files.readAllLines(Paths.get("doskonale.txt"));

        Map<String, Integer> map = new HashMap<>();

        Matcher matcher = Pattern.compile("\\w+").matcher(fileContents);
//                .results()
//                .forEach(matchResult -> System.out.println(matchResult.group()));

//        Map<String, Long> counted = Pattern.compile("\\w+")
//                .matcher(fileContents)
//                .results()
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        String s;
        while (matcher.find()) {
            s = matcher.group();

            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }

        map.forEach((word, count) -> {
            System.out.println("Slowo " + word + " wystapilo " + count + " razy.");
        });


//        try {
//            String fileContents = new String(Files.readAllBytes(Paths.get("doskonale.txt")));
//            //List<String> lines = Files.readAllLines(Paths.get("doskonale.txt"));
//
//            String[] data = fileContents.split(",+|\\.|\\(|\\)|\\s+");
//
//            Map<Integer, Integer> map = new HashMap<>();
//
//            int i;
//            for (String s : data) {
//                i = Integer.parseInt(s);
//
//                if (map.containsKey(i)) {
//                    map.put(i, map.get(i) + 1);
//                } else {
//                    map.put(i, 1);
//                }
//            }
//
//            map.forEach((k, v) -> {
//                System.out.println(k + " wystapilo " + v + " razy");
//            });
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        BufferedWriter bw = new BufferedWriter(new FileWriter("example.txt", true));

        bw.append("jakis tekst")
                .append("\r\n")
                .flush();

        bw.close();

    }

    public static void zad1() {
        try (BufferedReader br = new BufferedReader(new FileReader("doskonale.txt"))) {

            String[] data;
            int i;

            String line;
            while ((line = br.readLine()) != null) {
                data = line.split("\\s+");

                for (String s : data) {
                    i = Integer.parseInt(s);

                    if (sumOfDividers(i) == i) {
                        System.out.println(i + " jest doskonala");
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int sumOfDividers(int n) {
        int sum = 0;

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        return sum;
    }

}
