package 알고리즘.etc.Practice;

public class Tv implements Channel{

    private int CurChannel;
    private String name;

    @Override
    public int ChannelUp() {
        CurChannel += 1;
        return CurChannel;
    }

    @Override
    public int ChannelDown() {
        CurChannel -= 1;
        return CurChannel;
    }

    @Override
    public void ChangeCh(int ChNumber) {
        CurChannel = ChNumber;
    }

    public static void main(String[] args) {
        Tv tv = new Tv();
        tv.ChangeCh(19);
        tv.ChannelUp();
        System.out.println(tv.CurChannel);
        tv.ChannelDown();
        System.out.println(tv.CurChannel);
    }
}
