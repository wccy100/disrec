package com.zonekey.disrec.common.utils;

import java.security.SecureRandom;
import java.util.UUID;

import org.springside.modules.utils.Encodes;

/**
 * 封装各种生成唯一性ID算法的工具类.
 * 
 * @author calvin
 */
public abstract class IdUtils {

	private static SecureRandom random = new SecureRandom();

	/**
	 * 封装JDK自带的UUID, 通过Random数字生成, 中间有-分割.
	 */
	public static String uuid() {
		return UUID.randomUUID().toString();
	}

	/**
	 * 封装JDK自带的UUID, 通过Random数字生成, 中间无-分割.
	 */
	public static String uuid2() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}

	/**
	 * 使用SecureRandom随机生成Long. 
	 */
	public static long randomLong() {
		return Math.abs(random.nextLong());
	}

	/**
	 * 基于Base62编码的随机生成Long.
	 */
	/*public static String randomBase62() {
		return Encodes.encodeBase62(random.nextLong());
	}*/
}
