package application.command.menu;

import application.command.camp.CampCommands;
import application.command.coach.CoachCommands;
import application.command.player.PlayerCommands;
import application.command.record.RecordCommands;

import java.util.Scanner;

public class ConsoleMenu {
    private final CampCommands campCommands;
    private final CoachCommands coachCommands;
    private final PlayerCommands playerCommands;
    private final RecordCommands recordCommands;
    private final Scanner scanner;

    public ConsoleMenu(CampCommands campCommands, CoachCommands coachCommands,
                       PlayerCommands playerCommands, RecordCommands recordCommands) {
        this.campCommands = campCommands;
        this.coachCommands = coachCommands;
        this.playerCommands = playerCommands;
        this.recordCommands = recordCommands;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("=== Теннисные кемпы - Система управления ===");

        while (true) {
            displayMainMenu();
            int entityChoice = getMenuChoice();

            if (entityChoice == 5) {
                System.out.println("Выход из программы...");
                return;
            }

            if (entityChoice >= 1 && entityChoice <= 4) {
                handleEntityOperations(entityChoice);
            } else {
                System.out.println("Неверный выбор! Попробуйте снова.");
            }

            pause();
        }
    }

    private void displayMainMenu() {
        System.out.println("\n=== ГЛАВНОЕ МЕНЮ ===");
        System.out.println("1. Управление кемпами");
        System.out.println("2. Управление тренерами");
        System.out.println("3. Управление игроками");
        System.out.println("4. Управление записями");
        System.out.println("5. Выход");
        System.out.print("Выберите сущность: ");
    }

    private void handleEntityOperations(int entityChoice) {
        String entityName = getEntityName(entityChoice);

        while (true) {
            displayOperationMenu(entityName);
            int operationChoice = getMenuChoice();

            if (operationChoice == 5) {
                System.out.println("Возврат в главное меню...");
                return;
            }

            executeOperation(entityChoice, operationChoice);
            pause();
        }
    }

    private void displayOperationMenu(String entityName) {
        System.out.println("\n=== УПРАВЛЕНИЕ " + entityName.toUpperCase() + " ===");
        System.out.println("1. Добавить " + entityName);
        System.out.println("2. Найти " + entityName + " по ID");
        System.out.println("3. Обновить данные " + entityName);
        System.out.println("4. Удалить " + entityName);
        System.out.println("5. Назад в главное меню");
        System.out.print("Выберите действие: ");
    }

    private void executeOperation(int entityChoice, int operationChoice) {
        switch (entityChoice) {
            case 1 -> executeCampOperation(operationChoice);
            case 2 -> executeCoachOperation(operationChoice);
            case 3 -> executePlayerOperation(operationChoice);
            case 4 -> executeRecordOperation(operationChoice);
        }
    }

    private void executeCampOperation(int operationChoice) {
        switch (operationChoice) {
            case 1 -> campCommands.addCamp();
            case 2 -> campCommands.findCamp();
            case 3 -> campCommands.updateCamp();
            case 4 -> campCommands.deleteCamp();
            default -> System.out.println("Неверный выбор операции!");
        }
    }

    private void executeCoachOperation(int operationChoice) {
        switch (operationChoice) {
            case 1 -> coachCommands.addCoach();
            case 2 -> coachCommands.findCoach();
            case 3 -> coachCommands.updateCoach();
            case 4 -> coachCommands.deleteCoach();
            default -> System.out.println("Неверный выбор операции!");
        }
    }

    private void executePlayerOperation(int operationChoice) {
        switch (operationChoice) {
            case 1 -> playerCommands.addPlayer();
            case 2 -> playerCommands.findPlayer();
            case 3 -> playerCommands.updatePlayer();
            case 4 -> playerCommands.deletePlayer();
            default -> System.out.println("Неверный выбор операции!");
        }
    }

    private void executeRecordOperation(int operationChoice) {
        switch (operationChoice) {
            case 1 -> recordCommands.addRecord();
            case 2 -> recordCommands.findRecord();
            case 3 -> recordCommands.updateRecord();
            case 4 -> recordCommands.deleteRecord();
            default -> System.out.println("Неверный выбор операции!");
        }
    }

    private String getEntityName(int entityChoice) {
        return switch (entityChoice) {
            case 1 -> "кемп";
            case 2 -> "тренер";
            case 3 -> "игрок";
            case 4 -> "запись";
            default -> "сущность";
        };
    }

    private int getMenuChoice() {
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            scanner.nextLine();
            return -1;
        } finally {
            scanner.nextLine();
        }
    }

    private void pause() {
        System.out.println("\nНажмите Enter для продолжения...");
        scanner.nextLine();
    }
}