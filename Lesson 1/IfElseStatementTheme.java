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

        char firtNameInitial = "Dmitry".charAt(0);
        if (firtNameInitial =='M') {
            System.out.println("Поздравляем. Сегодня всем, у кого имя начинается на букву " + firtNameInitial + " бесплатный вход");
        } else if (firtNameInitial == 'I') {
            System.out.println("Поздравляем. Сегодня всем, у кого имя начинается на букву " + firtNameInitial + " бесплатный ланч");
        } else {
            System.out.println("Буква " + firtNameInitial + " сегодня не участвует в розыгрыше. Повезет в другой день");
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
        num = 2;

        if (num % 2 == 0 && num < 0) {
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

        int num2 = num / 100;
        int num3 =  (num / 10) % 10;
        int num4 = num % 10;

        int num5 = num1 / 100;
        int num6 = (num1 / 10) % 10;
        int num7 = num1 % 10;

        boolean hasDigit = false;

        System.out.println("Исходные числа: " + num + ", " + num1);
        if (num4 == num7) {
            System.out.println("В первом разряде (единицы) одинаковая цифра " + num4);
            hasDigit = true;
        }
        if (num3 == num6) {
            System.out.println("Во втором разряде (десятки) одинаковая цифра " + num3);
            hasDigit = true;
        }
        if (num2 == num5) {
            System.out.println("В третьем разряде (сотни) одинаковая цифра " + num2);
             hasDigit = true;
        }

        if (!hasDigit) {
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
        int interestTotal;
        int totalAmount;

        if (depositAmount < 100_000) {
            interestTotal = depositAmount * 5 / 100;
            totalAmount = depositAmount + interestTotal;
        } else if (depositAmount >= 100_000 || depositAmount < 300_000) {
            interestTotal = depositAmount * 7 / 100;
            totalAmount = depositAmount + interestTotal;
        } else {
            interestTotal = depositAmount * 10 / 100;
            totalAmount = depositAmount + interestTotal;
        }

        System.out.println("Сумма вклада: " + depositAmount + " руб." + "\nСумма начисленного %: " + interestTotal + " руб." + "\nИтоговая сумма с %: " + totalAmount + " руб.");

        System.out.println("\n7. Определение оценки по предметам");
        int finalHistoryPercent = 59;
        int finalProgrammingPercent = 92;

        int historyScore;
        if (finalHistoryPercent <= 60) {
            historyScore = 2;
        } else if (finalHistoryPercent > 60 && finalHistoryPercent <= 73) {
            historyScore = 3;
        } else if (finalHistoryPercent > 73 && finalHistoryPercent <= 91) {
            historyScore = 4;
        } else {
            historyScore = 5;
        }

        int programmingScore;
        if (finalProgrammingPercent <= 60) {
            programmingScore = 2;
        } else if (finalProgrammingPercent > 60 && finalProgrammingPercent <= 73) {
            programmingScore = 3;
        } else if (finalProgrammingPercent > 73 && finalProgrammingPercent <= 91) {
            programmingScore = 4;
        } else {
            programmingScore = 5;
        }

        double avgGrade = (double) (historyScore + programmingScore) / 2;
        int avgPercent = (finalHistoryPercent + finalProgrammingPercent) / 2;

        System.out.println("Оценка по истории - " + historyScore + "\nОценка по программированию - " + programmingScore);
        System.out.println("Средний балл оценок по предметам - " + avgGrade);
        System.out.println("Средний % по предметам - " + avgPercent);

        System.out.println("\n8. Расчет годовой прибыли");
        int monthlySales = 13000;
        int rentCostPerMonth = 5000;
        int productionCostPerMonth = 9000;

        int profitMonth = monthlySales - (rentCostPerMonth + productionCostPerMonth);
        int profitYear = profitMonth * 12;

        if (profitYear < 0) {
            System.out.println("Прибыль за год: " + profitYear + " руб.");
        } else if (profitYear == 0) {
            System.out.println("Прибыль за год: " + profitYear + " руб.");
        } else {
            System.out.println("Прибыль за год: +" + profitYear + " руб.");
        }
    }
}