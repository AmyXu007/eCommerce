USE BUY4U;

-- Category 001 is book
-- I added 10 books
-- Category 002 is Electronics
-- Category 003 is Food
-- Category 004 is Movie


-- Below is book
insert into Products values
(
	0000001,
    'Software Engineering (10th Edition)',
    171.89,
    'The Fundamental Practice of Software Engineering. Software Engineering introduces readers to the overwhelmingly important subject of software programming and development. In the past few years, computer systems have come to dominate not just our technological growth, but the foundations of our world’s major industries. This text seeks to lay out the fundamental concepts of this huge and continually growing subject area in a clear and comprehensive manner.',
	LOAD_FILE('/Users/Theodore/img/00001.jpg'),
    001,
    '2015-04-03',
    10
);

insert into Products values
(
	0000002,
    'Computer System: A Programmers Perspsctive (3rd Edition)',
    200.89,
    'This book (CS:APP3e) is the third edition of a book that stems from the introductory computer systems course we developed at Carnegie Mellon University, starting in the Fall of 1998, called "Introduction to Computer Systems" (ICS). The presentation is based on the following principles, which aim to help the students become better programmers and to help prepare them for upper-level systems courses.',
	LOAD_FILE('/Users/Theodore/img/00002.jpg'),
    001,
    '2015-04-03',
    10
);

insert into Products values
(
	0000003,
    'The Elements of Statistical Learning: Data Mining, Inference, and Prediction (2nd Edition)',
    220.39,
    'This major new edition features many topics not covered in the original, including graphical models, random forests, ensemble methods, least angle regression & path algorithms for the lasso, non-negative matrix factorization and spectral clustering. There is also a chapter on methods for ``wide'' data (italics p bigger than n), including multiple testing and false discovery rates. ',
	LOAD_FILE('/Users/Theodore/img/00003.jpg'),
    001,
    '2015-04-03',
    10
);

insert into Products values
(
	0000004,
    'Pattern Recognition and Machine Learning (Information Science and Statistics)',
    77.39,
    'This is the first textbook on pattern recognition to present the Bayesian viewpoint. The book presents approximate inference algorithms that permit fast approximate answers in situations where exact answers are not feasible. It uses graphical models to describe probability distributions when no other books apply graphical models to machine learning. No previous knowledge of pattern recognition or machine learning concepts is assumed. Familiarity with multivariate calculus and basic linear algebra is required, and some experience in the use of probabilities would be helpful though not essential as the book includes a self-contained introduction to basic probability theory.',
	LOAD_FILE('/Users/Theodore/img/00004.jpg'),
    001,
    '2015-04-03',
    10
);

insert into Products values
(
	0000005,
    'Python Machine Learning',
    35.99,
    'Learn how to build powerful Python machine learning algorithms to generate useful data insights with this data analysis tutorial',
	LOAD_FILE('/Users/Theodore/img/00005.jpg'),
    001,
    '2015-04-03',
    10
);

insert into Products values
(
	0000006,
    'Bayesian Reasoning and Machine Learning',
    53.99,
    'Machine learning methods extract value from vast data sets quickly and with modest resources. They are established tools in a wide range of industrial applications, including search engines, DNA sequencing, stock market analysis, and robot locomotion, and their use is spreading rapidly. People who know the methods have their choice of rewarding jobs. This hands-on text opens these opportunities to computer science students with modest mathematical backgrounds. It is designed for final-year undergraduates and masters students with limited ',
	LOAD_FILE('/Users/Theodore/img/00006.jpg'),
    001,
    '2015-04-03',
    10
);

insert into Products values
(
	0000007,
    'Machine Learning for Hackers: Case Studies and Algorithms to Get You Started',
    49.99,
    'If you’re an experienced programmer interested in crunching data, this book will get you started with machine learning—a toolkit of algorithms that enables computers to train themselves to automate useful tasks. Authors Drew Conway and John Myles White help you understand machine learning and statistics tools through a series of hands-on case studies, instead of a traditional math-heavy presentation.',
	LOAD_FILE('/Users/Theodore/img/00007.jpg'),
    001,
    '2015-04-03',
    10
);

