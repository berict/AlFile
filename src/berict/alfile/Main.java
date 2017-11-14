package berict.alfile;

import berict.alfile.file.File;
import berict.alfile.main.MainFormController;
import berict.alfile.main.MainSwingController;

public class Main {

    public static boolean DEBUG = true;

    public static void main(String[] args) {
        init();
    }

    static void init() {
        // full swing method
//        MainSwingController controller = new MainSwingController();

        // form method
        MainFormController controller = new MainFormController();
    }
}
