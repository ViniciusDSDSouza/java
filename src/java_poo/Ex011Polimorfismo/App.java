package java_poo.Ex011Polimorfismo;

import java_poo.Ex011Polimorfismo.devFlix.*;

public class App {
    public static void main(String[] args) {
        Video video = new Video("Video de gatinho brincando");
        video.play();

        Filme filme = new Filme("Vingadores");
        filme.play();
        filme.play("Inglês");
        filme.play("Inglês", "Português");
        System.out.println(filme);

    }
}