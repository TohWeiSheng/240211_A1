//Semester: #A171
//Course: #STIW3054
//Group: #A
//Task: #Assignment1
//Matrik: #240211
//Name: #Toh Wei Sheng
package com.uum.assignment1;

import java.io.File;
import java.util.LinkedList;
/**
 *
 * @author User
 */
public final class countJavaFiles {
    
    private final LinkedList<String> listFile = new LinkedList();
    public Object iss;
    public Object issues;
    
    public countJavaFiles(String path) {
        final File folder = new File(path);
        listFolderFile(folder);
    }

    public void listFolderFile(final File folder) {
        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                this.listFolderFile(fileEntry);
            } else {
                String list[] = {fileEntry.getName()};
                for (int i = 0; i < list.length; i++) {
                    addFolder(list[i]);
                }
            }
        }
            
    }

    public void addFolder(String extFile) {
        if (checkJavaExtension(extFile)) {
            listFile.add(extFile);
        }
    }

    public boolean checkJavaExtension(String extFile) {
        return extFile.substring(extFile.length() - 4).equalsIgnoreCase("Java");
    }

    public String[] getFileList() {
        String arrayFile[] = new String[listFile.size()];

        for (int i = 0; i < listFile.size(); i++) {
            arrayFile[i] = listFile.get(i);
        }
        return arrayFile;
    }

    @Override
    public String toString() {
        String fileName = "";
        for (int i = 0; i < listFile.size(); i++) {
            fileName += listFile.get(i);
        }
        return fileName;
    }
        public int numJavaFile() {
        int numJavaFile = listFile.size();
        return numJavaFile;
    }

}