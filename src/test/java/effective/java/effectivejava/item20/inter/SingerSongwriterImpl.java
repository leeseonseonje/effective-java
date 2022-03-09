package effective.java.effectivejava.item20.inter;

public class SingerSongwriterImpl implements SingerSongwriter {

    @Override
    public void sing() {
        System.out.println("SING");
    }

    @Override
    public void singerSongwriter() {
        System.out.println("SINGER SONGWRITER");
    }

    @Override
    public void compose() {
        System.out.println("SONGWRITER");
    }

    public void d() {
        System.out.println("d");
    }
}
