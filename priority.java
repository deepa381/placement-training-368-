//priority queue implementation
import java.util.*;
class Patient {
    String name;
    int severity; // Higher value = more serious
    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }
    @Override
    public String toString() {
        return name + " (Severity: " + severity + ")";
    }
}
class Main {
    public static void main(String[] args) {

        PriorityQueue<Patient> pq = new PriorityQueue<>(
            new Comparator<Patient>() {
                @Override
                public int compare(Patient p1, Patient p2) {
                    return p2.severity - p1.severity; // Higher severity first
                }
            }
        );

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter No.: ");
        int no = sc.nextInt();

        for (int i = 1; i <= no; i++) {
            System.out.print("Enter Name and Severity: ");
            pq.add(new Patient(sc.next(), sc.nextInt()));
        }

        while (!pq.isEmpty()) {
            System.out.println("Treating: " + pq.poll());
        }

        sc.close();
    }
}