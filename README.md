# RPG API

Link to app:  https://generic-rpg-api.herokuapp.com/

## REST API endpoints
```:warning: NOTE: User and CharacterClass MUST be added before a Character is added```
### Users
Method | Endpoint | Description
------------ | ------------- | --------------
GET | /api/user/{id} | Gets User based on id
GET | /api/users | Gets all users
POST | /api/user | Adds a user
POST | /api/users | Adds several users at once

### Character Classes
Method | Endpoint | Description
------------ | ------------- | --------------
GET | /api/class/{className} | Gets CharacterClass based on classname
GET | /api/class/{id} | Gets CharacterClass based on id
GET | /api/classes | Gets all CharacterClasses
POST | /api/class | Adds a CharacterClass
POST | /api/classes | Adds several classes at once

### Characters
Method | Endpoint | Description
------------ | ------------- | --------------
GET | /api/character/{id} | Gets Character based on id
GET | /api/characters | Gets all characters
POST | /api/character | Adds a character

## Sample data

### Users
```
[
    {
        "username": "GodSlayer666",
        "email": "godslayer666@example.com",
        "password": "myPassw0rd5",
        "name": "John Doe",
        "region": "NA"
    },
    {
        "username": "Elixir",
        "email": "elixir@example.com",
        "password": "pass1234",
        "name": "Jane Doe",
        "region": "AF"
    },
    {
        "username": "Phoenix55",
        "email": "phoenix55@example.com",
        "password": "passsword",
        "name": "Alice Alison",
        "region": "AS"
    },
    {
        "username": "AzureDiamond",
        "email": "adiamond@example.com",
        "password": "hunter2",
        "name": "Bob Bobson",
        "region": "NA"
    },
    {
        "username": "sballmer",
        "email": "steven.ballmer@example.com",
        "password": "1234",
        "name": "Steve Ballmer",
        "region": "NA"
    },
    {
        "username": "vheijl",
        "email": "vheijl@example.com",
        "password": "***************",
        "name": "V Heijler",
        "region": "EU"
    }
]
```

### Character classes
```
[
    {
        "type": "Warlord",
        "baseHealth": 80.0,
        "baseDefence": 70.0,
        "baseStrength": 75.5,
        "baseAgility": 15.0,
        "baseMana": 0.0
    },
    {
        "type": "Warlock",
        "baseHealth": 50.0,
        "baseDefence": 30.0,
        "baseStrength": 30.0,
        "baseAgility": 50.0,
        "baseMana": 85.0
    },
    {
        "type": "Hunter",
        "baseHealth": 65.0,
        "baseDefence": 55.0,
        "baseStrength": 45.0,
        "baseAgility": 70.0,
        "baseMana": 0.0
    },
    {
        "type": "Bearzerk",
        "baseHealth": 50,
        "baseDefence": 100,
        "baseStrength": 100.0,
        "baseAgility": 20.0,
        "baseMana": 0.0
    }
]
```

### Characters
NOTE: For the moment, several characters can not be added at once, you have to add them one by one.

```
{
    "name": "Bob",
    "level": 7,
    "gameCharacterClassId": 1,
    "health": 10.0,
    "defence": 10.0,
    "strength": 4.0,
    "agility": 8.0,
    "mana": 1.0,
    "userId": 1
}

{
    "name": "Bobs cousin",
    "level": 1,
    "gameCharacterClassId": 3,
    "health": 5.0,
    "defence": 2.0,
    "strength": 1.0,
    "agility": 1.0,
    "mana": 1.0,
    "userId": 1
}

{
    "name": "Erland the erlang",
    "level": 50,
    "gameCharacterClassId": 4,
    "health": 198.0,
    "defence": 185.0,
    "strength": 144.0,
    "agility": 148.0,
    "mana": 99.0,
    "userId": 2
}

{
    "name": "Snelhest",
    "level": 15,
    "gameCharacterClassId": 2,
    "health": 20.0,
    "defence": 25.0,
    "strength": 10.0,
    "agility": 23.0,
    "mana": 25.0,
    "userId": 3
}

{
    "name": "ADs warlock",
    "level": 10,
    "gameCharacterClassId": 2,
    "health": 20.0,
    "defence": 20.0,
    "strength": 24.0,
    "agility": 18.0,
    "mana": 10.0,
    "userId": 4
}

{
    "name": "BacPeak",
    "level": 3,
    "gameCharacterClassId": 4,
    "health": 14.0,
    "defence": 12.0,
    "strength": 14.0,
    "agility": 8.0,
    "mana": 3.0,
    "userId": 5
}

{
    "name": "DEVELOPERS",
    "level": 99,
    "gameCharacterClassId": 3,
    "health": 80.0,
    "defence": 85.0,
    "strength": 59.9,
    "agility": 77.0,
    "mana": 0.0,
    "userId": 5
}

{
    "name": "Asda",
    "level": 15,
    "gameCharacterClassId": 1,
    "health": 15.0,
    "defence": 20.0,
    "strength": 20.0,
    "agility": 15.0,
    "mana": 0.0,
    "userId": 6
}


```
