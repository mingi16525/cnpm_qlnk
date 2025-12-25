# Frontend - Hệ Thống Quản Lý Nhân Khẩu

Ứng dụng web quản lý nhân khẩu được xây dựng với React + Vite, cung cấp giao diện người dùng hiện đại và tương tác cho hệ thống quản lý thông tin cư dân.

## Tính năng

- 🏠 Quản lý hộ khẩu và thành viên hộ
- 👥 Quản lý thông tin nhân khẩu
- 📅 Quản lý sự kiện nhân khẩu (sinh, tử)
- 🏨 Quản lý tạm trú, tạm vắng
- 💰 Quản lý thu chi (khoản thu, khoản chi, thu phí)
- 🤝 Quản lý hoạt động thiện nguyện
- 🔐 Xác thực và phân quyền người dùng

## Yêu cầu hệ thống

- Node.js >= 16.0.0
- npm hoặc yarn

## Cài đặt

```bash
npm install

## Chạy Development Server

```bash
npm run dev
```

Server sẽ chạy tại http://localhost:3000

## Build Production

```bash
npm run build
```

Build output sẽ được tạo trong thư mục `dist/`

## Preview Production Build

```bash
npm run preview
```

## Cấu trúc thư mục

```
frontend/
├── index.html           # HTML template chính
├── package.json         # Dependencies và scripts
├── vite.config.js       # Cấu hình Vite
└── src/
    ├── main.jsx         # Entry point của ứng dụng
    ├── App.jsx          # Component chính
    ├── App.css          # Styles cho App component
    ├── index.css        # Global styles
    └── api/
        ├── axios.js     # Cấu hình Axios và API client
        └── README.md    # Tài liệu về API
```

## Environment Variables

Tạo file `.env` hoặc `.env.local` trong thư mục frontend với nội dung:

```env
VITE_API_BASE_URL=http://localhost:8080
```

**Lưu ý:** Biến môi trường trong Vite phải bắt đầu bằng prefix `VITE_` để có thể truy cập trong code.

## Kết nối với Backend

Frontend kết nối với REST API backend chạy tại `http://localhost:8080` (có thể cấu hình qua biến môi trường).

Các endpoint chính:
- `/api/auth/*` - Xác thực
- `/api/hokhau/*` - Hộ khẩu
- `/api/nhankhau/*` - Nhân khẩu
- `/api/sukiennhankhau/*` - Sự kiện nhân khẩu
- `/api/tamtrutamvang/*` - Tạm trú/tạm vắng
- `/api/khoanthu/*` - Khoản thu
- `/api/khoanchi/*` - Khoản chi
- `/api/thuphi/*` - Thu phí
- `/api/hoatdongthiennguyen/*` - Hoạt động thiện nguyện

## Scripts

```bash
# Development
npm run dev           # Chạy dev server với hot reload

# Production
npm run build         # Build production
npm run preview       # Preview production build

# Code Quality
npm run lint          # Chạy ESLint (nếu có cấu hình)
```

## Công nghệ sử dụng

- **React 18** - UI library
- **Vite** - Build tool và dev server
- **Axios** - HTTP client cho API calls

## Hướng dẫn phát triển

1. Clone repository
2. Cài đặt dependencies: `npm install`
3. Tạo file `.env.local` với cấu hình phù hợp
4. Chạy development server: `npm run dev`
5. Truy cập `http://localhost:3000` để xem ứng dụng

## Troubleshooting

### Port đã được sử dụng
Nếu port 3000 đã được sử dụng, Vite sẽ tự động chọn port khác (3001, 3002, ...). Kiểm tra console output để biết port chính xác.

### Lỗi kết nối API
- Đảm bảo backend đang chạy tại `http://localhost:8080`
- Kiểm tra biến môi trường `VITE_API_BASE_URL` trong file `.env.local`
- Kiểm tra CORS configuration trong backend
