// 地址生成器核心：多国真实格式的随机身份与地址数据（纯本地组合，无网络请求）。
// 数据为常见真实城市/邮编/街道与姓名的随机组合，仅供开发测试、表单演示使用。

const POSTCODE_INWARD_LETTERS = 'ABDEFGHJLNPQRSTUWXYZ';

export const ADDRESS_GENDERS = Object.freeze([
  { code: 'random', label: '随机性别' },
  { code: 'male', label: '男' },
  { code: 'female', label: '女' }
]);

const DE_STREETS = [
  'Hauptstraße', 'Bahnhofstraße', 'Gartenstraße', 'Schulstraße', 'Dorfstraße', 'Bergstraße',
  'Kirchstraße', 'Waldstraße', 'Ringstraße', 'Lindenstraße', 'Goethestraße', 'Schillerstraße',
  'Mozartstraße', 'Beethovenstraße', 'Marktplatz', 'Rosenweg', 'Birkenweg', 'Eichenweg',
  'Ahornweg', 'Finkenweg', 'Lerchenweg', 'Feldstraße', 'Wiesenstraße', 'Mühlenstraße',
  'Poststraße', 'Blumenstraße', 'Talstraße', 'Brunnenstraße', 'Kastanienallee', 'Uhlandstraße',
  'Lessingstraße', 'Jahnstraße', 'Breite Straße', 'Friedrichstraße', 'Königstraße', 'Wilhelmstraße',
  'Luisenstraße', 'Sonnenstraße', 'Industriestraße', 'Neue Straße'
];

const US_STREETS = [
  'Main Street', 'Church Street', 'High Street', 'Park Avenue', 'Oak Avenue', 'Maple Street',
  'Cedar Street', 'Pine Street', 'Elm Avenue', 'Walnut Street', 'Chestnut Street', 'Willow Lane',
  'Sycamore Drive', 'Magnolia Boulevard', 'River Road', 'Lakeview Drive', 'Hillcrest Avenue',
  'Sunset Drive', 'Meadow Lane', 'Franklin Street', 'Jefferson Avenue', 'Madison Street',
  'Lincoln Avenue', 'Jackson Street', 'Spring Street', 'Highland Avenue', 'Prospect Street',
  'Broadway', 'Center Street', 'Union Street'
];

const GB_STREETS = [
  'High Street', 'Station Road', 'Church Lane', 'Victoria Road', 'King Street', 'Queen Street',
  'Mill Lane', 'Park Road', 'London Road', 'George Street', 'Albert Road', 'Green Lane',
  'Manor Road', 'Church Street', 'The Crescent', 'Kings Road', 'School Lane', 'Windsor Road',
  'Springfield Road', 'York Road', 'New Road', 'Grange Road', 'Highfield Road', 'Richmond Road',
  'Stanley Road'
];

const FR_STREETS = [
  'Rue de la République', 'Rue Victor Hugo', 'Avenue Jean Jaurès', 'Rue de la Paix',
  'Boulevard Voltaire', 'Rue Pasteur', 'Avenue de la Gare', 'Rue des Écoles', 'Rue du Moulin',
  "Rue de l'Église", 'Rue des Lilas', 'Rue Gambetta', 'Avenue Victor Hugo', 'Rue Nationale',
  'Rue du Général de Gaulle', 'Rue Émile Zola', 'Rue Jean Moulin', 'Rue Saint-Michel',
  'Rue Carnot', 'Rue Lamartine', 'Rue Molière', 'Impasse des Roses', 'Allée des Tilleuls',
  'Chemin des Vignes', 'Rue des Acacias', 'Rue de Verdun', 'Rue Danton'
];

