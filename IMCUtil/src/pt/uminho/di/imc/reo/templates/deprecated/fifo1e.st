#PORTS
($b$#,$a$)

#INITIALS
[]&

#GOALS
[]& 

#TRANSITIONS
[]& !
* [$a$]& $ga$			@ FIFO1e_$id$_ARR_[$a$] @
* [$b$]& $gb$			@ FIFO1e_$id$_ARR_[$b$] @

[$a$]& <$a$>
* []{$a$}& 0

[$a$]& !
* [$a$ $b$]& $gb$		@ FIFO1e_$id$_ARR_[$b$] @

[]{$a$}& !
* []# $gaB$				@ FIFO1e_$id$_TRs_[$a$]_B @
* [$b$]{$a$}& $gb$		@ FIFO1e_$id$_ARR_[$b$] @

[]# !
* [$a$]# $ga$			@ FIFO1e_$id$_ARR_[$a$] @
* [$b$]# $gb$			@ FIFO1e_$id$_ARR_[$b$] @

[$a$]# !
* [$a$ $b$]# $gb$		@ FIFO1e_$id$_ARR_[$b$] @

[$b$]& !
* [$a$ $b$]& $ga$		@ FIFO1e_$id$_ARR_[$a$] @

[$a$ $b$]& <$a$>
* [$b$]{$a$}& 0

[$b$]{$a$}& !
* [$b$]# $gaB$			@ FIFO1e_$id$_TRs_[$a$]_B @

[$b$]# !
* [$a$ $b$]# $ga$		@ FIFO1e_$id$_ARR_[$a$] @

[$b$]# <$b$>
* []{$b$}# 0

[]{$b$}# !
* [$a$]{$b$}# $ga$		@ FIFO1e_$id$_ARR_[$a$] @
* []& $gBb$				@ FIFO1e_$id$_TRs_B_[$b$] @

[$a$ $b$]# <$b$>
* [$a$]{$b$}# 0

[$a$]{$b$}# !
* [$a$]& $gBb$			@ FIFO1e_$id$_TRs_B_[$b$] @