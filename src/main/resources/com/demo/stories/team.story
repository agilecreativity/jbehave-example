Scenario: English Premier League Score for 2001-2002
Given the scores table of English Premier leage for year 2001-2002: 
   | No| name            | P  | W   |  L |  D |win |lose|Pts | 
   | 1 | Arsenal         | 38 | 26  |  9 |  3 | 79 | 36 | 87 |
   | 2 | Liverpool       | 38 | 24  |  8 |  6 | 67 | 30 | 80 |
   | 3 | Manchester_U    | 38 | 24  |  5 |  9 | 87 | 45 | 77 |
   | 4 | Newcastle       | 38 | 21  |  8 |  9 | 74 | 52 | 71 |
   | 5 | Leeds           | 38 | 18  | 12 |  8 | 53 | 37 | 66 |
   | 6 | Chelsea         | 38 | 17  | 13 |  8 | 66 | 38 | 64 |
   | 7 | West_Ham        | 38 | 15  |  8 | 15 | 48 | 57 | 53 |
   | 8 | Aston_Villa     | 38 | 12  | 14 | 12 | 46 | 47 | 50 |
   | 9 | Tottenham       | 38 | 14  |  8 | 16 | 49 | 53 | 50 |
   |10 | Blackburn       | 38 | 12  | 10 | 16 | 55 | 51 | 46 |
   |11 | Southampton     | 38 | 12  |  9 | 17 | 46 | 54 | 45 |
   |12 | Middlesbrough   | 38 | 12  |  9 | 17 | 35 | 47 | 45 |
   |13 | Fulham          | 38 | 10  | 14 | 14 | 36 | 44 | 44 |
   |14 | Charlton        | 38 | 10  | 14 | 14 | 38 | 49 | 44 |
   |15 | Everton         | 38 | 11  | 10 | 17 | 45 | 57 | 43 |
   |16 | Bolton          | 38 |  9  | 13 | 16 | 44 | 62 | 40 |
   |17 | Sunderland      | 38 | 10  | 10 | 18 | 29 | 51 | 40 |
   |18 | Ipswitch        | 38 |  9  |  9 | 20 | 41 | 64 | 36 |
   |19 | Derby           | 38 |  8  |  6 | 24 | 33 | 63 | 30 |
   |20 | Leicester       | 38 |  5  | 13 | 20 | 30 | 64 | 28 |
When win and lose is calculated
Then the score should be as follow:
   | No| name            | P  | W   |  L |  D |win |lose|Pts | diff| lowest_diff |
   | 1 | Arsenal         | 38 | 26  |  9 |  3 | 79 | 36 | 87 | 43  | No          |
   | 2 | Liverpool       | 38 | 24  |  8 |  6 | 67 | 30 | 80 | 37  | No          |
   | 3 | Manchester_U    | 38 | 24  |  5 |  9 | 87 | 45 | 77 | 42  | No          |
   | 4 | Newcastle       | 38 | 21  |  8 |  9 | 74 | 52 | 71 | 22  | No          |
   | 5 | Leeds           | 38 | 18  | 12 |  8 | 53 | 37 | 66 | 16  | No          |
   | 6 | Chelsea         | 38 | 17  | 13 |  8 | 66 | 38 | 64 | 28  | No          |
   | 7 | West_Ham        | 38 | 15  |  8 | 15 | 48 | 57 | 53 | -9  | No          |
   | 8 | Aston_Villa     | 38 | 12  | 14 | 12 | 46 | 47 | 50 | -1  | No          |
   | 9 | Tottenham       | 38 | 14  |  8 | 16 | 49 | 53 | 50 | -4  | No          |
   |10 | Blackburn       | 38 | 12  | 10 | 16 | 55 | 51 | 46 |  4  | No          |
   |11 | Southampton     | 38 | 12  |  9 | 17 | 46 | 54 | 45 | -8  | No          |
   |12 | Middlesbrough   | 38 | 12  |  9 | 17 | 35 | 47 | 45 |-12  | No          |
   |13 | Fulham          | 38 | 10  | 14 | 14 | 36 | 44 | 44 | -8  | No          |
   |14 | Charlton        | 38 | 10  | 14 | 14 | 38 | 49 | 44 |-11  | No          |
   |15 | Everton         | 38 | 11  | 10 | 17 | 45 | 57 | 43 |-12  | No          |
   |16 | Bolton          | 38 |  9  | 13 | 16 | 44 | 62 | 40 |-18  | No          |
   |17 | Sunderland      | 38 | 10  | 10 | 18 | 29 | 51 | 40 |-22  | No          |
   |18 | Ipswitch         | 38 |  9  |  9 | 20 | 41 | 64 | 36 |-23 | No          |
   |19 | Derby           | 38 |  8  |  6 | 24 | 33 | 63 | 30 |-30  | No          |
   |20 | Leicester       | 38 |  5  | 13 | 20 | 30 | 64 | 28 |-34  | Yes         |