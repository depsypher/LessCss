package nl.dslmeinte.xtext.css.test;

import java.io.File;
import java.util.List;
import nl.dslmeinte.xtext.test.util.XtextTestsSupport;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.junit.Assert;

/**
 * Parses all CSS test files in the cloudhead/less.js repository,
 * located in /test/css. Note that this directory must be symlinked
 * as 'lessjs-test-css' in this project's root.
 */
@SuppressWarnings("all")
public class AllLessJsCssTests extends XtextTestsSupport {
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
  
  public void test_all_LessJs_css_tests() {
      File _file = new File("lessjs-test-css");
      final File dir = _file;
      boolean success = true;
      File[] _listFiles = dir.listFiles();
      final Function1<File,Boolean> _function = new Function1<File,Boolean>() {
          public Boolean apply(final File it) {
            String _name = it.getName();
            boolean _endsWith = _name.endsWith(".css");
            return Boolean.valueOf(_endsWith);
          }
        };
      Iterable<File> _filter = IterableExtensions.<File>filter(((Iterable<File>)Conversions.doWrapArray(_listFiles)), _function);
      final Function1<File,String> _function_1 = new Function1<File,String>() {
          public String apply(final File it) {
            String _xblockexpression = null;
            {
              String _name = it.getName();
              final String name = _name;
              int _lastIndexOf = name.lastIndexOf(".css");
              String _substring = name.substring(0, _lastIndexOf);
              _xblockexpression = (_substring);
            }
            return _xblockexpression;
          }
        };
      List<File> _sortBy = IterableExtensions.<File, String>sortBy(_filter, _function_1);
      for (final File file : _sortBy) {
        {
          String _name = file.getName();
          String _operator_plus = StringExtensions.operator_plus("parsing ", _name);
          String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, ":");
          InputOutput.<String>println(_operator_plus_1);
          boolean _test = this.test(file);
          final boolean result = _test;
          String _name_1 = file.getName();
          boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_name_1, "colors.css");
          if (_operator_notEquals) {
            boolean _operator_and = false;
            if (!success) {
              _operator_and = false;
            } else {
              _operator_and = BooleanExtensions.operator_and(success, result);
            }
            success = _operator_and;
          }
          InputOutput.<String>println("");
          InputOutput.<String>println("");
        }
      }
      Assert.assertTrue("there were syntactic/semantic errors", success);
  }
  
  public void test_imports() {
      File _file = new File("lessjs-test-css/import.css");
      final File file = _file;
      boolean _test = this.test(file);
      Assert.assertTrue("there were syntactic/semantic errors", _test);
  }
}
