import java.util.ArrayList;

public class Student {

    public String fname;
    public String lname;
    public int indexNumber;
    public String email;
    public String address;
    public double[] grades;

    public double calculateAverage(){
        if (grades.length==0){
            throw new IllegalArgumentException();
        } else if (grades.length==21) {
            throw new IllegalArgumentException("Przekroczono limit ocen");
        }
        double avg=0;
        for(int i=0; i < grades.length; i++){
            avg+=grades[i];
        }
        avg/= grades.length;

        double poPrzecinku= avg - Math.floor(avg);

        if (poPrzecinku <0.25){
            return Math.floor(avg);
        } else if (poPrzecinku >= 0.25 && poPrzecinku < 0.75) {
            return Math.floor(avg)+0.5;
        } else
        return Math.ceil(avg);
    }



}
