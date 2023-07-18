public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("\n1. Вывод характеристик компьютера");

        byte memoryCapacity = 8;
        short numberOfCores = 8;
        int hardDiskCapacity = 500;
        long maxConnectionSpeed = 1;
        float ssdFirmwareVersion = 7429.61f;
        double bluetoothFirmwareVersion = 19.3d;
        char chip = 'M';
        boolean isActivated = true;

        System.out.println("Оперативная память: " + memoryCapacity + " ГБ");
        System.out.println("Количество ядер: " + numberOfCores);
        System.out.println("Объем жесткого диска: " + hardDiskCapacity + " ГБ");
        System.out.println("Максимальная скорость связи: " + maxConnectionSpeed + " Гб/с");
        System.out.println("Версия прошивки SSD: " + ssdFirmwareVersion);
        System.out.println("Версия прошивки Bluetooth: " + bluetoothFirmwareVersion);
        System.out.println("Чип: " + chip);
        System.out.println("Активация: " + isActivated);

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        int penPrice = 100;
        int bookPrice = 200;
        int discountPercent = 11;
        int discountPrice = penPrice + bookPrice;
        int discountAmount = (discountPrice * discountPercent) / 100;
        int totalWithDiscount = discountPrice - discountAmount;

        System.out.println("Общая стоимость товара без скидки: " + discountPrice + " руб.");
        System.out.println("Сумма скидки: " + discountAmount + " %");
        System.out.println("Общая стоимость товаров со скидкой: " + totalWithDiscount + " руб.");

        System.out.println("\n3. Вывод слова Java");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte byteMax = Byte.MAX_VALUE;
        short shortMax = Short.MAX_VALUE;
        int intMax = Integer.MAX_VALUE;
        long longMax = Long.MAX_VALUE;

        System.out.println("byte. Первоначальное значение: " + byteMax);
        System.out.println("byte. Инкремент: " + ++byteMax);
        System.out.println("byte. Декремент: " + --byteMax);

        System.out.println("short. Первоначальное значение: " + shortMax);
        System.out.println("short. Инкремент: " + ++shortMax);
        System.out.println("short. Декремент: " + --shortMax);

        System.out.println("int. Первоначальное значение: " + intMax);
        System.out.println("int. Инкремент: " + ++intMax);
        System.out.println("int. Декремент: " + --intMax);

        System.out.println("long. Первоначальное значение: " + longMax);
        System.out.println("long. Инкремент: " + ++longMax);
        System.out.println("long. Декремент: " + --longMax);

        System.out.println("\n5. Перестановка значений переменных");
        int num1 = 2;
        int tmp = num1;
        int num2 = 5;
        
        System.out.println("С помощью третьей переменной:\n" + "Исходные значения переменных: num1 = " + num1 + ", num2 = " + num2);
        num1 = num2;
        num2 = tmp;
        System.out.println("Новые значения переменных: num1 = " + num1 + ", num2 = " + num2);

        System.out.println("\nС помощью арифметических операций:\n" + "Исходные значения переменных: num1 = " + num1 + ", num2 = " + num2);
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println("Новые значения переменных: num1 = " + num1 + ", num2 = " + num2);

        System.out.println("\nС помощью побитовой операции ^:\n" + "Исходные значения переменных: num1 = " + num1 + ", num2 = " + num2);
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.println("Новые значения переменных: num1 = " + num1 + ", num2 = " + num2);

        System.out.println("\n6. Вывод символов и их кодов");
        char dollar = '$';
        char asterisk = '*';
        char at = '@';
        char pipe = '|';
        char tilde = '~';

        System.out.println((int) dollar + " " + dollar);
        System.out.println((int) asterisk + " " + asterisk);
        System.out.println((int) at + " " + at);
        System.out.println((int) pipe + " " + pipe);
        System.out.println((int) tilde + " " + tilde);

        System.out.println("\n7. Вывод в консоль ASCII - арт Дюка");
        char slash = '/';
        char bSlash = '\\';
        char underscore = '_';
        char lParenthesis = '(';
        char rParenthesis = ')';

        System.out.println("    " + slash + bSlash);
        System.out.println("   " + slash + "  " + bSlash);
        System.out.println("  " + slash + underscore + lParenthesis + " " + rParenthesis + bSlash);
        System.out.println(" " + slash + "      " + bSlash);
        System.out.println("" + slash + underscore + underscore + underscore + underscore + slash + bSlash + underscore + underscore + bSlash);

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа");
        num1 = 123;

        int hundreds = num1 / 100;
        int tens = num1 / 10 % 10;
        int ones = num1 % 10;

        int sum = hundreds + tens + ones;
        int product = hundreds * tens * ones;

        System.out.println("Число " + num1 + " содержит:");
        System.out.println(hundreds + " сотен\n" + tens + " десятков\n" + ones + " единиц");
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
