package design.project.adapterex.ex02;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Lamun {
    private String name;
    private String spices; // 나중에 추가될 수 있지 않을까?

    public Lamun(String name) {
        this.name = name;
        this.spices = "없음";
    }

    public void 청양고추추가() {
        spices = "청양고추";
    }
}
