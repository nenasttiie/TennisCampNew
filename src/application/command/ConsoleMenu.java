package application.command;

import java.util.Scanner;

public class ConsoleMenu {
    private final CoachCommands commands;
    private final Scanner scanner;

    public ConsoleMenu(CoachCommands commands) {
        this.commands = commands;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("=== Теннисный лагерь - Система управления тренерами ===");

        while (true) {
            displayMenu();
            int choice = getMenuChoice();

            switch (choice) {
                case 1 -> commands.addCoach();
                case 2 -> commands.findCoach();
                case 3 -> commands.updateCoach();
                case 4 -> commands.deleteCoach();
                case 5 -> {
                    System.out.println("Выход из программы...");
                    return;
                }
                default -> System.out.println("Неверный выбор! Попробуйте снова.");
            }

            pause();
        }
    }

    private void displayMenu() {
        System.out.println("\n=== ГЛАВНОЕ МЕНЮ ===");
        System.out.println("1. Добавить тренера");
        System.out.println("2. Найти тренера по ID");
        System.out.println("3. Обновить данные тренера");
        System.out.println("4. Удалить тренера");
        System.out.println("5. Выход");
        System.out.print("Выберите действие: ");
    }

    private int getMenuChoice() {
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            scanner.nextLine(); // clear invalid input
            return -1;
        } finally {
            scanner.nextLine(); // consume newline
        }
    }

    private void pause() {
        System.out.println("\nНажмите Enter для продолжения...");
        scanner.nextLine();
    }
}