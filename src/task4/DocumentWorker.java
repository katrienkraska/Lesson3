package task4;

import java.util.Scanner;

public class DocumentWorker {
    void openDocument() {
        System.out.println("Документ відкритий");
    }

    void editDocument() {
        System.out.println("Правка документа доступна у версії Про");
    }

    void saveDocument() {
        System.out.println("Збереження документа доступне у версії Про");
    }
}

class ProDocumentWorker extends DocumentWorker {
    @Override
    void openDocument() {
        super.openDocument();
        System.out.println("Документ відредаговано");
    }

    @Override
    void saveDocument() {
        super.saveDocument();
        System.out.println("Документ збережено у старому форматі, збереження в інших форматах доступне у версії Експерт");
    }
}

class ExpertDocumentWorker extends DocumentWorker {
    @Override
    void saveDocument() {
        super.saveDocument();
        System.out.println("Вивести на екран документ збережений в новому форматі");
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть номер ключа доступу (pro/exp): ");
        String key = scanner.nextLine();

        DocumentWorker documentWorker;

        if (key == "pro") {
            documentWorker = new ProDocumentWorker();
        } else if (key == "exp") {
            documentWorker = new ExpertDocumentWorker();
        } else {
            documentWorker = new DocumentWorker();
        }

        documentWorker.openDocument();
        documentWorker.editDocument();
        documentWorker.saveDocument();
    }
}
