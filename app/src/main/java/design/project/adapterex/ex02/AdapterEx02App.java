package design.project.adapterex.ex02;

public class AdapterEx02App {
    static void print(Lamun la) {
        System.out.println(la.getName() + "이 만들어졌어요. 양념은 " + la.getSpices());
    }

    public static void main(String[] args) {
        Lamun la = new Lamun("라면");
        la.청양고추추가();
        Print.show(la);
    }
}
