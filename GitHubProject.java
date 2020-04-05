package git;

public class GitHubProject {
	public static void main(String[] args) {
		for (int i = 0; i < 11; i++) {
			try {
				Movies movie = randomMovies();

				System.out
						.println("MovieName #" + i + ":" + movie.getName() + "\n" + 
				                 "Plot" + ":" + movie.plot() + "\n");
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

	public Movies(String name) {
		this.name = name;
	}

	public String plot() {
		return "ashhwekhfkjh";
	}

	public String getName() {
		return name;
	}
}

class IronMan extends Movies {

	public IronMan() {
		super("IRONMAN");
	}

	public String plot() {
		return "ashhwekhfkjh";
	}

}
