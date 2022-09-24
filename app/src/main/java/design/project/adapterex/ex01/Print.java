package design.project.adapterex.ex01;

public class Print {
    static void show(Lamun la) {
        System.out.println(la.getName() + "이 만들어졌어요. 양념은 " + la.getSpices());
    }
}
