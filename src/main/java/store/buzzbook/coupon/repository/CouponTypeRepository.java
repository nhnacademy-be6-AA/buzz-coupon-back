package store.buzzbook.coupon.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import store.buzzbook.coupon.common.constant.CouponScope;
import store.buzzbook.coupon.entity.CouponType;

public interface CouponTypeRepository extends JpaRepository<CouponType, Integer> {

	List<CouponType> findAllBy();

	Optional<CouponType> findAllByName(CouponScope name);

	boolean existsByName(CouponScope name);
}
