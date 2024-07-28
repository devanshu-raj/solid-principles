package product;

import product.enums.Color;
import product.enums.Size;

public class Product {

    public String name;
    public Color color;
    public Size size;

    public Product(String name, Color color, Size size) {
        this.name = name;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return String.format("Name:%s, Color:%s, Size:%s", name, color, size);
    }
}
