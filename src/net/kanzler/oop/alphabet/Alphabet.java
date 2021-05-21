package net.kanzler.oop.alphabet;

public class Alphabet {
    public static void main(String[] args) {

        char engCh = 65;            // Английская буква A
        int engCount = 26;          // Кол-во букв в английском алфавите
        printAlphabet(engCh, engCount);

        char rusCh = 1040;          // Русская буква А
        int rusCount = 33 - 1;      // Кол-во симовлов в русском алфавите - пропускаем Ё(1025)
        printAlphabet(rusCh, rusCount);

        // Более изящный метод вывода алфавита
        printAlphabet2('A', 'Z');
        printAlphabet2('А', 'Я');

    }

    private static void printAlphabet2(char start, char end) {
        while (start <= end) {
            System.out.print(start + " ");
            start++;
        }
        System.out.println();
    }

    private static void printAlphabet(int indexStart, int count) {
        for (int i = indexStart; i < indexStart + count; i++) {
            System.out.print((char) i + " ");
        }
        System.out.println();
    }


}
