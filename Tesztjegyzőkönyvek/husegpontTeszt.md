# Tesztjegyzőkönyv - Bónusz (Hűségpontok)

Az alábbi tesztdokumentum a Webshop projekthez tartozó Hűségpontok teszteléséhez készült. Felelőse: Keresztúri László Márk


## 1. Teszteljárások (TP)

### 1.1. Hűségpont tesztelése negatív értékkel
- Azonosító: TP-01
- Tesztesetek: TC-01, TC-02
- Leírás: Hűségpont tesztelése negatív értékkel 
    0. lépés: Nyissuk meg az alkalmazást, és lépjünk a Belépés oldalra
    1. lépés: Belépünk Jani felhasználói oldalára
    2. lépés: Megnyitjuk a kosarat
    3. lépés: Beírjuk a megvásárolni kívánt termék nevét
    3. lépés: Beírjuk a vásárolni kívánt darabszámot
    3. lépés: Nyomjuk meg a Beküldés gombot
    4. lépés: Ellenőrizzük az eredményt. Elvárt eredmény: hiba
	
### 1.2. Hűségpont tesztelése pozitív értékkel
- Azonosító: TP-02
- Tesztesetek: TC-03, TC-04
- Leírás: Hűségpont tesztelése pozitív értékkel
    0. lépés: Nyissuk meg az alkalmazást, és lépjünk a Belépés oldalra
    1. lépés: Belépünk Jani felhasználói oldalára
    2. lépés: Megnyitjuk a kosarat
    3. lépés: Beírjuk a megvásárolni kívánt termék nevét
    3. lépés: Beírjuk a vásárolni kívánt darabszámot
    3. lépés: Nyomjuk meg a Beküldés gombot
    4. lépés: Ellenőrizzük az eredményt. Elvárt eredmény: hűségpont növelése



## 2. Tesztesetek (TC)

### 2.1.  Hűségpont tesztelése negatív értékkel

#### 2.1.1. TC-01
- TP: TP-01
- Leírás: Hűségpont tesztelése negatív értékkel
- Bemenet: termék neve = Alma ; darabszám = -10
- Művelet: nyomjuk meg a Beküldés gombot 
- Elvárt kimenet: az eredmény mező tartalma: levonta a hűségpontokból a vásárolt mennyiség összegének a 10%-át (HIBA)



### 2.2.  Hűségpont tesztelése pozitív értékkel

#### 2.2.1. TC-02
- TP: TP-02
- Leírás: Hűségpont tesztelése pozitív értékkel
- Bemenet: termék neve = Alma ; darabszám = 5
- Művelet: nyomjuk meg a Beküldés gombot 
- Elvárt kimenet: az eredmény mező tartalma: hozzáadja a vásárolt termék össz árának 10%-át a hűségpontokhoz



## 3. Tesztriportok (TR)

### 3.1.  Hűségpont tesztelése negatív kosár értékkel tesztriportjai

#### 3.1.1. TR-01 (TC-01)
- TP: TP-01
    1. lépés: Alma árut beírtam
    2. lépés: -10 dbszámot beírtam 
    3. lépés: a gomb egyszeri megnyomása után nem kaptam hibát
    4. lépés: nem elvárt eredményt kaptam
    

	
### 3.2.  Hűségpont tesztelése pozitív kosár értékkel tesztriportjai

#### 3.2.1. TR-02 (TC-02)
- TP: TP-02
    1. lépés: Alma árut beírtam
    2. lépés: 5 dbszámot beírtam 
    3. lépés: a gomb egyszeri megnyomása után nőtt a hűségpont
    4. lépés: elvárt eredményt kaptam
    

	
    
    