/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Repository.ZipAndUnzipRepository;
import View.Menu;

/**
 *
 * @author tuanh
 */
public class ZipAndUnzipFileProgram extends Menu<String> {

    static String[] mc = {"Compression", "Extraction", "Exit"};
    ZipAndUnzipRepository program;

    public ZipAndUnzipFileProgram() {
        super("\nZipper program", mc);
        program = new ZipAndUnzipRepository();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                program.zipFile();
                break;
            case 2:
                program.unzipFile();
                break;
            case 3:
                System.exit(0);
        }
    }
}
