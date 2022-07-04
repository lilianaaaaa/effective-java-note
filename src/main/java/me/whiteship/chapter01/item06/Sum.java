package me.whiteship.chapter01.item06;

public class Sum {
    private static long sum() {
        // TODO Long을 long으로 변경하여 실행해 보세요.
        //계속 autoboxing 되어서 인스턴스 계속 생성됨
        Long sum = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++)
            sum += i;
        return sum;
    }

    public static void main(String[] args) {
        long start = System.nanoTime();
        long x = sum();
        long end = System.nanoTime();
        System.out.println((end - start) / 1_000_000. + " ms.");//Java 7부터 이런식으로 숫자형태 쓸 수 있음(끊어서 쓰니까 보기 편함)
        System.out.println(x);
    }
}
