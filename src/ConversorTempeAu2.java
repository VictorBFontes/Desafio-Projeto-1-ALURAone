public class ConversorTempe {

    public static void main(String[] args) {
        System.out.println("""
    Bem vindo ao conversor de temperaturas!!
    Aqui convertemos graus Celsius para Fahrenheit utilizando essa fórmula:
    (temperatura * 1.8) + 32.
    Usaremos o exemplo de 29.8ºC=
    """);

        double grausCel = 29.8;
        double fahrenResul = (grausCel * 1.8) + 32;
        int resulInt = (int) fahrenResul;

        System.out.println("""
                O resultado em Fahrenheit será de: 
                """ + fahrenResul + """
                 
                E agora arredondando ficaria assim: 
                """ + resulInt);
    }
}
