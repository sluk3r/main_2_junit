package cn.baiing.tutorial.junit;

import junit.framework.Assert;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.junit.Before;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.apache.log4j.Logger;

@RunWith(JUnit4ClassRunnerLog4j.class)
public class JunitLog4JIntegration {
    private static Logger logger = Logger.getLogger(JunitLog4JIntegration.class.getName());

    @Test
    public void log4jDemo() {
        logger.info("log4jDemo invoked.");
    }
}
