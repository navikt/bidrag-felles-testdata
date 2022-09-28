package no.nav.bidrag.felles.test.data.person;

import no.nav.bidrag.felles.test.data.RandomTestData;

public class NavnListe {
    public static String randomJentenavn() {
        return RandomTestData.random().oneOf(JENTENAVN);
    }

    public static String randomGuttenavn() {
        return RandomTestData.random().oneOf(GUTTENAVN);
    }

    public static String randomFornavn(Kjonn kjonn) {
        return Kjonn.KVINNE.equals(kjonn)
                ? randomJentenavn()
                : randomGuttenavn();
    }

    public static String randomEtternavn() {
        return RandomTestData.random().oneOf(ETTERNAVN);
    }

    private static final String[] JENTENAVN = {
            "Aagot", "Aase", "Aashild", "Aasta", "Abigail", "Ada", "Adele", "Adelen", "Adelina", "Adriana", "Agata", "Agathe", "Agne", "Agnes", "Agnete", "Agnethe", "Agnieszka", "Aida", "Aileen", "Ailin", "Aina",
            "Aisha", "Alba", "Aleksandra", "Alette", "Alexandra", "Alfhild", "Alice", "Alicia", "Alicja", "Alida", "Alina", "Aline", "Alisa", "Alise", "Alma", "Alva", "Alvhild", "Alvilde", "Amal", "Amalia", "Amalie",
            "Amanda", "Amelia", "Amelie", "Amina", "Amira", "Amna", "Amy", "Ana", "Anastasia", "Anbjørg", "Andrea", "Andrine", "Ane", "Aneta", "Anett", "Anette", "Angela", "Angelica", "Angelika", "Angelina", "Anine",
            "Anisa", "Anita", "Anja", "Anlaug", "Ann", "Ann-Christin", "Ann-Helen", "Ann-Karin", "Ann-Kristin", "Ann-Mari", "Anna", "Annabelle", "Annbjørg", "Anne", "Anne-Berit", "Anne-Britt", "Anne-Grete",
            "Anne-Grethe", "Anne-Kari", "Anne-Karin", "Anne-Kristin", "Anne-Lene", "Anne-Lise", "Anne-Mari", "Anne-Marie", "Anne-Marit", "Anne-Mette", "Anne-Sofie", "Anneli", "Annelise", "Annette", "Anni", "Annie",
            "Annika", "Anniken", "Annlaug", "Anny", "Antonia", "Aria", "Ariana", "Ariel", "Arna", "Arnhild", "Arya", "Asbjørg", "Asha", "Aslaug", "Asma", "Asta", "Astri", "Astrid", "Aud", "Audhild", "Audny",
            "Aurora", "Ausra", "Ava", "Aya", "Ayan", "Ayla", "Aylin", "Ayse", "Azra", "Barbara", "Barbro", "Beata", "Beate", "Beathe", "Beatrice", "Belinda", "Bella", "Benedicte", "Benedikte", "Bente", "Benthe",
            "Bergljot", "Berit", "Bertha", "Bertine", "Betina", "Bettina", "Betty", "Bianca", "Birgit", "Birgitta", "Birgitte", "Birte", "Birthe", "Bjørg", "Bodil", "Borghild", "Borgny", "Bozena", "Brit", "Brita",
            "Brith", "Britt", "Brynhild", "Bushra", "Camilla", "Carina", "Carine", "Carla", "Carmen", "Carolina", "Caroline", "Cassandra", "Catharina", "Catherine", "Cathrin", "Cathrine", "Catrine", "Cecilia",
            "Cecilie", "Celia", "Celina", "Celine", "Cesilie", "Charlotte", "Christel", "Christiane", "Christin", "Christina", "Christine", "Cicilie", "Cindy", "Clara", "Claudia", "Connie", "Cornelia", "Cristina",
            "Dagmar", "Dagny", "Dagrun", "Daiva", "Dalia", "Dana", "Daniela", "Daniella", "Danuta", "Daria", "Deborah", "Desiree", "Diana", "Dina", "Dominika", "Doris", "Dorota", "Dorthe", "Dorthea", "Ea", "Ebba",
            "Edda", "Edel", "Eden", "Edit", "Edita", "Edith", "Edle", "Edna", "Edyta", "Egle", "Eileen", "Eilen", "Eilin", "Eir", "Eira", "Eiril", "Eirill", "Eirin", "Eivor", "Ekaterina", "Elbjørg", "Eldbjørg",
            "Eldrid", "Elea", "Eleah", "Elen", "Elena", "Elfrid", "Eli", "Eliana", "Elida", "Elin", "Elina", "Eline", "Elinor", "Elisa", "Elisabet", "Elisabeth", "Elise", "Eliza", "Elizabeth", "Ella", "Elle",
            "Ellen", "Ellie", "Ellinor", "Elly", "Elma", "Elna", "Elsa", "Else", "Else-Marie", "Elsie", "Elvira", "Elzbieta", "Ema", "Embla", "Emelie", "Emely", "Emilia", "Emilie", "Emilija", "Emily", "Emina",
            "Emine", "Emma", "Emmeli", "Emmeline", "Emmy", "Enya", "Erica", "Erika", "Erle", "Erna", "Ester", "Esther", "Eva", "Evelina", "Evelyn", "Evy", "Ewa", "Ewelina", "Fadumo", "Fanny", "Farah", "Fatemeh",
            "Fatima", "Fatma", "Felicia", "Filippa", "Fiona", "Fredrikke", "Freya", "Frid", "Frida", "Fride", "Frøya", "Frøydis", "Gabriela", "Gabriele", "Gabriella", "Gabrielle", "Galina", "Gerd", "Gerda", "Gina",
            "Gine", "Gintare", "Gitte", "Gjertrud", "Gloria", "Grace", "Grazyna", "Greta", "Grete", "Gretha", "Grethe", "Gro", "Gry", "Gudny", "Gudrun", "Gudveig", "Gun", "Gunda", "Gunhild", "Gunn", "Gunnbjørg",
            "Gunnhild", "Gunnlaug", "Gunnvor", "Gunvor", "Guri", "Guro", "Gyda", "Gøril", "Hafsa", "Hala", "Haldis", "Halima", "Halldis", "Hamdi", "Hana", "Hanan", "Hanna", "Hannah", "Hanne", "Harriet", "Hatice",
            "Hedda", "Hedvig", "Hege", "Heidi", "Helen", "Helena", "Helene", "Helga", "Helin", "Helle", "Hennie", "Henny", "Henriette", "Henrikke", "Herborg", "Herdis", "Hermine", "Hiba", "Hild", "Hilda", "Hilde",
            "Hildegunn", "Hildur", "Hjørdis", "Hodan", "Hong", "Huda", "Hulda", "Iben", "Ida", "Idun", "Idunn", "Ieva", "Ilona", "Iman", "Ina", "Ine", "Ines", "Inga", "Ingebjørg", "Ingeborg", "Ingelin", "Inger",
            "Inger-Johanne", "Inger-Lise", "Inger-Marie", "Ingerid", "Ingfrid", "Inghild", "Ingjerd", "Ingri", "Ingrid", "Ingrida", "Ingun", "Ingunn", "Ingvil", "Ingvild", "Ingvill", "Iqra", "Iren", "Irena", "Irene",
            "Irina", "Iris", "Irma", "Irmelin", "Iryna", "Isa", "Isabel", "Isabell", "Isabella", "Isabelle", "Iselin", "Ivana", "Iwona", "Izabela", "Jacqueline", "Jamila", "Jana", "Jane", "Janet", "Janicke",
            "Janita", "Janne", "Janniche", "Jannicke", "Jannike", "Jasmin", "Jasmina", "Jasmine", "Jeanett", "Jeanette", "Jelena", "Jenni", "Jennie", "Jennifer", "Jenny", "Jessica", "Jette", "Jill", "Joan", "Joanna",
            "Jofrid", "Johanna", "Johanne", "Jolanta", "Jorid", "Jorun", "Jorunn", "Josefine", "Josephine", "Judit", "Judith", "Julia", "Juliana", "Juliane", "Julianne", "Julie", "June", "Juni", "Jurgita", "Justyna",
            "Kaia", "Kaisa", "Kaja", "Kajsa", "Kamila", "Kamilla", "Karen", "Kari", "Kari-Anne", "Karianne", "Karin", "Karina", "Karine", "Karla", "Karolina", "Karoline", "Katarina", "Katarzyna", "Kate", "Katharina",
            "Kathe", "Katherine", "Kathinka", "Kathrin", "Kathrine", "Katinka", "Katja", "Katrin", "Katrina", "Katrine", "Kelly", "Kerstin", "Khadija", "Kim", "Kine", "Kinga", "Kira", "Kirsten", "Kirsti", "Kitty",
            "Kjellaug", "Kjellfrid", "Kjellrun", "Kjersti", "Kjerstin", "Klara", "Klaudia", "Kornelia", "Kristel", "Kristi", "Kristiane", "Kristin", "Kristina", "Kristine", "Krystyna", "Laila", "Lajla", "Lana",
            "Lara", "Larisa", "Laura", "Lea", "Leah", "Leikny", "Leila", "Lena", "Lene", "Leni", "Leona", "Leonora", "Leyla", "Liana", "Lidia", "Lilian", "Liliana", "Lilja", "Lill", "Lilli", "Lillian", "Lilly",
            "Lily", "Lin", "Lina", "Linda", "Lindis", "Line", "Linea", "Linn", "Linnea", "Lisa", "Lisbet", "Lisbeth", "Lise", "Liss", "Liv", "Liva", "Live", "Livia", "Liz", "Liza", "Lone", "Lotta", "Lotte", "Louise",
            "Lovise", "Lucia", "Lucy", "Luna", "Lydia", "Lykke", "Ma", "Madeleine", "Madelen", "Madelene", "Magda", "Magdalena", "Magna", "Magnhild", "Magni", "Magny", "Mai", "Mai-Britt", "Maia", "Maiken", "Maj",
            "Maja", "Malak", "Malena", "Malene", "Malgorzata", "Mali", "Malika", "Malin", "Maren", "Margaret", "Margareth", "Margarita", "Margit", "Margot", "Margrete", "Margrethe", "Margun", "Margunn", "Mari",
            "Mari-Ann", "Maria", "Mariam", "Marian", "Mariana", "Mariann", "Marianne", "Marie", "Mariel", "Mariell", "Marielle", "Marija", "Marina", "Marion", "Marit", "Marita", "Marlen", "Marlene", "Marry", "Marta",
            "Marte", "Martha", "Marthe", "Marthine", "Martina", "Martine", "Martyna", "Marwa", "Mary", "Mary-Ann", "Maryam", "Maryan", "Marzena", "Mathea", "Mathilda", "Mathilde", "Matilda", "Matilde", "Maud", "May",
            "May-Britt", "May-Liss", "Maya", "Maylen", "Medina", "Melanie", "Melina", "Melinda", "Melissa", "Merete", "Merethe", "Mette", "Mia", "Michaela", "Michelle", "Mie", "Mila", "Mildrid", "Milena", "Milla",
            "Mille", "Mina", "Mira", "Miranda", "Miriam", "Mirjam", "Molly", "Mona", "Monica", "Monika", "Muna", "My", "Møyfrid", "Målfrid", "Nada", "Nadia", "Nadine", "Nadja", "Naima", "Najma", "Nancy", "Nanna",
            "Naomi", "Natalia", "Natalie", "Natasha", "Nathalie", "Nellie", "Nelly", "Ngoc", "Nicole", "Nicoline", "Nikola", "Nikoline", "Nina", "Ninni", "Noor", "Nora", "Norah", "Norma", "Norunn", "Nour", "Nova",
            "Oda", "Oddbjørg", "Oddlaug", "Oddny", "Oddrun", "Oddveig", "Oksana", "Olaug", "Olava", "Olea", "Olena", "Olga", "Oline", "Olivia", "Oliwia", "Othelie", "Othilie", "Otilie", "Patricia", "Patrycja",
            "Paula", "Paulina", "Pauline", "Peggy", "Pernille", "Petra", "Phuong", "Pia", "Rabia", "Rachel", "Ragna", "Ragne", "Ragnhild", "Ragni", "Rahel", "Rahma", "Rakel", "Ramona", "Rana", "Randi", "Rania",
            "Rannveig", "Ranveig", "Rasa", "Rebecca", "Rebecka", "Rebekka", "Regina", "Regine", "Reidun", "Reidunn", "Renata", "Renate", "Renathe", "Renee", "Rigmor", "Rikke", "Rina", "Rita", "Ronja", "Rosa", "Rose",
            "Runa", "Rut", "Ruta", "Ruth", "Rønnaug", "Saba", "Sabina", "Sabine", "Sabrina", "Sadia", "Safia", "Saga", "Sahar", "Sahra", "Saima", "Salma", "Samantha", "Samira", "Sana", "Sandra", "Sanja", "Sanna",
            "Sanne", "Sara", "Sarah", "Savannah", "Selam", "Selina", "Seline", "Selma", "Senait", "Serina", "Serine", "Sharon", "Sheila", "Shirin", "Sidra", "Sidsel", "Sienna", "Sigfrid", "Signe", "Signy", "Sigrid",
            "Sigrun", "Sigrunn", "Siham", "Silja", "Silje", "Silvia", "Simona", "Simone", "Sina", "Sine", "Siren", "Siri", "Siril", "Sissel", "Siv", "Siw", "Snefrid", "Sofia", "Sofie", "Sofija", "Sol", "Solbjørg",
            "Solfrid", "Solgunn", "Solrun", "Solveig", "Solvor", "Solvår", "Sonia", "Sonja", "Sophia", "Sophie", "Stella", "Stephanie", "Stina", "Stine", "Sumaya", "Sunniva", "Susan", "Susann", "Susanna", "Susanne",
            "Suzanne", "Svanhild", "Svetlana", "Sylvi", "Sylvia", "Sylwia", "Synne", "Synnøve", "Synøve", "Sølvi", "Tale", "Tamara", "Tanja", "Tanya", "Tara", "Tatiana", "Tatjana", "Tea", "Teresa", "Terese", "Thale",
            "Thanh", "Thea", "Thelma", "Theresa", "Therese", "Thi", "Thilde", "Thora", "Thu", "Thuy", "Tia", "Tilde", "Tilla", "Tina", "Tine", "Tiril", "Tirill", "Tomine", "Tone", "Tonje", "Tora", "Torbjørg",
            "Tordis", "Torgunn", "Torhild", "Toril", "Torild", "Torill", "Torun", "Torunn", "Tove", "Trine", "Trine-Lise", "Trude", "Turi", "Turid", "Tuva", "Tyra", "Ulla", "Ulrikke", "Una", "Une", "Unn", "Unni",
            "Urszula", "Vaida", "Valborg", "Valentina", "Valeria", "Vanessa", "Vanja", "Venche", "Venke", "Vera", "Veronica", "Veronika", "Veslemøy", "Vibecke", "Vibeke", "Victoria", "Vida", "Vigdis", "Viktoria",
            "Viktorija", "Vilde", "Vilja", "Vilje", "Vilma", "Viola", "Violeta", "Vivi", "Vivian", "Vår", "Vårin", "Wanja", "Wenche", "Wendy", "Wenke", "Weronika", "Wigdis", "Wiktoria", "Wilma", "Yasmin", "Ylva",
            "Yngvild", "Yvonne", "Zahra", "Zainab", "Zara", "Zeinab", "Zoe", "Zofia", "Zuzanna", "Ågot", "Åsa", "Åse", "Åshild", "Åslaug", "Åsne", "Åsta"
    };

