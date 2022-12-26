public class Main {


    public static void main(String[] args) {
        System.out.println("Курсовая №1");
        EmployeeBook test= new EmployeeBook();
        test.getListEmployee();
        test.setSplitter();
        test.getTotalMonthPay();
        test.setSplitter();
        test.getMaxMonthPay();
        test.setSplitter();
        test.getMinMonthPay();
        test.setSplitter();
        test.getMiddleMonthPay();
        test.setSplitter();
        test.getFullName();
        test.setSplitter();
        test.indexingPay(15);
        test.setSplitter();
        test.getDepartMaxMonthPay(3);
        test.setSplitter();
        test.getDepartMinMonthPay(5);
        test.setSplitter();
        test.getDepartTotalMonthPay(3);
        test.setSplitter();
        test.getDepartMiddleMonthPay(3);
        test.setSplitter();
        test.indexingDepartPay(3,15);
        test.setSplitter();
        test.getDepartInfo(3);
        test.setSplitter();
        test.getMinMonthPay(70000);
        test.setSplitter();
        test.getMaxMonthPay(70000);
        test.removeEmployee("Сидоров Сидор Сидорович");
        test.getListEmployee();//Проверим массив
        test.createEmployee("Син Дзин Пин", 5, 1500450);
        test.getListEmployee();//Проверим массив
        test.editPayEmployee("Син Дзин Пин",250000);
        test.editDepartEmployee("Син Дзин Пин",1);
        test.getListEmployee(); //Проверим массив
        test.getDepartFullName();
    }


}