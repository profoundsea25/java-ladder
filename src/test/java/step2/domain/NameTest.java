package step2.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class NameTest {

    @DisplayName("이름은 5글자를 넘길 수 없다.")
    @Test
    public void nameLengthTest() {
        assertThatThrownBy(() -> new Name("테스트이름입니다."))
                .isInstanceOf(IllegalArgumentException.class);
    }

}