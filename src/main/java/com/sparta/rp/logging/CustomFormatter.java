package com.sparta.rp.logging;

import java.time.Clock;
import java.time.LocalDate;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class CustomFormatter extends Formatter {

    @Override
    public String format(LogRecord record) {
        return LocalDate.now()
                + " " + record.getLevel()
                + " " + record.getMessage()
                + "\n";
    }
}
