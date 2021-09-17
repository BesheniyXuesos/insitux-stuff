(var pos $dl.players.PLAYERNAME.position) 
;change PLAYERNAME to your nickname to get your coordinates
;you can write coordinates instead of player position for example: (var pos [1 1 1])

(var randomMax 20)
(var randomMin -20)
;you can also change these variables to get more or less spread

(let g 0)
(dl.sound.play "rbxassetid://6959070005")
(wait 13)
 (while (< g 20)
    (print g)
    (let g (inc g))
    (dl.util.explosion (map + pos [(rand-int randomMin randomMax) 0 (rand-int randomMin randomMax)]) "TestGrenade")

(wait  (/(rand-int 1 1.5)10)))