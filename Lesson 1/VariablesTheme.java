public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("\n1. Вывод характеристик компьютера");

        byte memoryCapacity = 8;
        short numberOfCores = 8;
        int hardDiskCapacity = 500;
        long maxConnectionSpeed = 1;
        float ssdFirmwareVersion = 7429.61f;
        double bluetoothFirmwareVersion = 19.3d;

        System.out.println("Оперативная память: " + memoryCapacity + " ГБ");
        System.out.println("Количество ядер: " + numberOfCores);
        System.out.println("Объем жесткого диска: " + hardDiskCapacity + " ГБ");
        System.out.println("Максимальная скорость связи: " + maxConnectionSpeed + " Гб/с");
        System.out.println("Версия прошивки SSD: " + ssdFirmwareVersion);
        System.out.println("Версия прошивки Bluetooth: " + bluetoothFirmwareVersion);

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        int penPrice = 100;
        int bookPrice = 200;
        int discountPercentage = 11;
        int totalWithoutDiscount = penPrice + bookPrice;
        int discountAmount = (totalWithoutDiscount * discountPercentage) / 100;
        int totalWithDiscount = totalWithoutDiscount - discountAmount;

        System.out.println("Общая стоимость товара без скидки: " + totalWithoutDiscount + " руб.");
        System.out.println("Сумма скидки: " + discountAmount + " %");
        System.out.println("Общая стоимость товаров со скидкой: " + totalWithDiscount + " руб.");

        System.out.println("\n3. Вывод слова Java");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte num1 = Byte.MAX_VALUE;
        short num2 = Short.MAX_VALUE;
        int num3 = Integer.MAX_VALUE;
        long num4 = Long.MAX_VALUE;

        System.out.println("byte. Первоначальное значение: " + num1);
        num1++;
        System.out.println("byte. Инкремент: " + num1);
        num1--;
        System.out.println("byte. Декремент: " + num1);

        System.out.println("short. Первоначальное значение: " + num2);
        num2++;
        System.out.println("short. Инкремент: " + num2);
        num2--;
        System.out.println("short. Декремент: " + num2);

        System.out.println("int. Первоначальное значение: " + num3);
        num3++;
        System.out.println("int. Инкремент: " + num3);
        num3--;
        System.out.println("int. Декремент: " + num3);

        System.out.println("long. Первоначальное значение: " + num4);
        num4++;
        System.out.println("long. Инкремент: " + num4);
        num4--;
        System.out.println("long. Декремент: " + num4);

        System.out.println("\n5. Перестановка значений переменных");
        int num5 = 2;
        int num6 = 5;
        int num7 = num5;

        System.out.println("С помощью третьей переменной:\n" + "Исходные значения переменных: num5 = " + num5 + ", num6 = " + num6);
        num5 = num6;
        num6 = num7;
        System.out.println("Новые значения переменных: num5 = " + num5 + ", num6 = " + num6);

        System.out.println("\nС помощью арифметических операций:\n" + "Исходные значения переменных: num5 = " + num5 + ", num6 = " + num6);
        num5 += num6;
        num6 = num5 - num6;
        num5 -= num6;
        System.out.println("Новые значения переменных: num5 = " + num5 + ", num6 = " + num6);

        System.out.println("\nС помощью побитовой операции ^:\n" + "Исходные значения переменных: num5 = " + num5 + ", num6 = " + num6);
        num5 ^= num6;
        num6 ^= num5;
        num5 ^= num6;
        System.out.println("Новые значения переменных: num5 = " + num5 + ", num6 = " + num6);

        System.out.println("\n6. Вывод символов и их кодов");
        char ch1 = '$';
        char ch2 = '*';
        char ch3 = '@';
        char ch4 = '|';
        char ch5 = '~';

        System.out.println((int) ch1 + " " + ch1);
        System.out.println((int) ch2 + " " + ch2);
        System.out.println((int) ch3 + " " + ch3);
        System.out.println((int) ch4 + " " + ch4);
        System.out.println((int) ch5 + " " + ch5);

        System.out.println("\n7. Вывод в консоль ASCII - арт Дюка");
        ch1 = '/';
        ch2 = '\\';
        ch3 = '_';
        ch4 = '(';
        ch5 = ')';

        System.out.println("    " + ch1 + ch2);
        System.out.println("   " + ch1 + "  " + ch2);
        System.out.println("  " + ch1 + ch3 + ch4 + " " + ch5 + ch2);
        System.out.println(" " + ch1 + "      " + ch2);
        System.out.println("" + ch1 + ch3 + ch3 + ch3 + ch3 + ch1 + ch2 + ch3 + ch3 + ch2);

        System.out.println("\n8. Вывод количества сотен, десятков и едениц числа");
        num3 = 123;

        num5 = num3 / 100;
        num6 = num3 / 10 % 10;
        num7 = num3 % 10;

        int sum = num5 + num6 + num7;
        int product = num5 * num6 * num7;

        System.out.println("Число " + num3 + " содержит:");
        System.out.println(num5 + " сотен\n" + num6 + " десятков\n" + num7 + " единиц");
        System.out.println("Сумма его цифр = " + sum);
        System.out.println("Произведение = " + product);

        System.out.println("\n9. Вывод времени");
        int totalSecond = 86399;

        int hours = totalSecond / 3600;
        int minutes = (totalSecond % 3600) / 60;
        int seconds = totalSecond % 60;

        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}
