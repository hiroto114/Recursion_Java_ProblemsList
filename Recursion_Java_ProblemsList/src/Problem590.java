public class Problem590 {
    public static void main(String[] args){
        Shape circle = new Shape("circle", "red");
        Shape square = new Shape("square", "blue");

        System.out.println(circle.type);
        System.out.println(square.color);
    }
}
class Shape {
    public String type;
    public String color;
    public Shape(String type, String color){
        this.type = type;
        this.color = color;
    }
}