import controllers.MainController;

public class Main {
    public static void main(String[] args) {
//        String string = "Жил-был Сапег Позорный. Он срамный был король. Любил немного взятку, но брал откат порой.";
//        System.out.println(string);
//        string = new Trimmer().convert(string);
//        System.out.println(string);
//        List<String> phraseStrings = new TextByPhraseSplitter().convert(string);
//        System.out.println(phraseStrings);
//        System.out.println("Разбиение каждой фразы на слова:");
//
//        Text text = new Text(string);
//
//        Map<String, Double> stat = new StatisticByFractionOfTraitCalculator(
//                SymbolTrait.VOWEL
//        ).calculate(text);

        new MainController(args).run();
    }
}
