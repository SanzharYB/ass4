import java.util.ArrayList;
import java.util.List;


public class Playlist {
    private List<Song> songs;

    public Playlist() {
        songs = new ArrayList<>();
    }

    public void add(Song song) {
        songs.add(song);
    }

    public Iterator getSeqIter() {
        return new SeqIter(songs);
    }

    public Iterator getShuffleIter() {
        return new ShuffleIter(songs);
    }

    public Iterator getGenreIter(String genre) {
        return new GenreIter(songs, genre);
    }
}
