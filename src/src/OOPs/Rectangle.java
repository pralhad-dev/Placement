package OOPs;

class Rectangle {
    int width,length;

    Rectangle(int width, int length) {
        this.length = length;
        this.width = width;
    }

    Rectangle(int side) {
        this.length = side;
        this.width = side;
    }

    int getArea(){
        return width*length;
    }
}
