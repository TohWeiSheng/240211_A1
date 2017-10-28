/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uum.assignment1;

import countSovledProblem.countIssues;
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
public class countIssuesTest {
    
    public countIssuesTest() {
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
     * Test of issuesNum method, of class countIssues.
     */
    @Test
    public void testIssuesNum() {
        System.out.println("issuesNum");
        File folder = new File ("C:\\Users\\User\\Documents\\NetBeansProjects\\RealTimeAssignment1\\File");
        String[] ext = {};
        countIssues instance = new countIssues();
        int expResult = 0;
        int result = instance.issuesNum(folder, ext);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setIssue method, of class countIssues.
     */
    @Test
    public void testSetIssue() {
        System.out.println("setIssue");
        int count = 0;
        countIssues instance = new countIssues();
        instance.setIssue(count);
   
    }

    /**
     * Test of getIssues method, of class countIssues.
     */
    @Test
    public void testGetIssues() {
        System.out.println("getIssues");
        countIssues instance = new countIssues();
        int expResult = 0;
        int result = instance.getIssues();
        assertEquals(expResult, result);
 
    }
    
}
