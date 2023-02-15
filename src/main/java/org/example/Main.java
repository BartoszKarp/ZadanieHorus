package org.example;

public class Main {
    public static void main(String[] args) {

        OneBlock block1 = new OneBlock("brown", "wood");
        OneBlock block2 = new OneBlock("brown", "wood");
        OneBlock block3 = new OneBlock("red", "concret");
        OneBlock block4 = new OneBlock("red", "concret");
        OneBlock block5 = new OneBlock("black", "stone");
        OneBlock block6 = new OneBlock("black", "stone");
        OneBlock block7 = new OneBlock("black", "stone");
        OneBlock block8 = new OneBlock("black", "stone");
        OneBlock block9 = new OneBlock("brown", "wood");
        OneBlock block10 = new OneBlock("brown", "wood");
        OneBlock block11 = new OneBlock("brown", "wood");
        OneBlock block12 = new OneBlock("brown", "wood");
        OneBlock block13 = new OneBlock("brown", "wood");

        Wall wall = new Wall();

        wall.add(block1);
        wall.add(block2);
        wall.add(block3);
        wall.add(block4);
        wall.add(block5);
        wall.add(block6);
        wall.add(block7);
        wall.add(block8);
        wall.add(block9);
        wall.add(block10);
        wall.add(block11);
        wall.add(block12);
        wall.add(block13);

        System.out.println("Dowolny element o podanym kolorze: ");
        System.out.println(wall.findBlockByColor("red"));

        System.out.println();
        System.out.println("Wszystkie elementy danego materiału: ");
        System.out.println(wall.findBlocksByMaterial("wood"));

        System.out.println();
        System.out.println("Liczba wszystkich elementów: ");

        System.out.println(wall.count());

        wall.getBlocks();
    }
}