package pl.marcinkulwicki.main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.stream.Stream;

public class MainReadAndSort {

    public static void main(String[] args) {

        Path path = Paths.get("./tekstowy.txt");

        try (Stream<String> stream = Files.lines(path)) {

            stream
                    .map(String::trim)
                    .filter(x -> x.matches(".*[1-2][90][0-9]{2}.*"))
                    .sorted(Comparator.comparing(
                            s -> Integer.parseInt(s.replaceAll("\\D+","")) % 10000)
                    )
                    .forEach(System.out::println);

        } catch (IOException e){
            System.out.println("Cant find file");
            e.printStackTrace();
        }
    }
}
