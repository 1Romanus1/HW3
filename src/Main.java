//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Задача 1
        int age = 28;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " он совершеннолетний");
        }
        if (age <= 18) {
            System.out.println("он не достиг совершеннолетия, нужно немного подождать");
        }
        //Задача N2
        int t = -3;
        if (t >= 5) {
            System.out.println("На улице " + t + " градусов, можно идти без шапки");
        } else {
            System.out.println("На улице " + t + " градусов, нужно надеть шапку");
        }
        //Задача N3
        int kmH = 55;
        if (kmH >= 60) {
            System.out.println("Если скорость " + kmH + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + kmH + ", то можно ездить спокойно");
        }
        //Задача N4
        int person = 22;
        if (person >= 2 && person <= 6) {
            System.out.println("Если возраст человека равен " + person + ", то ему нужно ходить в детский сад");
        }
        if (person >= 7 && person <= 17) {
            System.out.println("Если возраст человека равен " + person + ", то ему нужно ходить в школу");
        }
        if (person >= 18 && person <= 24) {
            System.out.println("Если возраст человека равен " + person + ", то его место в университете");
        }
        if (person > 24) {
            System.out.println("Если возраст человека равен " + person + ", то ему пора на работу");
        }
        //Задача N5
        int child = 7;
        if (child <= 5) {
            System.out.println("Если возраст ребенка равен " + child + ": нельзя кататься на атракционе");
        }
        if (child > 5 && child <= 14) {
            System.out.println("Если возраст ребенка равен " + child + ": можно кататься в сопровождении взрослого");
        }
        if (child > 15) {
            System.out.println("Если возраст ребенка равен " + child + ": можно кататься в сопровождении взрослого");
        }
        //Задача N6
        int people = 102;
        if (people >= 60) {
            System.out.println("Сидячих мест нету - вагон полностью забит");
        } else {
            System.out.println("В вагоне есть сидячие места");
        }
        //Задача N7
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println(one);
        } else {
            if (two > three) {
                System.out.println(two);
            } else {
                System.out.println(three);
            }
        }
    }
}