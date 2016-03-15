package com.junit.suites;

import com.webdriver.LoadAsk;
import com.webdriver.LoadBing;
import com.webdriver.LoadGoogle;
import com.webdriver.LoadYahoo;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        LoadAsk.class,
        LoadBing.class,
        LoadGoogle.class,
        LoadYahoo.class
})
public class JunitTestSuite {
}
