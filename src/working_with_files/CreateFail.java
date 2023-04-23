package working_with_files;

import java.io.*;

// Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, который запишет эту строку
// в простой текстовый файл, обработайте исключения.
public class CreateFail {
    public static void main(String[] args) {
        StringBuilder slovo = new StringBuilder();
        String text = "TEXT";
        slovo.append(text.repeat(100));
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
        }
    }
}