const DE_REGIONS = [
  {
    code: 'BW', name: 'Baden-Württemberg', nameZh: '巴登-符腾堡州',
    cities: [
      { name: 'Stuttgart', postal: ['70173', '70176', '70178', '70180', '70190', '70197'], areaCode: '711' },
      { name: 'Karlsruhe', postal: ['76131', '76133', '76135', '76137'], areaCode: '721' },
      { name: 'Freiburg im Breisgau', postal: ['79098', '79100', '79102', '79104'], areaCode: '761' },
      { name: 'Mannheim', postal: ['68159', '68161', '68163', '68165'], areaCode: '621' }
    ]
  },
  {
    code: 'BY', name: 'Bayern', nameZh: '巴伐利亚州',
    cities: [
      { name: 'München', postal: ['80331', '80333', '80335', '80469', '80538', '80798'], areaCode: '89' },
      { name: 'Nürnberg', postal: ['90402', '90403', '90408', '90411', '90419'], areaCode: '911' },
      { name: 'Augsburg', postal: ['86150', '86152', '86154', '86156'], areaCode: '821' },
      { name: 'Regensburg', postal: ['93047', '93049', '93051', '93053'], areaCode: '941' }
    ]
  },
  {
    code: 'BE', name: 'Berlin', nameZh: '柏林',
    cities: [
      { name: 'Berlin', postal: ['10115', '10117', '10119', '10178', '10243', '10405', '10559', '10623', '10707', '10963', '12043', '13353'], areaCode: '30' }
    ]
  },
  {
    code: 'BB', name: 'Brandenburg', nameZh: '勃兰登堡州',
    cities: [
      { name: 'Potsdam', postal: ['14467', '14469', '14471', '14473'], areaCode: '331' },
      { name: 'Cottbus', postal: ['03042', '03044', '03046', '03048'], areaCode: '355' },
      { name: 'Brandenburg an der Havel', postal: ['14770', '14772', '14776'], areaCode: '3381' }
    ]
  },
  {
    code: 'HB', name: 'Bremen', nameZh: '不来梅',
    cities: [
      { name: 'Bremen', postal: ['28195', '28197', '28199', '28203', '28205', '28209'], areaCode: '421' },
      { name: 'Bremerhaven', postal: ['27568', '27570', '27572', '27576'], areaCode: '471' }
    ]
  },
  {
    code: 'HH', name: 'Hamburg', nameZh: '汉堡',
    cities: [
      { name: 'Hamburg', postal: ['20095', '20097', '20099', '20144', '20146', '20249', '20354', '20457', '22083', '22301', '22765'], areaCode: '40' }
    ]
  },
  {
    code: 'HE', name: 'Hessen', nameZh: '黑森州',
    cities: [
      { name: 'Frankfurt am Main', postal: ['60306', '60311', '60313', '60316', '60322', '60325', '60329', '60486', '60594'], areaCode: '69' },
      { name: 'Wiesbaden', postal: ['65183', '65185', '65187', '65189', '65195'], areaCode: '611' },
      { name: 'Darmstadt', postal: ['64283', '64285', '64287', '64289'], areaCode: '6151' },
      { name: 'Kassel', postal: ['34117', '34119', '34121', '34123'], areaCode: '561' }
    ]
  },
  {
    code: 'MV', name: 'Mecklenburg-Vorpommern', nameZh: '梅克伦堡-前波美拉尼亚州',
    cities: [
      { name: 'Rostock', postal: ['18055', '18057', '18059', '18069'], areaCode: '381' },
      { name: 'Schwerin', postal: ['19053', '19055', '19057', '19059'], areaCode: '385' },
      { name: 'Stralsund', postal: ['18435', '18437', '18439'], areaCode: '3831' }
    ]
  },
  {
    code: 'NI', name: 'Niedersachsen', nameZh: '下萨克森州',
    cities: [
      { name: 'Hannover', postal: ['30159', '30161', '30163', '30167', '30169', '30173', '30175'], areaCode: '511' },
      { name: 'Braunschweig', postal: ['38100', '38102', '38104', '38106'], areaCode: '531' },
      { name: 'Osnabrück', postal: ['49074', '49076', '49078', '49080'], areaCode: '541' },
      { name: 'Oldenburg', postal: ['26121', '26122', '26123', '26129'], areaCode: '441' }
    ]
  },
  {
    code: 'NW', name: 'Nordrhein-Westfalen', nameZh: '北莱茵-威斯特法伦州',
    cities: [
      { name: 'Köln', postal: ['50667', '50670', '50672', '50674', '50676', '50678', '50733', '50823', '50937', '51063'], areaCode: '221' },
      { name: 'Düsseldorf', postal: ['40210', '40211', '40213', '40215', '40217', '40219', '40221', '40233', '40237'], areaCode: '211' },
      { name: 'Dortmund', postal: ['44135', '44137', '44139', '44141', '44145', '44147'], areaCode: '231' },
      { name: 'Essen', postal: ['45127', '45128', '45130', '45131', '45133'], areaCode: '201' },
      { name: 'Münster', postal: ['48143', '48145', '48147', '48149', '48151'], areaCode: '251' }
    ]
  },
  {
    code: 'RP', name: 'Rheinland-Pfalz', nameZh: '莱茵兰-普法尔茨州',
    cities: [
      { name: 'Mainz', postal: ['55116', '55118', '55120', '55122', '55124'], areaCode: '6131' },
      { name: 'Ludwigshafen am Rhein', postal: ['67059', '67061', '67063', '67065'], areaCode: '621' },
      { name: 'Koblenz', postal: ['56068', '56070', '56072', '56073'], areaCode: '261' },
      { name: 'Trier', postal: ['54290', '54292', '54293', '54295'], areaCode: '651' }
    ]
  },
  {
    code: 'SL', name: 'Saarland', nameZh: '萨尔州',
    cities: [
      { name: 'Saarbrücken', postal: ['66111', '66113', '66115', '66117', '66119', '66123'], areaCode: '681' },
      { name: 'Neunkirchen', postal: ['66538', '66539', '66540'], areaCode: '6821' },
      { name: 'Homburg', postal: ['66424'], areaCode: '6841' }
    ]
  },
  {
    code: 'SN', name: 'Sachsen', nameZh: '萨克森州',
    cities: [
      { name: 'Dresden', postal: ['01067', '01069', '01097', '01099', '01127', '01157', '01187', '01307'], areaCode: '351' },
      { name: 'Leipzig', postal: ['04103', '04105', '04107', '04109', '04155', '04177', '04229', '04275', '04315'], areaCode: '341' },
      { name: 'Chemnitz', postal: ['09111', '09112', '09113', '09116', '09119', '09126', '09130'], areaCode: '371' }
    ]
  },
  {
    code: 'ST', name: 'Sachsen-Anhalt', nameZh: '萨克森-安哈尔特州',
    cities: [
      { name: 'Magdeburg', postal: ['39104', '39106', '39108', '39110', '39112'], areaCode: '391' },
      { name: 'Halle (Saale)', postal: ['06108', '06110', '06112', '06114', '06116', '06120'], areaCode: '345' },
      { name: 'Dessau-Roßlau', postal: ['06842', '06844', '06846', '06847'], areaCode: '340' }
    ]
  },
  {
    code: 'SH', name: 'Schleswig-Holstein', nameZh: '石勒苏益格-荷尔斯泰因州',
    cities: [
      { name: 'Kiel', postal: ['24103', '24105', '24106', '24107', '24114', '24118', '24143', '24159'], areaCode: '431' },
      { name: 'Lübeck', postal: ['23552', '23554', '23556', '23558', '23562', '23566'], areaCode: '451' },
      { name: 'Flensburg', postal: ['24937', '24939', '24941', '24943'], areaCode: '461' }
    ]
  },
  {
    code: 'TH', name: 'Thüringen', nameZh: '图林根州',
    cities: [
      { name: 'Erfurt', postal: ['99084', '99085', '99086', '99089', '99091', '99096'], areaCode: '361' },
      { name: 'Jena', postal: ['07743', '07745', '07747', '07749'], areaCode: '3641' },
      { name: 'Weimar', postal: ['99423', '99425', '99427'], areaCode: '3643' },
      { name: 'Gera', postal: ['07545', '07546', '07548', '07551'], areaCode: '365' }
    ]
  }
];

