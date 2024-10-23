import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class ShuffleIter implements Iterator {
    private List<Song> songs;
    private List<Song> shuffledSongs;
    private int pos;

    public ShuffleIter(List<Song> songs) {
        this.songs = songs;
        this.shuffledSongs = new ArrayList<>(songs);
        Collections.shuffle(shuffledSongs, new Random());
        this.pos = 0;
    }

    @Override
    public boolean hasNext() {
        return pos < shuffledSongs.size();
    }

    @Override
    public Song next() {
        return hasNext() ? shuffledSongs.get(pos++) : null;
    }
}
