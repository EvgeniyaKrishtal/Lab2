import com.sun.source.tree.Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int bufint;
        //Задание 1
       System.out.println("Задание 1");
        System.out.println("Ввод ArrayList");
        String bufstr;
        List<String> List1 = new ArrayList<>(10);
        System.out.println(List1.size());
        for (int i=0;i<10;i++
             ) {
            bufstr = reader.readLine();
            List1.add(bufstr);
        }

        System.out.println("\nПерестановка строки в начало");
        for(int j=0;j<15;j++) {
            List1.add(0, List1.get(List1.size() - 1));
            List1.remove(List1.size() - 1);
            System.out.println(List1);
        }

        System.out.println("\nВвод 5-ти строк и замена ими 5-ть последних");

        for (int j=0; j<5 ;j++){
            List1.remove(List1.size()-1);
        }
        for (int j=0;j<5;j++){
            List1.add(List1.size(),reader.readLine());
        }
        System.out.println("\nВывод ArrayList через цикл foreach");
        int u=0;
        System.out.println(List1);
        for (String i:List1) {
            System.out.println(List1.get(u));
            u++;
        }
        // Задание 2
       System.out.println("Задание 2");

        List<Integer> ListTest1 = new ArrayList<>();
        System.out.println("\nВставка нового значения в начало списка");
        for (int i=0;i<100000;i++
        ) {
            bufint = i;
            ListTest1.add(bufint);
        }

        long start = System.currentTimeMillis();

        for(int i=0;i<100000;i++) {
            ListTest1.add(i,i+1);
            ListTest1.remove(List1.size() - 1);
        }
        System.out.println("\nЧтение каждого из 10000 элементов списка");
        for(int i=0;i<100000;i++) {
            ListTest1.get(i);
        }

        System.out.println("\nЗапись нового значения в каждый из 10000 элементов списка");
        for(int i=0;i<100000;i++) {
            ListTest1.set(i,i+2);
        }
        System.out.println("\nУдаление первого элемента списка");
        for(int i=0;i<100000;i++) {
            ListTest1.remove(0);
        }

        long finish = System.currentTimeMillis();

        System.out.println(finish-start);

        System.out.println("\nТе же самые операции для LinkedList");
        List<Integer> ListTest2 = new LinkedList<>();
        System.out.println("\nВставка нового значения в начало списка");
        for (int i=0;i<100000;i++
        ) {
            bufint = i;
            ListTest2.add(bufint);
        }

        start = System.currentTimeMillis();

        for(int i=0;i<100000;i++) {
            ListTest2.add(i,i+1);
            ListTest2.remove(List1.size() - 1);
        }
        System.out.println("\nЧтение каждого из 10000 элементов списка");
        for(int i=0;i<100000;i++) {
            ListTest2.get(i);
        }
        System.out.println("\nЗапись нового значения в каждый из 10000 элементов списка");
        for(int i=0;i<100000;i++) {
            ListTest2.set(i,i+2);
        }
        System.out.println("\nУдаление первого элемента списка");
        for(int i=0;i<100000;i++) {
            ListTest2.remove(0);
        }

        finish = System.currentTimeMillis();

        System.out.println(finish-start);

        //Задание 3
       System.out.println("Задание 3");
        List<Integer> List21 = new ArrayList<>();
        List<Integer> List22 = new ArrayList<>();
        System.out.println("\nСоздание двух одинаковых списков");
        for (int i=0;i<15;i++) {
            bufint = i;
            List21.add(bufint);
        }

        for (int i=0;i<15;i++) {
            bufint = i;
            List22.add(bufint);
        }

        boolean b = List21.equals(List22);
        System.out.println(b);
        System.out.println("\nСравнение объектов списков при помощи equals");
        for (int i=0;i<15;i++
        ) {
            boolean c = List21.get(i).equals(List22.get(i));
            System.out.println(c);
        }
        System.out.println("\nСоздание cписка для хранения User");
        List<User> UserList = new ArrayList<>();
        System.out.println("\nДобавление новых юзеров");
        UserList.add(new User("Kostya","MadSeer",19));
        UserList.add(new User("Vadim","FinnAndJake",19));
        UserList.add(new User("Olga","OlyAsh214",20));

        System.out.println("\nПроверка на наличие в списке и удаление");

        System.out.println(UserList.contains(new User("Kostya","MadSeer",19)));
        UserList.remove(new User("Kostya","MadSeer",19));
        System.out.println(UserList.contains(new User("Kostya","MadSeer",19)));

        System.out.println("");

        List<User> UserList2 = new ArrayList<>();
        UserList2.add(new User("Vadim","FinnAndJake",19));
        UserList2.add(new User("Olga","OlyAsh214",20));

        System.out.println(b=UserList.equals(UserList2));

        //Задание 4
        System.out.println("Задание 4");
        System.out.println("\nСоздание коллекции HashSet и добавление в нее фамилий");
        HashSet<String> Hash = new HashSet<String>();
        Hash.add("Плешков");
        Hash.add("Повелица");
        Hash.add("Лабунский");
        Hash.add("Никитин");
        Hash.add("Шевченко");
        Hash.add("Ткаченко");
        Hash.add("Коломиец");
        HashSet<String> Hash2 = new HashSet<String>();

        System.out.println("\nВывод содержимого коллекции");
        for (String j:Hash) {
            System.out.println(j);
        }
        System.out.println("\nУдаление из коллекции фамилий, начинающихся на гласную букву");
        for (String j:Hash
             ) {
            char firstbukva;
            firstbukva = j.charAt(0);
            if(firstbukva=='У'||firstbukva=='Е'||firstbukva=='А'||
                    firstbukva=='О'||firstbukva=='Э'||firstbukva=='Я'||
                    firstbukva=='И'||firstbukva=='Ю'){
            }else {Hash2.add(j);};
        }

        System.out.println("");
        Hash.removeAll(Hash2);
        System.out.println("\nИтоговое значение коллекции");
        for (String j:Hash
        ) {
            System.out.println(j);
        }

        System.out.println("\nСоздание коллекции TreeSet и добавление в нее фамилий");

        TreeSet<String > Tree = new TreeSet<String>();
        TreeSet<String > Tree2 = new TreeSet<String>();
        Tree.add("Плешков");
        Tree.add("Повелица");
        Tree.add("Лабунский");
        Tree.add("Никитин");
        Tree.add("Ткаченко");
        Tree.add("Шевченко");
        Tree.add("Коломиец");

        System.out.println("\nВывод содержимого коллекции");
        for (String j:Tree
        ) {
            System.out.println(j);
        }
        System.out.println("\nУдаление из коллекции первых 5-ти фамилий");
        int n=0;
        Iterator<String> i = Tree.iterator();
        for (String j:Tree
        ) {
            if(n<5){Tree2.add(j);}
            n++;
        }
        Tree.removeAll(Tree2);
        System.out.println("\nИтоговое значение коллекции");

        for (String j:Tree
        ) {
            System.out.println(j);
        }

        //Задание 5
        System.out.println("\nСоздание коллекции HashSet и добавление в нее объектов Student");
        HashSet<Student> Students1 = new HashSet<Student>();
        Students1.add(new Student("Kostya","Kutko","ESTMu-19-1",5));
        Students1.add(new Student("Vadim","Beck","ESTMu-19-1",5));
        Students1.add(new Student("Asya","Shevchenko","ESTMu-19-1",5));
        Students1.add(new Student("Denis","Bespalko","ESTMu-19-1",5));
        System.out.println("\nПроверка корректности работы методов contains, remove");
        System.out.println(Students1.contains(new Student("Kostya","Kutko","ESTMu-19-1",5)));
        System.out.println(Students1.remove(new Student("Kostya","Kutko","ESTMu-19-1",5)));
        System.out.println(Students1.contains(new Student("Kostya","Kutko","ESTMu-19-1",5)));
        for (Student j:Students1
        ) {
            System.out.println(j);
        }
        System.out.println("\nСоздание коллекции TreeSet и добавление в нее объектов Student");
        TreeSet<Student> Students2 = new TreeSet<Student>();
        Students2.addAll(Students1);
        System.out.println("\nВывод содержимого на экран");
        for (Student j:Students2
        ) {
            System.out.println(j);
        }
        System.out.println("");
        TreeSet<Student> Students3 = new TreeSet<Student>();
        Students3.add(new Student("Андрей", "Плешков", "ЕСТМу 19-1", 5));
        Students3.add(new Student("Алексей", "Повелица", "ЕСТМу 19-1", 5));
        Students3.add(new Student("Никита", "Никитин", "ЕСТМу 19-1", 5));
        Students3.add(new Student("Лабунский", "Владимир", "ЕСТМу 19-1", 5));
        Students3.add(new Student("Александра", "Шевченко", "ЕСТМу 19-1", 5));

        for (Student j:Students3
        ) {
            System.out.println(j);
        }


    }
}
