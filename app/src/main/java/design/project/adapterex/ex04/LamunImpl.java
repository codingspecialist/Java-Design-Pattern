package design.project.adapterex.ex04;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LamunImpl implements Lamun {
    private String name;
    private String spices; // 라면, 신라면 (나중에 추가될 수 있지 않을까?)

    public LamunImpl(String name) {
        this.name = name;
        this.spices = "없음";
    }

    public void 청양고추추가() {
        spices = "청양고추";
    }
}