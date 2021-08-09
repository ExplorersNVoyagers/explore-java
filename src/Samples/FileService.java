package Samples;

import java.io.File;
import java.lang.String;

public class FileService {
    public static final String FOLDER_PATH = "C:\\Users\\Public\\Pictures";

    public static void main(String[] args) {
        System.out.println("hello");
//        String path =  System.getProperty("user.dir");
        File file = new File(FOLDER_PATH);
        int[] dirFile = new int[2];
        dirFile[0]  =-1;
        calculateFilesAndFolders(file, dirFile);
        System.out.println("No of files is " + dirFile[1] + "   No. of directories is " + dirFile[0]);
    }

    private static void calculateFilesAndFolders(File file, int[] dirFile) {
        if (file.isDirectory()) {
            dirFile[0] = dirFile[0] + 1;
            File[] f = file.listFiles();
            for (File h : f) {
                calculateFilesAndFolders(h, dirFile);
            }
        } else {
            dirFile[1] = dirFile[1] + 1;
        }
    }

    private static void calculateFilesAndFolders1(File file, int[] dirFile) {
        if (file.isDirectory()) {
            dirFile[0] = dirFile[0] + 1;
            if (file.list().length > 0) {
                File[] f = file.listFiles();
                for (File h : f) {
                    calculateFilesAndFolders(h, dirFile);
                }
            }
        } else {
            dirFile[1] = dirFile[1] + 1;
        }
    }
}
