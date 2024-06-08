package lap1;
public class library {

    // *********************************
    
    public int year;
    public int PredictAge(){
        return (2024 - year);
    }

    // *********************************
    public double rad;
    public double Area(){
        return (Math.PI*rad*rad);
    }
    public double Perimeter(){
        return (2*Math.PI*rad);
    }
    // *********************************


    public int speed;
    public int upTo20(){
        return (speed += 20);
    }
    public int upTo40(){
        return (speed += 40);
    }
    public int upTo60(){
        return (speed += 60);
    }
    public int downTo20(){
        return (speed -= 20);
    }
    public int downTo40(){
        return (speed -= 40);
    }
    public int downTo60(){
        return (speed -= 60);
    }


    // *********************************
    public int converHoursToMinutes(int hours) {
        return (hours * 60);
    }
    public int converDaysToMinutes(int days) {
        return (days * 24 * 60);
    }
    // *********************************

}
