#PORTS
($a$, $b$)

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

[$a$] <$a$>
* []{$a$} 0

[]{$a$} !
* [$b$]{$a$} $gb$
* [] $gaL$

[$b$]{$a$} !
* [$b$] $gaL$

[$b$] !
* [$a$ $b$] $ga$

[$a$ $b$] <$a$ $b$>
* []{$a$ $b$} 0

[]{$a$ $b$} !
* [] $gab$