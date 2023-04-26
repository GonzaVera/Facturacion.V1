import java.net.DatagramPacket;

public class CalculoFak {
    static String p;
    static String c;
    static String d;//entra
    static double Tota;
    static double Santillan;

    static double DC;
    static double Descu;
    static double Prodparse;
    static double CantParse;
    static double st;

    public static void Ina(String AA){
        p = AA;
    }
    public static void Inb(String BB){
        c = BB;
    }
    public static void InDesc(String CC){d = CC;}

    public static double Calcular(){
        Prodparse = Double.parseDouble(p);
        CantParse = Double.parseDouble(c);
        st = Prodparse * CantParse;
        String.valueOf(st);
        return st;
    }
    public static double Desc(){
        Descu = Double.parseDouble(d);
        Descu = (st * Descu) / 100;
         DC = Descu;
         String.valueOf(DC);
        return DC;
    }
    public static double Total(){
        Tota = st - Descu;
        Santillan = Tota;
            String.valueOf(Santillan);
        return Santillan;
    }
}
//agregamos valores y que tire el subtotal