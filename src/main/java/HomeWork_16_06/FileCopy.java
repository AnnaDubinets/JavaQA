package HomeWork_16_06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileCopy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите путь к существующему файлу: ");
        String sourcePath = scanner.nextLine();

        System.out.print("Введите имя нового файла: ");
        String destinationPath = scanner.nextLine();

        try {
            copyFile(sourcePath, destinationPath);
            System.out.println("Файл успешно скопирован.");
        } catch (IOException e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }

    public static void copyFile(String sourcePath, String destinationPath) throws IOException {
        FileInputStream fis = new FileInputStream(sourcePath);
        FileOutputStream fos = new FileOutputStream(destinationPath);

        byte[] buffer = new byte[1024];
        int length;
        while ((length = fis.read(buffer)) > 0) {
            fos.write(buffer, 0, length);
        }

        fis.close();
        fos.close();
    }
}
