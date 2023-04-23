package string;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerExamples {
    public static void main(String[] args) {
        try {
            // создаем логгер с именем Loggers
            Logger logger = Logger.getLogger(LoggerExamples.class.getName());
            // объявляем хендлер, чтобы сделать запись в файл
            FileHandler fh = new FileHandler("logger.log");
            // связываем хендлер и логгер между собой
            logger.addHandler(fh);
            SimpleFormatter sFormat = new SimpleFormatter();
            fh.setFormatter(sFormat);
            // нужно, чтобы была запись только в файл, без вывода в терминал
            logger.setUseParentHandlers(false);
            // записываем в лог файл
            logger.log(Level.INFO, "Начало логирования");
        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }
}