const US_REGIONS = [
  {
    code: 'CA', name: 'California', nameZh: '加利福尼亚州',
    cities: [
      { name: 'Los Angeles', postal: ['90012', '90015', '90017', '90024', '90026', '90036', '90064'], areaCode: '213' },
      { name: 'San Francisco', postal: ['94102', '94103', '94107', '94109', '94110', '94115', '94117', '94133'], areaCode: '415' },
      { name: 'San Diego', postal: ['92101', '92103', '92104', '92109', '92115'], areaCode: '619' },
      { name: 'Sacramento', postal: ['95814', '95816', '95818', '95819'], areaCode: '916' },
      { name: 'San Jose', postal: ['95110', '95112', '95113', '95126', '95128'], areaCode: '408' }
    ]
  },
  {
    code: 'NY', name: 'New York', nameZh: '纽约州',
    cities: [
      { name: 'New York', postal: ['10001', '10002', '10003', '10009', '10011', '10016', '10019', '10023', '10025', '10036', '11201', '11211', '11215'], areaCode: '212' },
      { name: 'Buffalo', postal: ['14201', '14202', '14209', '14213', '14216', '14222'], areaCode: '716' },
      { name: 'Rochester', postal: ['14604', '14607', '14609', '14611', '14620'], areaCode: '585' },
      { name: 'Albany', postal: ['12202', '12203', '12206', '12208', '12210'], areaCode: '518' }
    ]
  },
  {
    code: 'TX', name: 'Texas', nameZh: '得克萨斯州',
    cities: [
      { name: 'Houston', postal: ['77002', '77004', '77006', '77008', '77019', '77025', '77030', '77057', '77098'], areaCode: '713' },
      { name: 'Dallas', postal: ['75201', '75204', '75206', '75214', '75219', '75225', '75231'], areaCode: '214' },
      { name: 'Austin', postal: ['78701', '78703', '78704', '78705', '78731', '78745', '78751', '78757'], areaCode: '512' },
      { name: 'San Antonio', postal: ['78201', '78205', '78209', '78212', '78216', '78229', '78240'], areaCode: '210' }
    ]
  },
  {
    code: 'FL', name: 'Florida', nameZh: '佛罗里达州',
    cities: [
      { name: 'Miami', postal: ['33125', '33127', '33130', '33131', '33132', '33133', '33134', '33137', '33145'], areaCode: '305' },
      { name: 'Orlando', postal: ['32801', '32803', '32804', '32806', '32808', '32812', '32819'], areaCode: '407' },
      { name: 'Tampa', postal: ['33602', '33603', '33605', '33606', '33607', '33609', '33611', '33629'], areaCode: '813' },
      { name: 'Jacksonville', postal: ['32202', '32204', '32205', '32207', '32210'], areaCode: '904' }
    ]
  },
  {
    code: 'IL', name: 'Illinois', nameZh: '伊利诺伊州',
    cities: [
      { name: 'Chicago', postal: ['60601', '60603', '60605', '60607', '60610', '60611', '60614', '60618', '60622', '60625', '60640', '60647', '60657'], areaCode: '312' },
      { name: 'Springfield', postal: ['62701', '62702', '62703', '62704', '62711'], areaCode: '217' },
      { name: 'Naperville', postal: ['60540', '60563', '60564', '60565'], areaCode: '630' }
    ]
  },
  {
    code: 'WA', name: 'Washington', nameZh: '华盛顿州',
    cities: [
      { name: 'Seattle', postal: ['98101', '98102', '98103', '98105', '98107', '98109', '98112', '98115', '98117', '98122', '98144'], areaCode: '206' },
      { name: 'Spokane', postal: ['99201', '99202', '99203', '99205', '99208', '99223'], areaCode: '509' },
      { name: 'Tacoma', postal: ['98402', '98403', '98405', '98406', '98408', '98418'], areaCode: '253' }
    ]
  },
  {
    code: 'PA', name: 'Pennsylvania', nameZh: '宾夕法尼亚州',
    cities: [
      { name: 'Philadelphia', postal: ['19102', '19103', '19106', '19107', '19123', '19125', '19130', '19146', '19147'], areaCode: '215' },
      { name: 'Pittsburgh', postal: ['15201', '15203', '15206', '15213', '15217', '15222', '15232'], areaCode: '412' },
      { name: 'Harrisburg', postal: ['17101', '17102', '17103', '17104', '17110'], areaCode: '717' }
    ]
  },
  {
    code: 'OH', name: 'Ohio', nameZh: '俄亥俄州',
    cities: [
      { name: 'Columbus', postal: ['43201', '43202', '43204', '43206', '43209', '43212', '43214', '43215', '43220'], areaCode: '614' },
      { name: 'Cleveland', postal: ['44102', '44103', '44106', '44109', '44113', '44114', '44118'], areaCode: '216' },
      { name: 'Cincinnati', postal: ['45202', '45203', '45206', '45208', '45211', '45219', '45226'], areaCode: '513' }
    ]
  },
  {
    code: 'GA', name: 'Georgia', nameZh: '佐治亚州',
    cities: [
      { name: 'Atlanta', postal: ['30303', '30305', '30306', '30307', '30308', '30309', '30312', '30318', '30324'], areaCode: '404' },
      { name: 'Savannah', postal: ['31401', '31404', '31405', '31406', '31410'], areaCode: '912' },
      { name: 'Augusta', postal: ['30901', '30904', '30906', '30907', '30909'], areaCode: '706' }
    ]
  },
  {
    code: 'MA', name: 'Massachusetts', nameZh: '马萨诸塞州',
    cities: [
      { name: 'Boston', postal: ['02108', '02109', '02110', '02113', '02114', '02115', '02116', '02118', '02127', '02130', '02215'], areaCode: '617' },
      { name: 'Cambridge', postal: ['02138', '02139', '02140', '02141', '02142'], areaCode: '617' },
      { name: 'Worcester', postal: ['01602', '01604', '01605', '01608', '01609'], areaCode: '508' }
    ]
  },
  {
    code: 'CO', name: 'Colorado', nameZh: '科罗拉多州',
    cities: [
      { name: 'Denver', postal: ['80202', '80203', '80205', '80206', '80209', '80210', '80211', '80218', '80220'], areaCode: '303' },
      { name: 'Colorado Springs', postal: ['80903', '80904', '80906', '80909', '80918', '80920'], areaCode: '719' },
      { name: 'Boulder', postal: ['80301', '80302', '80303', '80304', '80305'], areaCode: '303' }
    ]
  },
  {
    code: 'AZ', name: 'Arizona', nameZh: '亚利桑那州',
    cities: [
      { name: 'Phoenix', postal: ['85003', '85004', '85006', '85012', '85014', '85016', '85018', '85020', '85028'], areaCode: '602' },
      { name: 'Tucson', postal: ['85701', '85704', '85705', '85710', '85712', '85716', '85719'], areaCode: '520' },
      { name: 'Scottsdale', postal: ['85250', '85251', '85254', '85257', '85260'], areaCode: '480' }
    ]
  }
];

const GB_REGIONS = [
  {
    code: 'ENG', name: 'England', nameZh: '英格兰',
    cities: [
      { name: 'London', outward: ['N1', 'NW1', 'NW3', 'E1', 'E2', 'E8', 'E14', 'EC1V', 'EC2A', 'SE1', 'SE10', 'SE15', 'SW2', 'SW4', 'SW11', 'W2', 'W4', 'W6', 'W11', 'WC1X'], areaCode: '20' },
      { name: 'Manchester', outward: ['M1', 'M2', 'M3', 'M4', 'M13', 'M14', 'M15', 'M16', 'M20', 'M21'], areaCode: '161' },
      { name: 'Birmingham', outward: ['B1', 'B2', 'B3', 'B5', 'B12', 'B13', 'B15', 'B16', 'B17', 'B29'], areaCode: '121' },
      { name: 'Liverpool', outward: ['L1', 'L2', 'L3', 'L4', 'L6', 'L7', 'L8', 'L15', 'L17', 'L18'], areaCode: '151' },
      { name: 'Leeds', outward: ['LS1', 'LS2', 'LS3', 'LS4', 'LS6', 'LS7', 'LS8', 'LS11'], areaCode: '113' },
      { name: 'Bristol', outward: ['BS1', 'BS2', 'BS3', 'BS4', 'BS5', 'BS6', 'BS7', 'BS8'], areaCode: '117' },
      { name: 'Newcastle upon Tyne', outward: ['NE1', 'NE2', 'NE3', 'NE4', 'NE5', 'NE6', 'NE7'], areaCode: '191' }
    ]
  },
  {
    code: 'SCT', name: 'Scotland', nameZh: '苏格兰',
    cities: [
      { name: 'Edinburgh', outward: ['EH1', 'EH2', 'EH3', 'EH4', 'EH6', 'EH7', 'EH8', 'EH9', 'EH10', 'EH11'], areaCode: '131' },
      { name: 'Glasgow', outward: ['G1', 'G2', 'G3', 'G4', 'G5', 'G11', 'G12', 'G13', 'G20', 'G41'], areaCode: '141' },
      { name: 'Aberdeen', outward: ['AB10', 'AB11', 'AB15', 'AB16', 'AB24', 'AB25'], areaCode: '1224' }
    ]
  },
  {
    code: 'WLS', name: 'Wales', nameZh: '威尔士',
    cities: [
      { name: 'Cardiff', outward: ['CF10', 'CF11', 'CF14', 'CF23', 'CF24'], areaCode: '29' },
      { name: 'Swansea', outward: ['SA1', 'SA2', 'SA3', 'SA5', 'SA6', 'SA7'], areaCode: '1792' }
    ]
  },
  {
    code: 'NIR', name: 'Northern Ireland', nameZh: '北爱尔兰',
    cities: [
      { name: 'Belfast', outward: ['BT1', 'BT2', 'BT5', 'BT6', 'BT7', 'BT9', 'BT10', 'BT12', 'BT15'], areaCode: '28' },
      { name: 'Derry', outward: ['BT47', 'BT48'], areaCode: '28' }
    ]
  }
];

