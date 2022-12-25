public class ListOfMethod {
    //Заполним массив данными
    public static Employee[] employees = {
            new Employee("Иванов Иван Иванович", 1, 50000),
            new Employee("Сидоров Сидор Сидорович", 2, 51200),
            new Employee("Петров Петр Петрович", 3, 53450),
            new Employee("Семенов Семен Семонович", 4, 52350),
            new Employee("Дмитриев Дмитрий Дмитрееевич", 5, 55627),
            new Employee("Гаврилов Алексей Алексеевич", 1, 54630),
            new Employee("Григорьев Антон Иванович", 2, 57890),
            new Employee("Самохин Иван Генадьевич", 3, 60520),
            new Employee("Тимофеев Сергей Гнедьевич", 4, 52025),
            new Employee("Иванов Владимир Евгеньевич", 5, 53200)
    };

    // Получим список всех сотрудников
    public static void getListEmployee() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }

    }

    //Посчитатаем сумму затрат на зарплаты в месяц.
    public static void getTotalMonthPay() {
        float totalPay = 0;
        for (int i = 0; i < employees.length; i++) {
            totalPay = totalPay + employees[i].getPay();

        }
        System.out.println("Общая Сумма затрат на з/п за месяц составило : " + totalPay);
    }

    //Найдем сотрудника с максимальной зарплатой.
    public static void getMaxMonthPay() {
        String member = "";
        float maxPay = -1;
        for (int i = 0; i < employees.length; i++) {
            //maxPay=totalPay+employees[i].getPay();
            if (maxPay < employees[i].getPay()) {
                maxPay = employees[i].getPay();
                member = employees[i].getFullName();
            }

        }
        System.out.println(member + " получил максимальную з/п , она составила  : " + maxPay);
    }

    //Найдем сотрудника с минимальной зарплатой.
    public static void getMinMonthPay() {
        String member = "";
        float minPay = Float.MAX_VALUE;
        for (int i = 0; i < employees.length; i++) {
            //maxPay=totalPay+employees[i].getPay();
            if (minPay > employees[i].getPay()) {
                minPay = employees[i].getPay();
                member = employees[i].getFullName();
            }

        }
        System.out.println(member + " получил минимальную з/п , она составила  : " + minPay);
    }

    //Подсчитать среднее значение зарплат
    public static void getMiddleMonthPay() {
        float totalPay = 0;
        for (int i = 0; i < employees.length; i++) {
            totalPay = totalPay + employees[i].getPay();

        }
        System.out.println("Средняя з/п за месяц  : " + totalPay / employees.length);
    }

    //Получить Ф. И. О. всех сотрудников
    public static void getFullName() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Ф.И.О : " + employees[i].getFullName());
        }

    }

    //индексация з/п всех сотрудников
    public static void indexingPay(int indexingPercent) {

        for (int i = 0; i < employees.length; i++) {
            float Pay = employees[i].getPay();
            employees[i].setPay(Pay + (Pay * indexingPercent / 100));
            System.out.println(employees[i]);
        }

    }

    //Методы с параметром int Depart
    //Сотрудник с максимальной зарплатой
    public static void getDepartMaxMonthPay(int depart) {
        String member = "";
        float maxPay = -1;
        for (int i = 0; i < employees.length; i++) {

            if (maxPay < employees[i].getPay() && depart == employees[i].getDepartment()) {
                maxPay = employees[i].getPay();
                member = employees[i].getFullName();
            }

        }
        if (maxPay > -1) {
            System.out.println("В отделе № " + depart + " " + member + " получил максимальную з/п , она составила  : " + maxPay);
        } else {
            System.out.println("В отделе № " + depart + " нет сотрудников ,либо нет такого отдела");
        }
    }

    //Сотрудник с минимальной зарплатой.
    public static void getDepartMinMonthPay(int depart) {
        String member = "";
        float minPay = Float.MAX_VALUE;
        for (int i = 0; i < employees.length; i++) {

            if (minPay > employees[i].getPay() && depart == employees[i].getDepartment()) {
                minPay = employees[i].getPay();
                member = employees[i].getFullName();
            }

        }
        if (minPay != Float.MAX_VALUE) {
            System.out.println("В отделе № " + depart + " " + member + " получил минимальную з/п , она составила  : " + minPay);
        } else {
            System.out.println("В отделе № " + depart + " нет сотрудников ,либо нет такого отдела");
        }
    }
//Сумма затрат на зарплату по отделу.
    public static void getDepartTotalMonthPay(int depart) {
        float totalPay = 0;
        for (int i = 0; i < employees.length; i++) {
            if (depart == employees[i].getDepartment()) {
                totalPay = totalPay + employees[i].getPay();
            }


        }
        System.out.println("В отделе № " + depart + " общая сумма затрат на з/п за месяц составило : " + totalPay);
    }
//Средняя зарплата по отделу
    public static void getDepartMiddleMonthPay(int depart) {
        int count = 0;
        float totalPay = 0;
        for (int i = 0; i < employees.length; i++) {

            if (depart == employees[i].getDepartment()) {
                count++;
                totalPay = totalPay + employees[i].getPay();
            }

        }
        if (totalPay != 0 && count != 0) {
            System.out.println("В отделе № " + depart + " cредняя з/п за месяц  : " + totalPay / count);
        }

    }
   //индексация зарплаты всех сотрудников отдела на процент, который приходит в качестве параметра.
    public static void indexingDepartPay(int depart,float indexingPercent) {

        for (int i = 0; i < employees.length; i++) {
            if (depart == employees[i].getDepartment()) {
                float Pay = employees[i].getPay();
                employees[i].setPay(Pay + (Pay * indexingPercent / 100));
                System.out.println(employees[i]);
            }
        }

    }

    public static void getDepartInfo(int depart) {
        for (int i = 0; i < employees.length; i++) {
            if (depart == employees[i].getDepartment()) {
                System.out.println("Ид: " + employees[i].getId() + "  " + employees[i].getFullName() + " Зарплата: " + employees[i].getPay());

            }
        }

    }

    // //Методы с параметром int Depart
    public static void getMinMonthPay(int payment) {
        String member = "";
        float Pay = 0;
        for (int i = 0; i < employees.length; i++) {

            if (payment > employees[i].getPay()) {
                Pay = employees[i].getPay();
                member = employees[i].getFullName();
                System.out.println(member + "   получил  з/п меньше  " + payment + " ,и  она составила  : " + Pay);
            }

        }

    }

    public static void getMaxMonthPay(int payment) {
        String member = "";
        float Pay = 0;
        for (int i = 0; i < employees.length; i++) {

            if (payment <= employees[i].getPay()) {
                Pay = employees[i].getPay();
                member = employees[i].getFullName();
                System.out.println(member + "   получил  з/п ,больше или равно  " + payment + " ,и  она составила  : " + Pay);
            }

        }

    }

    public static void setSplitter() {
        System.out.println("*********************************************************");
    }
}









