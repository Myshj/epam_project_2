package service.word_evaluators;

import models.Word;

public class WordLengthCounter extends WordEvaluator<Integer> {
    @Override
    public Integer evaluate(Word word) {
        return word.getSymbols().size();
    }
}