insert into Products values
(
	0000008,
    'Introduction to Algorithms, Third Edition',
    99.99,
    'Some books on algorithms are rigorous but incomplete; others cover masses of material but lack rigor. Introduction to Algorithms uniquely combines rigor and comprehensiveness. The book covers a broad range of algorithms in depth, yet makes their design and analysis accessible to all levels of readers. Each chapter is relatively self-contained and can be used as a unit of study. The algorithms are described in English and in a pseudocode designed to be readable by anyone who has done a little programming. The explanations have been kept elementary without sacrificing depth of coverage or mathematical rigor.',
	LOAD_FILE('/Users/Theodore/img/00008.jpg'),
    001,
    '2015-04-03',
    10
);

insert into Products values
(
	0000009,
    'Algorithms + Data Structures = Programs (Prentice-Hall Series in Automatic Computation) 1st Edition',
    19.77,
    'This is a classic book about basic algorithms and data structures. It is a must have book for understanding behind-the-scenes logic of standard libraries in modern programming languages. Should be on every programmer\'s read list.',
	LOAD_FILE('/Users/Theodore/img/00009.jpg'),
    001,
    '2015-04-03',
    10
);

insert into Products values
(
	0000010,
    'The Algorithm Design Manual',
    71.96,
    'Most professional programmers that I’ve encountered are not well prepared to tackle algorithm design problems. This is a pity, because the techniques of algorithm design form one of the core practical technologies of computer science. Designing correct, efficient, and implementable algorithms for real-world problems requires access to two distinct bodies of knowledge: • Techniques – Good algorithm designers understand several fundamental algorithm design techniques, including data structures, dynamic programming, depth first search, backtracking, and heuristics. Perhaps the single most important design technique is modeling, the art of abstracting a messy real-world application into a clean problem suitable for algorithmic attack. • Resources – Good algorithm designers stand on the shoulders of giants. Rather than laboring from scratch to produce a new algorithm for every task, they can figure out what is known about a particular problem. Rather than re-implementing popular algorithms from scratch, they seek existing implementations to serve as a starting point. They are familiar with many classic algorithmic problems, which provide sufficient source material to model most any application. This book is intended as a manual on algorithm design, providing access to combinatorial algorithm technology for both students and computer professionals.',
	LOAD_FILE('/Users/Theodore/img/00010.jpg'),
    001,
    '2015-04-03',
    10
);



-- Below is Electronics
insert into Products values
(
	0000011,
    'iPhone 7',
    649,
    'iPhone 7, Black, Verizon, 32Gb',
	LOAD_FILE('/Users/Theodore/img/00011.jpg'),
    002,
    '2016-12-03',
    10
);

insert into Products values
(
	0000012,
    'Macbook Pro',
    1499,
    '2.0GHz dual-core Intel Core i5 processor, Turbo Boost up to 3.1GHz
8GB 1866MHz memory
256GB PCIe-based SSD
Intel Iris Graphics 540
Two Thunderbolt 3 ports
Backlit Keyboard (English) & User\'s Guide',
	LOAD_FILE('/Users/Theodore/img/00012.jpg'),
    002,
    '2016-12-03',
    10
);

insert into Products values
(
	0000013,
    'iPad Pro',
    599,
    '9.7-inch iPad Pro
Change(Model)
Finish
Silver
Change(Finish)
Storage and Connectivity
32GB1',
	LOAD_FILE('/Users/Theodore/img/00013.jpg'),
    002,
    '2016-12-03',
    10
);

insert into Products values
(
	0000014,
    'Apple Watch',
    369,
    'Band Size, Band with 38mm case fits 130–200mm wrists. Band with 42mm case fits 140–210mm wrists.Series,Series 2, Built-in GPS, water resistant 50m, dual-core processor, watchOS 3',
	LOAD_FILE('/Users/Theodore/img/00014.jpg'),
    002,
    '2016-12-03',
    10
);

insert into Products values
(
	0000015,
    'Apple TV',
    149,
    'New features for an even better Apple TV experience.',
	LOAD_FILE('/Users/Theodore/img/00015.jpg'),
    002,
    '2016-12-03',
    10
);

insert into Products values
(
	0000016,
    'Google Home',
    129,
    'Google Home is a voice-activated speaker powered by the Google Assistant. Ask it questions. Tell it to do things. It’s your own Google, always ready to help. Just start with, "Ok Google".',
	LOAD_FILE('/Users/Theodore/img/00016.jpg'),
    002,
    '2016-12-03',
    10
);


