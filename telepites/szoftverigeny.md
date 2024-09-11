Utolsó frissítés: 2024. júl. 10.

# Linux Mint 21.3 (Cinnamon)

https://www.linuxmint.com/edition.php?id=311

## általános

    $ sudo apt install mc konsole tmux gedit htop git neovim micro firefox

## clipman

    $ sudo apt install xfce4-clipman

## VS Code

lásd https://linuxiac.com/how-to-install-vs-code-on-linux-mint/

    $ sudo apt install software-properties-common apt-transport-https wget gpg
    $ wget -qO- https://packages.microsoft.com/keys/microsoft.asc | gpg --dearmor > packages.microsoft.gpg
    $ sudo install -D -o root -g root -m 644 packages.microsoft.gpg /etc/apt/keyrings/packages.microsoft.gpg
    $ sudo sh -c 'echo "deb [arch=amd64,arm64,armhf signed-by=/etc/apt/keyrings/packages.microsoft.gpg] https://packages.microsoft.com/repos/code stable main" > /etc/apt/sources.list.d/vscode.list'
    $ sudo apt update
    $ sudo apt install code

## Midnight Commander beállítás

A `~/.bashrc` állomány végére szúrjuk be:

    # my settings
    alias mc=". /usr/share/mc/bin/mc-wrapper.sh"

(Ez azt eredményezi, hogy ha elindítjuk az mc-t, majd elnavigálunk egy
könyvtárba és kilépünk, akkor abban a mappában találjuk magunkat,
ahol kiléptünk.)

## Python 3

    $ sudo apt install python3-pip

### PyCharm IDE

Látogassuk meg a `https://www.jetbrains.com/pycharm/download/?section=linux` oldalt.
Görgessünk le, töltsük le a Community Edition-t, majd bontsuk ki egy
megfelelő helyre (pl. a `/opt` mappába).

Nekem elegendő a Community Edition, de ha valaki a Professional Edition-t kéri,
akkor elegendő csak a Professional Edition-t feltenni.

## C fejlesztés

    $ sudo apt install build-essential
    $ sudo apt install gcc clang
    $ sudo apt install valgrind

### style50

    $ sudo apt install astyle
    $ pip3 install style50 --user -U

Utána a PATH-t bővítsük ki:

    $ export PATH=$PATH:$HOME/.local/bin

## Java fejlesztés

    $ sudo apt install openjdk-21-jdk-headless

### Intellij IDEA IDE

Látogassuk meg a `https://www.jetbrains.com/idea/download/?section=linux` oldalt.
Görgessünk le, töltsük le a Community Edition-t, majd bontsuk ki egy
megfelelő helyre (pl. a `/opt` mappába).

Nekem elegendő a Community Edition, de ha valaki az Ultimate Edition-t kéri,
akkor elegendő csak az Ultimate Edition-t feltenni.

## C# fejlesztés

Lásd https://learn.microsoft.com/en-us/dotnet/core/install/linux-ubuntu-install?pivots=os-linux-ubuntu-2204&tabs=dotnet8

    $ sudo apt-get update && sudo apt-get install -y dotnet-sdk-8.0

Ellenőrzés:

    $ dotnet --version

    $ sudo apt install nuget
    $ sudo apt install mono-csharp-shell

### Rider IDE

Látogassuk meg a `https://www.jetbrains.com/rider/download/#section=linux` oldalt.
Töltsük le, majd bontsuk ki egy megfelelő helyre (pl. a `/opt` mappába).

NE indítsuk el, ui. az első indítás után csak 30 napig használható.

## Lua

    $ sudo apt install lua5.4

## Go

    $ sudo apt install golang-1.22

Majd bővítsük a `~/.bashrc` végét:

    export PATH=$PATH:/usr/lib/go-1.22/bin
    export GOPATH="$HOME/go"
    export PATH=$PATH:$GOPATH/bin

## D Lang.

lásd https://dlang.org/download.html

    $ wget https://downloads.dlang.org/releases/2.x/2.109.1/dmd_2.109.1-0_amd64.deb
    $ sudo dpkg -i dmd_2.109.1-0_amd64.deb
    $ rm dmd_2.109.1-0_amd64.deb

