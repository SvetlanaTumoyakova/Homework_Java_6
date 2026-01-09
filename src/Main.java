public class Main {
    public static void main(String[] args) {
        Box3D box = new Box3D(5.0, 3.0, 2.0);
        System.out.println(box);
        System.out.println("Объем: " + box.getVolume());
        System.out.println();

        System.out.println("Новые значения");
        box.setWidth(10.0);
        box.setHeight(5.0);
        box.setDepth(7.0);
        System.out.println("Ширина: " + box.getWidth());
        System.out.println("Высота: " + box.getHeight());
        System.out.println("Глубина: " + box.getDepth());

        System.out.println(box);
        System.out.println("Объем: " + box.getVolume());
    }
}
