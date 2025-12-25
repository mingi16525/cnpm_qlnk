# Frontend API Documentation

Tài liệu API cho Hệ Thống Quản Lý Nhân Khẩu

**Base URL:** `http://localhost:8080/api`

## Mục lục

- [Xác thực](#xác-thực)
- [Quản lý Tài khoản & Vai trò](#quản-lý-tài-khoản--vai-trò)
- [Quản lý Nhân khẩu](#quản-lý-nhân-khẩu)
- [Quản lý Hộ khẩu](#quản-lý-hộ-khẩu)
- [Quản lý Thành viên Hộ](#quản-lý-thành-viên-hộ)
- [Tạm trú & Tạm vắng](#tạm-trú--tạm-vắng)
- [Sự kiện Nhân khẩu](#sự-kiện-nhân-khẩu)
- [Quản lý Chi](#quản-lý-chi)
- [Quản lý Khoản phí](#quản-lý-khoản-phí)
- [Thu phí](#thu-phí)
- [Hoạt động Thiện nguyện](#hoạt-động-thiện-nguyện)
- [Thu Thiện nguyện](#thu-thiện-nguyện)
- [Thống kê & Báo cáo](#thống-kê--báo-cáo)
- [Ghi nhận thay đổi](#ghi-nhận-thay-đổi)

---

## Xác thực

### Đăng nhập
```
POST /auth/login
```
**Body:**
```json
{
  "username": "string",
  "password": "string"
}
```

---

## Quản lý Tài khoản & Vai trò

### Lấy danh sách vai trò
```
GET /admin/vaitro
```

### Lấy danh sách tài khoản
```
GET /admin/taikhoan
```

### Tạo tài khoản mới
```
POST /admin/taikhoan/{tenVaiTro}
```

### Cập nhật vai trò tài khoản
```
PUT /admin/taikhoan/{id}?tenVaiTro={tenVaiTro}
```

### Khóa tài khoản
```
PUT /admin/taikhoan/{id}/lock
```

### Reset mật khẩu
```
PUT /admin/taikhoan/{id}/reset-password
```

### Xóa tài khoản
```
DELETE /admin/taikhoan/{id}
```

---

## Quản lý Nhân khẩu

### Lấy danh sách nhân khẩu
```
GET /nhankhau
```

### Lấy thông tin nhân khẩu theo ID
```
GET /nhankhau/{id}
```

### Tìm kiếm nhân khẩu
```
GET /nhankhau/search?keyword={value}
```

### Lấy danh sách nhân khẩu có thể thêm vào hộ
```
GET /nhankhau/available
```

### Tạo mới nhân khẩu
```
POST /nhankhau
```

### Cập nhật thông tin nhân khẩu
```
PUT /nhankhau/{id}
```

### Xóa nhân khẩu
```
DELETE /nhankhau/{id}
```

---

## Quản lý Hộ khẩu

### Lấy danh sách hộ khẩu
```
GET /hokhau
```

### Lấy thông tin hộ khẩu theo ID
```
GET /hokhau/{id}
```

### Lấy danh sách thành viên của hộ khẩu
```
GET /hokhau/{hoKhauId}/thanhvien
```

### Tạo mới hộ khẩu
```
POST /hokhau
```

### Cập nhật thông tin hộ khẩu
```
PUT /hokhau/{id}
```

### Tách hộ khẩu
```
POST /hokhau/{hoKhauId}/tach
```

### Xóa hộ khẩu
```
DELETE /hokhau/{id}
```

---

## Quản lý Thành viên Hộ

### Lấy danh sách thành viên theo hộ khẩu
```
GET /thanhvienho/hokhau/{id}
```

### Thêm thành viên vào hộ
```
POST /thanhvienho
```

### Xóa thành viên khỏi hộ
```
DELETE /thanhvienho/{id}
```

---

## Tạm trú & Tạm vắng

### Lấy thông tin tạm trú/tạm vắng theo ID
```
GET /tamtrutamvang/{id}
```

### Lấy danh sách tạm trú theo thời gian
```
GET /tamtrutamvang/loai/tamtru?tuNgay={tuNgay}&denNgay={denNgay}
```

### Lấy danh sách tạm vắng theo thời gian
```
GET /tamtrutamvang/loai/tamvang?tuNgay={tuNgay}&denNgay={denNgay}
```

### Tìm kiếm tạm trú/tạm vắng
```
GET /tamtrutamvang/search?keyword={value}
```

### Tạo mới tạm trú/tạm vắng
```
POST /tamtrutamvang
```

### Cập nhật tạm trú/tạm vắng
```
PUT /tamtrutamvang/{id}
```

### Xóa tạm trú/tạm vắng
```
DELETE /tamtrutamvang/{id}
```

---

## Sự kiện Nhân khẩu

### Lấy thông tin sự kiện theo ID
```
GET /sukien/{id}
```

### Lấy danh sách sự kiện sinh
```
GET /sukien/loai/sinh
```

### Lấy danh sách sự kiện tử
```
GET /sukien/loai/mat
```

### Lấy thống kê sự kiện
```
GET /sukien/stats
```

### Tìm kiếm sự kiện
```
GET /sukien/search?keyword={value}
```

### Lấy sự kiện theo khoảng thời gian
```
GET /sukien/daterange?start={YYYY-MM-DD}&end={YYYY-MM-DD}
```

### Tạo mới sự kiện
```
POST /sukien
```

### Cập nhật sự kiện
```
PUT /sukien/{id}
```

### Xóa sự kiện
```
DELETE /sukien/{id}
```

---

## Quản lý Chi

### Lấy danh sách khoản chi
```
GET /chi
```

### Lấy thông tin khoản chi theo ID
```
GET /chi/{id}
```

### Lấy khoản chi theo loại
```
GET /chi/loai/{loaiChi}
```

### Tìm kiếm khoản chi
```
GET /chi/search?keyword={value}
```

### Lấy khoản chi theo khoảng thời gian
```
GET /chi/daterange?start={YYYY-MM-DD}&end={YYYY-MM-DD}
```

### Thống kê tổng hợp chi
```
GET /chi/thongke
```

### Thống kê chi theo loại
```
GET /chi/thongke/loai/{loaiChi}
```

### Thống kê chi theo khoảng thời gian
```
GET /chi/thongke/daterange?start={YYYY-MM-DD}&end={YYYY-MM-DD}
```

### Tạo khoản chi mới
```
POST /chi
```

### Cập nhật khoản chi
```
PUT /chi/{id}
```

### Xóa khoản chi
```
DELETE /chi/{id}
```

---

## Quản lý Khoản phí

### Lấy danh sách khoản phí
```
GET /khoanphi
```

### Lấy thông tin khoản phí theo ID
```
GET /khoanphi/{id}
```

### Lấy khoản phí đang hoạt động
```
GET /khoanphi/active
```

### Lấy khoản phí theo loại
```
GET /khoanphi/loai/{loai}
```

### Tìm kiếm khoản phí
```
GET /khoanphi/search?keyword={value}
```

### Tạo khoản phí mới
```
POST /khoanphi
```

### Cập nhật khoản phí
```
PUT /khoanphi/{id}
```

### Cập nhật trạng thái khoản phí
```
PUT /khoanphi/{id}/trangthai
```

### Xóa khoản phí
```
DELETE /khoanphi/{id}
```

---

## Thu phí

### Lấy danh sách thu phí
```
GET /thuphi
```

### Lấy thông tin thu phí theo ID
```
GET /thuphi/{id}
```

### Lấy thu phí theo hộ khẩu
```
GET /thuphi/hoKhau/{hoKhauId}
```

### Lấy thu phí theo khoản phí
```
GET /thuphi/khoanphi/{khoanPhiId}
```

### Lấy danh sách chưa đóng theo khoản phí
```
GET /thuphi/khoanphi/{khoanPhiId}/chuadong
```

### Lấy danh sách đã đóng theo khoản phí
```
GET /thuphi/khoanphi/{khoanPhiId}/dadong
```

### Thống kê thu phí theo khoản phí
```
GET /thuphi/khoanphi/{khoanPhiId}/thongke
```

### Tìm kiếm thu phí
```
GET /thuphi/search?keyword={value}
```

### Tạo thu phí cho tất cả hộ
```
POST /thuphi/taomoi/khoanphi/{khoanPhiId}
```

### Tạo thu phí mới
```
POST /thuphi
```

### Cập nhật thu phí
```
PUT /thuphi/{id}
```

### Cập nhật trạng thái thu phí
```
PUT /thuphi/{id}/trangthai
```

### Xóa thu phí
```
DELETE /thuphi/{id}
```

---

## Hoạt động Thiện nguyện

### Lấy danh sách hoạt động
```
GET /hoatdong
```

### Lấy thông tin hoạt động theo ID
```
GET /hoatdong/{id}
```

### Lấy hoạt động đang hoạt động
```
GET /hoatdong/active
```

### Lấy hoạt động theo trạng thái
```
GET /hoatdong/trangthai/{trangThai}
```

### Thống kê hoạt động
```
GET /hoatdong/{id}/thongke
```

### Tìm kiếm hoạt động
```
GET /hoatdong/search?keyword={value}
```

### Lấy hoạt động theo khoảng thời gian
```
GET /hoatdong/daterange?start={YYYY-MM-DD}&end={YYYY-MM-DD}
```

### Tạo hoạt động mới
```
POST /hoatdong
```

### Cập nhật hoạt động
```
PUT /hoatdong/{id}
```

### Xóa hoạt động
```
DELETE /hoatdong/{id}
```

---

## Thu Thiện nguyện

### Lấy danh sách thu thiện nguyện
```
GET /thuthiennguyen
```

### Lấy thông tin thu thiện nguyện theo ID
```
GET /thuthiennguyen/{id}
```

### Lấy thu thiện nguyện theo hoạt động
```
GET /thuthiennguyen/hoatdong/{hoatDongId}
```

### Tìm kiếm thu thiện nguyện
```
GET /thuthiennguyen/search?keyword={value}
```

### Lấy thu thiện nguyện theo khoảng thời gian
```
GET /thuthiennguyen/daterange?start={YYYY-MM-DD}&end={YYYY-MM-DD}
```

### Tạo thu thiện nguyện mới
```
POST /thuthiennguyen
```

### Cập nhật thu thiện nguyện
```
PUT /thuthiennguyen/{id}
```

### Xóa thu thiện nguyện
```
DELETE /thuthiennguyen/{id}
```

---

## Thống kê & Báo cáo

### Thống kê nhân khẩu theo thời gian
```
GET /thongke/nhankhau?tuNgay={tuNgay}&denNgay={denNgay}
```

### Thống kê nhân khẩu theo nhóm tuổi
```
GET /thongke/nhankhau/nhomtuoi/{nhomTuoi}
```

### Báo cáo thu chi tổng hợp
```
GET /baocao/thuchitonghop
```

### Báo cáo giới tính
```
GET /baocao/gioitinh
```

---

## Ghi nhận thay đổi

### Lấy danh sách ghi nhận thay đổi
```
GET /ghinhanthaydoi
```

### Xóa ghi nhận thay đổi
```
DELETE /ghinhanthaydoi/{id}
```

---

## Ghi chú

- Tất cả endpoints đều yêu cầu authentication token (trừ `/auth/login`)
- Format ngày tháng: `YYYY-MM-DD`
- Tham số `{id}` là số nguyên (Integer)
- Response thành công trả về status code `200` hoặc `201`
- Response lỗi trả về status code `4xx` hoặc `5xx` kèm message lỗi

## Ví dụ sử dụng với Axios

```javascript
import axios from './axios';

// Đăng nhập
const login = async (credentials) => {
  const response = await axios.post('/auth/login', credentials);
  return response.data;
};

// Lấy danh sách nhân khẩu
const getNhanKhau = async () => {
  const response = await axios.get('/nhankhau');
  return response.data;
};

// Tạo nhân khẩu mới
const createNhanKhau = async (data) => {
  const response = await axios.post('/nhankhau', data);
  return response.data;
};
```


