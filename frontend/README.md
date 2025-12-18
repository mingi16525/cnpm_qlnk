# Frontend - Hệ Thống Quản Lý Nhân Khẩu

Frontend được xây dựng với React + Vite.

## Cài đặt

```bash
npm install
```

## Chạy Development Server

```bash
npm run dev
```

Server sẽ chạy tại http://localhost:3000

## Build Production

```bash
npm run build
```

## Cấu trúc thư mục

```
src/
  ├── api/          # API configuration
  ├── App.jsx       # Main component
  ├── main.jsx      # Entry point
  └── *.css         # Styles
```

## Environment Variables

Tạo file `.env.local` với nội dung:

```
VITE_API_BASE_URL=http://localhost:8080
```
