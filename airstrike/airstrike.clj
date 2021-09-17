(var pos $dl.players.PLAYERNAME.position) 
;change PLAYERNAME to your nickname to get your coordinates
;you can write coordinates instead of player position for example: (var pos [1 1 1])

(var randomMax 20)
(var randomMin (* randomMax -1))
;you can also change these variables to get more or less spread

(let g 0)
(dl.sound.play "rbxassetid://6959070005")
(wait 14)
 (while (< g 20)
    (print g)
    (let g (inc g))
    (dl.util.explosion (map + pos [(rand-int randomMin randomMax) 0 (+ (rand-int randomMin randomMax) (* g 3)) ]) "TestGrenade")
(wait  (/(rand-int 5 20)100)))