package me.whiteship.chapter01.item06;

import java.util.regex.Pattern;

public class RegularExpression {
    // 만약 문자열 하나로만 split한다면 fast path가 있음. 굳이 패턴을 캐싱할 필요가 없다.
    // 문자열 2개 이상일 경우는 캐싱하는게 더 효율적이다
    private static final Pattern SPLIT_PATTERN = Pattern.compile(",");

    public static void main(String[] args) {
        long start = System.nanoTime();
        for (int j = 0; j < 10000; j++) {
            String name = "keesun,whiteship";
            name.split(",");
//            SPLIT_PATTERN.split(name);
        }
        System.out.println(System.nanoTime() - start);
    }
}
//regex101.com
//regexr.com