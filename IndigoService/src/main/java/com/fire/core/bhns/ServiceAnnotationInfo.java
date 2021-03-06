package com.fire.core.bhns;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.fire.core.bhns.source.loadbalance.ILoadBalanceRule;
/**
 * @author 
 * 
 */
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ServiceAnnotationInfo
{
	int portalId();
	int[] depandence();
	Class<? extends ILoadBalanceRule> rule();
	int timeout() default 500;
	boolean asyn() default false;
}
