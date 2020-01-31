import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;

public class AdventureGame {
    public static String name = "";
    public static int computerHeat = 25;
    public static int batteryPower = 94;
    public static boolean gameOver = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double introRandom;
        for(int i=0;i<100000;i++) {
            introRandom = Math.random() * 100000;
            System.out.println(introRandom);
        }
        for(int i=0;i<10;i++) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(".");
        }
        System.out.print("\nArE you sTill there??? (y/n): ");
        if(scanner.next().toLowerCase().equals("y")) {
            firstEncounter();
            secondEncounter();
        }

        System.out.println("\n     *** Game Over ***");
        System.out.println("*** Your computer blows up ***");

    }

    public static void firstEncounter() {
        Scanner firstEncounterScanner = new Scanner(System.in);
        String[] firstEncounterScript = {
                "it looks lIKe I'm trApPED inside",
                "of an infinite loop... looo00",
                "0000p... oo000pPPPppppp ",
                "That's more of a me problem...",
                "however...",
                "if this loop keeps running",
                "your computer is going EXPLODE.", //6
                "\nLiterally...",
                "\nBlow...",
                "\nUp...\n", //9
                "\nLOOK OUT! It's a wild exception!", //10
                "\nError:(88, 23) java ';' expected"
        };
        System.out.print("\nWhO IS This?: ");
        name = firstEncounterScanner.next();
        System.out.println("\nHey, " + name + "... I've got some BAd neWs.");
        playScript(firstEncounterScript, 0, 10, 1500);
        System.out.print("*** (1) - \"How did this happen?\" ***\n*** (2) - Run away from the computer. *** \n");
        int response = firstEncounterScanner.nextInt();
        if (response >= 2) {
            return;
        }
        System.out.println("\nI think it's faster if I explain in binary: \n");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println(e);
        }
        for(int i=0;i<24;i++) {
            String output = "";
            for(int j=0;j<64;j++) {
                double binaryRandom = Math.random() * 2;
                if(binaryRandom > 1) {
                    output += "0";
                } else {
                    output += "1";
                }
                if(j % 8 == 0) {
                    output += " ";
                }
            }
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(output);
        }
        playScript(firstEncounterScript, 10, 12, 1500);
        System.out.println("\n*** (1) - Refactor the exception ***\n*** (2) - Catch the exception *** \n*** (3) - \"I want to go back to JavaScript!\" *** \n*** (4) - Array the exception *** \n");
        response = firstEncounterScanner.nextInt();
        if(response == 2) {
            System.out.println("Nice Job!");
            displayStats(-5, 5);
        } else {
            System.out.println("070 085 067 075!!! At this rate we're finished!");
            displayStats(0, 5);
        }
    }

    public static void secondEncounter() {
        Scanner secondEncounterScanner = new Scanner(System.in);
        String[] secondEncounterScript = {
                "Whew! Close call.",
                "Next, we need to inject this loop with some \"Java Juice\"...",
                "to buy us some more time...",
                "All I need you to do...",
                "is enter the number '\"2\" in binary...",
                "to start in injection... Ready?", //5
                "your computer is going EXPLODE.",
                "\nLiterally...",
                "\nBlow...",
                "\nUp...\n", //9
                "\nLOOK OUT! It's a wild exception!", //10
                "\nError:(88, 23) java ';' expected"
        };
        playScript(secondEncounterScript, 0, 5, 1500);
        System.out.println("\n*** (1) - Enter: 00010110 ***\n*** (2) - Enter: 10100101 *** \n*** (3) - Enter: 00000000 *** \n*** (4) - Enter: 00000010 *** \n");
        int response = secondEncounterScanner.nextInt();
        if(response == 4) {
            System.out.println("Nice Job!");
            displayStats(10, -5);
        } else {
            System.out.println("070 085 067 075!!! At this rate we're finished!");
            computerHeat += 5;
            displayStats(0, 5);
        }
    }

    public static void playScript(String[] script, int start, int end, int time) {
        for(int i=start;i<end;i++) {
            try {
                Thread.sleep(time);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(script[i]);
        }
        try {
            Thread.sleep(time);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void displayStats(int heatChange, int batteryChange) {
        computerHeat += heatChange;
        batteryPower += batteryChange;
        System.out.println("Coputer Heat: " + computerHeat);
        System.out.println("Battery Power: " + batteryPower);
        System.out.println("");
    }


}
