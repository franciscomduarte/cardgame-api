INSERT INTO tb_usuario (id, username, password, role) VALUES (1, 'usuario1', 'senha', 'ROLE_USER');
INSERT INTO tb_usuario (id, username, password, role) VALUES (2, 'usuario2', 'senha', 'ROLE_ADMIN');

INSERT INTO tb_filme(id,
					title, 
					year, 
					rated, 
					runtime, 
					genre, 
					director, 
					writer, 
					actors, 
					plot, 
					language, 
					country, 
					awards, 
					poster, 
					metascore, 
					imdbrating, 
					imdbvotes, 
					imdbid, 
					type, 
					boxoffice, 
					production, 
					website, 
					response)
VALUES (1,
        'Hulk', 
        2003, 
        'PG-13', 
        '138 min', 
        'Action, Sci-Fi', 
        'Ang Lee', 
        'Stan Lee, Jack Kirby, James Schamus', 
        'Eric Bana, Jennifer Connelly, Sam Elliott', 
        'Bruce Banner, a genetics researcher with a tragic past, suffers an accident that causes him to transform into a raging green monster when he gets angry.', 
        'English, Spanish', 
        'United States', 
        '3 wins & 14 nominations', 
        'https://m.media-amazon.com/images/M/MV5BMzQwZDg1MGEtN2E5My00ZDJlLWI4MzItM2U2MjJhYzlkNmEzXkEyXkFqcGdeQXVyNDAxNjkxNjQ@._V1_SX300.jpg', 
        '54', 
        '5', 
        '262,822', 
        'tt0286716', 
        'movie', 
        '$132,177,234', 
        'N/A', 
        'N/A', 
        0);

