# Tesztjegyzőkönyv-Felhasználói munkamenet

Az alábbi tesztdokumentum a Webshop projekthez tartozó felhasználói munkamenet teszteléséhez készült. Felelőse: Sprok Dániel



## 1. Teszteljárások (TP)

### 1.1. Felhasználói munkamenet tesztelése 
- Azonosító: TP-01
- Tesztesetek: TC-01, TC-02
- Leírás: felhasználói munkamenet tesztelése
    0. lépés: Nyissuk meg az alkalmazást és kattintsunk a Regisztráció vagy Bejelentkezés fülre.
    1. lépés: Adjuk meg a kötelező adatokat a registráció/bejelentkezés során.
    2. lépés: Navigáljunk el egy adott oldalra és ellenőrizzük, hogy be vagyunk-e még jelentkezve.
    3. lépés: Lépjünk vissza az előző oldalra és ellenőrizzük, hogy be vagyunk-e még jelentkezve.
    4. lépés: Jelentkezzünk ki és ellenőrizzük, hogy tényleg megszűnt-e a munkamenet.


## 2. Tesztesetek (TC)

### 2.1.  Felhasználói munkamenet tesztesetei

#### 2.1.1. TC-01
- TP: TP-01
- Leírás: felhasználói munkamenet tesztelése 
- Bemenet regisztráláskor: Felhasználónév = Teszt11; E-Mail = teszt11@gmail.com; Jelszó = Teszt11
- Bemenet bejelentkezéskor: Felhasználónév = Teszt11; Jelszó = Teszt11
- Műveletek: Elnavigálok a kezdőlapról a kosár oldalra, majd visszalépek a kezdőlapra és utána kijelentkezek.
- Elvárt eredmény: A munakmenet csak a kijelentkezés után szűnik meg.

#### 2.1.2. TC-02
- TP: TP-01
- Leírás: felhasználói munkamenet tesztelése 
- Bemenet bejelentkezéskor: Felhasználónév = Teszt11; Jelszó = Teszt11
- Művelet: Elnavigálok a kezdőlapról a Panaszbenyújtási űrlap oldalra, majd visszalépek a kezdőlapra és utána kijelentkezek.
- Elvárt eredmény: A munakmenet csak a kijelentkezés után szűnik meg.



## 3. Tesztriportok (TR)

### 3.1.  Felhasználói munkamenet tesztriportjai

#### 3.1.1. TR-01 (TC-01)
- TP: TP-01
    1. lépés: A Felhasználónév mezőbe beírtam a Teszt11-et.
    2. lépés: Az E-Mail mezőbe beírtam a teszt11@gmail.com-ot.
    3. lépés: A Jelszó mezőbe beírtam a Teszt11-et.
	4. lépés: Bejelentkezéskor megadom a a fentebb írt felhasználónevet és jelszót.
    5. lépés: Elnavigálok a kosár lapra.
	6. lépés: Visszalépek a kezdő oldalra.
	7. lépés: Kijelentkezek.
	8. lépés: Az elvárt eredményt kaptam. A munakmenet csak a kijelentkezés után szűnt meg.
    

#### 3.1.2. TR-02 (TC-02)
- TP: TP-01
    1. lépés: Bejelentkezéskor megadom a a fentebb írt felhasználónevet és jelszót. (Teszt11 és Teszt11)
    2. lépés: Elnavigálok a Panaszbenyújtási űrlap oldalra.
	3. lépés: Visszalépek a kezdő oldalra.
	4. lépés: Kijelentkezek.
	5. lépés: Az elvárt eredményt kaptam. A munakmenet csak a kijelentkezés után szűnt meg.



    