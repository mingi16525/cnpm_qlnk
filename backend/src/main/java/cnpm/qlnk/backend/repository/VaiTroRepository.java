package cnpm.qlnk.backend.repository;
import cnpm.qlnk.backend.entity.VaiTro;
import org.springframework.data.jpa.repository.JpaRepository;
public interface VaiTroRepository extends JpaRepository<VaiTro, Integer> {
    // Phương thức custom giúp lấy VaiTro theo tên
    VaiTro findByTenVaiTro(String tenVaiTro);
}