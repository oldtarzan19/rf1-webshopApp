# Tesztjegyzőkönyv - Regisztráció

Az alábbi tesztdokumentum a Webshop projekthez tartozó Regisztráció teszteléséhez készült. Felelőse: Sándor Márk László


## 1. Teszteljárások (TP)

### 1.1. Regisztráció tesztelése nem megfelelő email-el
- Azonosító: TP-01
- Tesztesetek: TC-01, TC-02
- Leírás: Regisztráció tesztelése nem létező felhasználónévvel 
    0. lépés: Nyissuk meg az alkalmazást, és lépjünk a Regisztráció oldalra
    1. lépés: A felhasználónév szövegbeviteli mezőbe írjunk be egy nevet
    2. lépés: Az email szövegbeviteli mezőbe írjunk be egy nem megfelelő mailt
    3. lépés: A jelszó szövegbeviteli mezőbe írjunk be egy jelszót 
    4. lépés: A cím szövegbeviteli mezőbe írjunk be egy cím 
    5. lépés: Nyomjuk meg a Regisztráció gombot
    6. lépés: Ellenőrizzük az eredményt. Elvárt eredmény: hiba
	
### 1.2. Regisztráció tesztelése nem megfelelő címmel
- Azonosító: TP-02
- Tesztesetek: TC-03, TC-04
- Leírás: Regisztráció tesztelése nem létező jelszóval
    0. lépés: Nyissuk meg az alkalmazást, és lépjünk a Regisztráció oldalra
    1. lépés: A felhasználónév szövegbeviteli mezőbe írjunk be egy nevet
    2. lépés: Az email szövegbeviteli mezőbe írjunk be egy  mailt
    3. lépés: A jelszó szövegbeviteli mezőbe írjunk be egy jelszót 
    4. lépés: A cím szövegbeviteli mezőbe írjunk be egy nem megfelelő címet 
    5. lépés: Nyomjuk meg a Regisztráció gombot
    6. lépés: Ellenőrizzük az eredményt. Elvárt eredmény: hiba
	
### 1.3. Regisztráció tesztelése valid adatokkal 
- Azonosító: TP-03
- Tesztesetek: TC-05, TC-06
- Leírás: Belépés tesztelése valid adatokkal
    0. lépés: Nyissuk meg az alkalmazást, és lépjünk a Regisztráció oldalra
    1. lépés: A felhasználónév szövegbeviteli mezőbe írjunk be egy nevet
    2. lépés: Az email szövegbeviteli mezőbe írjunk be egy megfelelő mailt
    3. lépés: A jelszó szövegbeviteli mezőbe írjunk be egy jelszót 
    4. lépés: A cím szövegbeviteli mezőbe írjunk be egy megfelelő cím-et 
    5. lépés: Nyomjuk meg a Regisztráció gombot
    6. lépés: Ellenőrizzük az eredményt. Elvárt eredmény: A rendszer átrak a kezdőoldalra




## 2. Tesztesetek (TC)

### 2.1.  Belépés tesztelése nem megfelelő emailel

#### 2.1.1. TC-01
- TP: TP-01
- Leírás: belépés tesztelése nem megfelelő emailel
- Bemenet: felhasználónév = proba123 ; email = proba123@gmail.asdasd; jelszo=asdasd; cím= 4321 Szeged, Széchényi utca 14.;
- Művelet: nyomjuk meg a regisztráció gombot 
- Elvárt kimenet: az email mező tartalma: Nem megfelelő formátum

#### 2.1.2. TC-02
- TP: TP-01
- Leírás: belépés tesztelése nem megfelelő emailel
- Bemenet: felhasználónév = proba123 ; email = próba123@gmail.asd; jelszo=asdasd; cím= 4321 Szeged, Széchényi utca 14.;
- Művelet: nyomjuk meg a regisztráció gombot 
- Elvárt kimenet: az email mező tartalma: Nem megfelelő formátum


### 2.2.  Belépés tesztelése nem megfelelő címmel

#### 2.2.1. TC-03
- TP: TP-02
- Leírás: Regisztráció tesztelése nem létező címmel 
- Bemenet: felhasználónév = proba123 ; email = proba123@gmail.com; jelszo=asdasd; cím= 43 Szeged, Széchényi utca 14.;
- Művelet: nyomjuk meg a regisztráció gombot
- Elvárt kimenet: az cím mező tartalma: Nem megfelelő formátum

