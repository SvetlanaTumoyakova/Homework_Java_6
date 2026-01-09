public class Box {
   private double width;
   private double height;

    public Box(double width,double height){
        this.width=width;
        this.height=height;
    }
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Объект box {ширина = " + getWidth() + ", высота = " + getHeight() + "}";
    }

}
