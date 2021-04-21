package org.qtk.testeverything;

import android.content.Context;
import android.content.Intent;
import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by SiriusTK on 16/9/13.
 */
public class TestActivity extends ActivityInstrumentationTestCase2<MainActivity> {
    public TestActivity(Class<MainActivity> activityClass) {
        super(activityClass);
    }

    private Context context;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        context = getActivity().getApplicationContext();
    }

    public void testStart(){
        Intent intent = new Intent(context,MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }
}
