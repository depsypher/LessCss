package nl.dslmeinte.xtext.css.test;

import java.io.File;
import nl.dslmeinte.xtext.test.util.XtextTestsSupport;
import org.eclipse.xtext.junit.AbstractXtextTests;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class SelectorsTests extends XtextTestsSupport {
  protected void setUp() {
    try {
      {
        super.setUp();
        this.with(nl.dslmeinte.xtext.css.CSSStandaloneSetup.class);
      }
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void test_all_positive_tests_at_once() {
    File _fileInCurrentJavaPackage = this.fileInCurrentJavaPackage("bigPositiveTest.css");
    this.test(_fileInCurrentJavaPackage);
  }
  
  public void test_section5_example2_part1() {
    try {
      this.getModelAndExpect("h1 { font-family: sans-serif }\n\t\t\t\t\t\t\th2..foo { font-family: sans-serif }\n\t\t\t\t\t\t\th3 { font-family: sans-serif }", AbstractXtextTests.EXPECT_ERRORS);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void test_section5_example2_part2() {
    try {
      this.getModelAndExpect("h1, h2..foo, h3 { font-family: sans-serif }", AbstractXtextTests.EXPECT_ERRORS);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void test_anomolousTest1() {
    File _fileInCurrentJavaPackage = this.fileInCurrentJavaPackage("anomolousTest1.css");
    this.test(_fileInCurrentJavaPackage);
  }
  
  public void test_mixinsNested() {
    File _fileInCurrentJavaPackage = this.fileInCurrentJavaPackage("mixins-nested.css");
    this.test(_fileInCurrentJavaPackage);
  }
}
