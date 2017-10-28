/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uum.assignment1;

import java.io.File;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class countJavaFilesTest {
    
    public countJavaFilesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of listFolderFile method, of class countJavaFiles.
     */
    @Test
    public void testListFolderFile() {
        System.out.println("listFolderFile");
        File folder = new File ("C:\\Users\\User\\Documents\\NetBeansProjects\\RealTimeAssignment1\\File");
        countJavaFiles instance = new countJavaFiles("C:\\Users\\User\\Documents\\NetBeansProjects\\RealTimeAssignment1\\File");
        instance.listFolderFile(folder);

    }

    /**
     * Test of addFolder method, of class countJavaFiles.
     */
    @Test
    public void testAddFolder() {
        System.out.println("addFolder");
        String extFile = "dddd.java";
        countJavaFiles instance = new countJavaFiles("C:\\Users\\User\\Documents\\NetBeansProjects\\RealTimeAssignment1\\File");
        instance.addFolder(extFile);

    }

    /**
     * Test of checkJavaExtension method, of class countJavaFiles.
     */
    @Test
    public void testCheckJavaExtension() {
        System.out.println("checkJavaExtension");
        String extFile = "dddd.java";
        countJavaFiles instance = new countJavaFiles("C:\\Users\\User\\Documents\\NetBeansProjects\\RealTimeAssignment1\\File");
        boolean expResult = true;
        boolean result = instance.checkJavaExtension(extFile);
        assertEquals(expResult, result);

    }

    /**
     * Test of getFileList method, of class countJavaFiles.
     */
    @Test
    public void testGetFileList() {
        System.out.println("getFileList");
        countJavaFiles instance = new countJavaFiles("C:\\Users\\User\\Documents\\NetBeansProjects\\RealTimeAssignment1\\File");
        String[] expResult = {"MySleep.java","MyThread.java","MyThreadThread.java"};
        String[] result = instance.getFileList();
        assertArrayEquals(expResult, result);

    }

    /**
     * Test of toString method, of class countJavaFiles.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        countJavaFiles instance = new countJavaFiles("C:\\Users\\User\\Documents\\NetBeansProjects\\RealTimeAssignment1\\File");
        String expResult = "MySleep.javaMyThread.javaMyThreadThread.java";
        String result = instance.toString();
        assertEquals(expResult, result);

    }

    /**
     * Test of numJavaFile method, of class countJavaFiles.
     */
    @Test
    public void testNumJavaFile() {
        System.out.println("numJavaFile");
        countJavaFiles instance = new countJavaFiles("C:\\Users\\User\\Documents\\NetBeansProjects\\RealTimeAssignment1\\File");
        int expResult = 3;
        int result = instance.numJavaFile();
        assertEquals(expResult, result);

    }
    
}
