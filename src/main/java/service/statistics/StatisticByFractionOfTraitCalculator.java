package service.statistics;

import models.Phrase;
import models.SymbolTrait;
import models.Text;
import models.Word;
import service.word_evaluators.FractionOfSymbolWithTraitCounter;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class StatisticByFractionOfTraitCalculator {

    private SymbolTrait trait;

    public StatisticByFractionOfTraitCalculator(SymbolTrait trait) {
        this.trait = trait;
    }

    public Map<String, Double> calculate(Text text) {
        return Collections.unmodifiableMap(
                new HashMap<String, Double>() {{
                    for (Phrase phrase : text.getPhrases()) {
                        for (Word word : phrase.getWords()) {
                            putIfAbsent(
                                    word.getString().toLowerCase(),
                                    new FractionOfSymbolWithTraitCounter(trait).evaluate(word)
                            );
                        }
                    }
                }}
        );
    }
}
