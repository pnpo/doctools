#!/bin/bash

if [ $# -eq 3 ] ; then 
	echo 'conversion started...'
	bcg_io $1 $2
	echo "$1 converted with success\n"
	
	echo 'minimization started...'
	bcg_min -$3 -rate -self $2 "$2_$3.bcg"
	echo "$2 minimized with success\n"
	
	bcg_info "$2_$3.bcg"
	
else 
	echo 'Just provide the input .aut file and the output name for the .bcg file and the kind of bisimulation'
fi

# usage: 
# > ../input/bcgminimize.sh name.aut name.bcg (branching|...)

#test equivalence 
# bcg_open name.bcg bisimulator -[greater|smaller] -[strong|branching|...] name2.bcg