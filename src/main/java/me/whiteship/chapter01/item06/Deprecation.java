package me.whiteship.chapter01.item06;

public class Deprecation {

    /**
     * @deprecated in favor of
     * {@link #Deprecation(String)}
     */
    @Deprecated(forRemoval = true, since = "1.2")//앞으로 삭제될 예정이다~ 1.9부터 생김
    public Deprecation() {
    }

    private String name;

    public Deprecation(String name) {
        this.name = name;
    }

    //annotation processor:
    //컴파일 경고 메세지를 보내줌
}
