# Task Management RESTful API Design

## Base URL

```
/api
```

---

# User API

## 1. Lấy danh sách tất cả người dùng

**Method**

```
GET /users
```

Mô tả:

- Trả về toàn bộ danh sách người dùng.

---

## 2. Tạo người dùng mới

**Method**

```
POST /users
```

Request Body

```json
{
    "name": "Nguyễn Văn A",
    "role": "USER"
}
```

---

## 3. Cập nhật vai trò của người dùng

**Method**

```
PUT /users/{id}/role
```

Ví dụ

```
PUT /users/1/role
```

Request Body

```json
{
    "role": "ADMIN"
}
```

---

## 4. Xóa người dùng

**Method**

```
DELETE /users/{id}
```

Ví dụ

```
DELETE /users/1
```

---

## 5. Liệt kê toàn bộ công việc của một người dùng

**Method**

```
GET /users/{id}/tasks
```

Ví dụ

```
GET /users/1/tasks
```

---

# Task API

## 1. Lấy toàn bộ danh sách công việc

**Method**

```
GET /tasks
```

---

## 2. Tạo công việc mới

**Method**

```
POST /tasks
```

Request Body

```json
{
    "title": "Làm bài tập Spring Boot",
    "priority": "high",
    "status": "TODO"
}
```

---

## 3. Cập nhật trạng thái công việc

**Method**

```
PUT /tasks/{id}/status
```

Ví dụ

```
PUT /tasks/5/status
```

Request Body

```json
{
    "status": "DONE"
}
```

---

## 4. Xóa công việc

**Method**

```
DELETE /tasks/{id}
```

Ví dụ

```
DELETE /tasks/5
```

---

## 5. Tìm các công việc có độ ưu tiên là high

**Method**

```
GET /tasks?priority=high
```

---

## 6. Tìm các công việc có độ ưu tiên high của người dùng có id = 1

**Method**

```
GET /tasks?priority=high&userId=1
```

---

## 7. Gắn công việc cho người dùng

**Method**

```
PUT /tasks/{taskId}/assign/{userId}
```

Ví dụ

```
PUT /tasks/5/assign/1
```

Ý nghĩa:

- Gán công việc có id = 5 cho người dùng có id = 1.