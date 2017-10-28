//Semester: #A171
//Course: #STIW3054
//Group: #A
//Task: #Assignment1
//Matrik: #240211
//Name: #Toh Wei Sheng
package countSovledProblem;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

/**
 *
 * @author User
 */
public class countIssues {
    private int issuesCount=0;
    private final String keyword = "public static void main(String args[])";
    private final String extention = "";
    private String filePath="";
    

    public int issuesNum(final File folder, String[] ext) {

        int numIssue = 0;
        for (String ext1 : ext) {
            filePath = folder + "\\" + ext1;
            try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
                String readLine;
                while ((readLine = br.readLine()) != null) {
                    if (readLine.contains(keyword)) {
                        numIssue++;
                    }
                }
            } catch (IOException e) {
                System.out.println("Error. Please try again.");
            }
        }
        setIssue(numIssue);
        return issuesCount;
     
    }
    public void setIssue(int count) {
        issuesCount = count;
    }
 
    public int getIssues() {
       
        return issuesCount;
    }
}