docker_up:
	docker compose -f docker-compose.local.yml up -d --build

docker_run:
	docker compose -f docker-compose.local.yml exec app ./gradlew build
	docker compose -f docker-compose.local.yml exec app java -jar build/libs/demo-0.0.1-SNAPSHOT.jar