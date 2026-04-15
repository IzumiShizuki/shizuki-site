package com.tencent.bugly.proguard;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected HashMap<String, HashMap<String, byte[]>> f4951a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected HashMap<String, Object> f4952b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HashMap<String, Object> f4953c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected String f4954d = "GBK";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    C0008k f4955e = new C0008k();

    public static void b(ArrayList arrayList, Object obj) {
        if (obj.getClass().isArray()) {
            if (!obj.getClass().getComponentType().toString().equals("byte")) {
                throw new IllegalArgumentException("only byte[] is supported");
            }
            if (Array.getLength(obj) > 0) {
                arrayList.add("java.util.List");
                b(arrayList, Array.get(obj, 0));
                return;
            } else {
                arrayList.add("Array");
                arrayList.add("?");
                return;
            }
        }
        if (obj instanceof Array) {
            throw new IllegalArgumentException("can not support Array, please use List");
        }
        if (obj instanceof List) {
            arrayList.add("java.util.List");
            List list = (List) obj;
            if (list.size() > 0) {
                b(arrayList, list.get(0));
                return;
            } else {
                arrayList.add("?");
                return;
            }
        }
        if (!(obj instanceof Map)) {
            arrayList.add(obj.getClass().getName());
            return;
        }
        arrayList.add("java.util.Map");
        Map map = (Map) obj;
        if (map.size() <= 0) {
            arrayList.add("?");
            arrayList.add("?");
        } else {
            Object next = map.keySet().iterator().next();
            Object obj2 = map.get(next);
            arrayList.add(next.getClass().getName());
            b(arrayList, obj2);
        }
    }

    public void a(String str, Object obj) {
        if (str == null) {
            throw new IllegalArgumentException("put key can not is null");
        }
        if (obj == null) {
            throw new IllegalArgumentException("put value can not is null");
        }
        if (obj instanceof Set) {
            throw new IllegalArgumentException("can not support Set");
        }
        C0009l c0009l = new C0009l();
        c0009l.a(this.f4954d);
        c0009l.a(obj, 0);
        byte[] bArrA = n.a(c0009l.a());
        HashMap<String, byte[]> map = new HashMap<>(1);
        ArrayList arrayList = new ArrayList(1);
        b(arrayList, obj);
        map.put(C0001a.a((ArrayList<String>) arrayList), bArrA);
        this.f4953c.remove(str);
        this.f4951a.put(str, map);
    }
}
