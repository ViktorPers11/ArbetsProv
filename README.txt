Hej! Tackar så mycket för chansen att få göra det här provet, det var väldigt roligt och jag som normal arbetar med C# 
i min vardag fann det väldigt intressant och lärande att skriva ett program i Java. 

Jag använde mig av Spring Boot för jag såg i er annons att ni använde det. Det i sin tur gjorde att det inte behövdes särskilt mycket
JavaScript. Sen har jag aldig heller ens hört talas om Spring Boot innan jag började skriva detta, så jag hoppas inte min 
implementation är helt katastrof!

För att köra applikationen genom Spring Boot behöver ni göra följande (ni vet antagligen redan detta men för säkerhets skull):

1) Använde valfri CLI (jag körde kommandotolken) för att ställa er på .../ArbetsProv/ArbetsProv (Där filerna för programmet ligger)

2) Skriv sedan in ".\gradlew.bat bootRun" om ni kör Windows eller "./gradlew bootRun" om ni kör Linux/Mac

3) Gå in på localhost/8080/hello så ska hemsidan dyka upp!

OBS! Ibland kommer det en 500-sida. Detta beror på att något inte hinner med (antagligen med API:erna) och då blir det en exception. Det brukar åtgärdas av att refresha några gånger.
Hade antagligen kunnat lösa med att köra lite awaits, men det kändes lite överkurs för detta testet. 

Låt mig veta om något är konstigt eller om det dyker upp frågor.

Ha det fint!

Med vänlig hälsning, Viktor Persson