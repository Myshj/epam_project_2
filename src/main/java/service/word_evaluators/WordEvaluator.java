package service.word_evaluators;

import models.Word;

public abstract class WordEvaluator<T extends Number> {
    public abstract T evaluate(Word word);
}
