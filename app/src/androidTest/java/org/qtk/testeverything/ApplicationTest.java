package org.qtk.testeverything;

import android.app.Application;
import android.test.ApplicationTestCase;
import android.util.Log;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {


    public ApplicationTest() {
        super(Application.class);
    }


    public void testStart() {
        String str = null;
        str = mContext.getResources().getString(R.string.app_name);
        Log.i(Constants.TEST_LOG_TAG, str);
    }
}