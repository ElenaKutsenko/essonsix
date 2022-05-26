public class Main {
    public static void main(String[] args) {
        String firstName = "Ivan";
        String middleName = " Ivanovich";
        String lastName = " Ivanov";
        String fullName = firstName + middleName + lastName;
        {
            System.out.println("ФИО сотрудника — " + fullName);
        }
        String fullName2 = fullName.toUpperCase();
        {
            System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName2);
        }

        String fullName3 = fullName.replace(" ", ";");
        {
            System.out.println("Данные ФИО сотрудника для административного отдела — " + fullName3);
        }
        {

        fullName = "Иванов Семён Семёнович";
        String replace = fullName.replace("ё", "e");
        System.out.println(replace);

        }
    }
}