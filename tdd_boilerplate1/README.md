# TDD Live Session - ćwiczenia praktyczne

## *BargainMaestro* - aplikacja do wyszukania najtańszego sklepu 

### Opis aplikacji

#### Ogólne wymagania

Jako konsument chciałbym wiedzieć, w którym sklepie najkorzystniej dokonam zakupu towarów, które umieściłem
na liście zakupów. Chcę kupić wszystko w jednym sklepie, żeby uniknąć straty czasu na chodzenie po wielu 
sklepach - nie interesuje mnie najniższa cena każdego z artukułów tylko najniższa cena za cały koszyk.

#### Architektura

Aplikacja będzie dostarczona w formie biblioteki do wykorzystania z zewnętrznego programu. Powinna 
pozwalać na:
* definiowanie listy sklepów
* zatowarowania sklepów
* wyszukiwania towarów w obrębie sklepów
* tworzenia listy zakupów
* obliczania należności za podaną listę w danym sklepie

### Przebieg ćwiczenia

#### Etap 1. Definiowanie towaru, ceny oraz zatowarowania sklepu

Towar jest reprezentowany przez klasę `Merchandise`. Sklep przez klasę `Shop`.

`Merchandise` przechowuje informację o **nazwie** towaru oraz **cenie bazowej**. Ilość towaru nie jest 
brana pod uwagę.

`Shop` umożliwia dodanie towaru do listy dostępnych towarów oraz umożliwia wyszukiwanie towaru i 
sprawdzenie jego ceny. Raz dodany towar pozostaje w asortymencie sklepu.

Dla powyższych klas dostarczone zostały *testy jednostkowe*. 

Należy zaimplementować funkcjonalność klas `Merchandise` i `Shop` oraz dopisać kolejne testy 
sprawdzające poprawne działanie powyższych klas. 