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

    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3, Pupil pupil4) {
        this.pupils = new Pupil[]{pupil1, pupil2, pupil3, pupil4};
    }

    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3) {
        this.pupils = new Pupil[]{pupil1, pupil2, pupil3};
    }

    public void performActivities() {
        for (Pupil pupil : pupils) {
            System.out.println("Activities for pupil:");
            pupil.study();
            pupil.read();
            pupil.write();
            pupil.relax();
            System.out.println("--------------------");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Pupil pupil1 = new ExcellentPupil();
        Pupil pupil2 = new GoodPupil();
        Pupil pupil3 = new BadPupil();
        Pupil pupil4 = new GoodPupil();

        ClassRoom classRoom = new ClassRoom(pupil1, pupil2, pupil3, pupil4);

        classRoom.performActivities();
    }
}