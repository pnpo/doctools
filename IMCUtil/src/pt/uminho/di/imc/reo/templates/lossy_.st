#PORTS
($a$, $b$)

#INITIALS
[]

#GOALS
[]

#TRANSITIONS
[] <$a$>
* []{$a$} 0

[] <$a$ $b$>
* []{$a$ $b$} 0

[]{$a$} !
* [] $gaL$				@ LOSSY_$id$_TRl_[$a$] @

[]{$a$ $b$} !
* [] $gab$				@ LOSSY_$id$_TRs_[$a$,$b$] @