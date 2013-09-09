#PORTS
($a$, $b$) ($b$, $a$)

#INITIALS
[]

#GOALS
[]

#TRANSITIONS
[] !
* [$a$] $ga$
* [$b$] $gb$

[$a$] !
* [$a$ $b$] $gb$

[$b$] !
* [$a$ $b$] $ga$

[$a$ $b$] <$a$ $b$>
* []{$a$ $b$} 0

[]{$a$ $b$} !
* [] $gab$