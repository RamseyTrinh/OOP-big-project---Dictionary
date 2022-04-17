package Hoang;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class DictionaryManagement extends Dictionary {
    /**
     * Insert from file.
     */
    public static void insertFromFile() {
        Scanner sc;
        listWord.clear();
        listWordTarget.clear();
        try {
            sc = new Scanner(new File("Hoang/dictionaries.txt"));
            while (sc.hasNext()) {
                String wordTarget = sc.nextLine().trim();
                String wordExplain = sc.nextLine().trim();
                listWord.add(new Word(wordTarget, wordExplain));
            }
            for (Word word : listWord) {
                listWordTarget.add(word.getWord_target());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void dictionaryLookup() {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your word target: ");
        String wordtarget = sc.nextLine();
        for (Word word : listWord) {
            if (wordtarget.equalsIgnoreCase(word.getWord_target())) {
                count++;
                System.out.println("The word explain is: ");
                System.out.println(word.getWord_explain());
            }
        }
        if (count == 0) System.out.println("No word exist!");
    }

    public static String insertFromCommandline() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of words you want to insert: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Word_Target: ");
            String wordTarget = sc.nextLine();
            System.out.println("Enter this Word_Explain: ");
            String wordExplain = sc.nextLine();
            Word newWord = new Word(wordTarget, wordExplain);
            listWord.add(newWord);
        }
        return "Insert successful!";
    }

    public static String removeFromCommandline() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word you want to delete: ");
        String wordTarget = sc.nextLine();
        for (int i =0; i <listWord.size(); i++) {
            if (wordTarget.equalsIgnoreCase(listWord.get(i).getWord_target())) {
                listWord.remove(listWord.get(i));
            }
        }
        return "Remove successful";
    }

    public static String editFromCommandLine() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word you want to edit: ");
        String wordTarger = sc.nextLine();
        for (int i = 0; i < listWord.size(); i++) {
            if (wordTarger.equalsIgnoreCase(listWord.get(i).getWord_target())) {
                System.out.println("Enter your changed meaning: ");
                String word = sc.nextLine();
                listWord.set(i, new Word(wordTarger, word));
            }
        }
        return "Edit successful!";
    }

    public static void dictionaryExportToFile() {
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter("Hoang/dictionaries.txt");
            for (int i = 0; i < listWord.size(); i++) {
                fileWriter.write(listWord.get(i).getWord_target() + "\n");
                fileWriter.write(listWord.get(i).getWord_explain() + "\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}



