package service.word_evaluators;

import models.SymbolTrait;
import models.Word;

public class FractionOfSymbolWithTraitCounter extends SymbolTraitsEvaluator<Double> {
    public FractionOfSymbolWithTraitCounter(SymbolTrait trait) {
        super(trait);
    }

    @Override
    public Double evaluate(Word word) {
        return (double) new SymbolsWithTraitCounter(trait).evaluate(word) /
                new WordLengthCounter().evaluate(word);
    }
}
