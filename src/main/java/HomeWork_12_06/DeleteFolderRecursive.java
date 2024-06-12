package HomeWork_12_06;

import java.io.File;
import java.util.Scanner;

public class DeleteFolderRecursive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите путь к папке для удаления: ");
        String folderPath = scanner.nextLine();

        // метод для удаления папки
        deleteFolder(new File(folderPath));

        System.out.println("Папка успешно удалена.");
    }

    public static void deleteFolder(File folder) {
        if (folder.isDirectory()) {

            File[] files = folder.listFiles();
            if (files != null) {
                for (File file : files) {
                    deleteFolder(file);
                }
            }
        }

        folder.delete();
    }
}
