	(var pos $dl.players.svyat2.position) 
	;change PLAYERNAME to your nickname to get your coordinates
	;you can write coordinates instead of player position for example: (var pos [1 1 1])

	(var randomMax 20)
	(var randomMin (* randomMax -1))
	;you can also change these variables to get more or less spread

	(let g 0)
	(dl.sound.play "rbxassetid://6959070005")
	(var a (rand-int -3 3))
	(var b (rand-int -3 3)
	(wait 15)
	 (while (< g (rand-int 20 35))
	    (print g)
	    (let g (inc g))
	    (dl.util.explosion (map + pos [(+(rand-int randomMin randomMax) (* g a)) 0 (+ (rand-int randomMin randomMax) (* g b)) ]) "TestGrenade")
	(wait  (/(rand-int 1 10)100)))