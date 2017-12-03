package controllers;

import models.SymbolTrait;
import models.Text;
import service.comparators.StringDoubleEntryComparatorByDouble;
import service.statistics.StatisticByFractionOfTraitCalculator;
import service.stringifiers.ListOfStringDoubleEntryStringifier;
import utils.file_io.FileStringReader;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MainController {
    private final String sourceFile;
    private final String destinationFile;

    public MainController(String[] args) {
        sourceFile = args[0];
        destinationFile = args[1];
    }

    public void run() {
        try (
                FileWriter fw = new FileWriter(destinationFile)
        ) {
            List<Map.Entry<String, Double>> es = new ArrayList<>();
            es.addAll(
                    new StatisticByFractionOfTraitCalculator(SymbolTrait.VOWEL).calculate(
                            new Text(
                                    new FileStringReader(sourceFile).readAll()
                            )
                    ).entrySet());
            es.sort(new StringDoubleEntryComparatorByDouble());
            fw.write(
                    new ListOfStringDoubleEntryStringifier().convert(es)
            );

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
