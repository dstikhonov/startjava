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
        num = 2;

        if (num != 0) {
            if (num > 0) {
                System.out.print("Число " + num + " является положительным и ");
            } else {
                System.out.print("Число " + num + " является отрицательным и ");
            }
            if (num % 2 == 0) {
                System.out.println("четным");
            } else {
                System.out.println("нечетным");
            }
        } else {
            System.out.println("Число является нулем");
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

        boolean isEqual = false;

        System.out.println("Исходные числа: " + num + ", " + num1);
        if (onesNum == onesNum1) {
            System.out.println("В первом разряде (единицы) одинаковая цифра " + onesNum);
            isEqual = true;
        }
        if (tensNum == tensNum1) {
            System.out.println("Во втором разряде (десятки) одинаковая цифра " + tensNum);
            isEqual = true;
        }
        if (hundredsNum == hundredsNum1) {
            System.out.println("В третьем разряде (сотни) одинаковая цифра " + hundredsNum);
             isEqual = true;
        }

        if (!isEqual) {
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
        } else if (depositAmount <= 300_000) {
            interestRate = 7;
        }

        int interestTotal = depositAmount * interestRate / 100;
        int totalAmount = depositAmount + interestTotal;

        System.out.println("Сумма вклада: " + depositAmount + " руб.");
        System.out.println("Сумма начисленного %: " + interestTotal + " руб.");
        System.out.println("Итоговая сумма с %: " + totalAmount + " руб.");

        System.out.println("\n7. Определение оценки по предметам");
        int historyPercent = 59;
        int historyScore = 5;
        if (historyPercent <= 60) {
            historyScore = 2;
        } else if (historyPercent <= 73) {
            historyScore = 3;
        } else if (historyPercent <= 91) {
            historyScore = 4;
        }

        int programmingPercent = 92;
        int programmingScore = 5;
        if (programmingPercent <= 60) {
            programmingScore = 2;
        } else if (programmingPercent <= 73) {
            programmingScore = 3;
        } else if (programmingPercent <= 91) {
            programmingScore = 4;
        }

        double avgGrade = (double) (historyScore + programmingScore) / 2;
        int avgPercent = (historyPercent + programmingPercent) / 2;

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