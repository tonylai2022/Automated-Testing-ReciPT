package com.example.suites;

import com.example.tests.ButtonTests;
import com.example.tests.FormTests;
import com.example.tests.DropdownTests;
import com.example.tests.MenuTests;
import com.example.tests.SignUpTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        ButtonTests.class,
        FormTests.class,
        DropdownTests.class,
        MenuTests.class,
        SignUpTests.class
})
public class TestSuite {
}
