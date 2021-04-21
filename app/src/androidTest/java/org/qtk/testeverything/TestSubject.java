package org.qtk.testeverything;

import android.test.InstrumentationTestCase;

/**
 * Created by SiriusTK on 16/9/13.
 */
public class TestSubject extends InstrumentationTestCase {

    public void testPublicSubject(){
        // TODO: 16/9/13 为什么会闪退 
        launchActivity("org.qtk.testeverything",MainActivity.class,null);
    }


}
