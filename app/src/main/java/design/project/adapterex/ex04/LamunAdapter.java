package design.project.adapterex.ex04;

public class LamunAdapter implements Lamun {

    private LamunImpl lamunImpl;

    public LamunAdapter(LamunImpl lamunImpl) {
        this.lamunImpl = lamunImpl;
    }

    @Override
    public void 청양고추추가() {
        lamunImpl.청양고추추가();
    }

    public void 할라피뇨추가() {
        lamunImpl.setSpices("할라피뇨");
    }

    @Override
    public String getName() {
        return lamunImpl.getName();
    }

    @Override
    public String getSpices() {
        return lamunImpl.getSpices();
    }

}
