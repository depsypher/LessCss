package nl.dslmeinte.xtext.test.util;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit.AbstractXtextTests;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IntegerExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * Support class (which ought to be abstract) to help with unit testing files,
 * without using the classes from org.eclipse.xtext.junit4.parameterized
 * (which are either limited or which I don't understand).
 */
@SuppressWarnings("all")
public class XtextTestsSupport extends AbstractXtextTests {
  protected Diagnostician diagnostician;
  
  protected void setUp() {
    try {
      {
        super.setUp();
        Diagnostician _diagnostician = new Diagnostician();
        this.diagnostician = _diagnostician;
      }
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public boolean test(final File file) {
    try {
      {
        FileInputStream _fileInputStream = new FileInputStream(file);
        final FileInputStream input = _fileInputStream;
        EObject _modelAndExpect = this.getModelAndExpect(input, AbstractXtextTests.UNKNOWN_EXPECTATION);
        final EObject eObject = _modelAndExpect;
        Resource _eResource = eObject.eResource();
        final Resource resource = _eResource;
        EcoreUtil.resolveAll(resource);
        EList<Diagnostic> _errors = resource.getErrors();
        for (final Diagnostic e : _errors) {
          this.print(e, "error");
        }
        EList<Diagnostic> _warnings = resource.getWarnings();
        for (final Diagnostic w : _warnings) {
          this.print(w, "warning");
        }
        org.eclipse.emf.common.util.Diagnostic _validate = this.diagnostician.validate(eObject);
        List<org.eclipse.emf.common.util.Diagnostic> _children = _validate.getChildren();
        final List<org.eclipse.emf.common.util.Diagnostic> issues = _children;
        for (final org.eclipse.emf.common.util.Diagnostic i : issues) {
          this.print(i);
        }
        boolean _operator_and = false;
        int _size = issues.size();
        boolean _operator_equals = IntegerExtensions.operator_equals(_size, 0);
        if (!_operator_equals) {
          _operator_and = false;
        } else {
          EList<Diagnostic> _errors_1 = resource.getErrors();
          int _size_1 = _errors_1.size();
          boolean _operator_equals_1 = IntegerExtensions.operator_equals(_size_1, 0);
          _operator_and = BooleanExtensions.operator_and(_operator_equals, _operator_equals_1);
        }
        return _operator_and;
      }
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private String print(final Diagnostic it, final String type) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("L");
    int _line = it.getLine();
    _builder.append(_line, "");
    String _safeColumn = this.safeColumn(it);
    _builder.append(_safeColumn, "");
    _builder.append("\t\t");
    _builder.append(type, "");
    _builder.append("\t\t");
    String _message = it.getMessage();
    _builder.append(_message, "");
    String _string = _builder.toString();
    String _println = InputOutput.<String>println(_string);
    return _println;
  }
  
  private String print(final org.eclipse.emf.common.util.Diagnostic it) {
    StringConcatenation _builder = new StringConcatenation();
    int _severity = it.getSeverity();
    _builder.append(_severity, "");
    _builder.append("\t");
    String _message = it.getMessage();
    _builder.append(_message, "");
    String _string = _builder.toString();
    String _println = InputOutput.<String>println(_string);
    return _println;
  }
  
  private String safeColumn(final Diagnostic it) {
    String _xtrycatchfinallyexpression = null;
    try {
      int _column = it.getColumn();
      String _operator_plus = StringExtensions.operator_plus("@", Integer.valueOf(_column));
      _xtrycatchfinallyexpression = _operator_plus;
    } catch (final Throwable _t) {
      if (_t instanceof UnsupportedOperationException) {
        final UnsupportedOperationException e = (UnsupportedOperationException)_t;
        _xtrycatchfinallyexpression = "";
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return _xtrycatchfinallyexpression;
  }
  
  public File fileInCurrentJavaPackage(final String fileName) {
    Class<? extends Object> _class = this.getClass();
    Package _package = _class.getPackage();
    String _name = _package.getName();
    String _replace = _name.replace(".", "/");
    String _operator_plus = StringExtensions.operator_plus("src/", _replace);
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, "/");
    String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, fileName);
    File _file = new File(_operator_plus_2);
    return _file;
  }
  
  public File file(final String fileName) {
    File _file = new File(fileName);
    return _file;
  }
}
