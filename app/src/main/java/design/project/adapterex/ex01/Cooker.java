package design.project.adapterex.ex01;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Cooker {
    private String name;

    public Cooker() {
        this.name = "짜파게티";
    }

    public void cook() {
        System.out.println(this.name + "을 만들었어요");
    }
}
