public class Main {
    public static void main(String[] args) {
        // домашнаяя работа 1.3 Условные операторы, Дмитрий Аб. //
        // Task 1

        System.out.print("Задание 1 \n");
        byte iOS = 0;
        byte Android = 1;
        byte clientOS = Android;
        if (clientOS==1) {System.out.print("Установите версию приложения для Android по ссылке");}
        else if (clientOS==0){System.out.print("Установите версию приложения для iOS по ссылке");}
        else {System.out.print("У нас есть приложения для iOS и Android!");}

        // Task 2
        System.out.print("\n\nЗадание 2 \n");
        short issueYears = 2012;
        short issueYearsCouldInstallFull =2015;
        if (clientOS==1 && issueYears >=issueYearsCouldInstallFull ) {System.out.print("Установите версию приложения для Android по ссылке");}
        else if (clientOS==0 && issueYears >=issueYearsCouldInstallFull) {System.out.print("Установите версию приложения для iOS по ссылке");}
        else if (clientOS==0 && issueYears < issueYearsCouldInstallFull) {System.out.print("Установите облегченную версию приложения для iOS по ссылке");}
        else if (clientOS==1 && issueYears < issueYearsCouldInstallFull) {System.out.print("Установите облегченную версию приложения для Android по ссылке");}
        else {System.out.print("У нас есть приложения для iOS и Android!");}

        // Task 3
        System.out.print("\n\nЗадание 3 \n");
        int year = 2022;
        int YearsToLeapYear =  year % 4;
        int YearOfCentury =year % 100;
        if (YearsToLeapYear== 0 && YearOfCentury !=0) {System.out.println("этот год високосный");}
        else {System.out.println("этот год не високосный");}

        // Task 4
        System.out.print("\n\nЗадание 4 \n");
        int deliveryDistance = 95;
        if (deliveryDistance < 20 ) {System.out.println("Потребуется дней: 1");}
        else if (deliveryDistance>=20 && deliveryDistance < 60 ) {System.out.println("Потребуется дней: 2");}
        else if (deliveryDistance>=60 && deliveryDistance < 100 ) {System.out.println("Потребуется дней: 3");}
        else {System.out.println(" Ваша карта будет готова к выдаче на следующий день после обращения. \n Выберите и посетите отделение банка в любой удобный для Вас день, в течении меяца ");}

        // Task 5
        System.out.print("\n\nЗадание 5 \n");
        byte monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("осень");
                break;
            default:
                System.out.println("Такого месяца не существует");}

    }
}