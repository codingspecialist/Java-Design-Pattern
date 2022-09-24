package design.project.adapterex.ex03;

public class LamunAdapter {

    private Lamun lamun;

    public LamunAdapter(Lamun lamun) {
        this.lamun = lamun;
    }

    public void 청양고추추가() {
        lamun.청양고추추가();
    }

    public void 할라피뇨추가() {
        lamun.setSpices("할라피뇨");
    }

}
