package com;

abstract class Item1
{
	private int Id;
	private String Book_Name;
	private int No_cop;
	public Item1(int Id,String Book_Name,int No_cop) {
		this.Id=Id;
		this.Book_Name=Book_Name;
		this.No_cop=No_cop;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getBook_Name() {
		return Book_Name;
	}
	public void setBook_Name(String book_Name) {
		Book_Name = book_Name;
	}
	public int getNo_cop() {
		return No_cop;
	}
	public void setNo_cop(int no_cop) {
		No_cop = no_cop;
	}
	
}
abstract class WrittenItem extends Item1
{
	private String Auth_name;
	private int Auth_books;
	String Auth_place;

	public WrittenItem(int Id, String Book_Name, int No_cop) {
		super(Id, Book_Name, No_cop);
		// TODO Auto-generated constructor stub
	}
	
	public WrittenItem(int Id, String Book_Name, int No_cop, String auth_name, int auth_books, String auth_place) {
		super(Id, Book_Name, No_cop);
		Auth_name = auth_name;
		Auth_books = auth_books;
		Auth_place = auth_place;
	}

	public String getAuth_place() {
		return Auth_place;
	}
	public void setAuth_place(String auth_place) {
		Auth_place = auth_place;
	}
	public String getAuth_name() {
		return Auth_name;
	}
	public void setAuth_name(String auth_name) {
		Auth_name = auth_name;
	}
	public int getAuth_books() {
		return Auth_books;
	}
	public void setAuth_books(int auth_books) {
		Auth_books = auth_books;
	}
	
}
class Books extends WrittenItem
{
	public Books(int Id, String Book_Name, int No_cop,String Auth_name,int Auth_books,String Auth_place) {
		super(Id, Book_Name, No_cop);
		// TODO Auto-generated constructor stub
	}

	public String getAuth_place() {
		 return Auth_place="Chennai";
	}
}
class JournalPaper extends WrittenItem
{
	private int year;
	
	public JournalPaper(int Id, String Book_Name, int No_cop,String Auth_name,int Auth_books,String Auth_place) {
		super(Id, Book_Name, No_cop);
		// TODO Auto-generated constructor stub
	}
	
	public JournalPaper(int Id, String Book_Name, int No_cop,String Auth_name,int Auth_books,String Auth_place, int year) {
		super(Id, Book_Name, No_cop);
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
} 
abstract class MediaItem extends Item1
{
	private int Run_time;
	public MediaItem(int Id, String Book_Name, int No_cop) {
		super(Id, Book_Name, No_cop);
		// TODO Auto-generated constructor stub
	}
	
	public MediaItem(int Id, String Book_Name, int No_cop, int run_time) {
		super(Id, Book_Name, No_cop);
		this.Run_time = run_time;
	}

	public int getRun_time() {
		return Run_time;
	}
	public void setRun_time(int run_time) {
		this.Run_time = run_time;
	}	
}
class Video extends MediaItem
{
	
	public Video(int Id, String Book_Name, int No_cop) {
		super(Id, Book_Name, No_cop);
		// TODO Auto-generated constructor stub
	}
	public Video(int Id, String Book_Name, int No_cop,int Run_time, String dir, String genre, int year) {
		super(Id, Book_Name, No_cop);
		this.dir = dir;
		this.Genre = genre;
		this.Year = year;
	}
	private String dir;
	private	String Genre;
	private int Year;
	public String getDir() {
		return dir;
	}
	public void setDir(String dir) {
		this.dir = dir;
	}
	public String getGenre() {
		return Genre;
	}
	public void setGenre(String genre) {
		Genre = genre;
	}
	public int getYear() {
		return Year;
	}
	public void setYear(int year) {
		Year = year;
	}	
	public int getRun_time()
	{
		return 2;
	}
}
class Cd extends MediaItem
{
	
	public Cd(int Id, String Book_Name, int No_cop) {
		super(Id, Book_Name, No_cop);
		// TODO Auto-generated constructor stub
	}
	public Cd(int Id, String Book_Name, int No_cop,int run_time, String artist, String genre) {
		super(Id, Book_Name, No_cop);
		this.artist = artist;
		this.Genre = genre;
	}
	private String artist;
	private String Genre;
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return Genre;
	}
	public void setGenre(String genre) {
		Genre = genre;
	}
	
}

public class Item
{
	public static void main(String str[])
	{
		Cd c=new Cd(123, "Cs", 50, 3, "Justin", "pop");
		c.getArtist();
		c.getGenre();
	}
}










