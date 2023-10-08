package second_problem;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("cantec_out.txt");
        FileWriter fileWriter = new FileWriter("cantec_out.txt", true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        List<vers> versuriList = new ArrayList<>();
        Scanner inputFile = new Scanner(new File("versuri.txt"));
        while (inputFile.hasNextLine()){
            String line = inputFile.nextLine();
            System.out.println(line);
            vers versuri = new vers(line);
            versuriList.add(versuri);
        }
        inputFile.close();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nIntroduceti caracterele");
        String caractere = scanner.nextLine();
        for (vers versuri : versuriList) {
            versuri.Calculate();
            versuri.Steluta(caractere);
            versuri.CalculateGenerator();
            System.out.println("Debug: Line content: " + versuri.getLine());
            bufferedWriter.write("\n" + versuri.getLine());
            bufferedWriter.flush();
        }
        bufferedWriter.close();
    }
}
