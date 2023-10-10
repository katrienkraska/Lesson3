package task2;


class Pupil {
    void study() {
        System.out.println("Pupil is studying");
    }

    void read() {
        System.out.println("Pupil is reading");
    }

    void write() {
        System.out.println("Pupil is writing");
    }

    void relax() {
        System.out.println("Pupil is relaxing");
    }
}

class ExcellentPupil extends Pupil {
    void study() {
        System.out.println("Excellent pupil is studying hard");
    }

    void read() {
        System.out.println("Excellent pupil is reading lot");
    }

    void write() {
        System.out.println("Excellent pupil is writing nice");
    }

    void relax() {
        System.out.println("Excellent pupil is relaxing after school");
    }
}

class GoodPupil extends Pupil {
    void study() {
        System.out.println("Good pupil is studying regular");
    }

    void read() {
        System.out.println("Good pupil is reading book");
    }

    void write() {
        System.out.println("Good pupil is writing well");
    }

    void relax() {
        System.out.println("Good pupil is relaxing after school");
    }
}

class BadPupil extends Pupil {
    void study() {
        System.out.println("Bad pupil is studying at a low level");
    }

    void read() {
        System.out.println("Bad pupil is not reading");
    }

    void write() {
        System.out.println("Excellent pupil is writing slovenly");
    }

    void relax() {
        System.out.println("Excellent Pupil is relaxing after school");
    }
}

class ClassRoom {
    private Pupil[] pupils;

    public ClassRoom() {
        pupils = new Pupil[]{
                new ExcellentPupil(),
                new GoodPupil(),
                new BadPupil(),
                new GoodPupil()
        };
    }

    public void displayInfo() {
        System.out.println("Information about the class:");
        for (int i = 0; i < pupils.length; i++) {
            System.out.println("Student " + (i + 1) + ":");
            pupils[i].study();
            pupils[i].read();
            pupils[i].write();
            pupils[i].relax();
            System.out.println("--------------------");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ClassRoom classRoom = new ClassRoom();
        classRoom.displayInfo();
    }
}