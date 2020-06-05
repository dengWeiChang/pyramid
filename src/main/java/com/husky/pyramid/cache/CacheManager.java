package com.husky.pyramid.cache;

import com.husky.pyramid.annotation.DelModel;
import com.husky.pyramid.annotation.PyramidModel;
import org.aspectj.lang.ProceedingJoinPoint;

import java.util.function.Function;

/**
 * 缓存管理接口
 * @author dengweichang
 */
public interface CacheManager {

	/**
	 * 通用的获取缓存的方法
	 * @param pyramid    注解附带的值
	 * @param function    获取不到缓存时的操作
	 * @param args    {@link ProceedingJoinPoint#getArgs()}
	 * @return	Object
	 */
	Object generalCache(PyramidModel pyramid, Function<Object[], Object> function, Object[] args);

	/**
	 * 删除缓存
	 * @param delModel    注解附带的值
	 * @param publish    是否发送通知
	 */
	void generalClear(DelModel delModel, boolean publish);

}