const JP_REGIONS = [
  {
    code: 'TOKYO', name: '東京都', nameEn: 'Tokyo', nameZh: '东京都',
    cities: [
      {
        name: '新宿区', nameEn: 'Shinjuku-ku', areaCode: '3',
        districts: [
          { name: '新宿', nameEn: 'Shinjuku', postal: '160-0022' },
          { name: '西新宿', nameEn: 'Nishishinjuku', postal: '160-0023' },
          { name: '高田馬場', nameEn: 'Takadanobaba', postal: '169-0075' },
          { name: '四谷', nameEn: 'Yotsuya', postal: '160-0004' }
        ]
      },
      {
        name: '渋谷区', nameEn: 'Shibuya-ku', areaCode: '3',
        districts: [
          { name: '渋谷', nameEn: 'Shibuya', postal: '150-0002' },
          { name: '恵比寿', nameEn: 'Ebisu', postal: '150-0013' },
          { name: '代々木', nameEn: 'Yoyogi', postal: '151-0053' },
          { name: '神宮前', nameEn: 'Jingumae', postal: '150-0001' }
        ]
      },
      {
        name: '港区', nameEn: 'Minato-ku', areaCode: '3',
        districts: [
          { name: '六本木', nameEn: 'Roppongi', postal: '106-0032' },
          { name: '赤坂', nameEn: 'Akasaka', postal: '107-0052' },
          { name: '芝浦', nameEn: 'Shibaura', postal: '108-0023' },
          { name: '南青山', nameEn: 'Minamiaoyama', postal: '107-0062' }
        ]
      },
      {
        name: '台東区', nameEn: 'Taito-ku', areaCode: '3',
        districts: [
          { name: '上野', nameEn: 'Ueno', postal: '110-0005' },
          { name: '浅草', nameEn: 'Asakusa', postal: '111-0032' },
          { name: '蔵前', nameEn: 'Kuramae', postal: '111-0051' }
        ]
      }
    ]
  },
  {
    code: 'OSAKA', name: '大阪府', nameEn: 'Osaka', nameZh: '大阪府',
    cities: [
      {
        name: '大阪市北区', nameEn: 'Kita-ku, Osaka', areaCode: '6',
        districts: [
          { name: '梅田', nameEn: 'Umeda', postal: '530-0001' },
          { name: '中崎西', nameEn: 'Nakazakinishi', postal: '530-0015' },
          { name: '天神橋', nameEn: 'Tenjinbashi', postal: '530-0041' }
        ]
      },
      {
        name: '大阪市中央区', nameEn: 'Chuo-ku, Osaka', areaCode: '6',
        districts: [
          { name: '難波', nameEn: 'Namba', postal: '542-0076' },
          { name: '心斎橋筋', nameEn: 'Shinsaibashisuji', postal: '542-0085' },
          { name: '道修町', nameEn: 'Doshomachi', postal: '541-0045' }
        ]
      },
      {
        name: '堺市堺区', nameEn: 'Sakai-ku, Sakai', areaCode: '72',
        districts: [
          { name: '南瓦町', nameEn: 'Minamikawaramachi', postal: '590-0078' },
          { name: '甲斐町西', nameEn: 'Kaimachinishi', postal: '590-0964' }
        ]
      }
    ]
  },
  {
    code: 'KANAGAWA', name: '神奈川県', nameEn: 'Kanagawa', nameZh: '神奈川县',
    cities: [
      {
        name: '横浜市西区', nameEn: 'Nishi-ku, Yokohama', areaCode: '45',
        districts: [
          { name: 'みなとみらい', nameEn: 'Minatomirai', postal: '220-0012' },
          { name: '南幸', nameEn: 'Minamisaiwai', postal: '220-0005' },
          { name: '北幸', nameEn: 'Kitasaiwai', postal: '220-0004' }
        ]
      },
      {
        name: '横浜市中区', nameEn: 'Naka-ku, Yokohama', areaCode: '45',
        districts: [
          { name: '山下町', nameEn: 'Yamashitacho', postal: '231-0023' },
          { name: '元町', nameEn: 'Motomachi', postal: '231-0861' },
          { name: '石川町', nameEn: 'Ishikawacho', postal: '231-0868' }
        ]
      },
      {
        name: '鎌倉市', nameEn: 'Kamakura', areaCode: '467',
        districts: [
          { name: '小町', nameEn: 'Komachi', postal: '248-0006' },
          { name: '由比ガ浜', nameEn: 'Yuigahama', postal: '248-0014' },
          { name: '長谷', nameEn: 'Hase', postal: '248-0016' }
        ]
      }
    ]
  },
  {
    code: 'AICHI', name: '愛知県', nameEn: 'Aichi', nameZh: '爱知县',
    cities: [
      {
        name: '名古屋市中区', nameEn: 'Naka-ku, Nagoya', areaCode: '52',
        districts: [
          { name: '栄', nameEn: 'Sakae', postal: '460-0008' },
          { name: '錦', nameEn: 'Nishiki', postal: '460-0003' },
          { name: '大須', nameEn: 'Osu', postal: '460-0011' }
        ]
      },
      {
        name: '名古屋市中村区', nameEn: 'Nakamura-ku, Nagoya', areaCode: '52',
        districts: [
          { name: '名駅', nameEn: 'Meieki', postal: '450-0002' },
          { name: '太閤', nameEn: 'Taiko', postal: '453-0811' }
        ]
      }
    ]
  },
  {
    code: 'HOKKAIDO', name: '北海道', nameEn: 'Hokkaido', nameZh: '北海道',
    cities: [
      {
        name: '札幌市中央区', nameEn: 'Chuo-ku, Sapporo', areaCode: '11',
        districts: [
          { name: '大通西', nameEn: 'Odorinishi', postal: '060-0042' },
          { name: '南一条西', nameEn: 'Minami1jonishi', postal: '060-0061' },
          { name: '北一条西', nameEn: 'Kita1jonishi', postal: '060-0001' }
        ]
      },
      {
        name: '函館市', nameEn: 'Hakodate', areaCode: '138',
        districts: [
          { name: '五稜郭町', nameEn: 'Goryokakucho', postal: '040-0001' },
          { name: '本町', nameEn: 'Honcho', postal: '040-0011' }
        ]
      }
    ]
  },
  {
    code: 'FUKUOKA', name: '福岡県', nameEn: 'Fukuoka', nameZh: '福冈县',
    cities: [
      {
        name: '福岡市博多区', nameEn: 'Hakata-ku, Fukuoka', areaCode: '92',
        districts: [
          { name: '博多駅前', nameEn: 'Hakataekimae', postal: '812-0011' },
          { name: '祇園町', nameEn: 'Gionmachi', postal: '812-0038' }
        ]
      },
      {
        name: '福岡市中央区', nameEn: 'Chuo-ku, Fukuoka', areaCode: '92',
        districts: [
          { name: '天神', nameEn: 'Tenjin', postal: '810-0001' },
          { name: '大名', nameEn: 'Daimyo', postal: '810-0041' },
          { name: '今泉', nameEn: 'Imaizumi', postal: '810-0021' }
        ]
      },
      {
        name: '北九州市小倉北区', nameEn: 'Kokurakita-ku, Kitakyushu', areaCode: '93',
        districts: [
          { name: '京町', nameEn: 'Kyomachi', postal: '802-0002' },
          { name: '魚町', nameEn: 'Uomachi', postal: '802-0006' }
        ]
      }
    ]
  }
];

