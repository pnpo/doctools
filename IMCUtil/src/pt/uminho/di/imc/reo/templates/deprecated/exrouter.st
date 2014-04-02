#PORTS
($a$,$b$) ($a$,$c$)

#INITIALS
[]

#GOALS
[]

#TRANSITIONS
[] !
* [$a$] $ga$				@ XOR_$id$_ARR_[$a$] @
* [$b$] $gb$				@ XOR_$id$_ARR_[$b$] @
* [$c$] $gc$				@ XOR_$id$_ARR_[$c$] @


[$a$] !
* [$a$ $b$] $gb$			@ XOR_$id$_ARR_[$b$] @
* [$a$ $c$] $gc$			@ XOR_$id$_ARR_[$c$] @

[$b$] !
* [$a$ $b$] $ga$			@ XOR_$id$_ARR_[$a$] @
* [$b$ $c$] $gc$			@ XOR_$id$_ARR_[$c$] @

[$c$] !
* [$a$ $c$] $ga$			@ XOR_$id$_ARR_[$a$] @
* [$b$ $c$] $gb$			@ XOR_$id$_ARR_[$b$] @

[$a$ $b$] <$a$ $b$>
* []{$a$ $b$} 0

[$a$ $b$] !
* [$a$ $b$ $c$] $gc$		@ XOR_$id$_ARR_[$c$] @

[$a$ $c$] <$a$ $c$>
* []{$a$ $c$} 0

[$a$ $c$] !
* [$a$ $b$ $c$] $gb$ 		@ XOR_$id$_ARR_[$b$] @

[$b$ $c$] !
* [$a$ $b$ $c$] $ga$		@ XOR_$id$_ARR_[$a$] @

[$a$ $b$ $c$] <$a$ $b$>
* [$c$]{$a$ $b$} 0

[$a$ $b$ $c$] <$a$ $c$>
* [$b$]{$a$ $c$} 0

[]{$a$ $b$} !
* [] $gab$					@ XOR_$id$_TRs_[$a$,$b$] @
* [$c$]{$a$ $b$} $gc$		@ XOR_$id$_ARR_[$c$] @

[]{$a$ $c$} !
* [] $gac$					@ XOR_$id$_TRs_[$a$,$c$] @
* [$b$]{$a$ $c$} $gb$		@ XOR_$id$_ARR_[$b$] @

[$c$]{$a$ $b$} !
* [$c$] $gab$				@ XOR_$id$_TRs_[$a$,$b$] @

[$b$]{$a$ $c$} !
* [$b$] $gac$				@ XOR_$id$_TRs_[$a$,$c$] @