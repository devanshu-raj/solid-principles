public class Square extends Rectangle {

    public Square() {
    }

    public Square(int side) {
        width = height = side;
    }

    @Override
    public void setWidth(int side) {
        super.setWidth(side);
        super.setHeight(side);
    }

    @Override
    public void setHeight(int side) {
        super.setHeight(side);
        super.setWidth(side);
    }

}
