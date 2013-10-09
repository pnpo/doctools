#!/bin/bash

if [ $# -eq 2 ] ; then 
	echo 'conversion started...'
	file="$1/$2"
	bcg_io "$file.aut" "$file.bcg"
	echo "$1.aut converted with success\n"
	
	echo 'minimization started...'
	bcg_open  "$file.bcg"  reductor -weaktrace "$file.red.bcg"
	
	bcg_min  -branching -rate -self  "$file.red.bcg" "$file.red.bcg"
	echo "minimized with success\n"
	
	bcg_io "$file.red.bcg" "$file.red.aut"
	rm reductor
	cd $1
	rm *.bcg *.o
	
else 
	echo 'Just provide the input .aut file and the output name for the .bcg file and the kind of bisimulation'
fi

# usage: 
# > ../input/minimizer.sh name <no .extension>