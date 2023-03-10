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

## Metoda wytwórcza

Wzorzec kreacyjny, który udostepnia intefejs do tworzenia obiektów w ramach klasy bazowej, ale pozwala podklasom zmieniać typ tworzonych obiektów.
W praktyce tworzymy metodę która opakowuje tworzenie obiektu.
Po co nam to?
- Możemy mieć skomplikowana logikę biznesowa która jest potrzebna przed stworzeniem obiektu
- Możemy użyć polimofizmu i zdecydować jaki typ obiektu utworzyć

Używamy, jeżeli na wejściu nie wiemy jaki obiekt chcemy utworzyć i mamy jakas logikę która stoi przy tworzeniu tych obiektów.
Czyli mamy produkt czyli obiekt, który chcemy utworzyć i klasę factory, która definiuje jak tworzy obiekt.

#### Argumenty za:

- SRP - kod kreacyjny jest w jednym miejscu w programie
- Łatwo rozszerzać o nowe sposoby tworzenia obiektów

## Strategia

Wzorzec behawioralny, który pozwala zdefiniować rodzinę algorytmy i umieścić je w osobnych klasach i uczynić obiekty tych klas wymienialnymi
np. 3 sposoby przewozu paczek i w różnych przypadkach chcemy użyć innego algorytmu
np. Mamy implementację listy i wstrzykujemy do niej różne strategie sortowania


#### Argumenty za:
- Można odizolować szczegóły implementacyjne algorytmu od kodu, który z niego korzysta
- Zmiana dziedziczenia na kompozycję
- Open/Close Principle - Łatwo rozszerzać poprzez dodanie nowych strategii bez zmian w kotekście

#### Argumenty przeciw:

- Klienci muszą być świadomi różnic pomiędzy poszczególnymi strategiami, aby mogli wybrać właściwą.
Jeśli masz zaledwie kilka algorytmów i rzadko ulegają one zmianie, nie ma wyraźnej potrzeby nadmiernego komplikowania programu przez dodawanie nowych klas i interfejsów związanych z tym wzorcem.
- Wiele nowoczesnych języków programowania posiada wsparcie dla typów funkcyjnych pozwalających zaimplementować różne wersje algorytmu wewnątrz zestawu anonimowych funkcji. Można następnie korzystać z tych funkcji dokładnie tak jak z obiektów strategia, ale bez konieczności rozbudowy kodu o kolejne klasy i interfejsy.