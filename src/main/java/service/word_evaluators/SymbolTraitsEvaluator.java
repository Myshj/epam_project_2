package service.word_evaluators;

import models.SymbolTrait;

abstract class SymbolTraitsEvaluator<T extends Number> extends WordEvaluator<T> {
    SymbolTrait trait;

    SymbolTraitsEvaluator(SymbolTrait trait) {
        this.trait = trait;
    }
}
