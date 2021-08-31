package example.spring;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicPlayer {

    private final Random randomGenerator;
    private List<Music> catalogue;

    public MusicPlayer()
    {
        catalogue = new ArrayList<>();
        randomGenerator = new Random();
    }

    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setMusicList(List<Music> musicList) {
        this.catalogue = musicList;
    }

    public void playMusicList() {
        int index = randomGenerator.nextInt(catalogue.size());
        Music randomItem = catalogue.get(index);
        System.out.println("Our recommendation this week: " + randomItem.getSong());
    }


//    private Music music;
//
//    private String name;
//    private int volume;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getVolume() {
//        return volume;
//    }
//
//    public void setVolume(int volume) {
//        this.volume = volume;
//    }
//
//    // IoC
//    public MusicPlayer(Music music) {this.music = music;}
//
//    public MusicPlayer() {}
//
//    public void setMusic(Music music) {this.music = music;}
//
//    public void playMusic() {System.out.println("Playing: " + music.getSong());}
}
