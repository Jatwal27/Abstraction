class Rectangle extends Shape {
    double width;
    double height;

    Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }
    @Override
    double returnValue() {
        return 2*(width + height);
    }
}
