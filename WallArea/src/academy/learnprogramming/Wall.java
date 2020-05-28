package academy.learnprogramming;

public class Wall {

    private double width;
    private double height;

    public Wall() {
        // No-Arg Constructor
    }

    public Wall(double width, double height) {
        this.width = width;
        if (width < 0) {
            width = 0;
        }

        this.height = height;
        if (height < 0) {
            height = 0;
        }
        this.width = width;
        this.height = height;

    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;

    }

    public void setWidth(double width) {
        this.width = width;
        if (this.width < 0) {
            this.width = 0;
        }
    }

    public void setHeight(double height) {
        this.height = height;
        if (this.height < 0) {
            this.height = 0;
        }
    }

    public double getArea() {
        double area = this.height * this.width;
        return area;

    }
}