const FR_REGIONS = [
  {
    code: 'IDF', name: 'Île-de-France', nameZh: '法兰西岛大区', landline: '1',
    cities: [
      { name: 'Paris', postal: ['75001', '75003', '75005', '75006', '75008', '75010', '75011', '75013', '75015', '75017', '75018', '75020'] },
      { name: 'Boulogne-Billancourt', postal: ['92100'] },
      { name: 'Versailles', postal: ['78000'] }
    ]
  },
  {
    code: 'ARA', name: 'Auvergne-Rhône-Alpes', nameZh: '奥弗涅-罗讷-阿尔卑斯大区', landline: '4',
    cities: [
      { name: 'Lyon', postal: ['69001', '69002', '69003', '69004', '69005', '69006', '69007', '69008', '69009'] },
      { name: 'Grenoble', postal: ['38000', '38100'] },
      { name: 'Clermont-Ferrand', postal: ['63000', '63100'] }
    ]
  },
  {
    code: 'PAC', name: "Provence-Alpes-Côte d'Azur", nameZh: '普罗旺斯-阿尔卑斯-蓝色海岸大区', landline: '4',
    cities: [
      { name: 'Marseille', postal: ['13001', '13002', '13003', '13005', '13006', '13008', '13009'] },
      { name: 'Nice', postal: ['06000', '06100', '06200', '06300'] },
      { name: 'Aix-en-Provence', postal: ['13090', '13100'] }
    ]
  },
  {
    code: 'OCC', name: 'Occitanie', nameZh: '奥克西塔尼大区', landline: '5',
    cities: [
      { name: 'Toulouse', postal: ['31000', '31100', '31200', '31300', '31400', '31500'] },
      { name: 'Montpellier', postal: ['34000', '34070', '34080', '34090'] }
    ]
  },
  {
    code: 'NAQ', name: 'Nouvelle-Aquitaine', nameZh: '新阿基坦大区', landline: '5',
    cities: [
      { name: 'Bordeaux', postal: ['33000', '33100', '33200', '33300', '33800'] },
      { name: 'Limoges', postal: ['87000', '87100'] },
      { name: 'La Rochelle', postal: ['17000'] }
    ]
  },
  {
    code: 'GES', name: 'Grand Est', nameZh: '大东部大区', landline: '3',
    cities: [
      { name: 'Strasbourg', postal: ['67000', '67100', '67200'] },
      { name: 'Reims', postal: ['51100'] },
      { name: 'Nancy', postal: ['54000', '54100'] }
    ]
  },
  {
    code: 'HDF', name: 'Hauts-de-France', nameZh: '上法兰西大区', landline: '3',
    cities: [
      { name: 'Lille', postal: ['59000', '59160', '59260', '59800'] },
      { name: 'Amiens', postal: ['80000', '80080', '80090'] }
    ]
  },
  {
    code: 'PDL', name: 'Pays de la Loire', nameZh: '卢瓦尔河地区大区', landline: '2',
    cities: [
      { name: 'Nantes', postal: ['44000', '44100', '44200', '44300'] },
      { name: 'Angers', postal: ['49000', '49100'] },
      { name: 'Le Mans', postal: ['72000', '72100'] }
    ]
  },
  {
    code: 'BRE', name: 'Bretagne', nameZh: '布列塔尼大区', landline: '2',
    cities: [
      { name: 'Rennes', postal: ['35000', '35200', '35700'] },
      { name: 'Brest', postal: ['29200'] }
    ]
  },
  {
    code: 'NOR', name: 'Normandie', nameZh: '诺曼底大区', landline: '2',
    cities: [
      { name: 'Rouen', postal: ['76000', '76100'] },
      { name: 'Caen', postal: ['14000'] },
      { name: 'Le Havre', postal: ['76600', '76610', '76620'] }
    ]
  }
];

const DE_NAMES = {
  male: ['Alexander', 'Andreas', 'Christian', 'Daniel', 'David', 'Felix', 'Florian', 'Jan', 'Jonas', 'Julian', 'Leon', 'Lukas', 'Markus', 'Matthias', 'Maximilian', 'Michael', 'Niklas', 'Paul', 'Philipp', 'Sebastian', 'Stefan', 'Thomas', 'Tim', 'Tobias'],
  female: ['Anna', 'Christina', 'Claudia', 'Elena', 'Emilia', 'Emma', 'Hannah', 'Julia', 'Katharina', 'Katrin', 'Laura', 'Lea', 'Lena', 'Lisa', 'Marie', 'Melanie', 'Mia', 'Nicole', 'Nina', 'Sabine', 'Sandra', 'Sarah', 'Sophie', 'Vanessa'],
  last: ['Müller', 'Schmidt', 'Schneider', 'Fischer', 'Weber', 'Meyer', 'Wagner', 'Becker', 'Schulz', 'Hoffmann', 'Schäfer', 'Koch', 'Bauer', 'Richter', 'Klein', 'Wolf', 'Schröder', 'Neumann', 'Schwarz', 'Zimmermann', 'Braun', 'Krüger', 'Hartmann', 'Lange', 'Werner', 'Krause', 'Lehmann']
};

const US_NAMES = {
  male: ['James', 'John', 'Robert', 'Michael', 'William', 'David', 'Richard', 'Joseph', 'Thomas', 'Christopher', 'Daniel', 'Matthew', 'Anthony', 'Mark', 'Steven', 'Andrew', 'Joshua', 'Kevin', 'Brian', 'Ryan', 'Jacob', 'Ethan', 'Tyler', 'Brandon', 'Justin'],
  female: ['Mary', 'Jennifer', 'Linda', 'Elizabeth', 'Susan', 'Jessica', 'Sarah', 'Karen', 'Emily', 'Ashley', 'Amanda', 'Melissa', 'Michelle', 'Stephanie', 'Rebecca', 'Laura', 'Rachel', 'Katherine', 'Samantha', 'Nicole', 'Emma', 'Olivia', 'Hannah', 'Madison', 'Lauren'],
  last: ['Smith', 'Johnson', 'Williams', 'Brown', 'Jones', 'Garcia', 'Miller', 'Davis', 'Rodriguez', 'Martinez', 'Wilson', 'Anderson', 'Taylor', 'Thomas', 'Moore', 'Jackson', 'Martin', 'Lee', 'Thompson', 'White', 'Harris', 'Clark', 'Lewis', 'Walker', 'Young', 'Hall', 'Allen', 'King', 'Wright', 'Scott']
};

