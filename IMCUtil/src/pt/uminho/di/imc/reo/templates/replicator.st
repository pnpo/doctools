#PORTS
($a$,$b$) ($a$,$c$)

#INITIALS
[]

#GOALS
[]

#TRANSITIONS
[] !
* [$a$] $ga$					@ R_$id$_ARR_[$a$] @
* [$b$] $gb$					@ R_$id$_ARR_[$b$] @
* [$c$] $gc$					@ R_$id$_ARR_[$c$] @


[$a$] !
* [$a$ $b$] $gb$				@ R_$id$_ARR_[$b$] @
* [$a$ $c$] $gc$				@ R_$id$_ARR_[$c$] @

[$b$] !
* [$a$ $b$] $ga$				@ R_$id$_ARR_[$a$] @
* [$b$ $c$] $gc$				@ R_$id$_ARR_[$c$] @

[$c$] !
* [$a$ $c$] $ga$				@ R_$id$_ARR_[$a$] @
* [$b$ $c$] $gb$				@ R_$id$_ARR_[$b$] @

[$a$ $b$] !
* [$a$ $b$ $c$] $gc$			@ R_$id$_ARR_[$c$] @

[$a$ $c$] !
* [$a$ $b$ $c$] $gb$			@ R_$id$_ARR_[$b$] @

[$b$ $c$] !
* [$a$ $b$ $c$] $ga$			@ R_$id$_ARR_[$a$] @

[$a$ $b$ $c$] <$a$ $b$ $c$>
* []{$a$ $b$ $c$} 0

[]{$a$ $b$ $c$} !
* [] $gabc$						@ R_$id$_TRs_[$a$,$b$,$c$] @