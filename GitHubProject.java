package git;

public class GitHubProject {
	public static void main(String[] args) {
		for (int i = 0; i < 11; i++) {
			try {
				Movies movie = randomMovies();


				System.out.println("MovieName #" + i + ":" + movie.getName() + "\n" + 
				                 "Plot" + ":" + movie.plot() + "\n"+"HERO"+":"+movie.getHero()+"\n");

				

			} catch (NullPointerException np) {
				System.out.println("NO Movies Available");
			}
		}
	}

	public static Movies randomMovies() throws NullPointerException {
		int rand = (int) (Math.random() * 5) + 1;
		System.out.println("Random Number Generated was" + rand);
		switch (rand) {
		case 1:
			return new IronMan();
		}
		return null;
	}
}

class Movies {

	private String name;
	private String hero;


	public Movies(String name, String hero) {
		this.name = name;
		this.hero = hero;
	}

	public String plot() {
		return "ashhwekhfkjh";
	}

	public String getName() {
		return name;
	}
	public String getHero() {
		return hero;
	}
}

class IronMan extends Movies {

	public IronMan() {
		super("IRONMAN","Robert Downy JR");

	}

	public String plot() {
		return "ashhwekhfkjh";
	}

}

class BLackPanther extends Movies {

	public BLackPanther() {
		super("BLACKPANTHER","Chadwick Boseman");

	}

	public String plot() {
		return "Man With Metal Suit and Exteam knowledge";
	}

}
class Thor extends Movies {

	public Thor() {
		super("THOR", "Cris Hamsworth");
	}

	public String plot() {
		return "Thunder God with Hammer";
	}
class CaptainAmerica extends Movies {

	public CaptainAmerica() {
		super("CAPTAINAMERICA", "Cris Havens");
	}

	public String plot() {
		return "Captain America: The First Avenger with Vibrenium Shield";
	}
    class Hulk extends Movies {

	public Hulk() {
		super("HULK", "MArk Raffelow");
	}

	public String plot() {
		return "man with effected by Gama Rediation make him to beast when get angry";
	}

}
