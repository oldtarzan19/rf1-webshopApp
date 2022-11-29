# Tesztjegyzőkönyv - Belépés

Az alábbi tesztdokumentum a Webshop projekthez tartozó Belépés teszteléséhez készült. Felelőse: Keresztúri László Márk


## 1. Teszteljárások (TP)

### 1.1. Belépés tesztelése nem létező felhasználónévvel 
- Azonosító: TP-01
- Tesztesetek: TC-01, TC-02
- Leírás: Belépés tesztelése nem létező felhasználónévvel 
    0. lépés: Nyissuk meg az alkalmazást, és lépjünk a Belépés oldalra
    1. lépés: A Username szövegbeviteli mezőbe írjunk be egy nevet
    2. lépés: A Password szövegbeviteli mezőbe írjunk be egy jelszót
    3. lépés: Nyomjuk meg a Sign in gombot
    4. lépés: Ellenőrizzük az eredményt. Elvárt eredmény: hiba
	
### 1.2. Belépés tesztelése nem létező jelszóval
- Azonosító: TP-02
- Tesztesetek: TC-03, TC-04
- Leírás: Belépés tesztelése nem létező jelszóval
    0. lépés: Nyissuk meg az alkalmazást, és lépjünk a Belépés oldalra
    1. lépés: A Username szövegbeviteli mezőbe írjunk be egy nevet
    2. lépés: A Password szövegbeviteli mezőbe írjunk be egy jelszót
    3. lépés: Nyomjuk meg a Sign in gombot
    4. lépés: Ellenőrizzük az eredményt. Elvárt eredmény: hiba
	
### 1.3. Belépés tesztelése valid adatokkal 
- Azonosító: TP-03
- Tesztesetek: TC-05, TC-06
- Leírás: Belépés tesztelése valid adatokkal
    0. lépés: Nyissuk meg az alkalmazást, és lépjünk a Belépés oldalra
    1. lépés: A Username szövegbeviteli mezőbe írjunk be egy létező felhaszálónevet
    2. lépés: A Password szövegbeviteli mezőbe írjunk be egy valid jelszót
    3. lépés: Nyomjuk meg a Sign in gombot
    4. lépés: Ellenőrizzük az eredményt. Elvárt eredmény: belépés a felhasználó oldalára



## 2. Tesztesetek (TC)

### 2.1.  Belépés tesztelése nem létező felhasználónévvel

#### 2.1.1. TC-01
- TP: TP-01
- Leírás: belépés tesztelése nem létező felhasználónévvel
- Bemenet: Username = félix ; Password = hahaha
- Művelet: nyomjuk meg a gombot 
- Elvárt kimenet: az eredmény mező tartalma: HIBA (Index 0 out of bounds for length 0)

#### 2.1.2. TC-02
- TP: TP-01
- Leírás: belépés tesztelése nem létező felhasználónévvel
- Bemenet: Username = ilyenbiztosnincs ; Password = hahaha
- Művelet: nyomjuk meg a gombot 
- Elvárt kimenet: az eredmény mező tartalma: HIBA (Index 0 out of bounds for length 0)


### 2.2.  Belépés tesztelése nem létező jelszóval

#### 2.2.1. TC-03
- TP: TP-02
- Leírás: belépés tesztelése nem létező jelszóval 
- Bemenet: Username = Jani ; Password = 1234567891011
- Művelet: nyomjuk meg a gombot 
- Elvárt kimenet: az eredmény mező tartalma: HIBA (Bad credentials)

#### 2.2.2. TC-04
- TP: TP-02
- Leírás: belépés tesztelése nem létező jelszóval 
- Bemenet: Username = admin12 ; Password = nemjojelszo
- Művelet: nyomjuk meg a gombot 
- Elvárt kimenet: az eredmény mező tartalma: HIBA (Bad credentials)


### 2.3.  Belépés tesztelése valid adatokkal

#### 2.3.1. TC-05
- TP: TP-03
- Leírás: belépés tesztelése valid adatokkal 
- Bemenet: Username = Jani ; Password = Jani
- Művelet: nyomjuk meg a gombot 
- Elvárt kimenet: az eredmény mező tartalma: sikeresen beléptünk a felhasználói fiókba

#### 2.3.2. TC-06
- TP: TP-03
- Leírás: belépés tesztelése valid adatokkal 
- Bemenet: Username = admin12 ; Password = admin12
- Művelet: nyomjuk meg a gombot 
- Elvárt kimenet: az eredmény mező tartalma: sikeresen beléptünk az admin fiókba



## 3. Tesztriportok (TR)

### 3.1.  Belépés rossz username-val tesztriportjai

#### 3.1.1. TR-01 (TC-01)
- TP: TP-01
    1. lépés: félix username-t beírtam
    2. lépés: hahaha pwd-t beírtam beírtam 
    3. lépés: a gomb egyszeri megnyomása után hibát kaptam
    4. lépés: elvárt eredményt kaptam
    
#### 3.1.2. TR-02 (TC-02)
- TP: TP-01
    1. lépés: ilyenbiztosnincs username-t beírtam
    2. lépés: hahaha pwd-t beírtam beírtam 
    3. lépés: a gomb egyszeri megnyomása után hibát kaptam
    4. lépés: elvárt eredményt kaptam

	
### 3.2.  Belépés rossz jelszóval tesztriportjai

#### 3.2.1. TR-03 (TC-03)
- TP: TP-02
    1. lépés: Jani username-t beírtam
    2. lépés: 1234567891011 pwd-t beírtam beírtam 
    3. lépés: a gomb egyszeri megnyomása után hibát kaptam
    4. lépés: elvárt eredményt kaptam
    

#### 3.2.2. TR-04 (TC-04)
- TP: TP-02
    1. lépés: admin12 username-t beírtam
    2. lépés: nemjojelszo pwd-t beírtam beírtam 
    3. lépés: a gomb egyszeri megnyomása után hibát kaptam
    4. lépés: elvárt eredményt kaptam

	
### 3.3.  Belépés valid adatokkal tesztriportjai

#### 3.3.1. TR-05 (TC-05)
- TP: TP-03
    1. lépés: Jani username-t beírtam
    2. lépés: Jani pwd-t beírtam beírtam 
    3. lépés: a gomb egyszeri megnyomása után beléptünk a beírt felhasználó fiókjába
    4. lépés: elvárt eredményt kaptam
    

#### 3.3.2. TR-06 (TC-06)
- TP: TP-03
    1. lépés: admin12 username-t beírtam
    2. lépés: admin12 pwd-t beírtam beírtam 
    3. lépés: a gomb egyszeri megnyomása után beléptünk az admin fiókjába
    4. lépés: elvárt eredményt kaptam
    
    