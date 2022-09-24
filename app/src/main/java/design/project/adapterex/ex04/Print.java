package design.project.adapterex.ex04;

public class Print {
    static void show(LamunAdapter la) {
        System.out.println(la.getName() + "이 만들어졌어요. 양념은 " + la.getSpices());
    }
}
