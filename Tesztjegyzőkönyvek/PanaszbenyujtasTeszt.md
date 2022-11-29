# Tesztjegyzőkönyv - Bónusz (Hűségpontok)

Az alábbi tesztdokumentum a Webshop projekthez tartozó Hűségpontok teszteléséhez készült. Felelőse: Keresztúri László Márk


## 1. Teszteljárások (TP)

### 1.1. Panaszbenyújtás tesztelése üres szöveggel
- Azonosító: TP-01
- Tesztesetek: TC-01
- Leírás: Panaszbenyújtás tesztelése üres szöveggel 
    0. lépés: Nyissuk meg az alkalmazást, és lépjünk a Belépés oldalra
    1. lépés: Belépünk Teszt11 felhasználói oldalára
    2. lépés: Megnyitjuk a panaszbenyújtási űrlapot
    3. lépés: Nem írunk be szöveget
    3. lépés: Nyomjuk meg a Küldés gombot
    4. lépés: Ellenőrizzük az eredményt. Elvárt eredmény: error message
	
### 1.2. Panaszbenyújtás tesztelése nem üres szöveggel
- Azonosító: TP-02
- Tesztesetek: TC-02
- Leírás: Panaszbenyújtás tesztelése nem üres szöveggel 
    0. lépés: Nyissuk meg az alkalmazást, és lépjünk a Belépés oldalra
    1. lépés: Belépünk Teszt11 felhasználói oldalára
    2. lépés: Megnyitjuk a panaszbenyújtási űrlapot
    3. lépés: Írunk bele tetszőleges
    3. lépés: Nyomjuk meg a Küldés gombot
    4. lépés: Ellenőrizzük az eredményt. Elvárt eredmény: elküldi a szöveget és üríti a panasz mezőt
	




## 2. Tesztesetek (TC)

### 2.1.  Panaszbenyújtás tesztelése üres szöveggel

#### 2.1.1. TC-01
- TP: TP-01
- Leírás: Panaszbenyújtás tesztelése üres szöveggel
- Bemenet: 
- Művelet: nyomjuk meg a Küldés gombot 
- Elvárt kimenet: Hiba üzenetet kapunk, hogy ki kell tölteni a panasz szöveg mezőt

### 2.1.  Panaszbenyújtás tesztelése nem üres szöveggel

#### 2.2.1. TC-02
- TP: TP-02
- Leírás: Panaszbenyújtás tesztelése nem üres szöveggel
- Bemenet: Lorem ipsum
- Művelet: nyomjuk meg a Küldés gombot 
- Elvárt kimenet: Elküldi az üzenetet, törli a panasz mezőt




## 3. Tesztriportok (TR)

### 3.1.  Panaszbenyújtás tesztelése üres szöveggel tesztriportjai

#### 3.1.1. TR-01 (TC-01)
- TP: TP-01
    1. lépés: Panaszbenyújtás lapra léptem
    2. lépés: Üresen hagytam a panasz mezőt 
    3. lépés: a küldés gombot lenyomtam
    4. lépés: az elvárt eredményt kaptam

### 3.2.  Panaszbenyújtás tesztelése nem üres szöveggel tesztriportjai

#### 3.2.1. TR-02 (TC-02)
- TP: TP-02
    1. lépés: Panaszbenyújtás lapra léptem
    2. lépés: "Lorem ipsum" szöveget beírtam a panasz mezőbe 
    3. lépés: a küldés gombot lenyomtam
    4. lépés: az elvárt eredményt kaptam
    

	
    
    