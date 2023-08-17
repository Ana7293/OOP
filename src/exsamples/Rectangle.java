package exsamples;

public class Rectangle {
    double rectangleLength;
    double rectangleWidth;

    void setRectangleDimens(double rectangleLength , double rectangleWidth) {   //сохдаем метод с параметрами
        this.rectangleLength = rectangleLength;
        this.rectangleWidth = rectangleWidth;
    }
    double rectangleArea(){
        return rectangleLength * rectangleWidth;
    }



}
