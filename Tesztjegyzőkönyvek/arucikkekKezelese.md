# Tesztjegyzőkönyv-Árúcikk kezelése

Az alábbi tesztdokumentum a Webshop projekthez tartozó árukészletek kezelésének teszteléséhez készült. Felelőse: Zsofenszki Kristóf



## 1. Teszteljárások (TP)

### 1.1. Árúcikk hozzáadása funkció tesztelése 
- Azonosító: TP-01
- Tesztesetek: TC-01, TC-02
- Leírás: arucikk hozzáadása funkció tesztelése
    0. lépés: Nyissuk meg az alkalmazást, és lépjünk a készlet kezelő oldalra
    1. lépés: A Név szövegbeviteli mezőbe írjunk be az árúcikk nevét
    2. lépés: Az ár szövegbeviteli mezőbe írjunk be az árúcikk árát
    3. lépés: A darab szám szövegbeviteli mezőbe írjunk be az árúcikk mennyiségét
    4. lépés: Nyomjuk meg a Submit gombot 
    5. lépés: Ellenőrizzük az eredményt. Elvárt eredmény: az árú megjelenik az oldal alján található táblázatban
	
### 1.2. Árúcikk törlése funkció tesztelése 
- Azonosító: TP-02
- Tesztesetek: TC-01, TC-02
- Leírás: arucikk törlése funkció tesztelése
    0. lépés: Nyissuk meg az alkalmazást, és lépjünk a készlet kezelő oldalra
    1. lépés: Az ID szövegbeviteli mezőbe írjunk be az árú szám azonosítóját
    2. lépés: Nyomjuk meg a Submit gombot 
    3. lépés: Ellenőrizzük az eredményt. Elvárt eredmény: az árú eltűnik az oldal alján található táblázatból
	
### 1.3. Arúcikk tábla frissítés funkció tesztelése 
- Azonosító: TP-03
- Tesztesetek: TC-01, TC-02
- Leírás: arucikk hozzáadása funkció tesztelése
    0. lépés: Nyissuk meg az alkalmazást, és lépjünk a készlet kezelő oldalra
    1. lépés: Az Árucikk ID szövegbeviteli mezőbe írjunk be az árucikk szám azonosítóját
    2. lépés: Az Arúcikk ÁR szövegbeviteli mezőbe írjunk be az arucikkhez tartozó új árat
    3. lépés: Az Arúcikk DB szövegbeviteli mezőbe írjunk be az arucikkhez tartozó új darab számot
    4. lépés: Nyomjuk meg a Submit gombot 
    5. lépés: Ellenőrizzük az eredményt. Elvárt eredmény: az árucikk értékei frissülnek a megadott új értékekkel az oldal alján található táblázatban



## 2. Tesztesetek (TC)

### 2.1.  Árucikk hozzáadása funkció tesztelése

#### 2.1.1. TC-01
- TP: TP-01
- Leírás: hozzáadása funkció tesztelése 
- Bemenet: név = Kocka ; Ár = 300 ; Darab = 20
- Művelet: nyomjuk meg a gombot 
- Elvárt kimenet: az eredmény mező tartalma: az árú megjelent az oldal alján található táblázatban a megadott értékekkel

#### 2.1.2. TC-02
- TP: TP-01
- Leírás: hozzáadása funkció tesztelése 
- Bemenet: név = Kocka ; Ár = X ; Darab = 20
- Művelet: nyomjuk meg a Submit gombot 
- Elvárt kimenet: az eredmény mező tartalma: hiba, semmi változás nem történt a táblázatban mert az ár input nem szám, az oldal újratölt

### 2.2.  Felhasználói munkamenet tesztesetei

#### 2.2.1. TC-03
- TP: TP-02
- Leírás: törlés funkció tesztelése 
- Bemenet: ID = 5 ;
- Művelet: nyomjuk meg az Submit gombot 
- Elvárt kimenet: az eredmény mező tartalma: az 5-ös azonosítójú arú kitörlődött a táblázatból

#### 2.2.2. TC-04
- TP: TP-02
- Leírás: törlés funkció tesztelése 
- Bemenet: `NUMBER1` = 999 ;
- Művelet: nyomjuk meg az Submit gombot 
- Elvárt kimenet: az eredmény mező tartalma: HIBA, ilyen azonosítójú elem nincs. Nem történik semmi, az oldal újratölt

### 2.3.  Arúcikk tábla frissítés funkció tesztelése

#### 2.3.1. TC-05
- TP: TP-03
- Leírás: frissítés funkció tesztelése 
- Bemenet: Árucikk ID = 3 ; Árucikk ÁR = 1000 ; Árucikk DB = 10
- Művelet: nyomjuk meg az Submit gombot 
- Elvárt kimenet: az eredmény mező tartalma: A 3-as azonosítójú árucikk árának űj értéke 1000 és új darabszáma 10. A frissített áru megjelenik a táblázatban, felülírva a régit

#### 2.3.2. TC-06
- TP: TP-03
- Leírás: frissítés funkció tesztelése 
- Bemenet: Árucikk ID = 999 ; Árucikk ÁR = 1000 ; Árucikk DB = 10
- Művelet: nyomjuk meg az Submit gombot 
- Elvárt kimenet: az eredmény mező tartalma: HIBA, ilyen azonosítójú elem nincs. Nem történik semmi, az oldal újratölt



## 3. Tesztriportok (TR)

### 3.1.  Árucikk hozzáadásának tesztriportjai

#### 3.1.1. TR-01 (TC-01)
- TP: TP-01
    1. lépés: Kocka szöveget beírtam
    2. lépés: 300-t beírtam 
    3. lépés: 20-t beírtam 
    4. lépés: a gomb egyszeri megnyomás után az áru bekerült a táblázatban
    5. lépés: helyes eredményt kaptam
    
#### 3.1.2. TR-02 (TC-02)
- TP: TP-01
    1. lépés: Kocka szöveget beírtam
    2. lépés: X-et beírtam 
    2. lépés: 20-et beírtam 
    3. lépés: a gomb egyszeri megnyomás után újratöltött az oldal
    4. lépés: helyes eredményt kaptam (HIBA)
	
### 3.2.  Árucikk törlésének tesztriportjai

#### 3.2.1. TR-03 (TC-03)
- TP: TP-01
    1. lépés: 5-t beírtam
    2. lépés: a gomb egyszeri megnyomás után az áru törlődött a táblázatból
    3. lépés: helyes eredményt kaptam
    

#### 3.2.2. TR-04 (TC-04)
- TP: TP-01
    1. lépés: 999-t beírtam
    2. lépés: a gomb egyszeri megnyomás után újratöltött az oldal
    3. lépés: helyes eredményt kaptam (HIBA)
	
### 3.3.  Árucikk szerkesztésének tesztriportjai

#### 3.3.1. TR-05 (TC-05)
- TP: TP-01
    1. lépés: 3-t beírtam
    2. lépés: 1000-t beírtam 
    3. lépés: 10-t beírtam 
    4. lépés: a gomb egyszeri megnyomás után az áru frissült a táblázatban
    5. lépés: helyes eredményt kaptam
    

#### 3.3.2. TR-06 (TC-06)
- TP: TP-01
    1. lépés: 999-t beírtam
    2. lépés: 1000-t beírtam 
    3. lépés: 10-t beírtam 
    4. lépés: a gomb egyszeri megnyomás után újratöltött az oldal
    5. lépés: helyes eredményt kaptam (HIBA)
    



    