interface Sports {
    int SPORTS_MARKS = 10;
}

class Result implements Sports {
    int total;
    float percentage;

    Result(int subject1, int subject2, int subject3) {
        this.total = subject1 + subject2 + subject3;
        this.percentage = ((total + SPORTS_MARKS) / 3);
    }

    void display() {
        System.out.println("Total Marks (Including Sports): " + (total + SPORTS_MARKS));
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + getGrade());
    }

    String getGrade() {
        if (percentage >= 90) return "A+";
        else if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 50) return "D";
        else return "Fail";
    }
}

public class assignment12 {
    public static void main(String[] args) {
        Result student = new Result(85, 90, 80);
        student.display();
    }
}