# FC

**Step**
### Add a book to db.
### Path
```
http://localhost:8280/book/addBook
```
### Body e.g.
```
{
	"name": "Angular Framework Fundamental",
	"desc": "Description"
}
```


### Get book lists.
```
http://localhost:8280/book/getBooks
```

### Delete a book by id.
```
http://localhost:8280/book/deleteBook
```
Params name is bookId, e.g.
```
  bookId = 1
```
