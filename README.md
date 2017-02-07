# [Open-Weather-Map API](https://openweathermap.org/api)

## [計費方式](https://openweathermap.org/price)

## 免費版
* 每分鐘 60 Requests
* 支援 當天的天氣資料
* 支援 5 天的天氣預測 (每三小時更新一次)
* Weather maps API
* [License For Map, API] 使用 CC BY-SA 4.0 授權 (https://creativecommons.org/licenses/by-sa/4.0/)
* [License For Data] 使用 ODbL 授權 (http://opendatacommons.org/licenses/odbl/)
* 不提供歷史資料

## Response 資料格式
```
{"coord":
{"lon":145.77,"lat":-16.92},
"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04n"}],
"base":"cmc stations",
"main":{"temp":293.25,"pressure":1019,"humidity":83,"temp_min":289.82,"temp_max":295.37},
"wind":{"speed":5.1,"deg":150},
"clouds":{"all":75},
"rain":{"3h":3},
"dt":1435658272,
"sys":{"type":1,"id":8166,"message":0.0166,"country":"AU","sunrise":1435610796,"sunset":1435650870},
"id":2172797,
"name":"Cairns",
"cod":200}
```

### [Current Weather Data for One Location](https://github.com/jerry80409/open-data-demo/wiki/Call-current-weather-data-for-one-location)

### [Call current weather data for several cities](https://github.com/jerry80409/open-data-demo/wiki/Call-5-day---3-hour-forecast-data)

### Not yet [Bulk downloading]()

# Google Trends
## 關鍵字
### Used
```
Response<KeyWordsResponse> response = googleTrendsService.trendsOfKeyWords().execute();
System.out.println(response.body());
```

### Response 資料格式
```
{
  "romania": [
    "Starea natiei",
    "prima impadurire",
    "Monica Tatoiu",
    "Floricica Dansatoarea",
    "EURONEWS",
    "Mihai Gotiu",
    "Lady Gaga",
    "Horoscop 6 februarie 2017",
    "Sibiu",
    "motiune de cenzura",
    "Mihaela Grindeanu",
    "Steven van Groningen",
    "Al Jazeera",
    "Dolce Sport 1 Live",
    "New York Times",
    "Rivaldinho",
    "Romania Protest",
    "6 februarie",
    "The Guardian",
    "Sebastian Stan"
  ],
  "finland": [
    "Lady Gaga",
    "conviction",
    "John Nash",
    "Simone Biles",
    "House Of Brandon",
    "Kathleen Turner",
    "Ronda Rousey",
    "Michael Douglas",
    "Pirates of the Caribbean 5",
    "Super Bowl 2017",
    "Expendables 3",
    "OnePlus 3T",
    "Embargo",
    "Mikael Granlund",
    "KHL",
    "Angelina Jolie",
    "Sylvester Stallone",
    "Traffic Island",
    "Alma",
    "David Bowie"
  ],
  "portugal": [
    "Braga",
    "Lady Gaga",
    "Gisele Bündchen",
    "Feirense Rio Ave",
    "Principado da Pontinha",
    "Braga Estoril",
    "Bob Marley",
    "Mariah Carey",
    "Joost van der Westhuizen",
    "Espirito Santo Brasil",
    "Espirito Santo",
    "Cage the Elephant",
    "OCDE",
    "Gil Vicente",
    "24 Legacy",
    "Maritimo Moreirense",
    "Simone Biles",
    "Maritimo",
    "Super Bowl 2017",
    "FC Porto"
  ],
  "mexico": [
    "Samurai Jack",
    "La Constitucion De 1917",
    "Macaulay Culkin",
    "Hoy No Circula 6 De Febrero 2017",
    "Constitucion Mexicana",
    "Pasito Perron",
    "Tres Veces Tu",
    "Kristen Stewart",
    "Serie del Caribe",
    "Piratas del Caribe 5",
    "Katy Perry",
    "Jamie Lynn Spears",
    "Putin Asesino",
    "Bob Marley",
    "Selena Gomez Esta Embarazada",
    "Venustiano Carranza",
    "Axl Rose",
    "Martellus Bennett",
    "centenario de la Constitución Mexicana",
    "Lady Gaga"
  ],
  "egypt": [
    "كافيه كيف",
    "جيهان نصر",
    "موعد مباراة السوبر",
    "FIFA",
    "استقبال السيسي للمنتخب",
    "Super Bowl",
    "رؤوف خليف",
    "كاس العالم",
    "هدف الننى فى الكاميرون",
    "بث مباشر مصر والكاميرون",
    "مباراة مصر والكاميرون",
    "مشاهدة مباراة مصر والكاميرون",
    "Bein sport",
    "مصر والكاميرون",
    "اهداف مصر والكاميرون",
    "تردد قناة بين سبورت",
    "بين سبورت",
    "نتيجه الشهاده الاعداديه 2017",
    "يلا شوت نقل مباشر",
    "قناة بين سبورت"
  ],
  "brazil": [
    "Fies",
    "Calendario Fgts Contas Inativas",
    "Alexandre de Moraes",
    "Paredão Bbb",
    "Fox",
    "eSocial",
    "Esquadrão De Elite",
    "Piratas do Caribe 5",
    "Lotofacil 1471",
    "Kristen Stewart",
    "Lendas Do Amanha",
    "Bob Marley",
    "Rainha Elizabeth",
    "Gretchen",
    "Alicia Vikander",
    "Borja",
    "Jason Mraz",
    "Copa do Brasil",
    "Prouni",
    "Super Bowl 2017"
  ],
  "united_states": [
    "ESPN",
    "Patriots Parade 2017",
    "Betsy DeVos",
    "Bob Marley",
    "Audi Superbowl Commercial",
    "Samurai Jack",
    "Arnold Schwarzenegger",
    "Queen Elizabeth",
    "Genie Bouchard",
    "Lena Dunham",
    "Jane the Virgin",
    "School closures",
    "Nioh",
    "Melissa Mccarthy As Sean Spicer",
    "CBS Sports",
    "Selena",
    "Born This Way",
    "Michael Floyd",
    "meteor",
    "Baywatch"
  ],
  "india": [
    "Valentine Day",
    "TSPSC",
    "Propose Day",
    "WBSSC",
    "Valentines Day",
    "Miley Cyrus",
    "Happy Rose Day",
    "earthquake",
    "Rose Day",
    "earthquake today",
    "Happy Rose Day Images",
    "Valentine Week",
    "Super Bowl",
    "SBI PO 2017",
    "Phillauri",
    "AP Police",
    "Badrinath Ki Dulhania Songs",
    "Breaking News",
    "Live News",
    "sepsis"
  ],
  "malaysia": [
    "Selva Kumar",
    "Sarah Lian",
    "Tabung Haji",
    "Gmail",
    "Google Maps",
    "Public Bank",
    "Superbowl 2017",
    "Gabriel Jesus",
    "RHB",
    "Map",
    "Bursa Malaysia",
    "UiTM",
    "Thaipusam",
    "Dropbox",
    "LinkedIn",
    "SSM",
    "Pramoedya Ananta Toer",
    "Lady Gaga",
    "Nokia P1",
    "EPL"
  ],
  "austria": [
    "Lady Gaga",
    "Freiheitsstatue",
    "Jamie Lynn Spears",
    "St Moritz",
    "Super Bowl 2017 Stream",
    "Sky du Mont",
    "Lethal Weapon",
    "Inge Keller",
    "Katy Perry",
    "Michael Wendler",
    "Sat 1",
    "Football",
    "ran",
    "Fluch der Karibik 5",
    "Super Bowl Live",
    "Ski Wm",
    "Fast and Furious 8",
    "Toni Fritsch",
    "Super Bowl 2017",
    "Graz Wahl 2017"
  ],
  "colombia": [
    "Temblor Hoy",
    "Super Bowl 2017",
    "Pico Y Placa Medellin 2017",
    "Temblor En Bogota Hoy",
    "Caracol Noticias",
    "Temblo",
    "Juan Fernando Quintero",
    "Ultimas Noticias",
    "Tom Brady",
    "Super Bowl",
    "Millonarios",
    "Juventus",
    "Colombia vs Uruguay",
    "Sudamericano Sub 20",
    "Cristiano Ronaldo",
    "Deportivo Cali",
    "Neymar",
    "Super Bowl 2017",
    "Falcao",
    "Barcelona"
  ],
  "japan": [
    "覇者の塔",
    "ジャスティンビーバー",
    "デヴィ夫人",
    "小林よしのり",
    "岩田剛典",
    "キッズウォー",
    "三浦友和",
    "トモダチゲーム",
    "松山英樹",
    "仮面女子",
    "福原愛",
    "けものフレンズ",
    "スーパーボウル",
    "大谷翔平",
    "犬夜叉",
    "奥山佳恵",
    "秋元真夏",
    "りゅうちぇる",
    "無限の住人",
    "札幌雪まつり"
  ],
  "hungary": [
    "Erste Netbank",
    "Lady Gaga",
    "Schobert Norbi",
    "Gozsdu udvar",
    "Easyjet",
    "Hajdú Péter",
    "Mihócza Szilvia",
    "Bruce Willis",
    "Karib Tenger Kalózai 5",
    "Tom Brady",
    "Super Bowl 2017",
    "Pál Dénes",
    "Katona Kálmán",
    "NFL",
    "Nfl Super Bowl 2017",
    "Black Sabbath",
    "Lengyel László",
    "Kaposvári József",
    "Kárász Róbert",
    "Muri Enikő"
  ],
  "taiwan": [
    "相撲",
    "夏如芝",
    "歐陽娜娜",
    "林韋伶",
    "Iphone8",
    "金泰希",
    "群益證券",
    "高鳴",
    "104",
    "魯芬",
    "中國信託",
    "1111",
    "郵局",
    "超級盃",
    "匯率",
    "第一銀行",
    "皮肌炎",
    "兆豐銀行",
    "Super Bowl",
    "元大銀行"
  ],
  "greece": [
    "Καρανικασ",
    "ΕΦΚΑ",
    "Keaprogram",
    "Βομβα Κορδελιο",
    "Σεισμοσ Τωρα",
    "Σεισμοσ",
    "Aek",
    "Lady Gaga",
    "Καρτα Σιτισησ Πληρωμη",
    "Pirates of the Caribbean 5",
    "PAUL PIERCE",
    "ΑΔΜΗΕ",
    "Superbowl",
    "Nfl",
    "Βανδη",
    "Εφκα Ειδοποιητηρια",
    "Fast and Furious",
    "Ειρήνη Παπαδοπούλου",
    "Λεβαδειακοσ Πλατανιασ",
    "Μονη Εσφιγμενου"
  ],
  "czech_republic": [
    "Lady Gaga",
    "Nikol Štíbrová",
    "Ovčáček čtveráček",
    "Oto Košta",
    "HateFree",
    "ČSSZ",
    "Super Bowl 2017",
    "Super Bowl",
    "mana",
    "Neymar",
    "Black Sabbath",
    "Národní galerie",
    "Markéta Davidová",
    "Nova 2",
    "Premier League",
    "Dakota Johnson",
    "Davis Cup 2017",
    "Rae Sremmurd",
    "Monika Babišová",
    "Jaroslava Stránská"
  ],
  "canada": [
    "Betsy DeVos",
    "St Thomas",
    "Jamie Lynn Spears",
    "TSN",
    "Environment Canada Weather",
    "Eugenie Bouchard",
    "school closures",
    "Vocm",
    "Edmonton Oilers",
    "ESPN",
    "Superbowl Highlights",
    "Andrea Giesbrecht",
    "Meteo Media",
    "Queen Elizabeth",
    "Météomédia",
    "Bob Marley",
    "Fox",
    "UBC",
    "NAIT",
    "Samurai Jack"
  ],
  "italy": [
    "Vasco Rossi",
    "Jamie Lynn Spears",
    "Regina Elisabetta",
    "Giù la testa",
    "Matt Damon",
    "Rumeno",
    "Pirati dei Caraibi 5",
    "Andrea Marcaccini",
    "Sanremo 2017",
    "THE DEPARTED",
    "San Valentino",
    "Daniela De Jesus",
    "Nancy Coppola",
    "Supertennis",
    "Moviola Juve Inter",
    "Meteo Palermo",
    "Bob Marley",
    "Psycho",
    "Atalanta",
    "Rizzoli"
  ],
  "france": [
    "Mathieu Gallet",
    "Solidays",
    "Les Anges",
    "Laurent Baffie",
    "Fillon",
    "Mike Horn",
    "Les Anges 9",
    "Elsa Zylberstein",
    "Nrj12",
    "Alabama Monroe",
    "Australia",
    "Ennemi public",
    "melty Future Awards 2017",
    "After Earth",
    "Joost Van der Westhuizen",
    "Camille Cerf",
    "Tolisso",
    "Olympique Lyonnais",
    "Pirates des Caraibes 5",
    "Benjamin Gates"
  ],
  "kenya": [
    "Bob Marley",
    "24 Legacy",
    "Superbowl 2017",
    "Bet In",
    "Juventus",
    "Afcon",
    "Man City",
    "Tottenham",
    "IEBC",
    "Man U Vs Leicester",
    "Liverpool F.c.",
    "Chelsea vs Arsenal",
    "EPL",
    "Epl Results",
    "Barcelona",
    "Chelsea Vs Arsenal Prediction",
    "lecturers strike",
    "Cameroon vs Ghana",
    "Big Kev",
    "Sydney FC"
  ],
  "nigeria": [
    "Buhari News",
    "Super Bowl",
    "Afcon 2017 final",
    "Gabriel Jesus",
    "2face protest",
    "Tuface Protest",
    "James Ibori",
    "Chelsea vs Arsenal",
    "Premier League Table",
    "Premier League",
    "Premier League Results",
    "Seun Egbegbe",
    "Big Brother Nigeria 2017",
    "Nigerian Army",
    "Live scores",
    "Beyonce",
    "Barcelona",
    "Manchester United F.c.",
    "latest transfer news",
    "Liverpool vs Chelsea"
  ],
  "norway": [
    "Uber",
    "Lady Gaga",
    "samer",
    "sameflagget",
    "Alpin Vm 2017",
    "same",
    "Tråante",
    "Karin Hindsbo",
    "Selena Gomez",
    "Per Fugelli",
    "samisk",
    "Funcom",
    "samene",
    "Sametinget",
    "Super Bowl 2017",
    "Tom Brady",
    "Lavrans Solli",
    "Samefolkets dag",
    "Telemark",
    "Gabriel Jesus"
  ],
  "turkey": [
    "Şirinlerin Şapkası",
    "İçerde 20. bölüm izle",
    "Nelson Mandela",
    "Morgan Freeman",
    "Kim Milyoner Olmak ister sunucusu",
    "Fahire Kara",
    "İbrahim Kutluay",
    "Esra Erol Berke",
    "Son Dakika Izmir",
    "Son depremler",
    "EBA",
    "Kandilli Rasathanesi",
    "Çılgın Sedat",
    "Super Bowl",
    "Adem Kılıççı",
    "Izmir Deprem",
    "Istanbul Da Deprem",
    "Asena Atalay",
    "Gizem Karaca",
    "KOÜ"
  ],
  "israel": [
    "חוק ההסדרה",
    "פרשת המן",
    "Lady Gaga Super Bowl 2017",
    "האח הגדול עונה 8 פרק 15",
    "ג ולייטה",
    "ליידי גאגא",
    "טום בריידי",
    "סופרבול",
    "אריה דרעי בצל",
    "Super Bowl 2017",
    "חוק ההסדרה",
    "גילה גולדשטיין",
    "מכבי תל אביב",
    "רדיוהד",
    "צ אק נוריס",
    "Radiohead",
    "מכבי תל אביב נגד הפועל באר שבע",
    "Premier League",
    "רשת",
    "כרמלית"
  ],
  "australia": [
    "Joost van der Westhuizen",
    "Eugenie Bouchard",
    "David Dick",
    "Big Pineapple Festival",
    "Chrissy Teigen",
    "RBA",
    "Tom Arnold Wife",
    "Nioh",
    "24 Legacy",
    "Julio Jones",
    "Lady Gaga",
    "Cory Bernardi",
    "Married At First Sight",
    "Tom Brady Net Worth",
    "Jamie Lynn Spears",
    "Ed Sheeran",
    "Super Bowl 2017 ads",
    "Waitangi Day",
    "Pirates of the Caribbean 5",
    "Tash Sultana"
  ],
  "singapore": [
    "NS50",
    "Chan Chun Sing",
    "SMRT",
    "Betsy DeVos",
    "Presidential Election Singapore",
    "24 Legacy",
    "Lady Gaga",
    "Pramoedya Ananta Toer",
    "SGX",
    "MOM",
    "Maybank",
    "Ocean Sunfish",
    "Ezra",
    "SkillsFuture",
    "drive",
    "Kyra Poh",
    "Paul Pierce",
    "Bloomberg",
    "Leicester City",
    "Starhub Share Price"
  ],
  "netherlands": [
    "Fifty Shades Darker",
    "PVV",
    "Stemwijzer",
    "Super Bowl",
    "Patricia Paay",
    "Pauline Krikke",
    "Qmusic",
    "Freek Vonk",
    "Paul Verhoeven",
    "Amanda Todd",
    "voorjaarsvakantie",
    "Stem Wijzer",
    "D66",
    "Elsevier",
    "SP",
    "Bjorn Granath",
    "Joost van der Westhuizen",
    "Super Bowl 2017",
    "Lady Gaga",
    "Roda Ajax"
  ],
  "germany": [
    "Marvin Albrecht",
    "Lady Gaga",
    "Inge Keller",
    "VfB Stuttgart",
    "Dfb Pokal",
    "Lethal Weapon",
    "Jamie Lynn Spears",
    "Michael Wendler",
    "Angela Merkel",
    "Swr Aktuell App",
    "Patrick Esume",
    "Genitalverstümmelung",
    "Berlinale",
    "Neben Der Spur Dein Wille Geschehe",
    "SWR Aktuell",
    "Kristen Stewart",
    "Andrea Nahles",
    "Queen Elizabeth",
    "Neben der Spur",
    "Super Bowl 2017"
  ],
  "chile": [
    "Jamie Lynn Spears",
    "Tinder",
    "Permiso De Circulacion 2017",
    "Isapre Mas Vida",
    "Alicia Vikander",
    "Sudamericano Sub 20",
    "NFL",
    "Super Bowl 2017",
    "Tom Brady",
    "Universidad de Chile",
    "Universidad Catolica",
    "Violeta Parra",
    "Manchester City",
    "Esclerosis Multiple",
    "Superbowl",
    "virus hanta",
    "Club Universidad De Chile",
    "Cristiano Ronaldo",
    "Derby 2017",
    "Colo Colo"
  ],
  "belgium": [
    "Elsa Zylberstein",
    "Alabama Monroe",
    "Bob Marley",
    "De mol",
    "Lady Gaga",
    "De Mol 2017",
    "Selor",
    "Les Anges 9",
    "Vier",
    "De Mol Kandidaten",
    "Marlene Jobert",
    "UCL",
    "Francois Fillon",
    "Stemwijzer",
    "Jennifer Lopez",
    "Le Parrain 3",
    "Kandidaten De Mol 2017",
    "Simone Biles",
    "Kameroen",
    "Super Bowl"
  ],
  "thailand": [
    "พระมหามุนีวงศ์",
    "ไผ่ วันพอยท์",
    "Ais Playbox",
    "หมิว ลลิตา หย่า",
    "ฌอห์ณ เอสเธอร์",
    "ฌอห์ณ จินดาโชติ",
    "หงษ์หยก",
    "พรีเมียร์ลีก",
    "The Face Thailand Season 3",
    "เชลซี",
    "O-NET",
    "เบนซ์ เรซซิ่ง ล่าสุด",
    "เรื่องย่อบัลลังก์ดอกไม้",
    "วันทหารผ่านศึก",
    "หน้ากากฮันบก",
    "วันศุกร์",
    "หน้ากากนกอินทรี",
    "แถลงข่าวเบนซ์ เรซซิ่ง",
    "เบนซ์ เรซซิ่ง",
    "ไซซะนะ"
  ],
  "argentina": [
    "Angelici",
    "Carla Rebecchi",
    "Esposa Joven Final",
    "Jamie Lynn Spears",
    "Masacre en Hurlingham",
    "ABC",
    "El Dia",
    "El regreso de Lucas",
    "La Maquina De Ser Feliz",
    "Premios Carlos 2017",
    "Bob Marley",
    "C5N",
    "Edelap",
    "Temporal En La Plata",
    "Tyc",
    "Jazmin De Grazia",
    "Joost van der Westhuizen",
    "Axl Rose",
    "Bingo San Vicente",
    "Copa Davis 2017"
  ],
  "spain": [
    "Alicia Vikander",
    "Lady Gaga",
    "Lucas Hernandez",
    "Artur Mas",
    "Kristen Stewart",
    "Jamie Lynn Spears",
    "Super Bowl 2017",
    "Premios Goya 2017 Ganadores",
    "Tom Brady",
    "Cristiano Ronaldo",
    "Ghost",
    "Alfombra Roja Goya 2017",
    "Real Sociedad",
    "Rafinha",
    "Neymar",
    "Sevilla Villarreal",
    "Rita Barbera",
    "Gabriel Jesus",
    "Julieta",
    "Goya 2017"
  ],
  "south_korea": [
    "섀도우버스",
    "용의자",
    "정다은",
    "사람인",
    "환율",
    "국민은행",
    "우리은행",
    "잡코리아",
    "신한은행",
    "고영태",
    "희망키움통장",
    "하나은행",
    "신한카드",
    "정찬성",
    "로또740",
    "그것이알고싶다",
    "고민정",
    "전인범",
    "신혼일기",
    "정소민"
  ],
  "ukraine": [
    "Кристина Жмудская",
    "Адаптация",
    "Яндекс Пробки",
    "День Оксаны",
    "гомеопатия",
    "Мамочки 3 Сезон 1 Серия",
    "6 февраля",
    "Пираты Карибского моря 5",
    "День бармена",
    "Джамала",
    "СКАЙ",
    "Лев Лещенко",
    "Евровидение 2017",
    "Євробачення 2017",
    "Георгий Тараторкин",
    "Арсен Мирзоян",
    "Олег Анащенко",
    "Донецк",
    "взрыв в Донецке",
    "Типичный Донецк"
  ],
  "hong_kong": [
    "張德江",
    "辜成允",
    "皮肌炎",
    "魯芬",
    "親親我好媽",
    "芮成鋼",
    "射鵰英雄傳",
    "中國銀行",
    "Lady Gaga",
    "Nfl",
    "張圭陽",
    "Etnet",
    "將軍漢堡",
    "烈火奶奶",
    "23條",
    "曾俊華政綱",
    "孫春蘭",
    "渣打",
    "利是封回收",
    "881903"
  ],
  "south_africa": [
    "Joost van der Westhuizen",
    "Superbowl 2017",
    "Cameroon",
    "Lady Gaga",
    "Amor Vittone",
    "Gabriel Jesus",
    "J9 Foundation",
    "Premier League Table",
    "Gavin Ramsay",
    "John Cena",
    "Joost van der Westhuizen",
    "Joost",
    "Chelsea",
    "Lundi Tyamara Funeral",
    "Premier League",
    "Big Sean I Decided",
    "Beyonce Twins",
    "Mpho Ranko",
    "Man City",
    "Beyonce"
  ],
  "denmark": [
    "Ticketmaster",
    "Sailing Yacht A",
    "John Mayer",
    "meningitis",
    "Erik Sviatchenko",
    "David Lee",
    "Kristen Stewart",
    "Solomon Northup",
    "Eugenie Bouchard",
    "Simone Biles",
    "Karina Vetrano",
    "Super Bowl Winners",
    "Jennifer Grey",
    "the best of me",
    "STRANGER THINGS Season 2",
    "Super Bowl 2017 Highlights",
    "Super Bowl 2017",
    "Lady Gaga",
    "Metallica",
    "Morten Andersen"
  ],
  "poland": [
    "Nokia P1",
    "Alicia Vikander",
    "Danuta Szaflarska",
    "królowa Elżbieta",
    "Lady Gaga",
    "Opener",
    "Zbigniew Stonoga",
    "M Jak Miłość Vod",
    "Edyta Herbuś",
    "Christian Bassogog",
    "269",
    "Maja Kuczyńska",
    "Ennio Morricone",
    "Lady Gaga Super Bowl 2017",
    "Axl Rose",
    "Złota 44",
    "Bob Marley",
    "Budma",
    "Zus Składki",
    "Juventus"
  ],
  "indonesia": [
    "Adian Napitupulu",
    "Versace",
    "Ira Koesno",
    "Pramoedya Ananta Toer",
    "SBY",
    "Chat Firza Husein",
    "Foto Firza Husein Hot",
    "Persib vs PSM",
    "Rachel Vennya",
    "Leicester Vs Mu",
    "Nokia P1",
    "SNMPTN",
    "Kendall Jenner",
    "Taufik Ridho",
    "Juventus Vs Inter Milan",
    "Persib Day",
    "Persija vs PS TNI",
    "Balada Cinta Rizieq",
    "Manchester City",
    "Cristiano Ronaldo"
  ],
  "russia": [
    "Осиное гнездо",
    "гомеопатия",
    "Адаптация",
    "Пираты Карибского моря 5",
    "Максим Решетников",
    "Кристина Жмудская",
    "День сурка",
    "Хоккей с мячом",
    "Исчезнувшая",
    "Лев Лещенко",
    "Алексей Янин",
    "Леонид Якубович",
    "Георгий Тараторкин",
    "На 50 оттенков темнее",
    "Алекса",
    "Алексей Нилов",
    "Челси Арсенал",
    "Барселона",
    "Наталья Меламед",
    "ZA Sport"
  ],
  "sweden": [
    "Peter Springare",
    "Sting",
    "Albatraoz",
    "Paradise Hotel 2017",
    "Lady Gaga",
    "Oscar Zia",
    "samernas nationaldag",
    "TV3",
    "Qx Gaygala 2017",
    "Sailing Yacht A",
    "Lets Dance 2017",
    "artist anmäld för ofredande",
    "Diabetes Typ 2",
    "Nix",
    "Ebba Busch Thor",
    "Super Bowl",
    "Björn Granath",
    "Super Bowl 2017",
    "Leif Loket",
    "Peter Springare"
  ],
  "vietnam": [
    "FIFA Online 3",
    "Hoàng Kiều",
    "Nơi này có anh",
    "Vietcombank",
    "Ty Gia",
    "Super Bowl",
    "Thế Giới Di Đông",
    "Viettel Post",
    "Quỳnh Anh Shyn",
    "Gabriel Jesus",
    "Eximbank",
    "Giá vàng hôm nay",
    "Viết Thư Upu Lần Thứ 46 Năm 2017",
    "Bang Xep Hang Bong Da",
    "Phi Thanh Van",
    "Song Hye Kyo",
    "Video Bong Da",
    "Ket Qua Bong Da Hom Qua",
    "Duong Den Danh Ca Vong Co Tap 12",
    "Bong Da Ngoai Hang Anh"
  ],
  "saudi_arabia": [
    "حرق الكعبة",
    "فهد الروقي",
    "قناة العرب",
    "فوائد الموز",
    "جيهان نصر",
    "يلا شوت نقل مباشر",
    "الخدمة المدنية",
    "محمد النني",
    "Lady Gaga",
    "الكاميرون ومصر",
    "Egypt",
    "فضل شاكر",
    "لايف",
    "عمرو وردة",
    "منتخب الكاميرون",
    "يوفنتوس",
    "مباراة مصر والكاميرون 2017",
    "نظام نور",
    "نور",
    "مباراة مصر والكاميرون"
  ],
  "switzerland": [
    "Matt Pokora",
    "Simone Biles",
    "Lady Gaga",
    "Fillon",
    "Miruna Manescu",
    "St Moritz Ski Wm",
    "maladie de Charcot",
    "Denis Shapovalov",
    "Juventus",
    "Wm St Moritz Programm",
    "Jamie Lynn Spears",
    "Les Anges 9",
    "Eugenie Bouchard",
    "Ski Wm",
    "Lethal Weapon",
    "Wetter St. Moritz",
    "camembert",
    "Michael Wendler",
    "Super Bowl 2016",
    "Martin Seiler"
  ],
  "philippines": [
    "Super Bowl",
    "Lady Gaga",
    "Paul Pierce",
    "Ocean Sunfish",
    "IMG",
    "Chocolate",
    "Jeepney Strike Feb 6 2017",
    "transport strike",
    "Jeepney strike",
    "Nokia P1",
    "Jackie Chan",
    "Yogi Ferrell",
    "MACBETH",
    "MMK",
    "Stay lyrics",
    "Marc Anthony",
    "Santa Clarita Diet",
    "Abs Cbn Sports",
    "Tomorrow With You",
    "Cebu Pacific"
  ],
  "united_kingdom": [
    "Kim Woodburn",
    "davis cup 2017",
    "Joost van der Westhuizen",
    "Jamie Lynn Spears",
    "John Bercow",
    "The Accused",
    "Pirates of the Caribbean 5",
    "David Hockney",
    "Helen Flanagan",
    "Steve Hewlett",
    "Michael Praed",
    "David Beckham emails",
    "Stranger Things season 2",
    "Russell Brand",
    "NepentheZ",
    "Bob Marley",
    "Ibiza Weekender",
    "Queen Elizabeth",
    "Juventus",
    "The Jump Channel 4 2017"
  ]
}
```

## 台灣搜尋趨勢
