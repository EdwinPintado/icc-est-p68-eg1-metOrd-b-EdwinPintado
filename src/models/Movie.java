package models;

public class Movie {
  private String title;
  private int Year;
  
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public int getYear() {
    return Year;
  }
  public void setYear(int year) {
    Year = year;
  }
  public Movie(String title, int year) {
    this.title = title;
    Year = year;
  }
  @Override
  public String toString() {
    return "Movie [title=" + title + ", Year=" + Year + "]";
  }
  
  
}
