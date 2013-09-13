#PORTS
($a$,$c$) ($b$,$c$)

#INITIALS
[]

#GOALS
[]

#TRANSITIONS
[] !
* [$a$] $ga$				@ M_$id$_ARR_[$a$] @
* [$b$] $gb$				@ M_$id$_ARR_[$b$] @
* [$c$] $gc$				@ M_$id$_ARR_[$c$] @


[$a$] !
* [$a$ $b$] $gb$			@ M_$id$_ARR_[$b$] @
* [$a$ $c$] $gc$			@ M_$id$_ARR_[$c$] @

[$b$] !
* [$a$ $b$] $ga$			@ M_$id$_ARR_[$a$] @
* [$b$ $c$] $gc$			@ M_$id$_ARR_[$c$] @

[$c$] !
* [$a$ $c$] $ga$			@ M_$id$_ARR_[$a$] @
* [$b$ $c$] $gb$			@ M_$id$_ARR_[$b$] @

[$a$ $b$] !
* [$a$ $b$ $c$] $gc$		@ M_$id$_ARR_[$c$] @

[$a$ $b$ $c$] <$a$ $c$>
* [$b$]{$a$ $c$} 0

[$a$ $b$ $c$] <$b$ $c$>
* [$a$]{$b$ $c$} 0

[$a$ $c$] !
* [$a$ $b$ $c$] $gb$		@ M_$id$_ARR_[$b$] @

[$a$ $c$] <$a$ $c$>
* []{$a$ $c$} 0

[$b$ $c$] !
* [$a$ $b$ $c$] $ga$		@ M_$id$_ARR_[$a$] @

[$b$ $c$] <$b$ $c$>
* []{$b$ $c$} 0

[]{$a$ $c$} ! 
* [] $gac$					@ M_$id$_TRs_[$a$,$c$] @

[]{$b$ $c$} ! 
* [] $gbc$					@ M_$id$_TRs_[$b$,$c$] @