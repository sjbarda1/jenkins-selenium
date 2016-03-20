package com.junit.suites;

import com.webdriver.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        LoadSeleniumHQ.class,
        LoadJenkins.class,
        LoadWebcrawler.class
})
public class JunitTestSuiteTwo {
}
