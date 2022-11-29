# Tesztjegyzőkönyv - Felhasználói szintek kezelése

Az alábbi tesztdokumentum a Webshop projekthez tartozó felhasználói szintek tesztekéséhez készült. Felelőse: Kasza Dominik Árpád



## 1. Teszteljárások (TP)
	
### 1.1. Admin felhasználó belépésének tesztelése 
- Azonosító: TP-01
- Tesztesetek: TC-01
- Leírás: Admin felhasználó belépésének tesztelése
    0. lépés: Nyissuk meg az alkalmazást, és lépjünk a belépési oldalra
    1. lépés: Jelentkezzünk be egy admin felhasználóba
    2. lépés: Ellenőrizzük hogy megjelentek-e csak admin-nak látható felületek
	
### 1.2. Admin felhasználó menüpontjainek elérésének tesztelése 
- Azonosító: TP-02
- Tesztesetek: TC-02, TC-03, TC-04
- Leírás: Admin által elérhető menüpontok tesztelése
    0. lépés: Nyissuk meg az alkalmazást, és lépjünk a belépési oldalra
    1. lépés: Jelentkezzünk be egy admin felhasználóba
    2. lépés: Navigáljunk az egyik csak adminok által elérhető menüpontra
	3. lépés: Ellenőrizzük mi jelenik meg ha a menüpontokat próbáljuk használni
	
### 1.3. Átlagos felhasználó belépésének tesztelése 
- Azonosító: TP-03
- Tesztesetek: TC-05
- Leírás: Átlagos felhasználó belépésének tesztelése
    0. lépés: Nyissuk meg az alkalmazást, és lépjünk a belépési oldalra
    1. lépés: Jelentkezzünk be egy átlagos felhasználóba
    2. lépés: Ellenőrizzük hogy csak az átlagos felhasználónak látható dolgok jelentek meg
	
### 1.4. Átlagos felhasználó menüpontjainak tesztelése 
- Azonosító: TP-04
- Tesztesetek: TC-06
- Leírás: Átlagos felhasználó menüpontjainak
    0. lépés: Nyissuk meg az alkalmazást, és lépjünk a belépési oldalra
    1. lépés: Jelentkezzünk be egy átlagos felhasználóba
    2. lépés: Navigáljunk egy menüpontra ls kattintsunk rá
	3. lépés: Ellenőrizzük hova irányítanak a menüpontok




## 2. Tesztesetek (TC)

### 2.1.  Admin belépésének teszteléséhez tartozó teszteset

#### 2.1.1. TC-01
- TP: TP-01
- Leírás: Admin felhasználó belépésének tesztelése 
- Bemenet: felhasználó = admin12 password = admin12
- Művelet: bejelentkezés gomb megnyomása 
- Elvárt kimenet: a főoldalra dob, a csak admin számára látható fülek megjelennek

#### 2.2.1. TC-02
- TP: TP-02
- Leírás: Admin Készlet kezelő oldal menüpontjának tesztelése 
- Bemenet: 
- Művelet: Készlet kezelő oldal menüpontjára kattintás 
- Elvárt kimenet: A készletkezelő oldalra dob

#### 2.3.1. TC-03
- TP: TP-02
- Leírás: Admin Szállítás kezelő oldal menüpontjának tesztelése 
- Bemenet: 
- Művelet: Szállítás kezelő oldal menüpontjára kattintás 
- Elvárt kimenet: A szállításkezelő oldalra dob

#### 2.4.1. TC-04
- TP: TP-02
- Leírás: Admin Felhasználó kezelő oldal menüpontjának tesztelése 
- Bemenet: 
- Művelet: Felhasználó kezelő oldal menüpontjára kattintás 
- Elvárt kimenet: A felhasználó oldalra dob

#### 2.5.1. TC-05
- TP: TP-03
- Leírás: Átlagos felhasználó belépésének tesztelése
- Bemenet: felhasználó=Teszt11 jelszó=Teszt11
- Művelet: bejelntkezés gomb megnyomása 
- Elvárt kimenet: A főoldalra dob, csak a panaszbenyújtás és hűségpont menüpontok látszódnak

#### 2.6.1. TC-06
- TP: TP-04
- Leírás: Átlagos felhasználó menüpontjainak tesztelése
- Bemenet: 
- Művelet: egy elérhető menüpontra kattintás 
- Elvárt kimenet: A menüponthoz tartozó oldal irányít



## 3. Tesztriportok (TR)

### 3.1.  Admin bejelentkezésének tesztriportja

#### 3.1.1. TR-01 (TC-01)
- TP: TP-01
    1. lépés: megadtam az admin12 felhasználó nevet és jelszót
    2. lépés: bejelentkezés gombra kattintottam
    3. lépés: helyes eredményt kaptam
	
### 3.2.  Admin menüpontjainak tesztriportja

#### 3.2.1. TR-02 (TC-02)
- TP: TP-02
    1. lépés: Beléptem egy admin felhasználóba
    2. lépés: Készlet kezelő menüpontra kattintottam
    3. lépés: helyes eredményt kaptam
	
#### 3.3.1. TR-03 (TC-03)
- TP: TP-02
    1. lépés: Beléptem egy admin felhasználóba
    2. lépés: Szállítás kezelő menüpontra kattintottam
    3. lépés: helyes eredményt kaptam

#### 3.3.2. TR-03 (TC-04)
- TP: TP-02
    1. lépés: Beléptem egy admin felhasználóba
    2. lépés: Felhasználó kezelő menüpontra kattintottam
    3. lépés: helyes eredményt kaptam
	
#### 3.4.1. TR-04 (TC-05)
- TP: TP-03
    1. lépés: megadtam a Teszt11 felhasználó nevet és jelszót
    2. lépés: bejelentkezés gombra kattintottam
    3. lépés: helyes eredményt kaptam
	
#### 3.5.1. TR-05 (TC-06)
- TP: TP-04
    1. lépés: beléptem egy átlagos felhasználóba
    2. lépés: Hűségpontok menüpontra kattintottam
    3. lépés: helyes eredményt kaptam
    
	

    