package design.project.adapterex.ex03;

public class AdapterEx03App {

    public static void main(String[] args) {
        LamunAdapter la = new LamunAdapter(new Lamun("라면"));
        la.할라피뇨추가();
        // Print.show(la); // 실패 : 원인은 print 메서드가 Lamun을 의존하고 있다.
    }
}
