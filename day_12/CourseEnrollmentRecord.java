package day_12;

class Enrollment {
    String id;
    String learner;
    String course;
    double fee;
    String paymentStatus;

    Enrollment(String id, String learner, String course, double fee, String paymentStatus) {
        this.id = id;
        this.learner = learner;
        this.course = course;
        this.fee = fee;
        this.paymentStatus = paymentStatus;
    }

    Enrollment(String id, String learner, String course, double fee) {
        this(id, learner, course, fee, "Pending");
    }

    void display() {
        System.out.println("ENROLLMENT RECORD");
        System.out.println("ID: " + id);
        System.out.println("Learner: " + learner);
        System.out.println("Course: " + course);
        System.out.printf("Fee: Rs. %.2f%n", fee);
        System.out.println("Payment Status: " + paymentStatus);
    }
}

public class CourseEnrollmentRecord {
    public static void main(String[] args) {
        Enrollment enrollment = new Enrollment(
                "E101",
                "Aman",
                "Java Programming",
                12000
        );

        enrollment.display();
    }
}