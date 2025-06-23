# Java-Based-Student-Exam-Scheduler-Using-LinkedList-Navigation-and-ArrayList-Management
A Java project managing student data and exam schedules using ArrayList for student records and LinkedList for navigating exam entries.

This project is a lightweight student exam scheduling system built in Java, designed to efficiently manage and navigate individual student exam schedules using linked lists and user-driven input. The system simulates real-world exam management in small academic institutions, allowing users to add students and seamlessly browse their upcoming or previous exams.

Key Features and Functionalities:
Student Profile Management

Each student is represented using a Student class containing personal details and a dedicated exam schedule.

Student instances are stored and managed using ArrayList, enabling dynamic addition and lookup of student data.

LinkedList-Based Exam Scheduling

Each student's exams are stored in a custom linked list structure implemented via the ExamNode and ExamSchedule classes.


The linked list allows bidirectional navigation through a student's exam timeline, supporting features such as:

Viewing the full exam schedule

Navigating to the next exam

Returning to the previous exam

ExamSchedule Class Functionality

ExamSchedule manages exam addition, printing the full schedule, and maintaining the current exam pointer for smooth navigation.

Uses custom ExamNode objects for each exam entry, storing course name and exam date/time.

Interactive Command-Line Interface (CLI)


The Main class offers a simple, interactive user menu allowing:

Adding new students and their exam schedules

Viewing all exams for a selected student

Jumping to the next or previous exam interactively

StudentInfoSystem Utility Class

Central utility class that manages overall operations like finding students by name and coordinating input handling for exams.

Supports maintaining multiple student records while isolating their personal exam schedules.


Technologies Used:
Java

Object-Oriented Programming (OOP)

LinkedList (custom implementation)

ArrayList

Scanner (for CLI interaction)


Learning Objectives Demonstrated:
Efficient use of LinkedLists for ordered, navigable exam schedules.

Application of ArrayList for dynamic student record management.

Solid OOP design, emphasizing encapsulation, modular classes, and single-responsibility principles.

Console-based user interaction for practical Java input/output experience.


Possible Extensions:
File I/O to persist student and exam data.

Graphical User Interface (GUI) using JavaFX or Swing.

Sorting students by name or exam date using custom comparator/sorting algorithms.