#### 2.2.2. TC-04
- TP: TP-02
- Leírás: Regisztráció tesztelése nem létező címmel 
- Bemenet: felhasználónév = proba123 ; email = proba123@gmail.com; jelszo=asdasd; cím= 4321 Szeged, Széchényi 14.;
- Művelet: nyomjuk meg a regisztráció gombot
- Elvárt kimenet: az cím mező tartalma: Nem megfelelő formátum


### 2.3.  Regisztráció tesztelése valid adatokkal

#### 2.3.1. TC-05
- TP: TP-03
- Leírás: Regisztráció tesztelése valid adatokkal 
- Bemenet: felhasználónév = proba123 ; email = proba123@gmail.com; jelszo=asdasd; cím= 4321 Szeged, Széchényi utca 14.;
- Művelet: nyomjuk meg a regisztráció gombot
- Elvárt kimenet:  sikeresen regisztráltunk, át irányít a fő oldalra

#### 2.3.2. TC-06
- TP: TP-03
- Leírás: Regisztráció tesztelése valid adatokkal 
- Bemenet: felhasználónév = teszt123 ; email = teszt123@gmail.com; jelszo=valami; cím= 4321 Budapest, Széchényi utca 14.;
- Művelet: nyomjuk meg a regisztráció gombot
- Elvárt kimenet:  sikeresen regisztráltunk, át irányít a fő oldalra



## 3. Tesztriportok (TR)

### 3.1.  Belépés nem megfelelő emailel tesztriportjai

#### 3.1.1. TR-01 (TC-01)
- TP: TP-01
    1. lépés: proba123 felhasználónevet beírtam
    2. lépés: proba123@gmail.asdasd emailt beírtam 
    3. lépés: asdasd jelszót beírtam
    4. lépés: 4321 Szeged, Széchényi utca 14. címet beírtam
    5. lépés: a regitsztráció gomb egyszeri megnyomása után hibát kaptam
    6. lépés: elvárt eredményt kaptam
    
#### 3.1.2. TR-02 (TC-02)
- TP: TP-01
    1. lépés: proba123 felhasználónevet beírtam
    2. lépés: próba123@gmail.asd emailt beírtam 
    3. lépés: asdasd jelszót beírtam
    4. lépés: 4321 Szeged, Széchényi utca 14. címet beírtam
    5. lépés: a regitsztráció gomb egyszeri megnyomása után hibát kaptam
    6. lépés: elvárt eredményt kaptam
    

    
### 3.2.  Belépés nem megfelelő címmel tesztriportjai

#### 3.2.1. TR-03 (TC-03)
- TP: TP-02
    1. lépés: proba123 felhasználónevet beírtam
    2. lépés: proba123@gmail.com emailt beírtam 
    3. lépés: asdasd jelszót beírtam
    4. lépés: 43 Szeged, Széchényi utca 14. címet beírtam
    5. lépés: a regitsztráció gomb egyszeri megnyomása után hibát kaptam
    6. lépés: elvárt eredményt kaptam
    

#### 3.2.2. TR-04 (TC-04)
- TP: TP-02
    1. lépés: proba123 felhasználónevet beírtam
    2. lépés: proba123@gmail.com emailt beírtam 
    3. lépés: asdasd jelszót beírtam
    4. lépés: 4321 Szeged, Széchényi 14. címet beírtam
    5. lépés: a regitsztráció gomb egyszeri megnyomása után hibát kaptam
    6. lépés: elvárt eredményt kaptam

    
### 3.3.  Regisztráció valid adatokkal tesztriportjai

#### 3.3.1. TR-05 (TC-05)
- TP: TP-03
    1. lépés: proba123 felhasználónevet beírtam
    2. lépés: proba123@gmail.com emailt beírtam 
    3. lépés: asdasd jelszót beírtam
    4. lépés: 4321 Szeged, Széchényi utca 14. címet beírtam
    5. lépés: a regitsztráció gomb egyszeri megnyomása után hibát kaptam
    6. lépés: elvárt eredményt kaptam

#### 3.3.2. TR-06 (TC-06)
- TP: TP-03
    1. lépés: teszt123 felhasználónevet beírtam
    2. lépés: teszt123@gmail.com emailt beírtam 
    3. lépés: valami jelszót beírtam
    4. lépés: 4321 Budapest, Széchényi utca 14. címet beírtam
    5. lépés: a regitsztráció gomb egyszeri megnyomása után hibát kaptam
    6. lépés: elvárt eredményt kaptam
    
    