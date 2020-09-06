#!/usr/bin/env bash

# good_shape.sh
#
# update script for Ubuntu Linux

sudo dpkg --configure -a\
&& sudo apt -f install\
&& sudo apt --fix-missing install\
&& sudo apt clean\
&& sudo apt update\
&& sudo apt upgrade\
&& sudo apt dist-upgrade\
&& sudo apt clean\
&& sudo apt autoremove
