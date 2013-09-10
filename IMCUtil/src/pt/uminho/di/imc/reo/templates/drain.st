#PORTS
($a$, $b$) ($b$, $a$)

#INITIALS
[]

#GOALS
[]

#TRANSITIONS
[] !
* [$a$] $ga$			@ DRAIN_$id$_ARR_$a$ @
* [$b$] $gb$			@ DRAIN_$id$_ARR_$b$ @

[$a$] !
* [$a$ $b$] $gb$		@ DRAIN_$id$_ARR_$b$ @

[$b$] !
* [$a$ $b$] $ga$		@ DRAIN_$id$_ARR_$a$ @

[$a$ $b$] <$a$ $b$>
* []{$a$ $b$} 0

[]{$a$ $b$} !
* [] $gab$				@ DRAIN_$id$_TRs_$a$$b$ @