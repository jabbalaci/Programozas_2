utolsó frissítés: 2023. aug. 10.

Linux (Ubuntu 22.04)
====================

általános
---------

    $ sudo apt install mc konsole tmux gedit htop neovim firefox
    $ sudo snap install code --classic

Python 3
--------

    $ sudo apt install python3-pip
    $ sudo snap install pycharm-community --classic

NoSQL
-----

Lásd https://www.mongodb.com/docs/manual/tutorial/install-mongodb-on-ubuntu/

    $ sudo apt-get install gnupg curl
    $ curl -fsSL https://pgp.mongodb.com/server-6.0.asc | sudo gpg -o /usr/share/keyrings/mongodb-server-6.0.gpg --dearmor
    $ echo "deb [ arch=amd64,arm64 signed-by=/usr/share/keyrings/mongodb-server-6.0.gpg ] https://repo.mongodb.org/apt/ubuntu jammy/mongodb-org/6.0 multiverse" | sudo tee /etc/apt/sources.list.d/mongodb-org-6.0.list
    $ sudo apt-get update
    $ sudo apt-get install -y mongodb-org
    $ sudo systemctl enable mongod
    $ sudo systemctl start mongod

Ellenőrzés:

    $ sudo systemctl status mongod
    $ mongosh

C fejlesztés
------------

    $ sudo apt install build-essential
    $ sudo apt install gcc clang
    $ sudo snap install valgrind --classic

C# fejlesztés
-------------

Lásd https://learn.microsoft.com/en-us/dotnet/core/install/linux-ubuntu-2204

    $ sudo apt-get update && sudo apt-get install -y dotnet-sdk-7.0

Ellenőrzés:

    $ dotnet --version

    $ sudo apt install nuget
    $ sudo snap install rider --classic
    $ sudo apt install mono-csharp-shell

Java fejlesztés
---------------

    $ sudo apt install openjdk-17-jdk-headless
    $ sudo snap install intellij-idea-community --classic

Egy kis tisztogatás a végére
----------------------------

    $ sudo apt autoremove


Windows 10
==========

általános
---------

* Firefox
* Visual Studio Code
  https://code.visualstudio.com/Download
  innen a 64 bites verziót tegyük fel
* Total Commander
  https://www.ghisler.com/
  Download -> 64 bit version only

C fejlesztés
------------

* A https://nuwen.net/mingw.html oldalon töltsük le a mingw-18.0.exe -t.
  Direkt link: https://nuwen.net/files/mingw/mingw-18.0.exe
* Futtassuk és telepítsük pl. a `C:\tmp` könyvtárba.
* A `C:\tmp\MinGW` mappát mozgassuk át a `C:\MinGW` mappába.
* A `C:\MinGW\bin` könyvtárat adjuk hozzá a PATH-hoz.

C# fejlesztés
-------------

* .NET 7.0
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

Java fejlesztés
---------------

* Java SDK 17 (LTS)
  https://www.azul.com/downloads/?version=java-17-lts&os=windows&architecture=x86-64-bit&package=jdk#zulu
  Itt menjünk le az oldal legaljára.
  .msi változat telepítése
  Telepítés utáni ellenőrzés:
  - cmd indítása
  - `java -version` parancs kiadása
  - `javac -version` parancs kiadása
* Jetbrains IntelliJ IDEA telepítése
  https://www.jetbrains.com/idea/download/other.html
  itt: IntelliJ IDEA Community Edition oszlop, Windows x64 (exe) letöltése és telepítése

Python fejlesztés
-----------------
* Jetbrains PyCharm telepítése
  https://www.jetbrains.com/pycharm/download/other.html
  itt: PyCharm Community Edition oszlop, Windows (exe) letöltése és telepítése
