abstract class Shape {
    String color;

    Shape(String color) {
        this.color = color;
    }

    public abstract double perimeter();
    public abstract double returnValue();

    public String getColor() {
        return color;
    }

    public abstract double Area();

    public abstract double Perimeter();
}

