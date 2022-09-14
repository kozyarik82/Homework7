public class Main {
    public static void main(String[] args) {

        // Задача 1.1
        System.out.println(" Задача 1.1 ");

        int monthSalary = 65535;
        int goal = 2459000;
        int sum = 0;
        int i = 1;
        for (; sum <= goal; i++) {
            sum = sum + sum / 100;
            sum = sum + monthSalary;
            System.out.println(" Месяц " + i + " , сумма накоплений равна " + sum + " рублей ");
        }

        // Задача 1.2
        System.out.println(" Задача 1.2 ");

        int a = 0;
        while (a < 10) {
            a++;
            System.out.print(a + " ");
        }
        System.out.println();

        for (int b = 10; b >= 1; b--) {
            System.out.print(b + " ");
        }
        System.out.println();

        // Задача 1.3
        System.out.println(" Задача 1.3 ");

        int population = 12000000;
        int birth = population / 1000 * 17;
        int death = population / 1000 * 8;
        int year = 0;
        while ( year < 10) {
            year++;
            population = population + birth - death;
            System.out.println(" Год " + year + " , численность населения составляет " + population);
        }

        // Задача 2.1/2.2
        System.out.println(" Задача 2.1/2.2 ");

        int monthVasil = 15000;
        int goalVasil = 12_000_000;
        int amountOfSavings = 0;
        int c = 1;
        for (;amountOfSavings <= goalVasil; c++) {
            amountOfSavings = amountOfSavings + monthVasil;
            amountOfSavings = amountOfSavings + (amountOfSavings / 100 * 7);
            if (c % 6 == 0){
            System.out.println(" Месяц " + c + " , сумма накоплений составляет " + amountOfSavings);}
        }

        // Задача 2.3
        System.out.println(" Задача 2.3 ");

        int month = 15000;
        int nineYears = 12*9;
        int total = 0;
        int d = 1;
        for (;d<=nineYears;d++){
            total = month + total;
            total = total + (total/100*7);
            if (d % 6 ==0){
                System.out.println(" Месяц " + d + " , сумма накоплений составляет " + total);}
        }

        // Задача 2.4
        System.out.println(" Задача 2.4 ");

        int dateFriday = 2;
        for (;dateFriday<=31;dateFriday=dateFriday+7) {
            System.out.println(" Сегодня пятница, " + dateFriday + " число. Необходимо подготовить отчет ");
        }

        // Задача 3.1
        System.out.println(" Задача 3.1 ");

        int yearNow = 2022;
        int yearOneHundredNext = yearNow + 100;
        int yearTwoHundredPast = yearNow-200;
        for (;yearTwoHundredPast<=yearOneHundredNext;yearTwoHundredPast++){
            if (yearTwoHundredPast % 79 ==0){
                System.out.println(yearTwoHundredPast);}
        }

        // Задача 3.2
        System.out.println(" Задача 3.2 ");

        int f = 1;

        for (; f <=10; f++){
            int answer = 2*f;
            System.out.println("2*"+f+"="+answer);
        }





        }

    }
