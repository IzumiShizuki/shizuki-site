# API / SQL / 模型命名对齐规范

## 1. 目标

本文件只负责说明 API、SQL、Java 模型命名之间的边界与对齐规则，不复制已经由脚本和映射文件强约束的 SQL 规则。

## 2. 权威来源

- SQL 对象命名权威：
  - `resouces/sql/00_object_name_mapping.yaml`
  - `scripts/check_sql_conventions.sh`
- API 与 DTO 约束权威：
  - `resouces/md/02_代码开发文档_v0.1.md`
  - `resouces/md/05_AI协作开发规范_v0.1.md`

## 3. 对齐原则

- Controller 对外请求体：`*Request`
- Controller 对外响应体：`*Response`
- 列表简版响应：`*Summary`
- 选项集响应：`*OptionResponse`
- 持久化实体：`*Entity`
- Mapper / Service / Controller 保持与模块职责一致，不用 DTO 名承担职责说明

## 4. SQL 与模型的关系

- SQL 表名、索引名、约束名遵循映射文件与校验脚本
- Java `Entity` 对应表语义，不要求类名与表名字符串完全相同
- HTTP 字段继续使用 `snake_case`
- Java 字段继续使用 `camelCase`

## 5. 当前登记的命名例外

| 当前名称 | 当前位置 | 现状说明 | 目标名称 |
| --- | --- | --- | --- |
| `QuotaPolicyDto` | `model/response/src/main/java/io/github/shizuki/site/user/dto/QuotaPolicyDto.java` | 已作为对外响应使用，但后缀不统一 | `QuotaPolicyResponse` |
| `OAuthBindingView` | `model/response/src/main/java/io/github/shizuki/site/user/dto/OAuthBindingView.java` | 对外展示对象使用了 `View` | `OAuthBindingResponse` |

说明：

- 例外对象在未完成全链路替换前可以保留，但必须在台账中登记。
- 新增模型不得再引入新的 `*Dto` / `*View` 对外响应类。

## 6. 已符合规则的样例

- `AuthTokenResponse`
- `UserGroupsUpdateRequest`
- `PostSummary`
- `AuthorProfileResponse`
- `MusicTrackResponse`
- `AiCharacterDetailResponse`
