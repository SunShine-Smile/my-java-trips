package com.jason.myjavatrips;

import org.apache.commons.beanutils.BeanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cglib.beans.BeanCopier;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BeanUtil {
    private final static Logger log = LoggerFactory.getLogger(BeanUtils.class);

    public static boolean checkPropertyValue(Object o, String property, Object value) {
        try {
            return value.equals(BeanUtils.getProperty(o, property));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static Object getPropertyValue(Object o, String property) {
        try {
            return BeanUtils.getProperty(o, property);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Bean --> Map 1: 利用Introspector和PropertyDescriptor 将Bean --> Map
     *
     * @param obj
     * @return
     */
    public static Map<String, Object> transBean2Map(Object obj) {
        if (obj == null) {
            return null;
        }
        Map<String, Object> map = new HashMap<String, Object>(20);
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor property : propertyDescriptors) {
                String key = property.getName();
                // 过滤class属性
                if (!"class".equals(key)) {
                    // 得到property对应的getter方法
                    Method getter = property.getReadMethod();
                    Object value = getter.invoke(obj);
                    map.put(key, value);
                }
            }
        } catch (Exception e) {
            System.out.println("transBean2Map Error " + e);
        }
        return map;
    }

    /**
     * 复制 obj 并创建一个新的对象
     * 若是obj 为空， 则返回null
     *
     * @param src
     * @param clazz
     * @return
     * @throws 不抛出错误
     */
    public static <T> T copy(Object src, Class<T> clazz) {
        T t = null;
        try {
            if (src != null) {
                t = clazz.newInstance();
                BeanCopier copier = BeanCopier.create(src.getClass(), clazz, false);
                copier.copy(src, t, null);
            }
        } catch (Exception e) {
            log.error("copy object error:{}", e);
        }
        return t;
    }

    /**
     * 复制 List<obj> 则返回一个ArrayList <br>
     * 若是src =null 则返回一个ArrayList size=0
     *
     * @param src
     * @param clazz
     * @return
     */
    public static <T> List<T> copyList(List<?> src, Class<T> clazz) {
        if (src != null) {
            List<T> list = new ArrayList<T>();
            for (Object obj : src) {
                T t = copy(obj, clazz);
                list.add(t);
            }
            return list;
        } else {
            return new ArrayList<T>();
        }
    }

    /**
     * 将src对象中属性复制到to对象中，相同则覆盖
     *
     * @param src
     * @param to
     */
    public static void copy(Object src, Object to) {
        if (src == null || to == null) {
            return;
        } else {
            BeanCopier copier = BeanCopier.create(src.getClass(), to.getClass(), false);
            try {
                copier.copy(src, to, null);
            } catch (Exception e) {
                log.error("copy object error:{}", e);
            }
        }
    }

    /**
     * @param src 必须实现 Serializable,否则 报错
     * @return
     * @author Jason
     * <p>
     * deep clone
     */
    @SuppressWarnings("unchecked")
    public static <T> T clone(Object src) {
        if (src != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                objectOutputStream.writeObject(src);
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                return (T) objectInputStream.readObject();
            } catch (Exception e) {
                log.error("deep clone error:{}", e);
            }
        }
        return null;
    }
}
