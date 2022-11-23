﻿# l2-reborn-x30-rb-checker
Web scraping app that can help Lineage 2 players who play on l2Reborn x30 server.  
It extracts data about the status of raidbosses in the game from interactive map on https://seasons.l2reborn.org/raidbosses-map/ and turns it into ordered table of raidbosses who are alive or respawning soon. The information refreshes every 3 minutes. Basically using the json file their website uses after inspecting for it. Before that I used Jsoup parsing HTML...  

## Deployment
The application is deployed on Heroku: https://l2-reborn-x30-rb-checker.herokuapp.com/  

## Image examples
The app turns the information from this:  
[![H2K5JuS.md.png](https://iili.io/H2K5JuS.md.png)](https://freeimage.host/i/H2K5JuS)  
To this:  
[![H2KAYWg.md.png](https://iili.io/H2KAYWg.md.png)](https://freeimage.host/i/H2KAYWg)
