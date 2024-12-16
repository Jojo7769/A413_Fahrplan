public class A413_Fahrplan {
    public static void main(String[] args) {
        // Weichenstellungen. Passen Sie gerne die Werte zum Testen an.
        int fahrzeit = 0;
        boolean haltInSpandau = false;
        boolean richtungHamburg = false;
        boolean haltInStendal = true;
        char endetIn = 'h'; //h=Hannover, b=Braunschweig, w=Wolfsburg

        fahrzeit = fahrzeit + 8; // Fahrzeit Hbf -> Spandau

        if (haltInSpandau == true) {
            fahrzeit = fahrzeit + 2; // Halt in Spandau
        }
        if (richtungHamburg == true) {
            fahrzeit = fahrzeit + 96;
        }
        else {
            fahrzeit = fahrzeit + 34;
        }
        if (haltInStendal == true) {
            fahrzeit = fahrzeit + 16;
        }
        else {
            fahrzeit = fahrzeit + 6;
        }
        if (endetIn == 'h') {
            fahrzeit = fahrzeit + 62;
        }
        else if (endetIn == 'b') {
            fahrzeit = fahrzeit + 50;
        }
        else {
            fahrzeit = fahrzeit + 29;
        }
    }
}