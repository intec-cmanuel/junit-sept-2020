package be.intecbrussel.param;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class WordReverserTest2 {

    private WordReverser wordReverser;
    private String sentence;
    private String reversedSentence;

    @Before
    public void initialize() {
        wordReverser = new WordReverser();
    }

    public WordReverserTest2(String sentence, String reversedSentence) {
        this.sentence = sentence;
        this.reversedSentence = reversedSentence;
    }

    @Parameterized.Parameters
    public static Collection reversedWords() {
        return Arrays.asList(new Object[][]{
                {"Boat", "taoB"},
                {"Vliegen", "negeilV"},
                {"Tafel", "lefaT"},
                {null, null},
                {"", ""},
                {"       ", ""}
        });
    }

    @Test
    public void testWordReverser() {
        System.out.println("String to check: " + sentence);
        String result = wordReverser.reverseWord(sentence);
        Assertions.assertEquals(reversedSentence, result);
    }
}