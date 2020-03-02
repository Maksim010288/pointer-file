package pointer_file;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ZooClub zooClub = new ZooClub();
        zooClub.actionSelection();

        zooClub.notepad();
        zooClub.subtractFromNotepad();
        zooClub.writeText();
        zooClub.readTextFile();
    }
}