    private static final String[] GUTTENAVN = {
            "Aage", "Aaron", "Aasmund", "Abbas", "Abdallah", "Abdi", "Abdirahman", "Abdul", "Abdulkadir", "Abdullah", "Abdullahi", "Abdulrahman", "Abel", "Abraham", "Adam", "Adel", "Adem", "Adil", "Adnan", "Adrian",
            "Agnar", "Ahmad", "Ahmed", "Ahmet", "Aiden", "Ailo", "Aksel", "Alan", "Albert", "Alejandro", "Aleksandar", "Aleksander", "Aleksandr", "Aleksandrs", "Alex", "Alexander", "Alexandru", "Alf", "Alfred",
            "Ali", "Allan", "Alv", "Alvin", "Amanuel", "Amar", "Amer", "Amin", "Amir", "Ammar", "Amund", "Anas", "Anders", "Andre", "Andreas", "Andrei", "Andrej", "Andres", "Andrew", "Andris", "Andrius", "Andrzej",
            "Annar", "Ansgar", "Anthony", "Anton", "Antoni", "Antonio", "Anwar", "Aram", "Are", "Ari", "Arian", "Arild", "Arkadiusz", "Arman", "Armin", "Arn", "Arne", "Arnfinn", "Arnold", "Arnstein", "Arnt",
            "Arnulf", "Aron", "Arthur", "Artur", "Arturas", "Arunas", "Arve", "Arvid", "Arvin", "Arvydas", "Aryan", "Asbjørn", "Asgeir", "Ask", "Aslak", "Asle", "Asmund", "Atle", "Audrius", "Audun", "August",
            "Aurimas", "Axel", "Ayman", "Baard", "Balder", "Bartlomiej", "Bartosz", "Bastian", "Ben", "Bendik", "Bengt", "Benjamin", "Benny", "Bent", "Bernard", "Bernhard", "Bernt", "Bertil", "Bilal", "Birger",
            "Birk", "Bjarne", "Bjarte", "Bjørge", "Bjørn", "Bjørn-Erik", "Bjørnar", "Bo", "Bogdan", "Boguslaw", "Borgar", "Boris", "Brage", "Brede", "Brian", "Bror", "Bruno", "Brynjar", "Brynjulf", "Børge", "Børre",
            "Bård", "Carl", "Carlos", "Carsten", "Casper", "Caspian", "Cato", "Charles", "Charlie", "Chris", "Christen", "Christer", "Christian", "Christoffer", "Christopher", "Claes", "Claus", "Colin", "Conrad",
            "Constantin", "Cornelius", "Cristian", "Dag", "Dagfinn", "Dainius", "Damian", "Dan", "Dani", "Daniel", "Danny", "Darius", "Dariusz", "David", "Dawid", "Dawit", "Deividas", "Dejan", "Denis", "Dennis",
            "Didrik", "Diego", "Dominic", "Dominik", "Donatas", "Dragan", "Eddie", "Edgar", "Edin", "Edmund", "Edvard", "Edvin", "Edward", "Edwin", "Egidijus", "Egil", "Eigil", "Eilert", "Eilif", "Einar", "Eirik",
            "Eivind", "Eldar", "Eliah", "Elias", "Elling", "Elliot", "Emanuel", "Emil", "Emilian", "Emilio", "Emir", "Emmanuel", "Emre", "Emrik", "Endre", "Eric", "Erik", "Erland", "Erlend", "Erling", "Ernst",
            "Esben", "Eskil", "Eskild", "Espen", "Esten", "Evald", "Evaldas", "Even", "Eystein", "Eyvind", "Fabian", "Faisal", "Falk", "Farhad", "Felix", "Ferdinand", "Fernando", "Filip", "Fillip", "Finn",
            "Flemming", "Florian", "Francis", "Francisco", "Franciszek", "Frank", "Frans", "Fred", "Freddy", "Frederik", "Fredrick", "Fredrik", "Fridtjof", "Frithjof", "Frits", "Fritz", "Frode", "Gabriel", "Gard",
            "Gaute", "Gediminas", "Geir", "Georg", "George", "Georgios", "Gerhard", "Gert", "Giedrius", "Gintaras", "Gisle", "Gjermund", "Gjert", "Glen", "Glenn", "Goran", "Gorm", "Grzegorz", "Gudbrand", "Gudmund",
            "Gunnar", "Gunvald", "Gustav", "Guttorm", "Gøran", "Haakon", "Haavard", "Hadi", "Haldor", "Halfdan", "Hallgeir", "Hallstein", "Hallvard", "Halvard", "Halvor", "Hamid", "Hamza", "Hans", "Hans-Petter",
            "Harald", "Haris", "Harry", "Hasan", "Hassan", "Hauk", "Heine", "Helge", "Helmer", "Henning", "Henrik", "Henry", "Henryk", "Herman", "Hermann", "Hermod", "Hilmar", "Hjalmar", "Hogne", "Holger", "Hubert",
            "Hugo", "Hussain", "Hussein", "Håkon", "Håvar", "Håvard", "Ian", "Ibrahim", "Idar", "Idris", "Igor", "Ilyas", "Imran", "Imre", "Ingar", "Inge", "Ingebrigt", "Ingmar", "Ingolf", "Ingvald", "Ingvar",
            "Ingve", "Ireneusz", "Isa", "Isaac", "Isac", "Isak", "Ismail", "Ivan", "Ivar", "Iver", "Ivo", "Jacek", "Jack", "Jacob", "Jahn", "Jakob", "Jakub", "Jamal", "James", "Jan", "Jan-Erik", "Janis", "Jann",
            "Janusz", "Jaran", "Jarand", "Jardar", "Jarl", "Jarle", "Jaroslaw", "Jason", "Jean", "Jens", "Jeppe", "Jerzy", "Jesper", "Jim", "Jimmy", "Jo", "Joachim", "Joacim", "Joakim", "Joao", "Joar", "Joel",
            "Johan", "Johann", "Johannes", "John", "Johnny", "Jomar", "Jon", "Jonah", "Jonas", "Jonatan", "Jonathan", "Jone", "Jonn", "Jonny", "Jorge", "Jose", "Josef", "Joseph", "Joshua", "Jostein", "Jozef", "Juan",
            "Julian", "Julius", "Justin", "Jøran", "Jørg", "Jørgen", "Jørn", "Jørund", "Kaare", "Kacper", "Kai", "Kaj", "Kamal", "Kamil", "Karim", "Karl", "Karol", "Karolis", "Karstein", "Karsten", "Kasper", "Kato",
            "Kay", "Kazimierz", "Ken", "Kennet", "Kenneth", "Kenny", "Kent", "Kestutis", "Ketil", "Kevin", "Khaled", "Khalid", "Khalil", "Kian", "Kim", "Kim-Andre", "Kjartan", "Kjell", "Kjetil", "Klaus", "Knut",
            "Kolbjørn", "Konrad", "Kornelius", "Kristen", "Krister", "Kristian", "Kristoffer", "Krystian", "Krzysztof", "Kurt", "Kyrre", "Kåre", "Lars", "Lars-Erik", "Lasse", "Laurits", "Lauritz", "Lavrans",
            "Leander", "Leif", "Leiv", "Lennart", "Leo", "Leon", "Leonard", "Leonardo", "Leszek", "Levi", "Liam", "Liban", "Linas", "Linus", "Loke", "Lorentz", "Louis", "Luca", "Lucas", "Ludvig", "Ludvik", "Luis",
            "Luka", "Lukas", "Lukasz", "Lyder", "Maciej", "Mads", "Magnar", "Magne", "Magnus", "Mahad", "Mahamed", "Mahdi", "Mahmoud", "Maksymilian", "Malik", "Malvin", "Mantas", "Manuel", "Marc", "Marcel", "Marcin",
            "Marco", "Marcus", "Marek", "Marian", "Mario", "Marius", "Mariusz", "Mark", "Marko", "Markus", "Martin", "Martinius", "Martinus", "Martynas", "Marvin", "Matas", "Mateo", "Mateusz", "Matheo", "Matheus",
            "Mathias", "Mathis", "Matias", "Mats", "Matteo", "Matthew", "Matthias", "Mattias", "Mattis", "Max", "Maximilian", "Mehdi", "Mehmet", "Melvin", "Michael", "Michal", "Miguel", "Mika", "Mikael", "Mikail",
            "Mikal", "Mike", "Mikkel", "Mikolaj", "Milan", "Milian", "Milos", "Mindaugas", "Minh", "Mio", "Miroslav", "Miroslaw", "Mohamad", "Mohamed", "Mohammad", "Mohammed", "Mons", "Morgan", "Morten", "Mostafa",
            "Muhammad", "Muhammed", "Mustafa", "Narve", "Natan", "Nataniel", "Nathan", "Nathaniel", "Neo", "Nerijus", "Nicholas", "Nicklas", "Niclas", "Nicolai", "Nicolas", "Nicolay", "Niels", "Niklas", "Nikola",
            "Nikolai", "Nikolas", "Nikolay", "Nils", "Njål", "Noa", "Noah", "Noel", "Norbert", "Normann", "Norvald", "Odd", "Oddbjørn", "Oddgeir", "Oddleif", "Oddmund", "Oddvar", "Oddvin", "Odin", "Ola", "Olaf",
            "Olai", "Olav", "Ole", "Ole-Christian", "Ole-Jørgen", "Ole-Kristian", "Ole-Martin", "Ole-Petter", "Oliver", "Olivier", "Olve", "Omar", "Omer", "Omid", "Oscar", "Oskar", "Osman", "Osvald", "Ottar", "Otto",
            "Ove", "Paal", "Patrick", "Patrik", "Patryk", "Paul", "Paulius", "Pavel", "Pawel", "Peder", "Pedro", "Pelle", "Per", "Per-Arne", "Per-Erik", "Peter", "Petter", "Philip", "Phillip", "Piotr", "Preben",
            "Przemyslaw", "Pål", "Radoslaw", "Rafael", "Rafal", "Ragnar", "Ragnvald", "Rainer", "Rami", "Ramunas", "Rasmus", "Ravn", "Rayan", "Raymond", "Reidar", "Remi", "Remy", "Rene", "Reza", "Ricardo", "Richard",
            "Rikard", "Rino", "Roald", "Roar", "Robel", "Robert", "Robertas", "Roberto", "Robin", "Roger", "Roland", "Rolandas", "Rolf", "Rolv", "Roman", "Ronald", "Ronnie", "Ronny", "Roy", "Ruben", "Rudi", "Rudolf",
            "Runar", "Rune", "Ryan", "Ryszard", "Said", "Salah", "Saleh", "Salman", "Sam", "Sami", "Samir", "Samson", "Samuel", "Sander", "Saulius", "Scott", "Sean", "Sebastian", "Selmer", "Severin", "Seyed",
            "Sigbjørn", "Sigfred", "Sigmund", "Sigurd", "Sigvald", "Sigvart", "Sigve", "Silas", "Simen", "Simon", "Sindre", "Sivert", "Sjur", "Skjalg", "Slawomir", "Snorre", "Solomon", "Sondre", "Stanislaw",
            "Stefan", "Steffan", "Steffen", "Stein", "Steinar", "Sten", "Stephan", "Stephen", "Steve", "Steven", "Stian", "Stig", "Storm", "Sture", "Sturla", "Ståle", "Svein", "Svein-Erik", "Sveinung", "Sven",
            "Svend", "Svenn", "Sverre", "Syed", "Sylwester", "Syver", "Sølve", "Szymon", "Søren", "Tadas", "Tadeusz", "Tage", "Tarald", "Tarjei", "Ted", "Tellef", "Teo", "Teodor", "Terje", "Thanh", "Theo", "Theodor",
            "Thomas", "Thor", "Thorbjørn", "Thore", "Thorleif", "Thorstein", "Thorvald", "Tim", "Timian", "Timothy", "Tobias", "Tom", "Tom-Erik", "Tomas", "Tomasz", "Tommy", "Toni", "Tonny", "Tony", "Tor",
            "Tor-Arne", "Tor-Erik", "Toralf", "Torben", "Torbjørn", "Tord", "Tore", "Torfinn", "Torgeir", "Torger", "Torgrim", "Torje", "Torjus", "Torkel", "Torkil", "Torkild", "Torleif", "Torleiv", "Tormod",
            "Torodd", "Torstein", "Torvald", "Tristan", "Tron", "Trond", "Troy", "Truls", "Trygve", "Trym", "Tønnes", "Ulf", "Ulrik", "Usman", "Vaidas", "Valentin", "Van", "Varg", "Vebjørn", "Vegar", "Vegard",
            "Vemund", "Vetle", "Victor", "Vidar", "Viggo", "Viktor", "Vilhelm", "Viljar", "Villy", "Vincent", "Vladimir", "Vytautas", "Waldemar", "Walid", "Walter", "Werner", "Widar", "Wieslaw", "Wiggo", "Wiktor",
            "Wilhelm", "William", "Willy", "Wilmer", "Wojciech", "Yahya", "Yasin", "Yngvar", "Yngve", "Yonas", "Yosef", "Yousef", "Youssef", "Yusuf", "Zakaria", "Zbigniew", "Zoran", "Øistein", "Øivind", "Ørjan",
            "Ørnulf", "Øystein", "Øyvind", "Ådne", "Åge", "Åsmund"
    };

