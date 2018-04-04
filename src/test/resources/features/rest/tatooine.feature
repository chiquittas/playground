Feature: Star Wars
  Scenario: Homeworld check
  When user gets information about Luke Skywalker
  Then parameter "homeworld" is present
  When "homeworld" is requested
  Then "planet" has:
  |name|Tatooine|
  |population|200000|
 When "film" is requested
  Then "film" has:
  |title| Attack of the Clones|
  |character|Luke Skywalker   |
  |planet   |Tatooine         |
----------hhh
  #- поиск человека с id=1 (Luke Skywalker).
#- по его homeworld найти планету, проверить ее name (Tatooine) и population (200000).
#- для первого в списке этой планеты фильма проверить title (Attack of the Clones);
#- проверить, что фильму принадлежит Luke Skywalker и его планета.
