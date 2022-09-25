package design.project.adapterex.ex03;

public class CookerAdapter implements Cookerable {

    private Cooker cooker;

    public CookerAdapter(Cooker cooker) {
        this.cooker = cooker;
    }

    @Override
    public void cook() {
        cooker.cook();
        System.out.println("고추가루가 추가되었어요.");
    }

}
