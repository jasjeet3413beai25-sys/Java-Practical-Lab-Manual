package day_01;

class Session {
    String topic;
    int duration;
    String trainer;
    String room;

    Session(String topic, int duration, String trainer, String room) {
        this.topic = topic;
        this.duration = duration;
        this.trainer = trainer;
        this.room = room;
    }

    Session(String topic, int duration) {
        this(topic, duration, "Not Assigned", "Not Assigned");
    }

    Session(String topic) {
        this(topic, 1);
    }

    void display() {
        System.out.println("SESSION DETAILS");
        System.out.println("Topic: " + topic);
        System.out.println("Duration: " + duration + " hours");
        System.out.println("Trainer: " + trainer);
        System.out.println("Room: " + room);
    }
}

public class TrainerSessionPlanner {
    public static void main(String[] args) {
        Session session = new Session(
                "Java Arrays",
                2,
                "Mahendra Yadav",
                "Lab 3"
        );

        session.display();
    }
}