package se.su.ovning2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;

public class Searcher implements SearchOperations {
  private final Map<Recording, Recording> recordingMap = new HashMap<>();  //Recording är nyckel till Recording
  public Searcher(Collection<Recording> data) {
                                                                          //gör flera hashmaps med olika variabler. behöver ungefär 5 av de. Glöm inte att göra beräkningarna i varje metod för korrespontenta del i searcher klassen.
    Collection<Recording> recordings = data;
  }

   //Hashset är osorterad treeset har en nyckel och en värd.

  @Override
  public long numberOfArtists() {   //den ska returnera antalet artistet med get.size. man får en index hur många platser det är.  numberOfArtists.size.
    //for ( ggfha : djjf){

    
    //}
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'numberOfArtists'");
  }

  @Override
  public long numberOfGenres() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'numberOfGenres'");
  }

  @Override
  public long numberOfTitles() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'numberOfTitles'");
  }

  @Override
  public boolean doesArtistExist(String name) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'doesArtistExist'");
  }

  @Override
  public Collection<String> getGenres() {   //om en recording har en artist
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getGenres'");
  }

  @Override
  public Recording getRecordingByName(String title) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getRecordingByName'");
  }

  @Override
  public Collection<Recording> getRecordingsAfter(int year) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getRecordingsAfter'");
  }

  @Override
  public SortedSet<Recording> getRecordingsByArtistOrderedByYearAsc(String artist) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException(
        "Unimplemented method 'getRecordingsByArtistOrderedByYearAsc'");
  }

  @Override
  public Collection<Recording> getRecordingsByGenre(String genre) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getRecordingsByGenre'");
  }

  @Override
  public Collection<Recording> getRecordingsByGenreAndYear(String genre, int yearFrom, int yearTo) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getRecordingsByGenreAndYear'");
  }

  @Override
  public Collection<Recording> offerHasNewRecordings(Collection<Recording> offered) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'offerHasNewRecordings'");
  }
}
