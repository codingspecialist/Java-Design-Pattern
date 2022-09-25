package design.project.adapterex.ex03;

public class AdapterEx03App {
    public static void main(String[] args) {
        Cookerable la = new CookerAdapter(new Cooker());
        la.cook();

    }
}
