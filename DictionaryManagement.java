package Hoang;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;



public class DictionaryManagement  extends Dictionary {
    public static String insertFromCommandLine() throws SQLException {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Enter number of words you want to translate: ");
        int num = nhap.nextInt();
        nhap.nextLine();
        for (int i = 0; i < num; i++) {
            System.out.println("Enter your word_target: ");
            String wordTarget = nhap.nextLine();
            System.out.println("Enter your word_explain of this word_target: ");
            String wordExplain = nhap.nextLine();
        }
        return "Successfully Inserted";
    }

        /**
         * Insert from file.
         */
        public static void insertFromFile(){
            Scanner sc;
            listWord.clear();
            listWordTarget.clear();
            try{
                sc = new Scanner(new File("Hoang/dictionaries.txt"));
                while(sc.hasNext()){
                    String wordTarget = sc.nextLine().trim();
                    String wordExplain = sc.nextLine().trim();
                    listWord.add(new Word(wordTarget, wordExplain));
                }
                for(Word word : listWord){
                    listWordTarget.add(word.getWord_target());
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        public static void dictionaryLookup()
        {
            Scanner input = new Scanner(System.in);
            System.out.printf("Nhập từ cần tra: ");
            String word  = input.nextLine();
            for(Word w : listWord){
                if(word.equalsIgnoreCase(w.getWord_target()))
                {
                    System.out.printf("Nghĩa của từ "+ word +" là: "+w.getWord_explain());
                }
            }
        }
        


    }



