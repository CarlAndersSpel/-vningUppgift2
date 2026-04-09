package se.su.ovning2;

import java.util.Collection;
import java.util.Objects;
import java.util.Set;
//se till att den här klassen ska gå till hashmapen i Exercicetest2.

//ska överskugga två metoder.
public class Recording {
  private final int year;
  private final String artist;
  private final String title;
  private final String type;
  private final Set<String> genre;
  //private final Map<String> key = new HashMap<>();

  public Recording(String title, String artist, int year, String type, Set<String> genre) {
    this.title = title;
    this.year = year;
    this.artist = artist;
    this.type = type;
    this.genre = genre;
    
  }

  public String getArtist() {
    return artist;
  }

  public Collection<String> getGenre() {
    return genre;
  }

  public String getTitle() {
    return title;
  }

  public String getType() {
    return type;
  }

  public int getYear() {
    return year;
  }

  @Override
  public String toString() {
    return String.format("{ %s | %s | %s | %d | %s }", artist, title, genre, year, type);
  }

  @Override
  public boolean equals(Object obj){
//är de samma t.ex. year =  year
        if (this == obj){
          return true;
        }
        Recording that = (Recording) obj;
        return year == that.year && artist == that.artist && title == that.title;
}

@Override
public int hashCode(){
   return Objects.hash(year, artist, title);
}


}
