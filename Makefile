# コンテナを起動
docker_up:
	docker compose -f docker-compose.local.yml up -d --build

# ビルド
docker_build:
	docker compose -f docker-compose.local.yml exec app ./gradlew build

# APIを起動
docker_run:
	docker compose -f docker-compose.local.yml exec app ./gradlew build
	docker compose -f docker-compose.local.yml exec app java -jar build/libs/api-0.0.1-SNAPSHOT.jar

# DBに接続
docker_db:
	docker compose -f docker-compose.local.yml exec db mysql --host=localhost --user=mysql_user --password=mysql_password springboot_ddd
