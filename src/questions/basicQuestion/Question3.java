//Create a class Box that uses a parameterized constructor
// to initialize the dimensions of a box.The dimensions of the Box
// are width, height, depth. The class should have a method that
// can return the volume of the box. Create an object of the Box
// class and test the functionalities.

package questions.basicQuestion;

class Box{
    int width,height,depth;

    public Box(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    public int volume(){
        return width*height*depth;
    }
}

public class Question3 {
    public static void main(String[] args) {
        Box b1 = new Box(10,10,10);
        System.out.println(b1.volume());
    }
}
