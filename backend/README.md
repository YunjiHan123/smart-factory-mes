# Backend API Docs

## Swagger UI

백엔드를 실행한 뒤 아래 경로로 접속하면 됩니다.

```bash
cd backend
mvnw.cmd spring-boot:run
```

- `http://localhost:8080/swagger-ui.html`
- `http://localhost:8080/v3/api-docs`
- `http://localhost:8080/v3/api-docs.yaml`

## Postman Import

Postman에서 `Import -> Link`로 아래 OpenAPI 문서를 연결하세요.

```text
http://localhost:8080/v3/api-docs
```

권장 옵션:

- `Specification with a Postman Collection`

이 방식이면 OpenAPI를 기준 문서로 유지하면서 Postman 컬렉션을 다시 생성하거나 갱신하기 편합니다.

## Suggested Repo Layout

생성하거나 export한 Postman 파일은 아래 경로에 보관하면 됩니다.

```text
postman/
  Smart-Factory-MES.postman_collection.json
  Smart-Factory-MES.local.postman_environment.json
```
