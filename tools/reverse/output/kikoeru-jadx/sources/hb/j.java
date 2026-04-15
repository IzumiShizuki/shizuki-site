package hb;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.security.AccessController;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j extends eb.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f8319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f8320d;

    public j(eb.m mVar, eb.z zVar, Type type) {
        this.f8317a = 1;
        this.f8318b = mVar;
        this.f8319c = zVar;
        this.f8320d = type;
    }

    @Override // eb.z
    public final Object a(mb.a aVar) throws IOException {
        switch (this.f8317a) {
            case 0:
                int iH0 = aVar.h0();
                if (iH0 == 9) {
                    aVar.c0();
                    return null;
                }
                Map map = (Map) ((gb.o) this.f8320d).k();
                if (iH0 == 1) {
                    aVar.b();
                    while (aVar.y()) {
                        aVar.b();
                        Object objA = ((eb.z) ((j) this.f8318b).f8319c).a(aVar);
                        if (map.put(objA, ((eb.z) ((j) this.f8319c).f8319c).a(aVar)) != null) {
                            throw new eb.t("duplicate key: " + objA);
                        }
                        aVar.n();
                    }
                    aVar.n();
                } else {
                    aVar.g();
                    while (aVar.y()) {
                        m3.l.f14077b.getClass();
                        int iK = aVar.f15072g;
                        if (iK == 0) {
                            iK = aVar.k();
                        }
                        if (iK == 13) {
                            aVar.f15072g = 9;
                        } else if (iK == 12) {
                            aVar.f15072g = 8;
                        } else {
                            if (iK != 14) {
                                throw aVar.p0("a name");
                            }
                            aVar.f15072g = 10;
                        }
                        Object objA2 = ((eb.z) ((j) this.f8318b).f8319c).a(aVar);
                        if (map.put(objA2, ((eb.z) ((j) this.f8319c).f8319c).a(aVar)) != null) {
                            throw new eb.t("duplicate key: " + objA2);
                        }
                    }
                    aVar.o();
                }
                return map;
            case 1:
                return ((eb.z) this.f8319c).a(aVar);
            default:
                if (aVar.h0() == 9) {
                    aVar.c0();
                    return null;
                }
                String strF0 = aVar.f0();
                Enum r0 = (Enum) ((HashMap) this.f8318b).get(strF0);
                return r0 == null ? (Enum) ((HashMap) this.f8319c).get(strF0) : r0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x005b  */
    @Override // eb.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(mb.b r5, java.lang.Object r6) throws java.io.IOException {
        /*
            r4 = this;
            int r0 = r4.f8317a
            switch(r0) {
                case 0: goto L60;
                case 1: goto L19;
                default: goto L5;
            }
        L5:
            java.lang.Enum r6 = (java.lang.Enum) r6
            if (r6 != 0) goto Lb
            r6 = 0
            goto L15
        Lb:
            java.lang.Object r0 = r4.f8320d
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r6 = r0.get(r6)
            java.lang.String r6 = (java.lang.String) r6
        L15:
            r5.Y(r6)
            return
        L19:
            java.lang.Object r0 = r4.f8319c
            eb.z r0 = (eb.z) r0
            java.lang.Object r1 = r4.f8320d
            java.lang.reflect.Type r1 = (java.lang.reflect.Type) r1
            if (r6 == 0) goto L30
            boolean r2 = r1 instanceof java.lang.Class
            if (r2 != 0) goto L2b
            boolean r2 = r1 instanceof java.lang.reflect.TypeVariable
            if (r2 == 0) goto L30
        L2b:
            java.lang.Class r2 = r6.getClass()
            goto L31
        L30:
            r2 = r1
        L31:
            if (r2 == r1) goto L5c
            java.lang.Object r1 = r4.f8318b
            eb.m r1 = (eb.m) r1
            lb.a r3 = new lb.a
            r3.<init>(r2)
            eb.z r1 = r1.c(r3)
            boolean r2 = r1 instanceof hb.o
            if (r2 != 0) goto L45
            goto L5b
        L45:
            r2 = r0
        L46:
            boolean r3 = r2 instanceof hb.t
            if (r3 == 0) goto L56
            r3 = r2
            hb.t r3 = (hb.t) r3
            eb.z r3 = r3.c()
            if (r3 != r2) goto L54
            goto L56
        L54:
            r2 = r3
            goto L46
        L56:
            boolean r2 = r2 instanceof hb.o
            if (r2 != 0) goto L5b
            goto L5c
        L5b:
            r0 = r1
        L5c:
            r0.b(r5, r6)
            return
        L60:
            java.util.Map r6 = (java.util.Map) r6
            java.lang.Object r0 = r4.f8319c
            hb.j r0 = (hb.j) r0
            if (r6 != 0) goto L6c
            r5.y()
            goto L99
        L6c:
            r5.i()
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L77:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L96
            java.lang.Object r1 = r6.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r5.q(r2)
            java.lang.Object r1 = r1.getValue()
            r0.b(r5, r1)
            goto L77
        L96:
            r5.o()
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hb.j.b(mb.b, java.lang.Object):void");
    }

    public j(d dVar, eb.m mVar, Type type, eb.z zVar, Type type2, eb.z zVar2, gb.o oVar) {
        this.f8317a = 0;
        this.f8318b = new j(mVar, zVar, type);
        this.f8319c = new j(mVar, zVar2, type2);
        this.f8320d = oVar;
    }

    public j(Class cls) {
        this.f8317a = 2;
        this.f8318b = new HashMap();
        this.f8319c = new HashMap();
        this.f8320d = new HashMap();
        try {
            for (Field field : (Field[]) AccessController.doPrivileged(new z0(cls))) {
                Enum r42 = (Enum) field.get(null);
                String strName = r42.name();
                String string = r42.toString();
                fb.b bVar = (fb.b) field.getAnnotation(fb.b.class);
                if (bVar != null) {
                    strName = bVar.value();
                    for (String str : bVar.alternate()) {
                        ((HashMap) this.f8318b).put(str, r42);
                    }
                }
                ((HashMap) this.f8318b).put(strName, r42);
                ((HashMap) this.f8319c).put(string, r42);
                ((HashMap) this.f8320d).put(r42, strName);
            }
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        }
    }
}
