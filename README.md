# Social movies

## TODO

- Extract year
- Better rating parse... regexp

## API

register:

{"nickname" : "lulu","email" : "lul@lulu.com","imdbId" : "1","password" : "p","repeat" : "p"}

curl http://localhost:8080/user -d "{\"nickname\" : \"lulu\",\"email\" : \"lul@lulu.com\",\"imdbId\" : \"1\",\"password\" : \"p\",\"repeat\" : \"p\"}" -H "Content-type:application/json"

get-films:

