public class ExamSchedule {
    private ExamNode head;
    private ExamNode current;

    public ExamSchedule() {
        this.head = null;
        this.current = null;
    }

    public void addExam(String examDetails) {
        ExamNode node = new ExamNode(examDetails);
        if (head == null) {
            head = node;
            current = head;
            return;
        }
        ExamNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        node.prev = temp;
    }

    public void viewNextExam() {
        if (head == null) {
            System.out.println("No exams available.");
            return;
        }
        if (current == null) {
            System.out.println("End of exam schedule.");
            return;
        }
        System.out.println(current.examDetails);
        current = current.next;
    }

    public void viewPreviousExam() {
        if (head == null) {
            System.out.println("No exams available.");
            return;
        }
        if (current == null) {
            ExamNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            current = temp.prev;
            System.out.println(temp.examDetails);
            return;
        }
        if (current.prev == null) {
            System.out.println("Start of exam schedule.");
            return;
        }
        current = current.prev;
        System.out.println(current.examDetails);
    }

    public void viewAllExamSchedule() {
        ExamNode temp = head;
        if (temp == null) {
            System.out.println("No exams scheduled.");
        } else {
            System.out.println("Exam Schedule:");
            while (temp != null) {
                System.out.println(temp.examDetails);
                temp = temp.next;
            }
        }
    }
}
