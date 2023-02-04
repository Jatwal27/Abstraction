class Circle extends Shape{
    double Perimeter;
    double Radius;
    double area;

    Circle(String color, double Radius) {
        super(color);
        this.color = color;
        this.Radius = Radius;
    }

    @Override
    public  double Area(){
        return Math.PI * Math.pow(Radius,2);
    }
    @Override
    public  double Perimeter(){
        return 2 * Math.PI * Radius;
    }


}