dfmt telepítése (lásd https://github.com/dlang-community/dfmt):

    $ dub run dfmt -- -h

Utána a PATH-t bővítsük ki:

    $ export PATH=$PATH:$HOME/.dub/packages/dfmt/0.15.1/dfmt/bin

## NoSQL

### MongoDB:

Lásd https://www.mongodb.com/docs/manual/tutorial/install-mongodb-on-ubuntu/

    $ sudo apt-get install gnupg curl
    $ curl -fsSL https://www.mongodb.org/static/pgp/server-7.0.asc | sudo gpg -o /usr/share/keyrings/mongodb-server-7.0.gpg --dearmor
    $ echo "deb [ arch=amd64,arm64 signed-by=/usr/share/keyrings/mongodb-server-7.0.gpg ] https://repo.mongodb.org/apt/ubuntu jammy/mongodb-org/7.0 multiverse" | sudo tee /etc/apt/sources.list.d/mongodb-org-7.0.list
    $ sudo apt-get update
    $ sudo apt-get install -y mongodb-org
    $ sudo systemctl enable mongod
    $ sudo systemctl start mongod

Ellenőrzés:

    $ sudo systemctl status mongod
    $ mongosh

### Redis:

    $ sudo apt install redis

Redis Insight telepítése:

    - Software Manager indítása
    - a "redis" kulcsszóra keressünk rá
    - a Redis Insight csomagot telepítsük fel

## Egy kis tisztogatás a végére

    $ sudo apt autoremove
    $ sudo apt clean
    $ sudo apt autoclean

-------------------------------------------------

# Windows 10

## általános

* Firefox
* Visual Studio Code
  https://code.visualstudio.com/Download
  innen a 64 bites verziót tegyük fel
* Total Commander
  https://www.ghisler.com/
  Download -> 64 bit version only

## Python fejlesztés

* https://www.python.org/ meglátogatása
  Downloads -> Windows fül
* Stable Releases alatt Download Windows installer (64-bit)
  töltsük le, indítsuk el a telepítőt
* add python.exe to PATH legyen bekapcsolva
  Customize Installation módban tegyük fel
* Optional features alatt a pip legyen bekapcsolva
* telepítés ajánlott helye: `C:\Python312`

## C fejlesztés

* A https://nuwen.net/mingw.html oldalon töltsük le a mingw-19.0.exe -t.
  Direkt link: https://nuwen.net/files/mingw/mingw-19.0.exe
* Futtassuk és telepítsük pl. a `C:\tmp` könyvtárba.
* A `C:\tmp\MinGW` mappát mozgassuk át a `C:\MinGW` mappába.
* A `C:\MinGW\bin` könyvtárat adjuk hozzá a PATH-hoz.

## C# fejlesztés

* .NET 8.0
  https://dotnet.microsoft.com/download
  .NET SDK x64 telepítése
  Telepítés utáni ellenőrzés:
  - cmd indítása
  - `dotnet` parancs kiadása
  - `dotnet --version` parancs kiadása
* nuget csomagkezelő
  https://www.nuget.org/downloads , Windows x86 Commandline, recommended latest letöltése
  ez egy EXE file (nuget.exe), amit tegyünk be egy olyan helyre, ami szerepel a PATH-ban
  például a dotnet.exe mellé ide: `C:\Program files\dotnet\nuget.exe` helyre
* Jetbrains Rider IDE telepítése
  https://www.jetbrains.com/rider/ , 30-day trial verzió

## Java fejlesztés

* Java SDK 21 (LTS)
  https://www.azul.com/downloads/?version=java-21-lts&os=windows&architecture=x86-64-bit&package=jdk#zulu
  Itt menjünk le az oldal legaljára.
  .msi változat telepítése
  Telepítés utáni ellenőrzés:
  - cmd indítása
  - `java -version` parancs kiadása
  - `javac -version` parancs kiadása
* Jetbrains IntelliJ IDEA telepítése
  https://www.jetbrains.com/idea/download/other.html
  itt: IntelliJ IDEA Community Edition oszlop, Windows x64 (exe) letöltése és telepítése

## Python fejlesztés
* Jetbrains PyCharm telepítése
  https://www.jetbrains.com/pycharm/download/other.html
  itt: PyCharm Community Edition oszlop, Windows (exe) letöltése és telepítése
