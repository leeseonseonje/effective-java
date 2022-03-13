package effective.java.effectivejava.item31.code;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@RequiredArgsConstructor
public class BoundedWildCard<E> {

    private List<E> list;


    public List<E> genericTest(List<E> list) {
        this.list = list;
        return list;
    }

    public List<? extends E> extendsTest(List<? extends E> list) {
        list = this.list;
        return list;
    }

    public List<? super E> superTest(List<? super E> list) {
        list = this.list;
        return list;
    }
}
