package com.blucyn;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    // ---------------------------------------- //
    // Instance variables.

    // Will contain all verbs.
    // Two-dimensional array - dimension one is reserved for verbType 0 while dimension two is reserved for verbType 1.
    public static String[][] verbs;

    // Will contain all celebrities.
    public static String[] celebrities;
    // Will contain all fictionals.
    public static String[] fictionals;


    // ---------------------------------------- //
    // Main Method.

    public static void main(String[] args) {



        // Assign values to verbs array.
        verbs = new String[][]{

                // Type 0 verbs.
                {
                        "a pizza party", "piña coladas", "a rave", "a pool party", "an orgy", "coffee", "a romantic dinner", "a sleepover", "moving day", "filming a porno",
                        "a movie marathon", "playing Smash Bros", "playing UNO", "poker night", "taking a bath", "Taco Tuesday", "breakfast", "lunch", "dinner", "stepping on a LEGO",
                },

                // Type 1 verbs.
                {
                        "going to a funeral", "having sex", "modeling", "doing drag", "going to Disneyland", "going to Asia", "going to prom", "trying hot sauce", "watching a movie", "a school play",
                        "an apology tour", "a beauty pageant", "field day", "going to the spa", "going clothes shopping", "going back to school shopping", "going grocery shopping", "going bar hopping", "playing video games", "binge-eating",
                        "playing chess", "farming", "meeting the in-laws", "watching Shrek 2", "playing Bean Boozled", "playing a D&D campaign", "going to church", "going to Chuck-E-Cheese", "making a film", "doing interpretive dance",
                        "embarking on an interstellar voyage", "a Target run with", "picking up chicks", "getting matching tattoos", "doing the can-can", "walking into a haunted house", "going on America's Got Talent", "replacing a lightbulb",
                        "trying to sell bathwater",
                }

        };

        // Assign values to celebrities array.
        celebrities = new String[]{

                "Tom Cruise", "Frank Sinatra", "Michael J. Fox", "Adam Sandler", "Jim Carrey", "Adam West", "Carrie Fisher", "Gene Kelly", "Debbie Reynolds", "J. K. Simmons",
                "Dunkey", "Pewdiepie", "Daniel Radcliffe", "David Hyde Pierce", "Kelsey Grammer", "Paul McCartney", "John Lennon", "Yoko Ono", "George Harrison", "Ringo Starr",
                "Gwyneth Paltrow", "Robert Downey Jr.", "Tom Holland", "Zendaya", "Pierce Brosnan", "Jacksepticeye", "Meryl Streep", "Emma Stone", "Ryan Gosling", "Andrew Garfield",
                "Dan Castellaneta", "Jim Cummings", "Tara Strong", "Jim Henson", "Danny DeVito", "Taylor Swift", "Ariana Grande", "Jessica Biel", "Jennifer Grey", "Christopher Lloyd",
                "Harrison Ford", "Bill Murray", "Mark Hamill", "George Lucas", "Quentin Tarantino", "Harvey Weinstein", "Kevin Spacey", "Dennis Quaid", "Bob Hope", "Mark Zuckerberg",
                "Bing Crosby", "Tim Allen", "Seth Macfarlane", "Jason Segal", "Jason Alexander", "Miley Cyrus", "Billy Ray Cyrus", "Angelina Jolie", "Matthew McConaughey", "Mila Kunis",
                "Leonardo diCaprio", "Britney Spears", "Courtney Cox", "Sarah Silverman", "Sarah Jessica Parker", "Jessica Alba", "Dan Povenmire", "Matt Groening", "Swampy Marsh", "Alyssa Milano",
                "Emma Watson", "Rupert Grint", "Zooey Deschanel", "Will Ferrell", "Chris Pratt", "Chris Hemsworth", "Chris Evans", "Chris Pine", "Johnny Depp", "Dakota Fanning",
                "Elle Fanning", "The Olsen twins", "Mary-Kate Olsen", "Ashley Olsen", "Elizabeth Olsen", "Lindsay Lohan", "Arnold Schwarzenegger", "Joe Biden", "Bill Clinton", "Donald Trump",
                "Barack Obama", "Michelle Obama", "Will Smith", "Alfonso Ribero", "Bill Cosby", "Brad Pitt", "Charlie Chaplin", "Walt Disney", "Morgan Freeman", "Tom Hanks",
                "Hugh Jackman", "Anne Hathaway", "Kate Winslet", "Matt Damon", "Sylvester Stallone", "Clint Eastwood", "Cameron Diaz", "George Clooney", "Steven Spielberg", "Robert De Niro",
                "Audrey Hepburn", "Al Pacino", "Russell Crowe", "Liam Neeson", "Patrick Stewart", "Mark Wahlberg", "Beyoncé", "Albert Einstein", "Natalie Portman", "Sean Connery",
                "Queen Elizabeth", "Orlando Bloom", "Tim Burton", "Corey Burton", "Corey Feldman", "Corey Haim", "Dwayne \"The Rock\" Johnson", "Jackie Chan", "Scarlett Johansson", "Heath Ledger",
                "Kurt Cobain", "Kobe Bryant", "LeBron James", "Edward Norton", "Neil deGrasse Tyson", "Tom Bergeron", "Simon Cowell", "Gordon Ramsey", "Keira Knightley", "Winona Ryder",
                "Bradley Cooper", "Julia Roberts", "Nicolas Cage", "Daniel Craig", "Keanu Reeves", "Ian McKellan", "Halle Berry", "Bruce Willis", "Samuel L. Jackson", "Ben Stiller",
                "Robin Williams", "Antonio Banderas", "Denzel Washington", "Steve Carrell", "Amy Poehler", "Shia LaBeouf", "James Franco", "Mel Gibson", "Vin Diesel", "Zoe Saldaña ",
                "Selena Gomez", "Millie Bobby Brown", "Noah Schnapp", "Owen Wilson", "Tom Hiddleston", "Christian Bale", "Peter Jackson", "Michael Jackson", "Sandra Bullock", "Bruce Lee",
                "Drew Barrymore", "Macaulay Culkin", "Jack Nicholson", "Sigourney Weaver ", "Jake Gyllenhaal", "Maggie Gyllenhaal", "Katie Holmes", "Nancy Cartwright", "Blake Lively", "Ryan Reynolds",
                "Jason Statham", "Lucille Ball", "Kate Beckinsale", "Rowan Atkinson", "John Travolta", "Dean Martin", "Marlon Brando", "John Stamos", "Jodie Sweetin", "Channing Tatum",
                "Ben Affleck", "Jennifer Aniston", "James Cameron", "Kirk Cameron", "Rachel McAdams", "Amanda Bynes", "Tommy Wiseau", "Laurence Fishburne", "The Wachowski sisters", "Bob Hoskins",
                "Dan Aykroyd", "Matthew Broderick", "Craig T. Nelson", "Dick Van Dyke", "Jennifer Garner", "Tom Kenny", "Stephen Hillenburg", "Kristin Stewart", "Robert Pattinson", "Paris Hilton",
                "Carol Baskin", "Weird Al Yankovic", "Betty White", "Bea Arthur", "Rue McClanahan", "Estelle Getty", "John Mahoney", "Tucker Carlson", "Joe Rogan", "Seth Rogen",
                "Ann-Margret", "Danny Elfman", "Nancy Sinatra", "David Schwimmer", "Jim Parsons", "John Williams", "Stevie Wonder", "Carly Simon", "Rick Astley", "Tiny Tim",
                "Thom Yorke", "Chris Martin", "Adam Levine", "Justin Bieber", "Dr. John", "Hall & Oates", "Freddy Mercury", "The Jackson 5", "Billy Joel", "Elton John",
                "Buckner & Garcia", "Brendon Urie", "Billie Eilish", "Whitney Houston", "Rihanna", "Jennifer Lopez", "Mariah Carey", "Lady Gaga", "Katy Perry", "Sam Smith",
                "Eminem", "Zachary Levi", "Mandy Moore", "Elvis Presley", "Leah Remini", "Ed Sheeran", "Adele", "Bruno Mars", "Prince", "Alicia Keys",
                "Lorde", "Aretha Franklin", "Louis Armstrong", "Neil Armstrong", "Jesse McCartney", "Madonna", "Christina Agulera", "Benedict Cumberbatch", "Dolly Parton", "Bob Dylan",
                "Jimi Hendrix", "Johnny Cash", "Harry Styles", "Janet Jackson", "Shawn Mendes", "JAY-Z", "Kanye West", "John Legend", "Justin Timberlake", "Gwen Stefani",
                "Kelly Clarkson", "Björk", "Drake", "Marshawn Lynch", "Tom Brady", "Russell Wilson", "Molly Ringwald", "Marilyn Monroe", "Judy Garland", "Hedy Lamarr",
                "Boris Johnson", "Vladimir Putin", "Toby Fox", "Hugh Hefner", "Belle Delphine", "Jeffrey Epstein's"

        };

        // Assign values to celebrities array.
        fictionals = new String[]{

                "Cookie Monster", "Elmo", "Big Bird", "Gex", "Captain Stubing", "Frasier Crane", "Homer Simpson", "Marge Simpson", "Bart Simpson", "Lisa Simpson",
                "Maggie Simpson", "Fred Flintstone", "Sonic the Hedgehog", "Scrappy-Doo", "Scooby-Doo", "Donald Duck", "Roger Rabbit", "Stewie Griffin", "Batman", "the Joker",
                "Indiana jones", "Jack Sparrow", "Harry Potter", "Draco Malfoy", "Snape", "Dumbledore", "Dobby", "Hagrid", "Doc Brown", "Marty McFly",
                "Peter Pan", "Aladdin", "Lightning McQueen", "Shrek", "Barbie", "James Bond", "Princess Peach", "Peter Griffin", "Luke Skywalker", "Princess Leia",
                "Thanos", "Tony Stark", "Thor", "the Brady Bunch", "Alfred Pennyworth", "Mike Wasowzki", "Bruce Wayne", "Buzz Lightyear", "Mr. Potato Head", "Pac-Man",
                "SpongeBob", "Squidward", "Plankton", "Pikachu", "Ash Ketchum", "Jimmy Neutron", "Carl Wheezer", "Chicken Little", "Atticus Finch", "Scrooge McDuck",
                "Peter Griffin", "Heinz Doofenshmirtz", "Glenn Quagmire", "Sans", "Handy Manny", "Peppa Pig", "Daddy Pig", "C-3PO", "R2D2", "Yoda",
                "Merlin", "King Arthur", "Steven Universe", "Uncle Grandpa", "Deadpool", "Darkwing Duck", "Bender", "Philip J. Fry", "Hank Hill", "Bill Cipher",
                "Bert & Ernie", "Oscar the Grouch", "Hermione Granger", "Eric Cartman", "Kirby", "The Lone Ranger", "Mickey Mouse", "Inspector Gadget",

        };

        // Generate and print 100 gex quotes as a test.
        ArrayList<String> gexDex = new ArrayList<>();
        for (int i = 0; i < 100; i++) {

            String gex = getGext();
            if(!gexDex.contains(gex))
            {
                gexDex.add(gex);
            }

        }

        // Collections.sort(gexDex);

        for (String gex : gexDex) {

            System.out.println(gex);

        }

    }


    // ---------------------------------------- //
    // gex :O

    public static String getGext(){

        // Return a special event at a very low chance.
        if(Math.random() < .006)
        {
            return getSpecialGext();
        }

        // There are two types of verbs.
        // The values listed below of variable verbType will decide which to use.
        // 0 --> Those that follow _____ at ____'s house.
        // 1 --> Others that follow _____ with ____.
        int verbType = (int)(Math.random() * 2);
        // Assemble parts.
        return getIntro() + getVerb(verbType) + getCeleb(verbType);

    }

    public static String getSpecialGext(){

        int numOfEvents = 4;
        return switch ((int) (Math.random() * numOfEvents)) {
            case 0 -> getIntro() + "trying to sell " + getCeleb(0) + " bathwater.";
            case 1 -> getIntro() + "binge eating with Britney Spears.";
            case 2 -> getIntro() + "doing cocaine with Robert Downey Jr.";
            case 3 -> getIntro() + "having sex at Jeffrey Epstein's.";
            default -> "ERRATAS";
        };

    }


    // ---------------------------------------- //
    // Helper Methods.

    // Evaluates the current amount of gex resources.
    public static void printEvaluation(){

        double searchChance = .01;

        // Print how many total combinations there are.
        int totalQuotes = (verbs[0].length + verbs[1].length) * celebrities.length;
        System.out.println("There are a total of " + totalQuotes + " possible quotes.");
        System.out.println("There are also:");
        System.out.println("\t- " + verbs[0].length + " type 0 verbs");
        System.out.println("\t- " + verbs[1].length + " type 1 verbs");
        System.out.println("\t- " + celebrities.length + " celebrities");

        double chance = 1.0 / totalQuotes;
        // Optional code block to make the chance of repeat quotes equal to the chance of getting similar quotes.
        // WARNING: ALTHOUGH ENABLING THIS WILL MAKE PROJECTIONS MUCH MORE SAFE, IT WILL ALSO MAKE THEM MUCH MORE STRICT IN EVALUATION.
        // chance = probabilisticOr(probabilisticOr(1.0 / verbs[0].length, 1.0 / verbs[1].length), 1.0 / celebrities.length);
        System.out.println("There is a " + chance * 100 + "% chance to get a repeat quote in one test.");

        double baseChance = 1.0 / totalQuotes;
        int i = 0;
        while(chance < searchChance)
        {
            i++;
            chance = probabilisticOr(chance, baseChance);
        }
        System.out.println("In order to get a " + searchChance * 100 + "% chance of getting a repeat quote, you must read " + i + " quotes.");

    }

    // Adds two probabilities.
    public static double probabilisticOr(double a, double b){

        return a + b - a * b;

    }
    // Repeatedly adds a single given probability to itself a given amount of times.
    public static double loopedProbOr(double chance, int times){

        double baseChance = chance;
        for (int i = 0; i < times; i++)
        {
            chance = probabilisticOr(chance, baseChance);
        }
        return chance;

    }

    // Special method used only when converting String lists from the Google Doc to an array initializer.
    // (since i dont want to do it manually)
    public static void printAsInitializer(String verbsRaw){

        int i = 0;
        for(String s : verbsRaw.split("\n"))
        {
            System.out.print("\"" + s + "\", ");
            if(++i % 10 == 0){
                System.out.println();
            }
        }

    }

    // Each method generates a portion of a gex quote.
    public static String getIntro(){

        // Begin the quote and append a random beginning to the end.
        return "This is " + (Math.random() > .5? "like" : "worse than") + " ";

    }
    public static String getVerb(int verbType){

        // Return a random verb with its associated follow up.
        return randElement(verbs[verbType]) + " " + (verbType == 0? "at" : "with") + " ";

    }
    public static String getCeleb(int verbType){

        // Return a random verb with its associated follow up.
        String celeb = randElement(Math.random() < .04? fictionals : celebrities);
        if(verbType == 0)
        {
            celeb += "'s";
        }
        return celeb;

    }

    // Returns a random String element from a provided String array.
    public static String randElement(String[] x){

        return x[(int)(Math.random() * x.length)];

    }


}
