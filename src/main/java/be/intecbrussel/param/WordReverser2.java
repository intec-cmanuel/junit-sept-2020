package be.intecbrussel.param;

public class WordReverser2 {
    public String reverse(String sentence) {
        return sentence == null ? null : new StringBuilder(sentence).reverse().toString().trim();
    }
}
