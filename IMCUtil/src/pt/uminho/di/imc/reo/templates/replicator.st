#PORTS
($a$,$b$) ($a$,$c$)

#INITIALS
[]

#GOALS
[]

#TRANSITIONS
[] !
* [$a$] $ga$
* [$b$] $gb$
* [$c$] $gc$


[$a$] !
* [$a$ $b$] $gb$
* [$a$ $c$] $gc$

[$b$] !
* [$a$ $b$] $ga$
* [$b$ $c$] $gc$

[$c$] !
* [$a$ $c$] $ga$
* [$b$ $c$] $gb$

[$a$ $b$] !
* [$a$ $b$ $c$] $gc$

[$a$ $c$] !
* [$a$ $b$ $c$] $gb$

[$b$ $c$] !
* [$a$ $b$ $c$] $ga$

[$a$ $b$ $c$] <$a$ $b$ $c$>
* []{$a$ $b$ $c$} 0

[]{$a$ $b$ $c$} !
* [] $gabc$