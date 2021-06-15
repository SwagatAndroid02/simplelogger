package ssa.worriorx.com.simplelogger;

import android.util.Log;

public class SimpleLogger {

    private static final String TAG = "SIMPLE_LOGGER_TAG";

    public static void addLog(String logText){
        Log.d(TAG,logText);
    }
}
