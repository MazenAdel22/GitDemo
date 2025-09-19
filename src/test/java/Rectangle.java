public class Rectangle {
    private double length;
    private double width;

    public void modifyObject(Rectangle r) {
        r.length = 10 ;
        r.width = 20 ;
    }

    public Rectangle(){
        length = 10 ;
        width = 20 ;
    }

    public Rectangle(double l , double w){
        length = l ;
        width = w ;
    }

    public void setLength(double l) {
        if ( l > 0 )
            length = l ;
        else
            System.out.println("Enter Valid Positive Number.");
    }

    public void setWidth(double w) {
        if ( w > 0 )
            width = w ;
        else
            System.out.println("Enter Valid Positive Number.");
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return length*width;
    }
    public boolean isEqual (Rectangle obj2) {
        if (this.length == obj2.length && this.width == obj2.width)
            return true;
        else
            return false;
    }
}