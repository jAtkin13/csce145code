public class ShapesDemo {
    public static void main(String[] args) {
        Shapes[] sh = new Shapes[3];
        sh[0] = new rectangle(2, 5, 15);
        sh[1] = new EquilateralTriangle(2, 7);
        sh[2] = new EquilateralTriangle(10,19);

        for(int i = 0; i < sh.length; i++){
            sh[i].drawHere();
        }

    }
}
