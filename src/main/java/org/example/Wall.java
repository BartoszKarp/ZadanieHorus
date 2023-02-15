package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Wall implements Structure {

    private List<Block> blocks;

    public Wall() {
        this.blocks = new ArrayList<>();
    }

    public void add(Block block) {
        blocks.add(block);
    }

    @Override
    public Optional<Block> findBlockByColor(String color) {

        for (Block block : blocks) {
            if (block.getColor().equals(color)) {
                return Optional.of(block);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Block> findBlocksByMaterial(String material) {
        List<Block> blocksByMaterial = new ArrayList<>();

        for (Block block : blocks) {
            if (block.getMaterial().equals(material)) {
                blocksByMaterial.add(block);
            }
        }
        return blocksByMaterial;
    }

    @Override
    public int count() {
        return blocks.size();
    }

    public List<Block> getBlocks() {
        List<Block> allBlocks = new ArrayList<>();

        for (Block block : blocks) {
            if (!block.getMaterial().isEmpty()) {
                allBlocks.add(block);
            }
        }
        return allBlocks;
    }

    @Override
    public String toString() {
        return "Wall{" + "blocks=" + blocks.toString() + '}' + '\n';
    }
}
