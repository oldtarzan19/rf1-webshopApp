# Tesztjegyzőkönyv - Szállítás kezelése

Az alábbi tesztdokumentum a Webshop projekthez tartozó szállítás kezelésének teszteléséhez készült. Felelőse: Keresztúri László Márk



## 1. Teszteljárások (TP)
	
### 1.1. Szállítás törlése funkció tesztelése 
- Azonosító: TP-01
- Tesztesetek: TC-01, TC-02
- Leírás: szállítás törlése funkció tesztelése
    0. lépés: Nyissuk meg az alkalmazást, és lépjünk a szállítás kezelő oldalra
    1. lépés: Az ID szövegbeviteli mezőbe írjunk be a szállítás szám azonosítóját
    2. lépés: Nyomjuk meg a Submit gombot 
    3. lépés: Ellenőrizzük az eredményt. Elvárt eredmény: a szállítás eltűnik az oldal alján található táblázatból
	
### 1.2. Szállítás frissítés funkció tesztelése 
- Azonosító: TP-02
- Tesztesetek: TC-03, TC-04
- Leírás: szállítás frissítése funkció tesztelése
    0. lépés: Nyissuk meg az alkalmazást, és lépjünk a szállítás kezelő oldalra
    1. lépés: A Szállítás ID szövegbeviteli mezőbe írjunk be a szállítás azonosítóját
    2. lépés: A vasarlo_id szövegbeviteli mezőbe írjunk be a szállításhoz tartozó jelenlegi vagy új vásárlót
    3. lépés: A szállítási cím szövegbeviteli mezőbe írjunk be az új címet
    4. lépés: Nyomjuk meg a Submit gombot 
    5. lépés: Ellenőrizzük az eredményt. Elvárt eredmény: aszállítás értékei frissülnek a megadott új értékekkel az oldal alján található táblázatban



## 2. Tesztesetek (TC)

### 2.1.  Szállítás törlése funkció tesztelése  funkció tesztelése

#### 2.1.1. TC-01
- TP: TP-01
- Leírás: törlés funkció tesztelése 
- Bemenet: id = 5
- Művelet: nyomjuk meg a gombot 
- Elvárt kimenet: az eredmény mező tartalma: a szállítás eltűnik az oldal alján található táblázatból

#### 2.1.2. TC-02
- TP: TP-01
- Leírás: törlés funkció tesztelése 
- Bemenet: id = 7
- Művelet: nyomjuk meg a gombot 
- Elvárt kimenet: az eredmény mező tartalma: a szállítás eltűnik az oldal alján található táblázatból


### 2.2.  Arúcikk tábla frissítés funkció tesztelése

#### 2.2.1. TC-03
- TP: TP-02
- Leírás: frissítés funkció tesztelése 
- Bemenet: Szállítás ID = 5 ; vasarlo_id = 24 ; Szállítási cím = teszt utca
- Művelet: nyomjuk meg az Submit gombot 
- Elvárt kimenet: az eredmény mező tartalma: Az 5-as azonosítójú szállítás szállítási címének új értéke "teszt utca". A frissített szállítás megjelenik a táblázatban, felülírva a régit.

#### 2.2.2. TC-04
- TP: TP-02
- Leírás: frissítés funkció tesztelése 
- Bemenet: Szállítás ID = 7 ; vasarlo_id = 21 ; Szállítási cím = box utca
- Művelet: nyomjuk meg az Submit gombot 
- Elvárt kimenet: az eredmény mező tartalma: Az 7-as azonosítójú szállítás szállítási címének új értéke "box utca". A frissített szállítás megjelenik a táblázatban, felülírva a régit.



## 3. Tesztriportok (TR)

### 3.1.  Szállítás törlésének tesztriportjai

#### 3.1.1. TR-01 (TC-01)
- TP: TP-01
    1. lépés: 5 ID-t beírtam
    4. lépés: a gomb egyszeri megnyomás után a szállítás törlődött a táblázatból
    5. lépés: helyes eredményt kaptam
    
#### 3.1.2. TR-02 (TC-02)
- TP: TP-01
    1. lépés: 7 ID-t beírtam
    4. lépés: a gomb egyszeri megnyomás után a szállítás törlődött a táblázatból
    5. lépés: helyes eredményt kaptam
	
### 3.2.  Szállítás szerkesztésének tesztriportjai

#### 3.2.1. TR-03 (TC-03)
- TP: TP-02
    1. lépés: 5-t beírtam
    2. lépés: 24-t beírtam 
    3. lépés: "teszt utca"-t beírtam 
    4. lépés: a gomb egyszeri megnyomás után a szállítás frissült a táblázatban
    5. lépés: helyes eredményt kaptam
    

#### 3.2.2. TR-04 (TC-04)
- TP: TP-02
    1. lépés: 7-t beírtam
    2. lépés: 21-t beírtam 
    3. lépés: "box utca"-t beírtam 
    4. lépés: a gomb egyszeri megnyomás után a szállítás frissült a táblázatban
    5. lépés: helyes eredményt kaptam
    
    