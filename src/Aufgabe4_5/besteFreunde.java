package Aufgabe4_5;

import java.util.ArrayList;

public class besteFreunde {
    static ArrayList<String> list = new ArrayList<>();
    static ArrayList<Student> list2 = new ArrayList<>();

    static String freund_a = "Benni";
    static String freund_b = "Chris";
    static String freund_c = "Lucki";
    static String freund_d = "Daniel";
    static String freund_e = "Markus";


    public static void main(String[] args) {

        list.add(freund_a);
        list.add(freund_b);
        list.add(freund_c);
        list.add(freund_d);
        list.add(freund_e);

        System.out.println(list);


        Student student1 = new Student("Artem",46565,1991);
        Student student2 = new Student("Schlomo",2932449,1993);
        Student student3 = new Student("Finkelstein",348584950,1945);

        list2.add(student1);
        list2.add(student2);
        list2.add(student3);

        System.out.println("---------------");
        System.out.println(list2);

    }
    @Override
    public String toString() {
        return freund_a+"1 "+freund_b+"2 "+freund_c+"3 "+freund_d+"4 "+freund_e+"5";
    }

}
