package store.buzzbook.coupon.service;

import java.util.List;

import org.springframework.data.domain.Page;

import store.buzzbook.coupon.dto.couponpolicy.CouponPolicyConditionRequest;
import store.buzzbook.coupon.dto.couponpolicy.CouponPolicyResponse;
import store.buzzbook.coupon.dto.couponpolicy.CreateCouponPolicyRequest;
import store.buzzbook.coupon.dto.couponpolicy.CreateCouponPolicyResponse;
import store.buzzbook.coupon.dto.couponpolicy.UpdateCouponPolicyRequest;
import store.buzzbook.coupon.entity.CouponPolicy;

public interface CouponPolicyService {

	Page<CouponPolicyResponse> getCouponPoliciesByPaging(CouponPolicyConditionRequest condition);

	List<CouponPolicyResponse> getSpecificCoupons(int bookId);

	CouponPolicy getCouponPolicyById(int id);

	CreateCouponPolicyResponse createCouponPolicy(CreateCouponPolicyRequest request);

	CouponPolicyResponse updateCouponPolicy(int id, UpdateCouponPolicyRequest request);

	void deleteCouponPolicy(int id);
}
