# Tesztjegyzőkönyv-Prémium felhasználók

Az alábbi tesztdokumentum a Webshop projekthez tartozó prémium felhasználók teszteléséhez készült. Felelőse: Sprok Dániel



## 1. Teszteljárások (TP)

### 1.1. Prémium felhasználók tesztelése 
- Azonosító: TP-01
- Tesztesetek: TC-01
- Leírás: prémium felhasználók tesztelése 
    0. lépés: Nyissuk meg az alkalmazást, és jelentekzzünk be egy admin fiókkal.
    1. lépés: Navigáljunk el a Prémium oldalra.
    2. lépés: Vizsgáljuk meg, hogy minden prémium felhasználó megvan-e jelenítve. Ha egyezik az elvárt eredménnyel, akkor sikeres a teszt.


## 2. Tesztesetek (TC)

### 2.1.  Prémium felhasználók tesztesetei

#### 2.1.1. TC-01
- TP: TP-01
- Leírás: prémium felhasználók tesztelése 
- Bemenet bejelentkezéskor: felhasználónév: admin12; jelszó: admin12
- Művelet: Navigálás a Prémium oldalra.
- Elvárt eredmény: Prémium felhasználók ID alapján: 34, 36, 22; Összesen 3 db ilyen felhasználó van.


## 3. Tesztriportok (TR)

### 3.1.  Prémium felhasználók tesztriportjai

#### 3.1.1. TR-01 (TC-01)
- TP: TP-01
    1. lépés: Bejelentkeztem az admin12 és admin12 username-jelszó párossal.
    2. lépés: Elnavigáltam a Prémium oldalra.
    3. lépés: Az oldal álltal megjelenített felhasználók azonosítói: 34, 36, 22. Ez összesen 3 db felhasználó.
    4. lépés: Helyes eredményt kaptam. (3)