    private static final String[] ETTERNAVN = {
            "Aa", "Aabel", "Aaberg", "Aaby", "Aabø", "Aadland", "Aae", "Aaen", "Aagaard", "Aagesen", "Aakervik", "Aakre", "Aakvik", "Aaland", "Aalberg", "Aalvik", "Aam", "Aamodt", "Aamot", "Aandahl", "Aandal",
            "Aanensen", "Aanerud", "Aanes", "Aanestad", "Aanonsen", "Aanstad", "Aardal", "Aarflot", "Aarhus", "Aarland", "Aarnes", "Aarrestad", "Aarsand", "Aarseth", "Aarskog", "Aarsland", "Aarstad", "Aarum",
            "Aarvik", "Aarø", "Aas", "Aasberg", "Aasbø", "Aase", "Aasebø", "Aasen", "Aaserud", "Aaseth", "Aasgaard", "Aasheim", "Aasland", "Aaslund", "Aass", "Abbas", "Abdalla", "Abdallah", "Abdi", "Abdirahman",
            "Abdulla", "Abdullah", "Abdullahi", "Abdulle", "Abelsen", "Abraha", "Abraham", "Abrahamsen", "Abukar", "Adam", "Adan", "Aden", "Adolfsen", "Afzal", "Aga", "Aglen", "Ahmad", "Ahmadi", "Ahmadzai", "Ahmed",
            "Akbari", "Aker", "Akhtar", "Akram", "Aksdal", "Akselsen", "Aksnes", "Alahmad", "Alali", "Albertsen", "Albrigtsen", "Aleksandersen", "Alexandersen", "Alfheim", "Alfredsen", "Alfsen", "Algrøy", "Ali",
            "Allum", "Alm", "Almaas", "Alme", "Almli", "Almås", "Alnes", "Alnæs", "Alsaker", "Alsos", "Alstad", "Alsvik", "Alver", "Alvestad", "Alvheim", "Alvær", "Amble", "Amdahl", "Amdal", "Amdam", "Amin", "Amini",
            "Amiri", "Amlie", "Amundsen", "Anda", "Andersen", "Anderson", "Anderssen", "Andersson", "Andorsen", "Andreassen", "Andresen", "Andvik", "Anfinsen", "Angell", "Angelsen", "Angeltveit", "Angvik",
            "Anthonsen", "Anti", "Antonsen", "Anwar", "Apeland", "Araya", "Arctander", "Arif", "Arneberg", "Arnesen", "Arnestad", "Arnevik", "Arntsen", "Arntzen", "Arnøy", "Aronsen", "Arshad", "Arslan", "Arvesen",
            "Asbjørnsen", "Asghar", "Asheim", "Ashraf", "Ask", "Aske", "Askeland", "Askevold", "Askildsen", "Askim", "Askvik", "Aslaksen", "Aslam", "Asp", "Aspaas", "Aspelund", "Aspen", "Aspenes", "Asphaug",
            "Astrup", "Auestad", "Augestad", "Aukland", "Aulie", "Aunan", "Aune", "Aurdal", "Aure", "Aurstad", "Ausland", "Austad", "Austbø", "Austnes", "Austrheim", "Axelsen", "Aziz", "Azizi", "Baardsen", "Bach",
            "Backe", "Bakk", "Bakka", "Bakkan", "Bakke", "Bakkehaug", "Bakkejord", "Bakkeli", "Bakkelund", "Bakken", "Bakker", "Bakkerud", "Bakketun", "Bakstad", "Ballestad", "Balstad", "Baltzersen", "Bang", "Barka",
            "Barmen", "Barstad", "Barth", "Bartnes", "Bashir", "Bastiansen", "Bauer", "Bauge", "Baumann", "Baustad", "Bay", "Bech", "Beck", "Becker", "Begum", "Bekkelund", "Bekken", "Bekkevold", "Bell", "Belsvik",
            "Bendiksen", "Bendixen", "Bengtsson", "Benjaminsen", "Benonisen", "Bentsen", "Bentzen", "Berdal", "Berentsen", "Berg", "Bergan", "Berge", "Bergem", "Bergene", "Berger", "Bergersen", "Bergerud",
            "Bergesen", "Berget", "Berggren", "Bergh", "Bergheim", "Bergland", "Bergli", "Berglund", "Bergman", "Bergmann", "Bergo", "Bergquist", "Bergseng", "Bergset", "Bergseth", "Bergstrøm", "Bergsvik", "Bergtun",
            "Bergum", "Berhane", "Berhe", "Berisha", "Berland", "Bernhardsen", "Berntsen", "Berntzen", "Berre", "Berstad", "Bertelsen", "Berthelsen", "Bertheussen", "Betten", "Beyene", "Beyer", "Bhatti", "Bibi",
            "Bilstad", "Birkedal", "Birkeland", "Birkeli", "Birkelund", "Birkenes", "Bjelland", "Bjerga", "Bjerk", "Bjerkan", "Bjerke", "Bjerkeli", "Bjerkelund", "Bjerkestrand", "Bjerkli", "Bjerknes", "Bjerkvik",
            "Bjerkås", "Bjordal", "Bjorland", "Bjorøy", "Bjune", "Bjønnes", "Bjønness", "Bjørdal", "Bjørgan", "Bjørge", "Bjørgen", "Bjørgo", "Bjørgum", "Bjørheim", "Bjørk", "Bjørke", "Bjørkedal", "Bjørkhaug",
            "Bjørkheim", "Bjørkli", "Bjørklund", "Bjørkmo", "Bjørkum", "Bjørkås", "Bjørlo", "Bjørn", "Bjørndal", "Bjørndalen", "Bjørnerud", "Bjørnes", "Bjørnestad", "Bjørnevik", "Bjørnsen", "Bjørnstad", "Bjørnø",
            "Bjørnøy", "Bjørnå", "Bjørseth", "Bjørsvik", "Bjørvik", "Blakstad", "Blindheim", "Blix", "Blom", "Blomberg", "Blomvik", "Blystad", "Bodin", "Boge", "Bogen", "Bogstrand", "Bolme", "Bolstad", "Bondevik",
            "Bones", "Bonsaksen", "Borch", "Borchgrevink", "Bore", "Borg", "Borgan", "Borge", "Borgen", "Borgersen", "Borlaug", "Borsheim", "Bostad", "Botnen", "Botten", "Boye", "Braastad", "Braaten", "Braathen",
            "Bragstad", "Brakstad", "Brandal", "Brandt", "Brandtzæg", "Brandvik", "Braseth", "Brastad", "Brataas", "Bratberg", "Bratland", "Bratli", "Bratlie", "Bratsberg", "Brattli", "Brattås", "Bratvold", "Braut",
            "Bredal", "Bredesen", "Breen", "Breiland", "Breistein", "Breivik", "Brekka", "Brekke", "Brekken", "Bremnes", "Bremseth", "Brenden", "Brenna", "Brenne", "Brevig", "Brevik", "Bringedal", "Brobakken",
            "Broch", "Brodahl", "Brodersen", "Broen", "Brovold", "Brown", "Brox", "Bru", "Bruaset", "Brubakken", "Brudevoll", "Brudvik", "Bruheim", "Bruland", "Brun", "Brunborg", "Brunes", "Brunstad", "Brunvoll",
            "Brustad", "Bruun", "Bruvik", "Bruvoll", "Bryhn", "Bryn", "Bryne", "Brynildsen", "Brynjulfsen", "Brække", "Brækken", "Brænd", "Brænden", "Brøndbo", "Brønstad", "Bråten", "Bråthen", "Bu", "Buan", "Bue",
            "Buene", "Buer", "Bugge", "Bugten", "Bui", "Buljo", "Bull", "Bunes", "Buraas", "Burud", "Busch", "Busk", "Butt", "Buvarp", "Buvik", "By", "Byberg", "Bye", "Byrkjeland", "Bystrøm", "Bækken", "Bærheim",
            "Bævre", "Bø", "Bødtker", "Bøe", "Bøen", "Bøhler", "Bøhmer", "Bøhn", "Børnes", "Børresen", "Børseth", "Børsheim", "Børstad", "Børve", "Bøthun", "Bøyum", "Bårdsen", "Båtnes", "Cao", "Cappelen", "Carlsen",
            "Carlson", "Carlsson", "Caspersen", "Celik", "Celius", "Chan", "Chaudhry", "Chen", "Christensen", "Christiansen", "Christoffersen", "Christophersen", "Clausen", "Claussen", "Corneliussen", "Daae",
            "Dagestad", "Dagsland", "Dahir", "Dahl", "Dahlberg", "Dahle", "Dahlen", "Dahlgren", "Dahlstrøm", "Dalaker", "Dalby", "Dale", "Dalen", "Dalene", "Daleng", "Dalhaug", "Dalheim", "Dalland", "Dalsbø",
            "Dalseth", "Dammen", "Dang", "Daniel", "Danielsen", "Dar", "David", "Davidsen", "Dehli", "Demir", "Derås", "Devik", "Devold", "Didriksen", "Diesen", "Digernes", "Digre", "Dimmen", "Dinh", "Dirdal",
            "Ditlefsen", "Djupvik", "Djuve", "Djønne", "Do", "Doan", "Dokken", "Drabløs", "Drage", "Drageset", "Dragland", "Dramstad", "Drange", "Drevland", "Dreyer", "Drivenes", "Drønen", "Due", "Duong",
            "Dvergsdal", "Dyb", "Dybdahl", "Dybdal", "Dybvik", "Dybwad", "Dyngeland", "Dyrdal", "Dyrhaug", "Dyrkorn", "Dyrnes", "Dyrseth", "Dyrstad", "Dyrøy", "Dørum", "Ebbesen", "Eckhoff", "Edland", "Edvardsen",
            "Edvartsen", "Eeg", "Eek", "Ege", "Egeberg", "Egeland", "Egeli", "Egenes", "Eggan", "Egge", "Eggen", "Eggum", "Eid", "Eide", "Eidem", "Eidet", "Eidissen", "Eidsheim", "Eidsvik", "Eidsvåg", "Eie", "Eik",
            "Eike", "Eikeland", "Eikemo", "Eiken", "Eikenes", "Eikrem", "Eikås", "Eilertsen", "Einan", "Einarsen", "Einvik", "Eira", "Ek", "Ekeberg", "Ekeland", "Ekeli", "Ekelund", "Ekerhovd", "Ekker", "Eklund",
            "Eknes", "Ekre", "Ekrem", "Ekren", "Ekroll", "Ekstrøm", "Elde", "Elden", "Eldevik", "Eliassen", "Ellefsen", "Ellingsen", "Elmi", "Elnes", "Elstad", "Elton", "Eltvik", "Elvebakk", "Elvenes", "Elverum",
            "Elvestad", "Elvik", "Emanuelsen", "Emberland", "Emblem", "Emilsen", "Endal", "Endresen", "Enersen", "Enes", "Eng", "Engan", "Engdal", "Enge", "Engebakken", "Engebretsen", "Engedal", "Engeland",
            "Engelsen", "Engelstad", "Engen", "Engenes", "Enger", "Engeset", "Engeseth", "Engevik", "Engh", "Englund", "Engseth", "Engstad", "Engstrøm", "Engum", "Engvik", "Enoksen", "Ensrud", "Erdal", "Erga",
            "Erichsen", "Eriksen", "Eriksrud", "Eriksson", "Erikstad", "Erland", "Erlandsen", "Ernstsen", "Ersland", "Erstad", "Ertsås", "Ervik", "Eskedal", "Eskeland", "Espe", "Espedal", "Espeland", "Espelid",
            "Espenes", "Espeseth", "Estensen", "Evanger", "Evenrud", "Evensen", "Evenstad", "Evertsen", "Evje", "Evjen", "Evju", "Fadnes", "Fagerbakke", "Fagereng", "Fagerhaug", "Fagerheim", "Fagerland", "Fagerli",
            "Fagermo", "Fagernes", "Fagertun", "Fagervik", "Fagervold", "Fagerås", "Falch", "Falck", "Falk", "Falkenberg", "Fallet", "Fanebust", "Farah", "Fardal", "Farestveit", "Farooq", "Farstad", "Fauskanger",
            "Fauske", "Fedje", "Fenne", "Feragen", "Ferkingstad", "Fernandez", "Ferstad", "Fevang", "Fidje", "Fidjeland", "Figenschau", "Figenschou", "Fiksdal", "Fimland", "Fimreite", "Finne", "Finnerud",
            "Finnesand", "Finnøy", "Finseth", "Finsrud", "Finstad", "Fischer", "Fiske", "Fiskerstrand", "Fiskum", "Fiskvik", "Fiskå", "Fjeld", "Fjeldberg", "Fjelde", "Fjeldheim", "Fjeldstad", "Fjell", "Fjellanger",
            "Fjelldal", "Fjellestad", "Fjellheim", "Fjellstad", "Fjellvang", "Fjermestad", "Fjær", "Fjæreide", "Fjærli", "Fjørtoft", "Flaa", "Flaaten", "Flage", "Flataker", "Flatebø", "Flaten", "Flatland", "Flatmo",
            "Flatøy", "Flatås", "Fleischer", "Flem", "Flesland", "Flo", "Flø", "Flønes", "Fløtre", "Fløysvik", "Flåten", "Foldnes", "Folgerø", "Folkedal", "Folkestad", "Folkvord", "Folland", "Follestad", "Fonn",
            "Fonnes", "Forberg", "Forbord", "Forland", "Formo", "Fornes", "Forsberg", "Forseth", "Forsmo", "Fosen", "Foss", "Fossan", "Fossdal", "Fosse", "Fossen", "Fosser", "Fosshaug", "Fossheim", "Fossland",
            "Fossli", "Fossmark", "Fossmo", "Fossnes", "Fossum", "Fotland", "Frafjord", "Framnes", "Frank", "Frantzen", "Fredheim", "Fredriksen", "Fremstad", "Fretheim", "Friberg", "Friestad", "Frigstad", "Friis",
            "Frivold", "Frogner", "Frost", "Frostad", "Frydenberg", "Frydenlund", "Frøiland", "Frøland", "Frøseth", "Frøshaug", "Frøyen", "Frøyland", "Frøysa", "Frøystad", "Fuglerud", "Fuglestad", "Fure", "Furnes",
            "Furre", "Furset", "Furseth", "Furu", "Furuhaug", "Furuheim", "Furulund", "Furunes", "Furuseth", "Fyhn", "Fykse", "Fylkesnes", "Fylling", "Fyllingen", "Følstad", "Førde", "Føreland", "Førland", "Førre",
            "Førsund"
    };
}