package com.Projects;
import java.util.ArrayList;
import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n--- TO-DO LIST ---");
            System.out.println("1. View Tasks");
            System.out.println("2. Add Task");
            System.out.println("3. Edit Task");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.println("\nYour Tasks:");
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks found.");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;

                case 2:
                    System.out.print("Enter task to add: ");
                    String newTask = scanner.nextLine();
                    tasks.add(newTask);
                    System.out.println("Task added successfully!");
                    break;

                case 3:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks to edit.");
                        break;
                    }
                    System.out.print("Enter task number to edit: ");
                    int editIndex = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    if (editIndex >= 1 && editIndex <= tasks.size()) {
                        System.out.print("Enter new task: ");
                        String updatedTask = scanner.nextLine();
                        tasks.set(editIndex - 1, updatedTask);
                        System.out.println("Task updated!");
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    break;

                case 4:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks to delete.");
                        break;
                    }
                    System.out.print("Enter task number to delete: ");
                    int deleteIndex = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    if (deleteIndex >= 1 && deleteIndex <= tasks.size()) {
                        tasks.remove(deleteIndex - 1);
                        System.out.println("Task deleted!");
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting To-Do List. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
