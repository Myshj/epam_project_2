package service.word_evaluators;

import models.Symbol;
import models.SymbolTrait;
import models.Word;

public class SymbolsWithTraitCounter extends SymbolTraitsEvaluator<Integer> {
    public SymbolsWithTraitCounter(SymbolTrait trait) {
        super(trait);
    }

    @Override
    public Integer evaluate(Word word) {
        int count = 0;
        for (Symbol symbol : word.getSymbols()) {
            if (symbol.getTraits().contains(trait)) {
                count++;
            }
        }
        return count;
    }
}