const GB_NAMES = {
  male: ['Oliver', 'George', 'Harry', 'Jack', 'Charlie', 'Thomas', 'Jacob', 'Alfie', 'Oscar', 'William', 'James', 'Henry', 'Leo', 'Joshua', 'Freddie', 'Archie', 'Ethan', 'Isaac', 'Alexander', 'Daniel', 'Edward', 'Samuel', 'Max', 'Callum', 'Liam'],
  female: ['Olivia', 'Amelia', 'Isla', 'Emily', 'Ava', 'Jessica', 'Poppy', 'Sophie', 'Isabella', 'Grace', 'Lily', 'Freya', 'Charlotte', 'Daisy', 'Alice', 'Ruby', 'Chloe', 'Evie', 'Florence', 'Ella', 'Millie', 'Lucy', 'Rosie', 'Phoebe', 'Holly'],
  last: ['Smith', 'Jones', 'Taylor', 'Brown', 'Williams', 'Wilson', 'Johnson', 'Davies', 'Robinson', 'Wright', 'Thompson', 'Evans', 'Walker', 'White', 'Roberts', 'Green', 'Hall', 'Wood', 'Jackson', 'Clarke', 'Patel', 'Turner', 'Hughes', 'Edwards', 'Cooper', 'Ward', 'Morris', 'King', 'Watson', 'Baker']
};

const JP_NAMES = {
  male: [
    { kanji: '蓮', romaji: 'Ren' }, { kanji: '陽翔', romaji: 'Haruto' }, { kanji: '湊', romaji: 'Minato' },
    { kanji: '樹', romaji: 'Itsuki' }, { kanji: '大翔', romaji: 'Hiroto' }, { kanji: '悠真', romaji: 'Yuma' },
    { kanji: '陸', romaji: 'Riku' }, { kanji: '翔太', romaji: 'Shota' }, { kanji: '健太', romaji: 'Kenta' },
    { kanji: '大輔', romaji: 'Daisuke' }, { kanji: '拓海', romaji: 'Takumi' }, { kanji: '直樹', romaji: 'Naoki' },
    { kanji: '亮太', romaji: 'Ryota' }, { kanji: '和也', romaji: 'Kazuya' }, { kanji: '雄大', romaji: 'Yudai' },
    { kanji: '康平', romaji: 'Kohei' }, { kanji: '慎一', romaji: 'Shinichi' }, { kanji: '啓太', romaji: 'Keita' }
  ],
  female: [
    { kanji: '陽葵', romaji: 'Himari' }, { kanji: '凛', romaji: 'Rin' }, { kanji: '結衣', romaji: 'Yui' },
    { kanji: '葵', romaji: 'Aoi' }, { kanji: '紬', romaji: 'Tsumugi' }, { kanji: '莉子', romaji: 'Riko' },
    { kanji: '美咲', romaji: 'Misaki' }, { kanji: '花音', romaji: 'Kanon' }, { kanji: 'さくら', romaji: 'Sakura' },
    { kanji: '真由美', romaji: 'Mayumi' }, { kanji: '直子', romaji: 'Naoko' }, { kanji: '恵美', romaji: 'Emi' },
    { kanji: '千夏', romaji: 'Chinatsu' }, { kanji: '春香', romaji: 'Haruka' }, { kanji: '美穂', romaji: 'Miho' },
    { kanji: '綾乃', romaji: 'Ayano' }, { kanji: '里奈', romaji: 'Rina' }, { kanji: '優花', romaji: 'Yuka' }
  ],
  last: [
    { kanji: '佐藤', romaji: 'Sato' }, { kanji: '鈴木', romaji: 'Suzuki' }, { kanji: '高橋', romaji: 'Takahashi' },
    { kanji: '田中', romaji: 'Tanaka' }, { kanji: '伊藤', romaji: 'Ito' }, { kanji: '渡辺', romaji: 'Watanabe' },
    { kanji: '山本', romaji: 'Yamamoto' }, { kanji: '中村', romaji: 'Nakamura' }, { kanji: '小林', romaji: 'Kobayashi' },
    { kanji: '加藤', romaji: 'Kato' }, { kanji: '吉田', romaji: 'Yoshida' }, { kanji: '山田', romaji: 'Yamada' },
    { kanji: '佐々木', romaji: 'Sasaki' }, { kanji: '山口', romaji: 'Yamaguchi' }, { kanji: '松本', romaji: 'Matsumoto' },
    { kanji: '井上', romaji: 'Inoue' }, { kanji: '木村', romaji: 'Kimura' }, { kanji: '林', romaji: 'Hayashi' },
    { kanji: '斎藤', romaji: 'Saito' }, { kanji: '清水', romaji: 'Shimizu' }
  ]
};

const FR_NAMES = {
  male: ['Lucas', 'Hugo', 'Gabriel', 'Louis', 'Arthur', 'Jules', 'Raphaël', 'Léo', 'Paul', 'Nathan', 'Thomas', 'Théo', 'Antoine', 'Maxime', 'Alexandre', 'Nicolas', 'Julien', 'Pierre', 'Quentin', 'Romain', 'Clément', 'Baptiste', 'Étienne', 'Mathis', 'Adam'],
  female: ['Emma', 'Louise', 'Jade', 'Alice', 'Chloé', 'Lina', 'Léa', 'Rose', 'Anna', 'Inès', 'Camille', 'Manon', 'Juliette', 'Sarah', 'Zoé', 'Clara', 'Marie', 'Lucie', 'Charlotte', 'Mathilde', 'Amélie', 'Élise', 'Margaux', 'Océane', 'Pauline'],
  last: ['Martin', 'Bernard', 'Thomas', 'Petit', 'Robert', 'Richard', 'Durand', 'Dubois', 'Moreau', 'Laurent', 'Simon', 'Michel', 'Lefebvre', 'Leroy', 'Roux', 'David', 'Bertrand', 'Morel', 'Fournier', 'Girard', 'Bonnet', 'Dupont', 'Lambert', 'Fontaine', 'Rousseau', 'Vincent', 'Mercier', 'Blanc']
};

