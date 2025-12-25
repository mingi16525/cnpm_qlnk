import apiClient from './apiClient';

const thongKeApi = {
  // Thống kê nhân khẩu theo khoảng thời gian
  getNhanKhau: (tuNgay, denNgay) => 
    apiClient.get(`/thongke/nhankhau?tuNgay=${tuNgay}&denNgay=${denNgay}`),

  // Thống kê nhân khẩu theo nhóm tuổi
  getNhanKhauByNhomTuoi: (nhomTuoi) => 
    apiClient.get(`/thongke/nhankhau/nhomtuoi/${nhomTuoi}`)
};

export default thongKeApi;