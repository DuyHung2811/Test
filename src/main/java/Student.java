public class Student {
    private String name;
    private int tuoi;
    private int score;

    public Student() {
    }

    public Student(String name, int tuoi, int score) {
        this.name = name;
        this.tuoi = tuoi;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", tuoi=" + tuoi +
                ", score=" + score +
                '}';
    }
}
