public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("\n1. Перевод псевдокода на язык Java");
        boolean isMale = true;
        if (!isMale) {
            System.out.println("Доступ только для женщин");
        } else {
            System.out.println("Вы мужчина, проходите");
        }

        int age = 17;
        if (age < 18) {
            System.out.println("Доступ запрещен. Вы слишком молод");
        } else {
            System.out.println("Доступ разрешен");
        }

        double height = 1.9;
        if (height < 1.8) {
            System.out.println("Ваш рост не подходит под наши условия");
        } else {
            System.out.println("Ваш рост нам подходит");
        }

        char firstLetterName = "Dmitry".charAt(0);
        if (firstLetterName =='M') {
            System.out.println("Поздравляем. Сегодня всем, у кого имя начинается на букву " + firstLetterName + " бесплатный вход");
        } else if (firstLetterName == 'I') {
            System.out.println("Поздравляем. Сегодня всем, у кого имя начинается на букву " + firstLetterName + " бесплатный ланч");
        } else {
            System.out.println("Буква " + firstLetterName + " сегодня не участвует в розыгрыше. Повезет в другой день");
        }

        System.out.println("\n2. Поиск большего числа");
        int num = 1123;
        int num1 = 11232;

        if (num > num1) {
            System.out.println("Число " + num + " больше числа " + num1);
        } else if (num < num1) {
            System.out.println("Число " + num1 + " больше числа " + num);
        } else {
            System.out.println("Числа равны: " + num + " = " + num1);
        }

        System.out.println("\n3. Проверка числа");
        num = 0;

        if (num == 0) {
            System.out.println("Число " + num + " является нулем");
        } else if (num % 2 == 0 && num < 0) {
            System.out.println("Число " + num + " является отрицательным и четным");
        } else if (num % 2 != 0 && num < 0) {
            System.out.println("Число " + num + " является отрицательным и нечетным");
        } else if (num % 2 == 0 && num > 0) {
            System.out.println("Число " + num + " является положительным и четным");
        } else if (num % 2 != 0 && num > 0) {
            System.out.println("Число " + num + " является положительным и нечетным");
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        num = 123;
        num1 = 223;

        int hundredsNum = num / 100;
        int tensNum = (num / 10) % 10;
        int onesNum = num % 10;

        int hundredsNum1 = num1 / 100;
        int tensNum1 = (num1 / 10) % 10;
        int onesNum1 = num1 % 10;

        boolean hasSameDigit = false;

        System.out.println("Исходные числа: " + num + ", " + num1);
        if (onesNum == onesNum1) {
            System.out.println("В первом разряде (единицы) одинаковая цифра " + onesNum);
            hasSameDigit = true;
        }
        if (tensNum == tensNum1) {
            System.out.println("Во втором разряде (десятки) одинаковая цифра " + tensNum);
            hasSameDigit = true;
        }
        if (hundredsNum == hundredsNum1) {
            System.out.println("В третьем разряде (сотни) одинаковая цифра " + hundredsNum);
             hasSameDigit = true;
        }

        if (!hasSameDigit) {
            System.out.println("Равных чисел нет");
        }

        System.out.println("\n5. Определение символа по его коду");
        char symbol = '\u0031';

        if (symbol >= 'a' && symbol <= 'z') {
            System.out.println("Символ " + symbol + " является маленькой буквой");
        } else if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println("Символ " + symbol + " является большой буквой");
        } else if (symbol >= '0' && symbol <= '9') {
            System.out.println("Символ " + symbol + " является цифрой");
        } else {
            System.out.println("Символ " + symbol + " не буква и не цифра");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        int depositAmount = 301_000;
        int interestRate = 10;

        if (depositAmount < 100_000) {
            interestRate = 5;
        } else if (depositAmount < 300_000) {
            interestRate = 7;
        } else {
            interestRate = 10;
        }

        int interestTotal = depositAmount * interestRate / 100;
        int totalAmount = depositAmount + interestTotal;

        System.out.println("Сумма вклада: " + depositAmount + " руб.");
        System.out.println("Сумма начисленного %: " + interestTotal + " руб.");
        System.out.println("Итоговая сумма с %: " + totalAmount + " руб.");

        System.out.println("\n7. Определение оценки по предметам");
        int HistoryPercent = 59;
        int ProgrammingPercent = 92;

        int historyScore;
        int programmingScore;

        if (HistoryPercent <= 60) {
            historyScore = 2;
        } else if (HistoryPercent <= 73) {
            historyScore = 3;
        } else if (HistoryPercent <= 91) {
            historyScore = 4;
        } else {
            historyScore = 5;
        }

        if (ProgrammingPercent <= 60) {
            programmingScore = 2;
        } else if (ProgrammingPercent <= 73) {
            programmingScore = 3;
        } else if (ProgrammingPercent <= 91) {
            programmingScore = 4;
        } else {
            programmingScore = 5;
        }

        double avgGrade = (double) (historyScore + programmingScore) / 2;
        int avgPercent = (HistoryPercent + ProgrammingPercent) / 2;

        System.out.println("Оценка по истории - " + historyScore + "\nОценка по программированию - " + programmingScore);
        System.out.println("Средний балл оценок по предметам - " + avgGrade);
        System.out.println("Средний % по предметам - " + avgPercent);

        System.out.println("\n8. Расчет годовой прибыли");
        int monthlySales = 15000;
        int rentCostPerMonth = 5000;
        int productionCostPerMonth = 9000;

        int profitYear = (monthlySales - (rentCostPerMonth + productionCostPerMonth)) * 12;

        if (profitYear <= 0) {
            System.out.println("Прибыль за год: " + profitYear + " руб.");
        } else {
            System.out.println("Прибыль за год: +" + profitYear + " руб.");
        }
    }
}