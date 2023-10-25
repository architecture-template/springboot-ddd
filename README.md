# springboot-ddd
Spring Boot&amp;DDD

## 環境構築
- コンテナを起動
```
make docker_up
```
- DBに接続
- [ddl.sql](https://github.com/architecture-template/springboot-ddd/blob/main/docs/db/ddl.sql)を使用する
```
make docker_db
```

## API仕様
### IDから取得
```
GET: http://localhost:8080/example/1
```
- response
```json
{
    "status": 200,
    "message": "Get Example",
    "data": {
        "id": 1,
        "exampleName": "Name1",
        "deletedAt": null,
        "createdAt": "2023-10-25T00:54:44.000+00:00",
        "updatedAt": "2023-10-25T00:54:44.000+00:00"
    }
}
```
  
### 追加
```
POST: http://localhost:8080/example
```
- request
```json
{
    "exampleName": "Name2"
}
```
- response
```json
{
    "status": 200,
    "message": "Add Example",
    "data": {
        "id": 2,
        "exampleName": "Name2",
        "deletedAt": null,
        "createdAt": "2023-10-25T08:05:41.838+00:00",
        "updatedAt": "2023-10-25T08:05:41.838+00:00"
    }
}
```

### 更新
```
PUT: http://localhost:8080/example/2
```
- request
```
{
    "exampleName": "Name2 Update"
}
```
- response
```json
{
    "status": 200,
    "message": "Update Example",
    "data": {
        "id": 2,
        "exampleName": "Name2 Update",
        "deletedAt": null,
        "createdAt": "2023-10-25T08:05:41.838+00:00",
        "updatedAt": "2023-10-25T08:05:41.838+00:00"
    }
}
```

### 削除
```
DELETE: http://localhost:8080/example/2
```
- response
```
{
    "status": 200,
    "message": "Delete Example",
    "data": {
        "id": 2,
        "exampleName": "Name2 Update",
        "deletedAt": null,
        "createdAt": "2023-10-25T08:05:41.838+00:00",
        "updatedAt": "2023-10-25T08:05:41.838+00:00"
    }
}
```