insert into Products values
(
	0000017,
    'Google Wifi',
    129,
    'Meet Google Wifi.
Seamless coverage. Smart system.
A new kind of Wi-Fi system that beams a powerful signal throughout your home.',
	LOAD_FILE('/Users/Theodore/img/00017.jpg'),
    002,
    '2016-12-03',
    10
);

insert into Products values
(
	0000018,
    'Kindle',
    79.99,
    'All-New Kindle E-reader - Black, 6" Glare-Free Touchscreen Display, Wi-Fi',
	LOAD_FILE('/Users/Theodore/img/00018.jpg'),
    002,
    '2016-12-03',
    10
);

insert into Products values
(
	0000019,
    'Echo Dot',
    49.99,
    'Echo Dot (2nd Generation) is a hands-free, voice-controlled device that uses Alexa to play music, control smart home devices, provide information, read the news, set alarms, and more
Connects to speakers or headphones through Bluetooth or 3.5 mm stereo cable to play music from Amazon Music, Spotify, Pandora, iHeartRadio, and TuneIn
Controls lights, fans, switches, thermostats, garage doors, sprinklers, and more with compatible connected devices from WeMo, Philips Hue, Samsung SmartThings, Nest, ecobee, and others
Hears you from across the room with 7 far-field microphones for hands-free control, even in noisy environments or while playing music
Includes a built-in speaker so it can work on its own as a smart alarm clock in the bedroom, an assistant in the kitchen, or anywhere you might want a voice-controlled computer
Always getting smarter and adding new features, plus thousands of skills like Uber, Domino\'s, and more
Amazon Echo is not required to use Echo Dot',
	LOAD_FILE('/Users/Theodore/img/00019.jpg'),
    002,
    '2016-12-03',
    10
);

insert into Products values
(
	0000020,
    'Amazon Tap',
    129.99,
    'Ships from and sold by Amazon Digital Services LLC. Gift-wrap available.
Just tap and ask for music from Amazon Music, Spotify, Pandora, iHeartRadio, and TuneIn
Uses the Alexa Voice Service when connected to Wi-Fi or a mobile hotspot to play music, read the news, provide weather reports, and even order a pizza
Streams all your music via Bluetooth from your phone or tablet
Delivers crisp sound powered by Dolby, with dual stereo speakers that provide 360º omni-directional audio
Provides up to 9 hours of playback
Always getting smarter and adding new features and skills
Includes Charging Cradle',
	LOAD_FILE('/Users/Theodore/img/00020.jpg'),
    002,
    '2016-12-03',
    10
);


-- Category 003 Food
insert into Products values
(
	0000021,
    '27 Favorites Food Gift from The Swiss Colony',
   29.99,
    'This item can NOT go to APO/FPO addresses
Featuring snack-sized BEEF LOG®, Caraway, Garlic and Summer Sausages
Cheddar, Brick, Gouda and Colby Cheeses
Decadent Mini Butter Toffee
Fruit Spreads; delectable Bonbons; delicious Cakes; Petits Fours and more!',
	LOAD_FILE('/Users/Theodore/img/00021.jpg'),
    003,
    '2016-12-03',
    10
);

insert into Products values
(
	0000022,
    'Hungry Man\'s Snack Bundle(30 Count)',
   35.00,
    'Perfect for a Hungry Appetite
Bundle includes 30 individually wrapped snacks with a wide variety to please everyone
Great for after school snack, late night treat, break room or anywhere you need a quick snack
Makes a great Gift',
	LOAD_FILE('/Users/Theodore/img/00022.jpg'),
    003,
    '2016-12-03',
    10
);

insert into Products values
(
	0000023,
    'Pop-Tarts, Frosted Brown Sugar Cinnamon, 32 Count, 56.40 Ounce',
   8.00,
    'Whether toasted or enjoyed right from the pack, Kellogg\'s Pop-Tarts make mornings and snacktime fun.
They\'re a sweet treat everyone can enjoy whether sitting down for breakfast or running out the door.
These tasty tarts pack delicious brown sugar and cinnamon flavor into every bite of frosting, filling, and golden crust.
Wrapped in convenient two-tart packs, Pop-Tarts are an easy pick for a quick lunchtime recharge or snack on-the-go.
This package includes one box of 32 Kellogg\'s Frosted Brown Sugar Cinnamon Pop-Tarts.',
	LOAD_FILE('/Users/Theodore/img/00023.jpg'),
    003,
    '2016-12-03',
    10
);

