public class TraceExample {
    public static void main(String[] args) {
        a();
    }

    private static void a() {
        b();
    }

    private static void b() {
        c();
    }

    private static void c() {
        System.out.println("Метод 'c'");
        for (var trace : Thread.currentThread().getStackTrace()) { // Этот методов возвращает текущий stack trace.
            System.out.println(trace);
        }
    }

}

// в Терминале появится после запуска Run:
// Метод c (цэ)
//java.base/java.lang.Thread.getStackTrace(Thread.java:1610)
//TraceExample.c(TraceExample.java:16)
//TraceExample.b(TraceExample.java:11)
//TraceExample.a(TraceExample.java:7)
//TraceExample.main(TraceExample.java:3)

// Трассировка стека.
// Трассировка стека (от англ. stack trace) — это отчёт о действующих кадрах стека
// в определённый момент времени во время выполнения программы.
// Когда программа запускается, память обычно динамически выделяется в двух местах;
// на стеке и в куче. Память постоянно выделяется на стеке, но не обязательно в куче.
// Каждый раз, когда функция вызывается в программе,
// блок памяти выделяется поверх исполняющегося кадра стека.
