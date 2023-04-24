package working_with_files;

import java.io.*;

// Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, который запишет эту строку
// в простой текстовый файл, обработайте исключения.
public class WritingAndReadingFile {
    public static void main(String[] args) throws IOException {
        // Решение 1 : создаем файл(100раз) в main

      /* // StringBuilder slovo = new StringBuilder();  // создаем StringBuilder для создания слов
        String text = "TEXT";
       // slovo.append(text.repeat(100));   // создаем через repeat 100 слов(не пользуемся)
          // ссоздаем текстовый файл и обрабатываем его в исключении
        try (FileWriter fw = new FileWriter("file.txt", false)) {
            for (int i = 0; i < 100; i++) {
                fw.write(text + "\n");
            }
            fw.flush();
            // Чтение текстового файла
            BufferedReader br = new BufferedReader(new FileReader("file.txt"));
            String str;
            while ((str = br.readLine()) != null) {
                System.out.printf("== %s ==\n", str);
            }
            br.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }*/

        // Решение 2 : создаем файл(100раз) через метод и StringBuilder
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            word.append("TEST \n");
            createFail(word);
        }
    }
    public static void createFail(StringBuilder str) throws IOException {
        try(FileWriter text = new FileWriter("my File.txt",false)) // если мы хотим дополнять файл ставим true
        {
             text.write(str.toString());
             text.flush();
        } catch (IOException e) {
            throw new IOException(e.getMessage());
        }
    }
}
