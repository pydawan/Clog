package com.caseyjbrooks.clog.loggers;

import android.util.Log;

import com.caseyjbrooks.clog.ClogFormatter;
import com.caseyjbrooks.clog.ClogLogger;

public class ClogV implements ClogLogger, ClogFormatter {

    @Override
    public int log(String tag, String message) {
        return Log.v(tag, message);
    }

    @Override
    public int log(String tag, String message, Throwable throwable) {
        return Log.v(tag, message, throwable);
    }

    @Override
    public Object format(Object data, Object[] params) {
        Log.v("ClogV", data.toString());
        return data;
    }
}