package Day27.Example1;

public class Teacher {
    String name;
    String subject;
    int yearOfExperience;
    String BADegree;

    String howGoodIsTeacher() {
        if (yearOfExperience < 2) {
            return "Not Good...";
        } else if (yearOfExperience >= 2 && yearOfExperience < 4) {
            return "not bad, I guess?!";
        } else if (yearOfExperience >= 4) {
            return "Okay this teacher is actually really good!!!";
        }
        return null;
    }
}

