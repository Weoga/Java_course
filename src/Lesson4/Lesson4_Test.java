package Lesson4;

public class Lesson4_Test {
    int x;
    int y;
    int z;



    public Lesson4_Test(){
        this.x = 2;
        this.y = 34;
    }

    public Lesson4_Test(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void getAll(){
        System.out.println("x="+ this.x);
        System.out.println("y="+ this.y);
        System.out.println("z="+ this.z);
    }

}
