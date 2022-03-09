package effective.java.effectivejava.item20.inter;

public class SingerSongwriterMultiImpl implements Singer, Songwriter {
    @Override
    public void sing() {
        System.out.println("SING");
    }

    @Override
    public void compose() {
        System.out.println("SONGWRITER");
    }
}
