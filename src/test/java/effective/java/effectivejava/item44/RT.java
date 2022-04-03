package effective.java.effectivejava.item44;

import org.junit.jupiter.api.Test;

import java.util.*;

import static java.util.stream.Collectors.*;

public class RT {

    class Obj {
        private String IFVERSION;
        private String COMMAND;
        private int num;

        public Obj(String IFVERSION, String COMMAND, int num) {
            this.IFVERSION = IFVERSION;
            this.COMMAND = COMMAND;
            this.num = num;
        }
    }
    @Test
    void test() {
        Map<String, Obj> asdf=new HashMap<>();

        String given = "TYPE=1;PWD=bbbbb;IFVERSION=V0.0.0;COMMAND=NBILL";
        List<String> temp = List.of(
                "TYPE=1;PWD=bbbbb;IFVERSION=V0.0.0;COMMAND=NBILL",
                "TYPE=2;PWD=bbbbb;IFVERSION=V0.0.1;COMMAND=NBILL1",
                "TYPE=3;PWD=bbbbb;IFVERSION=V0.0.2;COMMAND=NBILL2",
                "TYPE=4;PWD=bbbbb;IFVERSION=V0.0.3;COMMAND=NBILL3"
        );

        String s = "TYPE=1;PWD=bbbbb;IFVERSION=V0.0.0;COMMAND=NBILL";
        String s1 = "TYPE=1;PWD=bbbbb;IFVERSION=V0.0.1;COMMAND=NBILL";



        String  ifversion = Arrays.stream(s.split(";")).filter(e -> e.contains("IFVERSION")).findFirst().get();
        String command = Arrays.stream(s.split(";")).filter(e -> e.contains("COMMAND")).findFirst().get();

        Map<Version, Integer> map = new HashMap<>();

        Version version = new Version();
        Arrays.stream(s.split(";")).filter(e -> e.contains("IFVERSION") || e.contains("COMMAND")).forEach(version::addVersion);
        Integer count = map.getOrDefault(version, 0);
        map.put(version, ++count);

        Version v1 = new Version();
        Arrays.stream(s1.split(";")).filter(e -> e.contains("IFVERSION") || e.contains("COMMAND")).forEach(v1::addVersion);
        Integer c1 = map.getOrDefault(v1, 0);
        map.put(v1, ++c1);


        map.keySet().forEach(e -> System.out.println(e + " : " + map.get(e)));


    }
}
class Version {

    String ifVersion;
    String command;

    public void addVersion(String message) {
        if (message.startsWith("IFVERSION")) {
            this.ifVersion = message;
        } else {
            this.command = message;
        }
    }

    @Override
    public String toString() {
        return "Version{" +
                "ifVersion='" + ifVersion + '\'' +
                ", command='" + command + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Version version = (Version) o;
        return Objects.equals(ifVersion, version.ifVersion) && Objects.equals(command, version.command);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ifVersion, command);
    }




    @Test
    void sm_test() {
        List<String> temp = List.of(
                "TYPE=1;PWD=bbbbb;IFVERSION=V0.0.0;COMMAND=NBILL",
                "TYPE=2;PWD=bbbbb;IFVERSION=V0.0.1;COMMAND=NBILL1",
                "TYPE=3;PWD=bbbbb;IFVERSION=V0.0.2;COMMAND=NBILL2",
                "TYPE=4;PWD=bbbbb;IFVERSION=V0.0.3;COMMAND=NBILL3"
        );
//        temp.stream().filter(e -> Arrays.stream(e.split(";")).filter(e1 -> e1.contains("IFVERSION") || ))
    }

    private class Versions {
        private Map<String, Integer> map= new HashMap<>();

        private Versions() {}
        public Map<String,Integer> getInstance() {return map;}
    }


}
