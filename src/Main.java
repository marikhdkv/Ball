public class Main
{
    public static void main(String[] args)
    {
        Ball b1 = new Ball();
        Ball b2 = new Ball(3.3, -4.7);

        b1.setX(5.2);
        b1.setY(10.1);

        System.out.println("b1 - " + b1);
        System.out.println("b2 - " + b2);
    }
}