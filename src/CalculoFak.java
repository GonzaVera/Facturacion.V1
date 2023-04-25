public class CalculoFak {
    static String p;
    static String c;
    static double Prodparse;
    static double CantParse;
    static double st;

    public static void Ina(String AA){
        p = AA;
    }
    public static void Inb(String BB){
        c = BB;
    }
    public static double Calcular(){
        Prodparse = Double.parseDouble(p);
        CantParse = Double.parseDouble(c);
        st = Prodparse * CantParse;
        String.valueOf(st);
        return st;
    }
}
//agregamos valores y que tire el subtotal