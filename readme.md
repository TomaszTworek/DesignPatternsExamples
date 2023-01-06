## Singleton

Wzorzec kreacyjny, który pozwala na istenieje wyłacznie jednej instancji danej klasy. Zapewnia też globalny dostęp do tej instancji.

#### Argumenty za:
- wiemy, że zawsze korzystamy z tej samej instancji danej klasy.

#### Argumenty przeciw:

- Ciężko jest utrzymać globalne obiekty dlatego czasem ludzie mówia, że to anty pattern.
- Zakładanie, że potrzebuje tylko jednej instancji danej klasy nie zawsze jest poprawne, bo zawsze może się to rozszerzyć
- Spoko jak mamy jedna instancje ale nie spoko, że nie możemy tworzyć nowych.

Przykłady: 
- Database connector
- Government

## Builder

Wzorzec kracyjny, który daje możliwość tworzenia złożonych obiektów etapmi, dzięki czemu nie musimy pamiętać o kolejności argumentów.

#### Argumenty za:
- Mamy możliwość dowolnej konfiguracji obiektu, wypełniajac tylko niezbędne pola.
- Nie musimy pamiętać ko kolejności parametrów w konstruktorze.
- Można konstruować obiekty etapami

#### Argumenty przeciw:

- Skomplikowany kod na start (rozwiazuje to biblioteka Lombok)



