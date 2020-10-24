package edu.akarimin.geekle.ch1;

public class TextBlockChallenger {

    public static void main(String[] args) {
        String jediWithoutTextBlock = "" +
                "<html>\n" +
                "    <head>Master Yoda</head> %s\n" +
                "</html>"
                        .strip()            // only line 9 is stripped, instead of whole String - no good
                        .formatted("Luke");

        // preferred
        String jediWithTextBlock = """              
                <html>
                    <head>Master Yoda</head> %s
                </html>
                """
                        .strip()
                        .formatted("Luke");
        System.out.println(jediWithoutTextBlock.equals(jediWithTextBlock));
        System.out.println(jediWithoutTextBlock.formatted("Luke").equals(jediWithTextBlock));

        System.out.println(jediWithoutTextBlock);
        System.out.println(jediWithTextBlock);
    }
}
