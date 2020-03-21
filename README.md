# FC

**Step**
### Add a book to db.
### Path
```
http://localhost:8280/book/addBook
```
### Body
```
{
	"name": "Enter a book name",
	"desc": "Description"
}
```


### Get book lists.
```
http://localhost:8280/book/getBooks
```

### Delete a book by id. -> 
```
http://localhost:8280/book/deleteBook
```
Params name is bookId
```
  bookId = 1
```
