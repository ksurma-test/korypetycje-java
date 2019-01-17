import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lekcja4 {

    public static void main(String[] args) throws IOException {

//        try (BufferedReader br = new BufferedReader(new FileReader("doskonale.txt"))) {
//            String[] data;
//            String line;
//            int i;
//            while ((line = br.readLine()) != null) {
//                data = line.split("\\s+");
//                for (String s : data) {
//                    i = Integer.parseInt(s);
//                    if (sumOfDividers(i) == i) {
//                        System.out.println(i + " jest doskonala");
//                    }
//
//                }
//            }
//
//        } catch (Exception e) {
//
//            e.printStackTrace();
//        }

        countWords();

        BufferedWriter bw = new BufferedWriter(new FileWriter("example.txt", true));

        bw.append("jakis tekst")
                .append("\r\n")
                .flush();
        bw.close();
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

    public static void countOfDividers() {

        try {

            List<String> lines = Files.readAllLines(Paths.get("doskonale.txt"));


        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public  static void countWords() throws IOException {

        String fileContents = new String(Files.readAllBytes(Paths.get("tekst.txt")));
        String[] data  = fileContents.split(",|\\.|\\(|\\)\\s+");
        Map<String, Integer> map = new HashMap<>();
        for (String s : data) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }

        map.forEach((k,v) -> {
            System.out.println(k + "wystąpiło " + v + "razy");
        });
    }




}