package commandPattern;
import java.util.Scanner;

public class SmartHomeApp {

    public static void main(String[] args) {

        Scanner enter = new Scanner(System.in);
        Light light = new Light();
        MusicPlayer mp = new MusicPlayer();
        Thermostat thermostat = new Thermostat();
        RemoteControl rc = new RemoteControl();
        int apploop = 0;

        while (apploop != 4) {
            int devloop = 0;
            System.out.println("Welcome to Smart Home App!\n");
            System.out.println("\tMAIN MENU\n" +
                               "\t1. Lights\n" +
                               "\t2. Music Player\n" +
                               "\t3. Thermostat\n" +
                               "\t4. Exit\n");
            System.out.print("Select a device you want to use: ");
            int choice = enter.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    while (devloop != 5) {

                        System.out.println("\tSmart Lights Command Option\n" +
                                "1. Turn On.\n" +
                                "2. Turn Off.\n" +
                                "3. Increase the brightness.\n" +
                                "4. Decrease the brightness.\n" +
                                "5. Back\n");
                        System.out.print("Select an option: ");
                        int option = enter.nextInt();
                        System.out.println();

                        switch (option) {
                            case 1:
                                rc.clickLightsSwitch(0);
                                break;

                            case 2:
                                rc.clickLightsSwitch(1);
                                break;

                            case 3:
                                rc.clickIncreaseBrightness();
                                break;

                            case 4:
                                rc.clickDecreaseBrightness();
                                break;

                            case 5:
                                devloop = option;
                                break;

                            default:
                                System.out.println("Invalid option...\n");
                                break;
                        }
                    }
                    break;

                case 2:
                    while (devloop != 5) {

                        System.out.println("\tSmart Music Player Command Option\n" +
                                "1. Volume Up.\n" +
                                "2. Volume Down.\n" +
                                "3. Play.\n" +
                                "4. Pause.\n" +
                                "5. Back\n");
                        System.out.print("Select an option: ");
                        int option = enter.nextInt();
                        System.out.println();

                        switch (option) {
                            case 1:
                                rc.clickVolumeUp();
                                break;

                            case 2:
                                rc.clickVolumeDown();
                                break;

                            case 3:
                                rc.clickMusicPlayerButton(0);
                                break;

                            case 4:
                                rc.clickMusicPlayerButton(1);
                                break;

                            case 5:
                                devloop = option;
                                break;

                            default:
                                System.out.println("Invalid option...\n");
                                break;
                        }
                    }
                    break;

                case 3:
                    while (devloop != 5) {

                        System.out.println("\tSmart Thermostat Command Option\n" +
                                "1. Increase the temperature.\n" +
                                "2. Decrease the temperature.\n" +
                                "3. Hold.\n" +
                                "4. Run.\n" +
                                "5. Back\n");
                        System.out.print("Select an option: ");
                        int option = enter.nextInt();
                        System.out.println();

                        switch (option) {
                            case 1:
                                rc.clickIncreaseTemp();
                                break;

                            case 2:
                                rc.clickDecreaseTemp();
                                break;

                            case 3:
                                rc.clickThermostatButton(0);
                                break;

                            case 4:
                                rc.clickThermostatButton(1);
                                break;

                            case 5:
                                devloop = option;
                                break;

                            default:
                                System.out.println("Invalid option...\n");
                                break;
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting program...\n");
                    apploop = choice;
                    break;

                default:
                    System.out.println("Invalid option...\n");
                    break;
            }
        }

    }

}
