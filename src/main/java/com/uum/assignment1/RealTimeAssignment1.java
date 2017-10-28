//Semester: #A171
//Course: #STIW3054
//Group: #A
//Task: #Assignment1
//Matrik: #240211
//Name: #Toh Wei Sheng
package com.uum.assignment1;

import countSovledProblem.countIssues;
/**
 *
 * @author User
 */
public class RealTimeAssignment1 {
    static countJavaFiles folder;
    static countIssues countIssues = new countIssues();
    static final String Path= "C:\\Users\\User\\Documents\\NetBeansProjects\\RealTimeAssignment1\\File";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        folder = new countJavaFiles(Path);
        int numJavaFile = folder.numJavaFile();
        int numIssues = countIssues.getIssues();
        System.out.println("Number of Java Files = " + numJavaFile);
        System.out.println("Number of Issues = " + numIssues);      
    }
    
}
