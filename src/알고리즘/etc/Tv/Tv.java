package 알고리즘.etc.Tv;

public class Tv implements Channel {

    private String Color;
    private String Spec;
    private String Volume;
    private String Name;
    private int CurrntCh = 5;
    private Integer CurCh2 = 10;


    public int getCurrntCh() {
        return CurrntCh;
    }

    @Override
    public void ChangeCh(int chNumber) {
        CurrntCh = chNumber;
    }

    @Override
    public int ChannelUp() {
        this.CurrntCh += 1;
        this.CurCh2 += 2;
        return this.CurCh2;
    }

    @Override
    public int ChannelDown() {
        CurrntCh -= 1;
        return this.CurrntCh;
    }


    public static void main(String[] args) {
        Tv tv = new Tv();
        System.out.println( tv.getCurrntCh());
        tv.ChangeCh(11);
        System.out.println( tv.ChannelUp());
        System.out.println(tv.ChannelDown());

//        System.out.println(tv);

    }
}