package jc;

import j2.h0;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {
    public static Map a(Object obj) {
        if ((obj instanceof kc.a) && !(obj instanceof kc.d)) {
            e(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e10) {
            l.i(e10, c0.class.getName());
            throw e10;
        }
    }

    public static Set b(Object obj) {
        if ((obj instanceof kc.a) && !(obj instanceof kc.e)) {
            e(obj, "kotlin.collections.MutableSet");
            throw null;
        }
        try {
            return (Set) obj;
        } catch (ClassCastException e10) {
            l.i(e10, c0.class.getName());
            throw e10;
        }
    }

    public static void c(int i10, Object obj) {
        if (obj == null || d(i10, obj)) {
            return;
        }
        e(obj, "kotlin.jvm.functions.Function" + i10);
        throw null;
    }

    public static boolean d(int i10, Object obj) {
        int iC;
        if (obj instanceof ub.e) {
            if (obj instanceof i) {
                iC = ((i) obj).c();
            } else if (obj instanceof ic.a) {
                iC = 0;
            } else if (obj instanceof ic.k) {
                iC = 1;
            } else if (obj instanceof ic.n) {
                iC = 2;
            } else if (obj instanceof ic.o) {
                iC = 3;
            } else if (obj instanceof ic.p) {
                iC = 4;
            } else if (obj instanceof ic.q) {
                iC = 5;
            } else if (obj instanceof ic.r) {
                iC = 6;
            } else if (obj instanceof ic.s) {
                iC = 7;
            } else if (obj instanceof ic.t) {
                iC = 8;
            } else if (obj instanceof ic.u) {
                iC = 9;
            } else if (obj instanceof ic.b) {
                iC = 10;
            } else if (obj instanceof ic.c) {
                iC = 11;
            } else {
                boolean z10 = obj instanceof sc.g;
                iC = z10 ? 12 : obj instanceof ic.d ? 13 : obj instanceof ic.e ? 14 : obj instanceof ic.f ? 15 : obj instanceof ic.g ? 16 : obj instanceof ic.h ? 17 : obj instanceof ic.i ? 18 : obj instanceof ic.j ? 19 : obj instanceof ic.l ? 20 : obj instanceof ic.m ? 21 : z10 ? 22 : -1;
            }
            if (iC == i10) {
                return true;
            }
        }
        return false;
    }

    public static void e(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(h0.k(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        l.i(classCastException, c0.class.getName());
        throw classCastException;
    }
}
