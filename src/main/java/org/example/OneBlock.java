package org.example;

import java.util.List;

public class OneBlock implements CompositeBlock{

    private String color;
    private String material;


    public OneBlock() {
    }

    public OneBlock(String color, String material) {
        this.color = color;
        this.material = material;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public String getMaterial() {
        return this.material;
    }

    @Override
    public List<Block> getBlocks() {
        return null;
    }

    @Override
    public String toString() {
        return "OneBlock{" +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
