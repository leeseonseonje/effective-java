package effective.java.effectivejava.item20;

import effective.java.effectivejava.item20.abclass.TestAbstractClass;
import effective.java.effectivejava.item20.abclass.TestAbstractClassExtend;
import effective.java.effectivejava.item20.inter.*;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class Item20Test {

    @Test
    void interfaceTest() {
        TestDefault testDefault = new TestDefaultImpl();

        testDefault.print(1);
        log.info(testDefault.defaultTest("interface"));


    }

    @Test
    void abstractTest() {
        TestAbstractClass testAbstractClass = new TestAbstractClassExtend("PARENT", "CHILD");

        testAbstractClass.print(2);
        log.info(testAbstractClass.testMethod("abstract"));

        testAbstractClass.sing();
    }

    @Test
    void singerSongwriterTest() {

        Singer singer = new SingerImpl();
        Songwriter songwriter = new SongwriterImpl();
        singer.sing();
        songwriter.compose();
    }

    @Test
    void singerSongwriterTestV2() {
        Singer typeSinger = new SingerSongwriterMultiImpl();
        Songwriter typeSongwriter = new SingerSongwriterMultiImpl();
        SingerSongwriterMultiImpl singerSongwriterMulti = new SingerSongwriterMultiImpl();

        typeSinger.sing();
        typeSongwriter.compose();

        singerSongwriterMulti.sing();
        singerSongwriterMulti.compose();
    }

    @Test
    void singerSongwriterTestV3() {
        Singer singerSongwriterTypeSinger = new SingerSongwriterImpl();
        Songwriter singerSongwriterTypeSongwriter = new SingerSongwriterImpl();
        SingerSongwriter singerSongwriter = new SingerSongwriterImpl();

        singerSongwriterTypeSinger.sing();
        singerSongwriterTypeSongwriter.compose();

        singerSongwriter.singerSongwriter();
        singerSongwriter.sing();
        singerSongwriter.compose();

        SingerSongwriterImpl singerSongwriterImpl = new SingerSongwriterImpl();
        singerSongwriterImpl.d();
    }
}
