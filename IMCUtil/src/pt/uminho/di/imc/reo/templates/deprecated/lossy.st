#PORTS
($a$, $b$)

#INITIALS
[]

#GOALS
[]

#TRANSITIONS
[] !
* [$a$] $ga$  			@ LOSSY_$id$_ARR_[$a$] @
* [$b$] $gb$  			@ LOSSY_$id$_ARR_[$b$] @

[$a$] !
* [$a$ $b$] $gb$ 		@ LOSSY_$id$_ARR_[$b$] @

[$a$] <$a$>
* []{$a$} 0

[]{$a$} !
* [] $gaL$				@ LOSSY_$id$_TRl_[$a$] @

[$b$] !
* [$a$ $b$] $ga$		@ LOSSY_$id$_ARR_[$a$] @

[$a$ $b$] <$a$ $b$>
* []{$a$ $b$} 0

[]{$a$ $b$} !
* [] $gab$				@ LOSSY_$id$_TRs_[$a$,$b$] @