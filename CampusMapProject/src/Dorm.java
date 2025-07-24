public class Dorm {
    private String name;
    private double x, y;
    private int population;

    public Dorm(String name, double x, double y, int population) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.population = population;
    }

    public String getName() { return name; }
    public double getX() { return x; }
    public double getY() { return y; }
    public int getPopulation() { return population; }

    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }
    public void setPopulation(int population) { this.population = population; }

    public double getCenterX() { return x; }
    public double getCenterY() { return y; }
}