export const ADDRESS_COUNTRIES = Object.freeze([
  {
    code: 'DE', label: '德国', labelEn: 'Germany', flag: '🇩🇪', phoneCode: '+49',
    regionLabel: '联邦州', regions: DE_REGIONS, streets: DE_STREETS, names: DE_NAMES,
    emailDomains: ['gmail.com', 'web.de', 'gmx.de', 't-online.de', 'outlook.de'],
    mobilePrefixes: ['151', '152', '157', '160', '162', '170', '171', '172', '175', '176', '177', '178', '179']
  },
  {
    code: 'US', label: '美国', labelEn: 'United States', flag: '🇺🇸', phoneCode: '+1',
    regionLabel: '州', regions: US_REGIONS, streets: US_STREETS, names: US_NAMES,
    emailDomains: ['gmail.com', 'outlook.com', 'yahoo.com', 'icloud.com', 'hotmail.com'],
    mobilePrefixes: []
  },
  {
    code: 'GB', label: '英国', labelEn: 'United Kingdom', flag: '🇬🇧', phoneCode: '+44',
    regionLabel: '构成国', regions: GB_REGIONS, streets: GB_STREETS, names: GB_NAMES,
    emailDomains: ['gmail.com', 'outlook.com', 'yahoo.co.uk', 'hotmail.co.uk', 'btinternet.com'],
    mobilePrefixes: ['7400', '7423', '7456', '7511', '7522', '7700', '7712', '7745', '7801', '7823', '7845', '7911', '7930', '7956', '7984']
  },
  {
    code: 'JP', label: '日本', labelEn: 'Japan', flag: '🇯🇵', phoneCode: '+81',
    regionLabel: '都道府县', regions: JP_REGIONS, streets: [], names: JP_NAMES,
    emailDomains: ['gmail.com', 'yahoo.co.jp', 'outlook.jp', 'icloud.com'],
    mobilePrefixes: ['90', '80', '70']
  },
  {
    code: 'FR', label: '法国', labelEn: 'France', flag: '🇫🇷', phoneCode: '+33',
    regionLabel: '大区', regions: FR_REGIONS, streets: FR_STREETS, names: FR_NAMES,
    emailDomains: ['gmail.com', 'outlook.fr', 'orange.fr', 'free.fr', 'laposte.net'],
    mobilePrefixes: ['6', '7']
  }
]);

export function findAddressCountry(code) {
  const normalized = String(code || '').trim().toUpperCase();
  return ADDRESS_COUNTRIES.find((item) => item.code === normalized) || null;
}

export function listAddressRegions(countryCode) {
  const country = findAddressCountry(countryCode);
  if (!country) return [];
  return country.regions.map((region) => ({
    code: region.code,
    name: region.name,
    nameZh: region.nameZh || region.name
  }));
}

const LATIN_CHAR_MAP = {
  'ä': 'ae', 'ö': 'oe', 'ü': 'ue', 'ß': 'ss', 'é': 'e', 'è': 'e', 'ê': 'e', 'ë': 'e',
  'à': 'a', 'â': 'a', 'î': 'i', 'ï': 'i', 'ô': 'o', 'û': 'u', 'ù': 'u', 'ç': 'c',
  'œ': 'oe', 'æ': 'ae'
};

function slugifyLatin(text) {
  const lower = String(text || '').toLowerCase();
  let output = '';
  for (const char of lower) output += LATIN_CHAR_MAP[char] ?? char;
  return output.normalize('NFD').replace(/[̀-ͯ]/g, '').replace(/[^a-z0-9]/g, '');
}

function createRandomSource(randomValues) {
  const injected = randomValues && randomValues.length
    ? Array.from(randomValues, (value) => (Number(value) >>> 0))
    : null;
  let cursor = 0;
  let buffer = null;
  let bufferIndex = 0;
  const nextUint = () => {
    if (injected) {
      const value = injected[cursor % injected.length];
      cursor += 1;
      return value;
    }
    if (!buffer || bufferIndex >= buffer.length) {
      buffer = new Uint32Array(64);
      globalThis.crypto.getRandomValues(buffer);
      bufferIndex = 0;
    }
    const value = buffer[bufferIndex];
    bufferIndex += 1;
    return value;
  };
  const next = () => nextUint() / 4294967296;
  const int = (min, max) => min + Math.floor(next() * (max - min + 1));
  return {
    next,
    int,
    pick: (list) => list[Math.floor(next() * list.length)],
    chance: (probability) => next() < probability,
    digits: (length) => {
      let output = '';
      for (let index = 0; index < length; index += 1) output += String(int(0, 9));
      return output;
    }
  };
}

function resolveRegion(country, regionCode, rng) {
  const normalized = String(regionCode || '').trim();
  if (normalized && normalized !== 'random') {
    const found = country.regions.find((region) => region.code === normalized);
    if (found) return found;
  }
  return rng.pick(country.regions);
}

function buildBirthday(rng, now) {
  const age = rng.int(18, 60);
  const month = rng.int(1, 12);
  const day = rng.int(1, 28);
  let year = now.getFullYear() - age;
  const hadBirthdayThisYear = month < now.getMonth() + 1 || (month === now.getMonth() + 1 && day <= now.getDate());
  if (!hadBirthdayThisYear) year -= 1;
  const birthday = `${year}-${String(month).padStart(2, '0')}-${String(day).padStart(2, '0')}`;
  return { birthday, age };
}

function buildEmail(country, firstLatin, lastLatin, birthday, rng) {
  const first = slugifyLatin(firstLatin);
  const last = slugifyLatin(lastLatin);
  const year = birthday.slice(2, 4);
  const patterns = [
    `${first}.${last}`,
    `${first}${last}`,
    `${first.charAt(0)}${last}`,
    `${last}.${first}`
  ];
  let local = rng.pick(patterns);
  if (rng.chance(0.5)) local += rng.chance(0.5) ? year : String(rng.int(1, 99));
  return `${local}@${rng.pick(country.emailDomains)}`;
}

function buildSubscriberDigits(rng, length) {
  return String(rng.int(2, 9)) + rng.digits(Math.max(0, length - 1));
}

function buildPhone(country, region, city, rng) {
  if (country.code === 'DE') {
    if (rng.chance(0.6)) {
      const prefix = rng.pick(country.mobilePrefixes);
      const number = buildSubscriberDigits(rng, 7);
      return { phone: `0${prefix} ${number}`, phoneIntl: `+49 ${prefix} ${number}` };
    }
    const number = buildSubscriberDigits(rng, 7 - Math.max(0, city.areaCode.length - 3));
    return { phone: `0${city.areaCode} ${number}`, phoneIntl: `+49 ${city.areaCode} ${number}` };
  }
  if (country.code === 'US') {
    const secondDigit = rng.int(0, 9);
    const thirdDigit = secondDigit === 1 ? rng.pick([0, 2, 3, 4, 5, 6, 7, 8, 9]) : rng.int(0, 9);
    const exchange = `${rng.int(2, 9)}${secondDigit}${thirdDigit}`;
    const line = rng.digits(4);
    return {
      phone: `(${city.areaCode}) ${exchange}-${line}`,
      phoneIntl: `+1 ${city.areaCode}-${exchange}-${line}`
    };
  }
  if (country.code === 'GB') {
    if (rng.chance(0.7)) {
      const prefix = rng.pick(country.mobilePrefixes);
      const number = rng.digits(6);
      return { phone: `0${prefix} ${number}`, phoneIntl: `+44 ${prefix} ${number}` };
    }
    const area = city.areaCode;
    const partOne = area.length <= 2 ? `${rng.pick([3, 7, 8])}${rng.digits(3)}` : rng.digits(3);
    const partTwo = rng.digits(4);
    return { phone: `0${area} ${partOne} ${partTwo}`, phoneIntl: `+44 ${area} ${partOne} ${partTwo}` };
  }
  if (country.code === 'JP') {
    if (rng.chance(0.7)) {
      const prefix = rng.pick(country.mobilePrefixes);
      const partOne = rng.digits(4);
      const partTwo = rng.digits(4);
      return { phone: `0${prefix}-${partOne}-${partTwo}`, phoneIntl: `+81 ${prefix}-${partOne}-${partTwo}` };
    }
    const area = city.areaCode;
    const subscriberLength = 9 - area.length;
    const splitIndex = subscriberLength - 4;
    const subscriber = buildSubscriberDigits(rng, subscriberLength);
    const partOne = subscriber.slice(0, splitIndex);
    const partTwo = subscriber.slice(splitIndex);
    return { phone: `0${area}-${partOne}-${partTwo}`, phoneIntl: `+81 ${area}-${partOne}-${partTwo}` };
  }
  const mobile = rng.chance(0.6);
  const lead = mobile ? rng.pick(country.mobilePrefixes) : region.landline;
  const pairs = Array.from({ length: 4 }, () => rng.digits(2));
  return {
    phone: `0${lead} ${pairs.join(' ')}`,
    phoneIntl: `+33 ${lead} ${pairs.join(' ')}`
  };
}

