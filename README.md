# Zadanie: sklep z częściami

Zrefaktoryzuj kod:
- dodaj/dopasuj modyfikatory dostępu oraz typy danych
- utwórz gettery, settery i odpowiednie konstruktory tam, gdzie to konieczne
- wyeliminuj wszystkie TODOs

Zaimplementuj następujące funkcjonalności:
=============
1. Zaimplementuj w klasie Order metodę getUniqueParts, która na podstawie listy zakupów zwróci listę, na której znajdą się części zakupione wyłącznie jeden raz.
Oznacza to, że odfiltrowane zostać powinny te części, dla których:
- na liście znajduje się kilka ich egzemplarzy
- na liście znajduje się ich zamiennik

Implementację wykonaj z wykorzystaniem wzorca strategia, stosując różne algorytmy:

- iteracyjna:
Element występuje na liście tylko jeden raz, jeżeli dwie pętle - jedna iterująca od przodu listy, a druga od tyłu, po raz pierwszy trafiają na taki sam obiekt wtedy, kiedy mają równe indeksy.
- Collections.frequency:
jest to metoda, za pomocą której sprawdzić można ilość wystąpień danego elementu w kolekcji.
- Kolekcje:
aby znaleźć unikalne elementy należy ze zbioru wszystkich elementów usunąć te, które się powtarzają. 
Powtarzające się elementy znajdziesz usuwając z listy wszystkich elementów zbiór (Set) tych elementów.
- Mapy:
Stwórz mapę, w której kluczem będą elementy, a wartością ich ilość. Dodaj do takiej mapy wszystkie elementy z listy i sprawdź który występuje wyłącznie raz.
- java.util.stream:
Przy pomocy streamu odfiltruj z listy te elementy, które się nie powtarzają.
=============
2. Zaimplementuj metodę optimizeCart(), która na podstawie dodanych do koszyka przedmiotów zwróci listę propozycji optymalizacji ceny.
Oznacza to, że jeżeli zakupione zostały części będące zamiennikami, to zaproponowany zostanie wybór tańszej z nich, w ilości równej liczbie takich części w koszyku. Metoda jako "propozycję" powinna zwracać dowolny typ danych, a nie drukować wynik na ekranie.
=============
3. Do zaproponowanego modelu dodaj koszyk, który wykorzystywany będzie przed faktycznym dokonaniem zakupu. Zakup od koszyka odróżnia data zakupu, informacja, czy jest opłacony oraz oczekiwana data dostawy. Dodatkowo, z koszyka mogą być usuwane przedmioty. Zaimplementuj metody, które pozwolą:
- W klasie koszyka dokonać zakupu (z dzisiejszą datą i dostawą za dwa dni) - metoda powinna zwrócić nowy obiekt Order.
- W klasie koszyka dodać nowy produkt do koszyka
- W klasie koszyka usunąć produkt z koszyka na podstawie jego numeru
- W klasie Order zmienić datę dostawy