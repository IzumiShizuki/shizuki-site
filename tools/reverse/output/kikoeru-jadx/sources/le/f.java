package le;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f12300c = new m();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f12301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f12302e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f12303f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f12304g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f12305h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f12306i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f12307j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f12308k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f12309l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final f f12310m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final f f12311n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final f f12312o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final f f12313p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final f f12314q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final ArrayList f12315r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final ArrayList f12316s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f12317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12318b;

    static {
        e eVar;
        int i10 = f12301d;
        int i11 = i10 << 1;
        f12302e = i10;
        int i12 = i10 << 2;
        f12303f = i11;
        int i13 = i10 << 3;
        f12304g = i12;
        int i14 = i10 << 4;
        f12305h = i13;
        int i15 = i10 << 5;
        f12306i = i14;
        f12307j = i15;
        f12301d = i10 << 7;
        int i16 = (i10 << 6) - 1;
        f12308k = i16;
        int i17 = i10 | i11 | i12;
        f12309l = i17;
        f12310m = new f(i16);
        f12311n = new f(i14 | i15);
        new f(i10);
        new f(i11);
        new f(i12);
        f12312o = new f(i17);
        new f(i13);
        f12313p = new f(i14);
        f12314q = new f(i15);
        new f(i11 | i14 | i15);
        Field[] fields = f.class.getFields();
        jc.l.d(fields, "getFields(...)");
        ArrayList arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            e eVar2 = null;
            if (!it.hasNext()) {
                break;
            }
            Field field2 = (Field) it.next();
            Object obj = field2.get(null);
            f fVar = obj instanceof f ? (f) obj : null;
            if (fVar != null) {
                int i18 = fVar.f12318b;
                String name = field2.getName();
                jc.l.d(name, "getName(...)");
                eVar2 = new e(i18, name);
            }
            if (eVar2 != null) {
                arrayList2.add(eVar2);
            }
        }
        f12315r = arrayList2;
        Field[] fields2 = f.class.getFields();
        jc.l.d(fields2, "getFields(...)");
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList<Field> arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (jc.l.a(((Field) obj2).getType(), Integer.TYPE)) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Field field4 : arrayList4) {
            Object obj3 = field4.get(null);
            jc.l.c(obj3, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj3).intValue();
            if (iIntValue == ((-iIntValue) & iIntValue)) {
                String name2 = field4.getName();
                jc.l.d(name2, "getName(...)");
                eVar = new e(iIntValue, name2);
            } else {
                eVar = null;
            }
            if (eVar != null) {
                arrayList5.add(eVar);
            }
        }
        f12316s = arrayList5;
    }

    public f(int i10, List list) {
        jc.l.e(list, "excludes");
        this.f12317a = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i10 &= ~((d) it.next()).a();
        }
        this.f12318b = i10;
    }

    public final boolean a(int i10) {
        return (i10 & this.f12318b) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!f.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        jc.l.c(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter");
        f fVar = (f) obj;
        return jc.l.a(this.f12317a, fVar.f12317a) && this.f12318b == fVar.f12318b;
    }

    public final int hashCode() {
        return (this.f12317a.hashCode() * 31) + this.f12318b;
    }

    public final String toString() throws IOException {
        Object next;
        Iterator it = f12315r.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((e) next).f12298a == this.f12318b) {
                break;
            }
        }
        e eVar = (e) next;
        String strF0 = eVar != null ? eVar.f12299b : null;
        if (strF0 == null) {
            ArrayList arrayList = new ArrayList();
            for (e eVar2 : f12316s) {
                String str = a(eVar2.f12298a) ? eVar2.f12299b : null;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            strF0 = vb.m.f0(arrayList, " | ", null, null, null, 62);
        }
        StringBuilder sbK = a0.c.K("DescriptorKindFilter(", strF0, ", ");
        sbK.append(this.f12317a);
        sbK.append(')');
        return sbK.toString();
    }

    public /* synthetic */ f(int i10) {
        this(i10, vb.r.f22819a);
    }
}
