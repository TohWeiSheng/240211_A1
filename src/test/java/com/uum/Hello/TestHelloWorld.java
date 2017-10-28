/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uum.Hello;

import org.junit.Assert;
import org.junit.Test;
/**
 *
 * @author User
 */
public class TestHelloWorld {
    @Test
    public void testHello(){
            HelloWorld hw = new HelloWorld();
            hw.sayHello("weisheng");
            Assert.assertEquals("Hello weisheng", "weisheng");
}
}