INSERT INTO tb_filme(id,title, year, rated, runtime, genre, director, writer, actors, plot, language, country, awards, poster, metascore, imdbrating, imdbvotes, imdbid, type, boxoffice, production, website, response)
VALUES (2, 'Hulk 2', 2003, 'PG-13', '138 min', 'Action, Sci-Fi', 'Ang Lee', 'Stan Lee, Jack Kirby, James Schamus', 'Eric Bana, Jennifer Connelly, Sam Elliott', 'Bruce Banner, a genetics researcher with a tragic past, suffers an accident that causes him to transform into a raging green monster when he gets angry.', 'English, Spanish', 'United States', '3 wins & 14 nominations', 'https://m.media-amazon.com/images/M/MV5BMzQwZDg1MGEtN2E5My00ZDJlLWI4MzItM2U2MjJhYzlkNmEzXkEyXkFqcGdeQXVyNDAxNjkxNjQ@._V1_SX300.jpg', '54', '5.6', '262,822', 'tt0286716', 'movie', '$132,177,234', 'N/A', 'N/A', 0);
INSERT INTO tb_filme(id,title, year, rated, runtime, genre, director, writer, actors, plot, language, country, awards, poster, metascore, imdbrating, imdbvotes, imdbid, type, boxoffice, production, website, response)
VALUES (3 ,'Spider', 2002, 'R', '98 min', 'Drama, Mystery, Thriller', 'David Cronenberg', 'Patrick McGrath', 'Ralph Fiennes, Miranda Richardson, Gabriel Byrne', 'A mentally disturbed man takes residence in a halfway house. His mind gradually slips back into the realm created by his illness, where he replays a key part of his childhood.', 'English', 'Canada, United Kingdom, France', '13 wins & 25 nominations', 'https://m.media-amazon.com/images/M/MV5BMmY4OGRmNWMtNmIyNS00YWQ5LWJmMGUtMDI3MWRlMmQ0ZDQzL2ltYWdlXkEyXkFqcGdeQXVyNTAyODkwOQ@@._V1_SX300.jpg', '83', '6.8', '38,365', 'tt0278731', 'movie', '$1,642,483', 'N/A', 'N/A', 0);
INSERT INTO tb_filme(id,title, year, rated, runtime, genre, director, writer, actors, plot, language, country, awards, poster, metascore, imdbrating, imdbvotes, imdbid, type, boxoffice, production, website, response)
VALUES (4, 'Iron Man', 2008, 'PG-13', '126 min', 'Action, Adventure, Sci-Fi', 'Jon Favreau', 'Mark Fergus, Hawk Ostby, Art Marcum', 'Robert Downey Jr., Gwyneth Paltrow, Terrence Howard', 'After being held captive in an Afghan cave, billionaire engineer Tony Stark creates a unique weaponized suit of armor to fight evil.', 'English, Persian, Urdu, Arabic, Kurdish, Hindi, Hungarian', 'United States, Canada', 'Nominated for 2 Oscars. 21 wins & 73 nominations total', 'https://m.media-amazon.com/images/M/MV5BMTczNTI2ODUwOF5BMl5BanBnXkFtZTcwMTU0NTIzMw@@._V1_SX300.jpg', '79', '7.9', '1,013,882', 'tt0371746', 'movie', '$319,034,126', 'N/A', 'N/A', 0);
INSERT INTO tb_filme(id,title, year, rated, runtime, genre, director, writer, actors, plot, language, country, awards, poster, metascore, imdbrating, imdbvotes, imdbid, type, boxoffice, production, website, response)
VALUES (5, 'Black Widow', 2021, 'PG-13', '134 min', 'Action, Adventure, Sci-Fi', 'Cate Shortland', 'Eric Pearson, Jac Schaeffer, Ned Benson', 'Scarlett Johansson, Florence Pugh, David Harbour', 'Natasha Romanoff confronts the darker parts of her ledger when a dangerous conspiracy with ties to her past arises.', 'English, Russian, Norwegian, Hungarian, Macedonian, Finnish', 'United States', '3 wins & 22 nominations', 'https://m.media-amazon.com/images/M/MV5BNjRmNDI5MjMtMmFhZi00YzcwLWI4ZGItMGI2MjI0N2Q3YmIwXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_SX300.jpg', '67', '6.7', '336,789', 'tt3480822', 'movie', '$183,651,655', 'N/A', 'N/A', 0);
INSERT INTO tb_filme(id,title, year, rated, runtime, genre, director, writer, actors, plot, language, country, awards, poster, metascore, imdbrating, imdbvotes, imdbid, type, boxoffice, production, website, response)
VALUES (6, 'Home Alone', 1990, 'PG', '103 min', 'Comedy, Family', 'Chris Columbus', 'John Hughes', 'Macaulay Culkin, Joe Pesci, Daniel Stern', 'An eight-year-old troublemaker must protect his house from a pair of burglars when he is accidentally left home alone by his family during Christmas vacation.', 'English', 'United States', 'Nominated for 2 Oscars. 11 wins & 6 nominations total', 'https://m.media-amazon.com/images/M/MV5BMzFkM2YwOTQtYzk2Mi00N2VlLWE3NTItN2YwNDg1YmY0ZDNmXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_SX300.jpg', '63', '7.6', '547,535', 'tt0099785', 'movie', '$285,761,243', 'N/A', 'N/A', 0);
INSERT INTO tb_filme(id,title, year, rated, runtime, genre, director, writer, actors, plot, language, country, awards, poster, metascore, imdbrating, imdbvotes, imdbid, type, boxoffice, production, website, response)
VALUES (8, 'My Girl', 1991, 'PG', '102 min', 'Comedy, Drama, Family', 'Howard Zieff', 'Laurice Elehwany', 'Anna Chlumsky, Macaulay Culkin, Dan Aykroyd', 'A young girl, on the threshold of her teen years, finds her life turning upside down, when she is accompanied by an unlikely friend.', 'English', 'United States', '2 wins & 5 nominations', 'https://m.media-amazon.com/images/M/MV5BYWM2ZDliNjItZTcxOC00NTY2LWE1ODctNzRhNGM3YWIyYjBiXkEyXkFqcGdeQXVyNTIzOTk5ODM@._V1_SX300.jpg', '56', '6.9', '78,532', 'tt0102492', 'movie', '$59,489,799', 'N/A', 'N/A', 0);
INSERT INTO tb_filme(id,title, year, rated, runtime, genre, director, writer, actors, plot, language, country, awards, poster, metascore, imdbrating, imdbvotes, imdbid, type, boxoffice, production, website, response)
VALUES (10, 'The Graduate', 1967, 'PG', '106 min', 'Comedy, Drama, Romance', 'Mike Nichols', 'Calder Willingham, Buck Henry, Charles Webb', 'Dustin Hoffman, Anne Bancroft, Katharine Ross', 'A disillusioned college graduate finds himself torn between his older lover and her daughter.', 'English', 'United States', 'Won 1 Oscar. 21 wins & 21 nominations total', 'https://m.media-amazon.com/images/M/MV5BMTQ0ODc4MDk4Nl5BMl5BanBnXkFtZTcwMTEzNzgzNA@@._V1_SX300.jpg', '83', '8.0', '267,267', 'tt0061722', 'movie', '$104,945,305', 'N/A', 'N/A', 0);
INSERT INTO tb_filme(id,title, year, rated, runtime, genre, director, writer, actors, plot, language, country, awards, poster, metascore, imdbrating, imdbvotes, imdbid, type, boxoffice, production, website, response)
VALUES (12, 'The Hangover', 2009, 'R', '100 min', 'Comedy', 'Todd Phillips', 'Jon Lucas, Scott Moore', 'Zach Galifianakis, Bradley Cooper, Justin Bartha', 'Three buddies wake up from a bachelor party in Las Vegas, with no memory of the previous night and the bachelor missing. They make their way around the city in order to find their friend before his wedding.', 'English', 'United States, Germany', 'Nominated for 1 BAFTA Film Award13 wins & 25 nominations total', 'https://m.media-amazon.com/images/M/MV5BNGQwZjg5YmYtY2VkNC00NzliLTljYTctNzI5NmU3MjE2ODQzXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_SX300.jpg', '73', '7.7', '759,307', 'tt1119646', 'movie', '$277,322,503', 'N/A', 'N/A', 0);
INSERT INTO tb_filme(id,title, year, rated, runtime, genre, director, writer, actors, plot, language, country, awards, poster, metascore, imdbrating, imdbvotes, imdbid, type, boxoffice, production, website, response)
VALUES (13, 'Vertigo', 1958, 'PG', '128 min', 'Mystery, Romance, Thriller', 'Alfred Hitchcock', 'Alec Coppel, Samuel A. Taylor, Pierre Boileau', 'James Stewart, Kim Novak, Barbara Bel Geddes', 'A former San Francisco police detective juggles wrestling with his personal demons and becoming obsessed with the hauntingly beautiful woman he has been hired to trail, who may be deeply disturbed.', 'English', 'United States', 'Nominated for 2 Oscars. 8 wins & 7 nominations total', 'https://m.media-amazon.com/images/M/MV5BYTE4ODEwZDUtNDFjOC00NjAxLWEzYTQtYTI1NGVmZmFlNjdiL2ltYWdlL2ltYWdlXkEyXkFqcGdeQXVyNjc1NTYyMjg@._V1_SX300.jpg', '100', '8.3', '390,348', 'tt0052357', 'movie', '$7,705,225', 'N/A', 'N/A', 0);