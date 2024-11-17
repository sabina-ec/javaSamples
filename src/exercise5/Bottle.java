package exercise5;

public class Bottle {

    private String color;
    private String material;
    private int size;

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColor(int size) {
        this.size = size;
    }


    public static void main(String[] args) {
        Bottle flasa = new Bottle();

        if (flasa.color != null) {
            System.out.println(flasa.color);
        }

        if (flasa.size != 0) {
            System.out.println(flasa.size);
        }

    }
}
