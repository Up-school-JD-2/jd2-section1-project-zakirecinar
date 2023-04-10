
public class Movie {

	protected int movieId;
	protected String movieName;
	protected String director;
	protected String artist;
	protected String time;
	protected String type;
	protected String explanation;
	public Movie() {
		
	}
	public Movie(int movieId, String movieName, String director, String artist, String time, String type,String explanation) {
		this.movieId = movieId;
		this.movieName = movieName;
		this.director = director;
		this.artist = artist;
		this.time = time;
		this.type = type;
		this.explanation = explanation;
	}
	public int getMovieId() {
		return movieId;
	}
	
	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getExplanation() {
		return explanation;
	}
	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}
	@Override
	public String toString() {
		return "--Movies--\n [movieId=" + movieId + ", movieName=" + movieName + ", director=" + director + ", artist="
				+ artist + ", time=" + time + ", type=" + type + ", explanation=" + explanation + "]";
	}
	
	
}