function buildPlace(country, region, rng) {
  const city = rng.pick(region.cities);
  if (country.code === 'JP') {
    const district = rng.pick(city.districts);
    const chome = rng.int(1, 6);
    const ban = rng.int(1, 24);
    const go = rng.int(1, 18);
    const streetLine = `${district.name}${chome}丁目${ban}-${go}`;
    const cityHasRegionSuffix = city.nameEn.includes(', ');
    const intlCityPart = cityHasRegionSuffix ? city.nameEn : `${city.nameEn}, ${region.nameEn}`;
    return {
      city,
      district: district.name,
      postalCode: `〒${district.postal}`,
      streetLine,
      addressLocal: `〒${district.postal}\n${region.name}${city.name}${streetLine}`,
      addressIntl: `${chome}-${ban}-${go} ${district.nameEn}, ${intlCityPart} ${district.postal}, Japan`
    };
  }
  if (country.code === 'GB') {
    const outward = rng.pick(city.outward);
    const inward = `${rng.int(0, 9)}${rng.pick([...POSTCODE_INWARD_LETTERS])}${rng.pick([...POSTCODE_INWARD_LETTERS])}`;
    const postalCode = `${outward} ${inward}`;
    const house = rng.int(1, 196);
    const streetLine = `${house} ${rng.pick(country.streets)}`;
    return {
      city,
      district: '',
      postalCode,
      streetLine,
      addressLocal: `${streetLine}\n${city.name}\n${postalCode}`,
      addressIntl: `${streetLine}, ${city.name} ${postalCode}, United Kingdom`
    };
  }
  const postalCode = rng.pick(city.postal);
  if (country.code === 'US') {
    const streetLine = `${rng.int(100, 9899)} ${rng.pick(country.streets)}`;
    return {
      city,
      district: '',
      postalCode,
      streetLine,
      addressLocal: `${streetLine}\n${city.name}, ${region.code} ${postalCode}`,
      addressIntl: `${streetLine}, ${city.name}, ${region.code} ${postalCode}, United States`
    };
  }
  if (country.code === 'FR') {
    const streetLine = `${rng.int(1, 178)} ${rng.pick(country.streets)}`;
    return {
      city,
      district: '',
      postalCode,
      streetLine,
      addressLocal: `${streetLine}\n${postalCode} ${city.name}`,
      addressIntl: `${streetLine}, ${postalCode} ${city.name}, France`
    };
  }
  let house = String(rng.int(1, 158));
  if (rng.chance(0.08)) house += rng.pick(['a', 'b', 'c']);
  const streetLine = `${rng.pick(country.streets)} ${house}`;
  return {
    city,
    district: '',
    postalCode,
    streetLine,
    addressLocal: `${streetLine}\n${postalCode} ${city.name}`,
    addressIntl: `${streetLine}, ${postalCode} ${city.name}, ${region.name}, Germany`
  };
}

function buildPerson(country, gender, rng) {
  if (country.code === 'JP') {
    const first = rng.pick(country.names[gender]);
    const last = rng.pick(country.names.last);
    return {
      fullName: `${last.kanji} ${first.kanji}`,
      fullNameEn: `${first.romaji} ${last.romaji}`,
      firstLatin: first.romaji,
      lastLatin: last.romaji
    };
  }
  const first = rng.pick(country.names[gender]);
  const last = rng.pick(country.names.last);
  return { fullName: `${first} ${last}`, fullNameEn: `${first} ${last}`, firstLatin: first, lastLatin: last };
}

function generateOneProfile(country, options, rng, now, index) {
  const region = resolveRegion(country, options.region, rng);
  const gender = options.gender === 'male' || options.gender === 'female'
    ? options.gender
    : (rng.chance(0.5) ? 'male' : 'female');
  const person = buildPerson(country, gender, rng);
  const { birthday, age } = buildBirthday(rng, now);
  const place = buildPlace(country, region, rng);
  const email = buildEmail(country, person.firstLatin, person.lastLatin, birthday, rng);
  const { phone, phoneIntl } = buildPhone(country, region, place.city, rng);
  return {
    id: `addr-${now.getTime().toString(36)}-${index}-${rng.int(0, 0xffff).toString(16)}`,
    generatedAt: now.toISOString(),
    country: country.code,
    countryLabel: country.label,
    countryEn: country.labelEn,
    flag: country.flag,
    regionCode: region.code,
    regionName: region.name,
    regionZh: region.nameZh || region.name,
    regionFieldLabel: country.regionLabel,
    gender,
    genderLabel: gender === 'male' ? '男' : '女',
    fullName: person.fullName,
    fullNameEn: person.fullNameEn,
    birthday,
    age,
    email,
    phone,
    phoneIntl,
    city: place.city.name,
    district: place.district,
    postalCode: place.postalCode,
    streetLine: place.streetLine,
    addressLocal: place.addressLocal,
    addressIntl: place.addressIntl
  };
}

export function generateAddressProfiles(options = {}, randomValues) {
  const country = findAddressCountry(options.country) || ADDRESS_COUNTRIES[0];
  const count = Math.min(10, Math.max(1, Math.trunc(Number(options.count) || 1)));
  const rng = createRandomSource(randomValues);
  const now = options.now ? new Date(options.now) : new Date();
  if (Number.isNaN(now.getTime())) throw new Error('无效的时间基准');
  const profiles = [];
  for (let index = 0; index < count; index += 1) {
    profiles.push(generateOneProfile(country, options, rng, now, index));
  }
  return profiles;
}

export function formatAddressProfileText(profile) {
  if (!profile) return '';
  const lines = [
    `姓名: ${profile.fullName}${profile.fullNameEn !== profile.fullName ? ` (${profile.fullNameEn})` : ''}`,
    `性别: ${profile.genderLabel}`,
    `生日: ${profile.birthday} (${profile.age} 岁)`,
    `邮箱: ${profile.email}`,
    `电话: ${profile.phone} / ${profile.phoneIntl}`,
    `国家: ${profile.countryLabel} (${profile.countryEn})`,
    `${profile.regionFieldLabel}: ${profile.regionName}${profile.regionZh !== profile.regionName ? ` · ${profile.regionZh}` : ''}`,
    `城市: ${profile.city}`,
    `邮编: ${profile.postalCode}`,
    `街道: ${profile.streetLine}`,
    '本地格式:',
    profile.addressLocal,
    '国际格式:',
    profile.addressIntl
  ];
  return lines.join('\n');
}
