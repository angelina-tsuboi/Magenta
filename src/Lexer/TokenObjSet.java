package Lexer;

import java.util.regex.Pattern;



public enum TokenObjSet {
  // Token types cannot have underscores
  
  NUMBER("(?<=\\s|^)\\d+(?=\\s|$)"),
  DECIMAL("\\d+(\\.\\d{1,2})?"),
  STRING("\"[^\"]*\""),
  BOOLEAN("true(?=[^_A-Za-z])|false(?=[^_A-Za-z])"),
  OPADD("[+]"),
  OPSUBTRACT("[-]"),
  OPMULTIPLY("[*]"),
  OPDIVIDE("[/]"),
  
  
  WHITESPACE("[ \t\f\r\n]+");
  

  public final String pattern;

  private TokenObjSet(String pattern) {
    this.pattern = pattern;
  }
}

//OP_ADD("(?<=^\\s*)\\+"),
//OP_SUBTRACT("(?<=^\\s*)\\+"),
//TEXT_LOWERCASE("(?<=^\\s*)[a-z][_A-Za-z]*(?=[^_A-Za-z])"),
//TEXT_UPPERCASE("(?<=^\\s*)_[_A-Za-z]*(?=[^_A-Za-z])"),
//TEXT_UNDERSCORE("(?<=^\\s*)_[_A-Za-z]*(?=[^_A-Za-z])")
//STRING("(?<=^\\s*)'([^'\\\\]|\\\\.)*'"),
//DECIMAL("\\d+\\.?\\d*"),
//BOOLEAN("(?<=^\\s*)true(?=[^_A-Za-z])|false(?=[^_A-Za-z])"),

//OP_PLUS("[+]"),
//OP_MINUS("[-]"),
//OP_MULTIPLY("[*]"),
//OP_DIVIDE("[/]"),