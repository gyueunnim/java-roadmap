package java_mid.lang.object.equals;

import java.util.Objects;

public class UserV2 {
    private String id;
    public UserV2(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

//    @Override
//    public boolean equals(Object obj) {
//        UserV2 user = (UserV2) obj;
//        return id.equals(user.getId());
//    }

    //정확한 equlas 구현, IDE 자동 생성
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserV2 userV2 = (UserV2) o;
        return Objects.equals(id, userV2.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
