public class Main {

    public static void main(String[] args) {

        Abbreviations abbreviations = new Abbreviations();
        abbreviations.addAbbreviation("e.g.", "for example");
        abbreviations.addAbbreviation("etc.", "and so on");
        abbreviations.addAbbreviation("i.e.", "more precisely");

        String text = "e.g. i.e. etc. lol";

        String[] words = text.split(" ");

//        for (String part : text.split(" ")) {
//            if (abbreviations.hasAbbreviation(part)) {
//                part = abbreviations.findExplanationFor(part);
//            }
//            System.out.print(part);
//            System.out.print(" ");
//        }
//        System.out.println();
        for (String word : words) {
            if (abbreviations.hasAbbreviation(word)) {
                word = abbreviations.findExplanationFor(word);
            }
            System.out.print(word);
            System.out.print(" ");
        }
        System.out.println();
    }

}

