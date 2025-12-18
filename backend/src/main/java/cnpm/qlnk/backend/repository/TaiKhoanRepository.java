package cnpm.qlnk.backend.repository;
import cnpm.qlnk.backend.entity.TaiKhoan;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
public interface TaiKhoanRepository extends JpaRepository<TaiKhoan, Integer> {
    // Sử dụng cho logic đăng nhập
    Optional<TaiKhoan> findByTenDangNhap(String tenDangNhap);
}