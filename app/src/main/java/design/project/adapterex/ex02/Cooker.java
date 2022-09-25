package design.project.adapterex.ex02;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Cooker implements Cookerable {
    private String name;

    public Cooker() {
        this.name = "짜파게티";
    }

    @Override
    public void cook() {
        System.out.println(this.name + "을 만들었어요");
    }
}
