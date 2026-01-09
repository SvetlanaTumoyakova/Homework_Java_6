public class Box3D extends Box {
   private double depth;

   public Box3D(double width,double height, double depth) {
        super(width, height);
        this.depth=depth;
    }

    public  double getDepth() {
       return depth;
    }
    public void setDepth(double depth) {
       this.depth = depth;
    }

    @Override
    public String toString() {
        String parentStr = super.toString();
        return parentStr.replace("box", "box3D") +
                ", глубина = " + getDepth() + "}";
    }

    public double getVolume() {
        return getWidth() * getHeight() * getDepth();
    }
}
