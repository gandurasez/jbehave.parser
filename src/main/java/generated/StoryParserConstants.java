/* Generated By:JavaCC: Do not edit this line. StoryParserConstants.java */
package generated;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface StoryParserConstants {

    /**
     * End of File.
     */
    int EOF = 0;
    /**
     * RegularExpression Id.
     */
    int META = 1;
    /**
     * RegularExpression Id.
     */
    int NARRATIVE = 2;
    /**
     * RegularExpression Id.
     */
    int SCENARIO = 3;
    /**
     * RegularExpression Id.
     */
    int GIVEN = 4;
    /**
     * RegularExpression Id.
     */
    int IN_META_NARRATIVE = 9;
    /**
     * RegularExpression Id.
     */
    int IN_META_SCENARIO = 10;
    /**
     * RegularExpression Id.
     */
    int IN_META_GIVEN = 11;
    /**
     * RegularExpression Id.
     */
    int META_COMMENT = 12;
    /**
     * RegularExpression Id.
     */
    int IGNORE = 13;
    /**
     * RegularExpression Id.
     */
    int IN_META_ANY = 14;
    /**
     * RegularExpression Id.
     */
    int IN_NARRATIVE_META = 15;
    /**
     * RegularExpression Id.
     */
    int IN_NARRATIVE_SCENARIO = 16;
    /**
     * RegularExpression Id.
     */
    int NARRATIVE_COMMENT = 17;
    /**
     * RegularExpression Id.
     */
    int IN_NARRATIVE_ANY = 18;
    /**
     * RegularExpression Id.
     */
    int COMMENT_END = 19;
    /**
     * RegularExpression Id.
     */
    int N_COMMENT_END = 20;
    /**
     * RegularExpression Id.
     */
    int M_COMMENT_END = 21;
    /**
     * RegularExpression Id.
     */
    int IN_GIVEN_META = 24;
    /**
     * RegularExpression Id.
     */
    int IN_GIVEN_SCENARIO = 25;
    /**
     * RegularExpression Id.
     */
    int IN_SCENARIO_META = 27;
    /**
     * RegularExpression Id.
     */
    int IN_SCENARIO_SCENARIO = 28;
    /**
     * RegularExpression Id.
     */
    int IN_SCENARIO_COMMENT = 29;
    /**
     * RegularExpression Id.
     */
    int IN_SCENARIO_GIVEN = 30;
    /**
     * RegularExpression Id.
     */
    int IN_SCENARIO_ANY = 31;

    /**
     * Lexical state.
     */
    int DEFAULT = 0;
    /**
     * Lexical state.
     */
    int IN_META = 1;
  /** Lexical state. */
  int IN_NARRATIVE = 2;
  /** Lexical state. */
  int IN_COMMENT = 3;
    /**
     * Lexical state.
     */
    int IN_NARRATIVE_COMMENT = 4;
  /** Lexical state. */
  int IN_META_COMMENT = 5;
    /** Lexical state. */
  int IN_GIVEN = 6;
  /** Lexical state. */
  int IN_SCENARIO = 7;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\"Meta:\"",
    "\"Narrative:\"",
          "\"Scenario:\"",
          "\"Given\"",
          "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
          "\"Narrative:\"",
          "\"Scenario:\"",
    "\"Given\"",
    "\"!--\"",
    "\"@ignore\"",
    "<IN_META_ANY>",
    "\"Meta:\"",
    "\"Scenario:\"",
    "\"!--\"",
    "<IN_NARRATIVE_ANY>",
    "<COMMENT_END>",
    "<N_COMMENT_END>",
    "<M_COMMENT_END>",
    "<token of kind 22>",
    "\"!--\"",
    "\"Meta:\"",
    "\"Scenario:\"",
    "<token of kind 26>",
    "\"Meta:\"",
    "\"Scenario:\"",
    "\"!--\"",
    "\"Given\"",
    "<IN_SCENARIO_ANY>",
  };

}
