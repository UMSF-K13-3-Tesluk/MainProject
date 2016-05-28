/* Вызов методов
Подумайте, что делает программа.
По аналогии с методом printName(Student student), в метод main добавьте вызовы методов printAge(Student student) и printMoney(Student student)
*/
public class Call_the_methods {

        public static void main(String[] args) {
            Student student = new Student();
            printName(student);
            printAge(student);
            printMoney(student);
            //напишите тут ваш код

        }

        public static void printName(Student student){
            System.out.println(student.name);
        }

        public static void printAge(Student student){
            System.out.println(student.age);
        }

        public static void printMoney(Student student){
            System.out.println(student.money);
        }


        public static class Student {
            String name = "Amigo";
            int age = 2;
            int money = 10;
        }
    }
