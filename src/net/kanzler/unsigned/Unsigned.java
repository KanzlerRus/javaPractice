package net.kanzler.unsigned;

public class Unsigned {
    enum Size {SMALL,BIG};

    public static void main(String[] args) {
        int i = 150;        // 00000000 00000000 00000000 10010110
        byte b = (byte) i;  //                            10010110

        System.out.println(b);                      // -106
        System.out.println(Byte.toUnsignedInt(b));  //  150


        byte b2 = (byte) Integer.parseInt("150");

        System.out.println(Byte.toUnsignedInt(b2)); // 150

        byte b3 = (byte) 200;
        int i3 = b3;
        System.out.println(i3);
        System.out.println(Byte.toUnsignedInt(b3));

        System.out.println(Size.SMALL);

        System.out.println(-5 % 2);     // будет генрироваться -1 !!1

        double s = 5.0 / 0;
        System.out.println(s); // генерируется infinity -- > исключение не поможет отловить ошибку
        // u - избегать в комментария -- так это являетсяуправляюзей последовательностью unicode
        // Код ошибки при завершении
        // войти в каталг c:\home\c
        System.exit(100);
    }
}
