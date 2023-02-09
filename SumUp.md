This file contain summaries of topics.

Section 4(xml conf.)
Bean galima suprasti kaip "objektą". Galima sukurti xml file, kuriame aprašome, kuri klasė yra bean.

Section 5 (depedency injection - xml configuration)
Norint atlikti dependency injection, reikia xml file įtraukti contstruct-arg ir nurodyti beans id, kurį norima įtraukti.
Taip pat galima atlikti settter injection. Reikalingas <Property/>

Section 6 (lifecycle&scope)
Bean scope yra singleton, propotype, request, session, global-session. Singleaton sukuriama į tą pačią atminties vietą, propotype į skirtingą.
Request su kiekvienu nauju http užklausa,o session su kiekviena http sesija.
    Bean turi lifecycle. Init() ir destroy ().Init() executed kada bean yra instantiated, o destroy() kuomet spring'o konteineris užsidaro.
Tiek bean scope, tiek bean lifecycle reikia nurodyti xml file. Atitinkamai pavyzdžiai yra beanLifeCycle.xml(init-method/destroy-method) ir beanScope.xml

Section 7(annotations - IoC)
Norint naudoti annotation su xml file, reikia xml file nurodyti package, kurį skanuoti(annotations.xml). Tuomet virš kiekvienos klasės parašome @component anotaciją.
Jeigu nenurodomas pavadinimas ("") šalia @component, tuomet būna default klasės pavadinimas, kuris prasideda iš mažosios.
Jeigu klasės pirmosios dvi raidės prasideda iš didžiųjų raidžių, tuomet bean pavadinimas lygiai toks pats, koks ir klasės pavadinimas

Section 8(annotations - depedency Injection)
Norint atlikti constructor injection rašoma @autowired anotacija virš field, arba constructor, setter .Svarbu paminėti, kad @autowired nėra būtinas, bet dėl
aiškumo galima parašyti. Jeigu yra multiple implementations, tuomet reikia naudoti
@Qualifier ir noridyti atitinkamai id(klasės pavadinimą, kurią norimą inject)
Taip pat galima inject properties file naudojant @value anotaciją bei nurodant xml file, kad įtraukti properties bei kur ieškoti.(sport.properties ir spring.xml pavyzdys)

Section 9(Annotations - bean scopes and lifecycle methods)

Norint nurodyti scope, virš klasės nurodome anotaciją @Scope(), su scope tipu.
Norint nurodyti lifecycle, virš metodo rašome anotacija @PostConstruct arba @PreDestroy. Atitinkamai yra init arba destroy.
@PreDestroy neveikia, kuomet bean scope prototype.

Section 10(Java conf without xml)

Sukuriamas config file(ex SportConfig). Virš klasės uždeda anotacija @Configuration. Toliau yra du būdai. Pirmasis uždėti
anotaciją @ComponentScan("name")(ex SwimCoach) ir mainapp'e naudojam AnnotationConfigApplicationContext. Toliau viskas tas pats kaip su xml.
Antrasis kelias yra nenaudoti @ComponentScan, o viduje config.class naudoti @Bean. Pirmiausia, sukuriamas bean(ex SportConfig).
Po to tas bean naudojamas gali būti naudojamas dependency injection. Tam sukuriamas kitas beans. Metodo pavadinimas yra bean id.
Toliau viskas vėl tas pats.

Section 11 (Spring MVC)

Model-View-Controller. Model - saugomi ir perduodami duomenys, objektai. View - ką mato vartotojas. Controller - visa logika


