public class TestCasting2 {
    public static void main(String args[]){
        //Exemplo 1
        byte a = 1;
        byte b = 3;
        /* Linha errada, pois a operacao adicao sofre casting implicita */
        //byte c = a + b;
        //Correcao do casting explicito
        byte c = (byte)(a+b);
        System.out.println(c);
        //Exemplo 2
        int ia = 1;
        long lb = 3;
        //Perda de precisao - causa erro
        //int ic = ia + lb; //linha errada -> casting
        //Correcao o casting explicito
        int ic = ia + (int) lb;
        System.out.println(ic);

    }
}
