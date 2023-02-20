package com.junit;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({CountA.class , SquareTest.class})
public class AllTests {

}
