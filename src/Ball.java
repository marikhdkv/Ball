public class Ball
{
    private double x;
    private double y;

    public Ball(double x, double y)         // Конструктор с параметрами
    {
        this.x = x;
        this.y = y;
    }

    public Ball()                           // Конструктор по умолчанию
    {
        this.x = 0.0;
        this.y = 0.0;
    }

    double getX() { return x; }             // Метод аксессор для X
    void setX(double x) { this.x = x; }     // Метод мутатор для X

    double getY() { return y; }             // Метод аксессор для Y
    void setY(double y) { this.y = y; }     // Метод мутатор для Y

    void move (double xDisp, double yDisp)  // Метод перемещения точки
    {
        this.x += xDisp;
        this.y += yDisp;
    }

    @Override
    public String toString()                // Переопределение метода toString()
    {
        return "x: " + x +", y: " + y;
    }
}