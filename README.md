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

## API
- IDから取得
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
- 追加
```
POST: http://localhost:8080/example
```
- request
```json
{
    "exampleName": "Name4"
}
```
- response
```json
{
    "status": 200,
    "message": "Add Example",
    "data": {
        "id": 4,
        "exampleName": "Name4",
        "deletedAt": null,
        "createdAt": "2023-10-25T08:05:41.838+00:00",
        "updatedAt": "2023-10-25T08:05:41.838+00:00"
    }
}
```

