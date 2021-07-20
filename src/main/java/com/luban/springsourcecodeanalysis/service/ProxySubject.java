package com.luban.springsourcecodeanalysis.service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.UndeclaredThrowableException;

/**
 * aop代理后的代码
 * Created by PengWX on 2021/6/22.
 */
/*public class ProxySubject extends Proxy
        implements IUserService {


    private static Method m1;
    private static Method m2;
    private static Method m3;
    private static Method m0;

    public ProxySubject(InvocationHandler invocationhandler) {
        super(invocationhandler);
    }

    public final boolean equals(Object obj) {
        try {
            return ((Boolean) super.h.invoke(this, m1, new Object[]{
                    obj
            })).booleanValue();
        } catch (Error e) {
        } catch (Throwable throwable) {
            throw new UndeclaredThrowableException(throwable);
        }
    }

    public final String toString() {
        try {
            return (String) super.h.invoke(this, m2, null);
        } catch (Error e) {
        } catch (Throwable throwable) {
            throw new UndeclaredThrowableException(throwable);
        }
    }

    public final void testAop(String s) {
        try {
            super.h.invoke(this, m3, new Object[]{
                    s
            });
            return;
        } catch (Error e) {
        } catch (Throwable throwable) {
            throw new UndeclaredThrowableException(throwable);
        }
    }

    public final int hashCode() {
        try {
            return ((Integer) super.h.invoke(this, m0, null)).intValue();
        } catch (Error) {
        } catch (Throwable throwable) {
            throw new UndeclaredThrowableException(throwable);
        }
    }

    static {
        try {
            m1 = Class.forName("java.lang.Object").getMethod("equals", new Class[]{Class.forName("java.lang.Object")});
            m2 = Class.forName("java.lang.Object").getMethod("toString", new Class[0]);
            m3 = Class.forName("com.luban.springsourcecodeanalysis.service.IUserService").getMethod("testAop", new Class[]{Class.forName("java.lang.String")});
            m0 = Class.forName("java.lang.Object").getMethod("hashCode", new Class[0]);
        } catch (NoSuchMethodException nosuchmethodexception) {
            throw new NoSuchMethodError(nosuchmethodexception.getMessage());
        } catch (ClassNotFoundException classnotfoundexception) {
            throw new NoClassDefFoundError(classnotfoundexception.getMessage());
        }
    }
}*/
