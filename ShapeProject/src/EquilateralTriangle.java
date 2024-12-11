public class EquilateralTriangle extends Shapes implements EquilateralTriangleInterface{

    private int base;

    public EquilateralTriangle(){
        super();
        this.base = 0;
    }

    public EquilateralTriangle(int xOffset, int xBase){
        super(xOffset);
        this.setBase(xBase);
    }

    public int getBase(){
        return this.base;
    }

    public void setBase(int xBase){
        if(xBase > 0 && xBase%2 == 1){
            this.base = xBase;
        }
    }

    public void drawHere(){
        drawTop();
        drawBase();
    }

    public void drawBase(){
        this.skipSpaces(this.getOffset());
        for (int i=0; i < this.base; i++){
            System.out.print("*");
        }
        System.out.println();
    }

    public void drawTop(){
        int center = this.base/2;
        int start = this.getOffset() + center;
        this.skipSpaces(start);
        System.out.println("*");

        int count = center - 1;
        int insideWidth = 1;
        for (int i = 0; i < count; i++){
            start--;
            System.out.print("*");
            this.skipSpaces(insideWidth);
            System.out.println("*");
            insideWidth += 2;

        }
    }

    public void skipSpaces(int spaces){
        for (int i = 0; i < spaces; i++){
            System.out.print(" ");
        }
    }


}
