package design.project.adapterex.ex04;

public class AdapterEx04App {

    public static void main(String[] args) {
        LamunAdapter la = new LamunAdapter(new LamunImpl("라면"));
        la.할라피뇨추가();
        Print.show(la);
    }
}
