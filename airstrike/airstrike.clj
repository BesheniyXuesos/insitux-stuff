(var randomMax 20)
(var randomMin (* randomMax -1))
;you can also change these variables to get more or less spread


(function airtstikePlr sender		
		(var pos (position (str "dl.players." sender)))  
						;change PLAYERNAME to your nickname to get your coordinates
						;you can write coordinates instead of player position for example: (var pos [1 1 1]

						(let g 0)
						(dl.sound.play "rbxassetid://6959070005")

						(var a (rand-int -3 3))
						(var b (rand-int -3 3))

						(wait 14.5)
						 (while (< g (rand-int 20 40))
						    (print g)
						    (let g (inc g))
						    (dl.util.explosion (map + pos [(+(rand-int randomMin randomMax) (* g a)) 0 (+ (rand-int randomMin randomMax) (* g b)) ]) "TestGrenade")
						(wait  (/(rand-int 3 15)100))) 
)

(function airtstikePos sender		
		(var pos sender)  
						;change PLAYERNAME to your nickname to get your coordinates
						;you can write coordinates instead of player position for example: (var pos [1 1 1]

						(let g 0)
						(dl.sound.play "rbxassetid://6959070005")

						(var a (rand-int -3 3))
						(var b (rand-int -3 3))

						(wait 14.5)
						 (while (< g (rand-int 20 40))
						    (print g)
						    (let g (inc g))
						    (dl.util.explosion (map + pos [(+(rand-int randomMin randomMax) (* g a)) 0 (+ (rand-int randomMin randomMax) (* g b)) ]) "TestGrenade")
						(wait  (/(rand-int 3 15)100))) 
)

(function sent sender channel message
  	(if (starts-with? message "!airstrikePlr ")
					(airtstikePlr (sect message 14))
			)
  	(if (starts-with? message "!airstrikePos ")
					(airtstikePos (sect message 14))
			)
 )

(dl.events.on_chat_message.connect sent)

