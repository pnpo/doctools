#PORTS
($a$,$b$)

#INITIALS
[]

#GOALS
[]

#TRANSITIONS
[] !
* [$a$] $ga$			@ SYNC_$id$_ARR_$a$ @
* [$b$] $gb$			@ SYNC_$id$_ARR_$b$ @

[$a$] !
* [$a$ $b$] $gb$		@ SYNC_$id$_ARR_$b$ @

[$b$] !
* [$a$ $b$] $ga$		@ SYNC_$id$_ARR_$a$ @

[$a$ $b$] <$a$ $b$>
* []{$a$ $b$} 0

[]{$a$ $b$} !
* [] $gab$				@ SYNC_$id$_TRs_$a$$b$ @