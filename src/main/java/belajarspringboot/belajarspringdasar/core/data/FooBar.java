package belajarspringboot.belajarspringdasar.core.data;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor //buat property dimasukkan sbg parameter constructor
@Data // supaya tidak perlu membuat gettter,setter
public class FooBar {

    private Foo foo;
    private Bar bar;

}