insert into Products values
(
	0000024,
    'Frito-Lay Classic Mix Variety Pack, 50 Count',
   11.98,
    'Includes your favorite varieties of Lay\'s, Cheetos, Fritos, and Doritos brand chips and snacks
Perfect for after-school snacks, picnics, sporting games, and lunch treats
Individually wrapped, perfect for packing lunches
Delicious on-the-go snacking options
Ten 1 oz. bags of FRITOS Original Corn Chips, sixteen 1 oz. bags of CHEETOS Crunchy Cheese Flavored Snacks, eight 1 oz. bags of DORITOS Nacho Cheese Flavored Tortilla Chips, twelve 1 oz. bags of LAY\'S Classic, four 1. oz. bags of LAY\'S Sour Cream & Onion Potato Chips',
	LOAD_FILE('/Users/Theodore/img/00024.jpg'),
    003,
    '2016-12-03',
    10
);

insert into Products values
(
	0000025,
    'Assorted Japanese Junk Food Snack "Dagashi" NT6000019',
   27.50,
    '"Dagashi" is a Japanese cheap sweets and snacks popular among children.
Assorted pack of Japanese popular snacks.
Suitable to share with friends and families.
Contents are subject to change each time.
Made in Japan',
	LOAD_FILE('/Users/Theodore/img/00025.jpg'),
    003,
    '2016-12-03',
    10
);


insert into Products values
(
	0000026,
    'McCormick Pure Coffee Extract, 1 oz',
   6.50,
    'Made with 100% premium, pure ingredients
Gluten free and kosher
Easy pour spout eliminates unnecessary mess
Adds rich, natural coffee flavor to baked goods
Great for frosting and tiramisu recipes',
	LOAD_FILE('/Users/Theodore/img/00026.jpg'),
    003,
    '2016-12-03',
    10
);


insert into Products values
(
	0000027,
    '4 Lou Malnati''s Chicago-style Deep Dish Pizzas (2 Sausage & 2 Pepperoni) ',
   89.99 ,
    'hip Lou Malnati''s legendary Chicago-style deep dish pizzas. 
    Each pizza is hand-made from scratch with mozzarella cheese, vine ripened plum tomatoes, and fresh toppings layered upon a flaky, buttery crust. Each pizza is 9" and serves two adults.',
	LOAD_FILE('/Users/Theodore/img/00027.jpg'),
    003,
    '2016-12-03',
    10
);

insert into Products values
(
	0000028,
    'Ultimate Care Package Full of Delicious Comfort Food and Snacks',
   24.50,
    'Fantastic gift! Perfect for college care packages, military, summer camp, back to school, teachers, coaches, housewarming, road trips, birthdays, get well, and new moms!
Stay at Home Snacks does all the work for you! Save a trip to several stores and that costly shipping expense and trip to the post office.
This item comes in an exclusive Stay at Home Snacks TM branded box.',
	LOAD_FILE('/Users/Theodore/img/00028.jpg'),
    003,
    '2016-12-03',
    10
);


insert into Products values
(
	0000029,
    'Student Breakfast Care Package / Food Basket ',
   34.99,
    'Include your own personal message to your College Student.
A great way to brighten your College Students morning.
A brilliantly collaborated mix of quick breakfast items sure to satisfy any Students grumbling tummy.
Keep your Student stocked up even if they are far from home.
100% Satisfaction Guaranteed',
	LOAD_FILE('/Users/Theodore/img/00029.jpg'),
    003,
    '2016-12-03',
    10
);


insert into Products values
(
	0000030,
    'Student Care Package / Food Basket - Cold Winters Night / Day',
   29.99,
    'A great way to brighten your College Students / Military Members day.
A brilliantly collaborated mix of snack food, sure to satisfy any grumbling tummy.
Keep your loved one stocked up even if they are far from home.
100% Satisfaction Guaranteed.
Include your own personal message (during checkout)!',
	LOAD_FILE('/Users/Theodore/img/00030.jpg'),
    003,
    '2016-12-03',
    10
);
