package com.example.cst438wk02hw01;

import android.app.Instrumentation;
import android.content.Context;

import org.junit.Test;
//import com.google.common.truth.Truth.assertThat;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
   

    @Test
    public void userTest() {
        assertTrue(MainActivity.validateUsername("din_djarin"));
        assertFalse(MainActivity.validateUsername("HelloMate"));
    }

    @Test
    public void passTest(){
        assertTrue(MainActivity.validatePassword("baby_yoda_ftw"));
        assertFalse(MainActivity.validatePassword("baby_yoda_sucksss"));
    }




}