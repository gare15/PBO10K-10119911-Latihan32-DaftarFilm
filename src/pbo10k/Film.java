/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k;

/**
 *
 * @author tegar
 */
public class Film {
    public String filmName, filmGenre;
    public Double filmRating;
    public int filmDuration;

    public void nowPlaying() {
        System.out.println("Judul Film\t\t: "+filmName);
        System.out.println("Genre Film\t\t: "+filmGenre);
        System.out.printf("Rating Film\t\t: %.1f%n",filmRating);
        System.out.printf("Duration Film\t: %d Menit%n%n",filmDuration);
    }
}
