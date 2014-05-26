package cn.baiing.tutorial.junit;

//import org.springframework.util.Log4jConfigurer;

import java.io.FileNotFoundException;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Created by wangxc on 2014/5/26.
 */

public class JUnit4ClassRunnerLog4j extends BlockJUnit4ClassRunner{

    static {
            //org.apache.log4j.BasicConfigurator.configure();
    }

    public JUnit4ClassRunnerLog4j(Class<?> clazz) throws org.junit.runners.model.InitializationError {
        super(clazz);
    }

}