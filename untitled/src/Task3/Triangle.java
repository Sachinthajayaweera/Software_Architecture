package Task3;

public class Triangle implements Shape{
    @Override
    public void draw() {
        int width= 7;
        int height= 4;
        for(int i=0; i< height; i++){
            for (int j= 0; j<width;j++){
                System.out.println("* ");
            }
            System.out.println();
        }

    }
}
