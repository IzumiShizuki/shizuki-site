package ce;

import com.tencent.bugly.beta.tinker.TinkerReport;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f3945c = new j(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f3946a = new c0(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3947b;

    public j() {
    }

    public static int c(r0 r0Var, Object obj) {
        switch (r0Var.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                return 8;
            case 1:
                ((Float) obj).getClass();
                return 4;
            case 2:
                return g.j(((Long) obj).longValue());
            case 3:
                return g.j(((Long) obj).longValue());
            case 4:
                return g.f(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                return 8;
            case 6:
                ((Integer) obj).getClass();
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                return 1;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                try {
                    byte[] bytes = ((String) obj).getBytes("UTF-8");
                    return g.i(bytes.length) + bytes.length;
                } catch (UnsupportedEncodingException e10) {
                    throw new RuntimeException("UTF-8 not supported.", e10);
                }
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                return ((b) obj).c();
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                return g.h((b) obj);
            case 11:
                if (obj instanceof e) {
                    e eVar = (e) obj;
                    return eVar.size() + g.i(eVar.size());
                }
                byte[] bArr = (byte[]) obj;
                return g.i(bArr.length) + bArr.length;
            case 12:
                return g.i(((Integer) obj).intValue());
            case 13:
                return obj instanceof q ? g.f(((q) obj).a()) : g.f(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                return 4;
            case 15:
                ((Long) obj).getClass();
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return g.i((iIntValue >> 31) ^ (iIntValue << 1));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return g.j((jLongValue >> 63) ^ (jLongValue << 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int d(n nVar, Object obj) {
        r0 r0Var = nVar.f3956b;
        int i10 = nVar.f3955a;
        if (!nVar.f3957c) {
            int iK = g.k(i10);
            if (r0Var == r0.f3966e) {
                iK *= 2;
            }
            return c(r0Var, obj) + iK;
        }
        int iC = 0;
        for (Object obj2 : (List) obj) {
            int iK2 = g.k(i10);
            if (r0Var == r0.f3966e) {
                iK2 *= 2;
            }
            iC += c(r0Var, obj2) + iK2;
        }
        return iC;
    }

    public static boolean e(Map.Entry entry) {
        n nVar = (n) entry.getKey();
        if (nVar.f3956b.f3970a != s0.f3981j) {
            return true;
        }
        if (!nVar.f3957c) {
            Object value = entry.getValue();
            if (value instanceof b) {
                return ((b) value).b();
            }
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        Iterator it = ((List) entry.getValue()).iterator();
        while (it.hasNext()) {
            if (!((b) it.next()).b()) {
                return false;
            }
        }
        return true;
    }

    public static Object h(f fVar, r0 r0Var) {
        switch (r0Var.ordinal()) {
            case 0:
                return Double.valueOf(Double.longBitsToDouble(fVar.j()));
            case 1:
                return Float.valueOf(Float.intBitsToFloat(fVar.i()));
            case 2:
                return Long.valueOf(fVar.l());
            case 3:
                return Long.valueOf(fVar.l());
            case 4:
                return Integer.valueOf(fVar.k());
            case 5:
                return Long.valueOf(fVar.j());
            case 6:
                return Integer.valueOf(fVar.i());
            case 7:
                return Boolean.valueOf(fVar.l() != 0);
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                int iK = fVar.k();
                int i10 = fVar.f3917b;
                int i11 = fVar.f3919d;
                if (iK > i10 - i11 || iK <= 0) {
                    return iK == 0 ? "" : new String(fVar.h(iK), "UTF-8");
                }
                String str = new String(fVar.f3916a, i11, iK, "UTF-8");
                fVar.f3919d += iK;
                return str;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 11:
                return fVar.e();
            case 12:
                return Integer.valueOf(fVar.k());
            case 13:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            case 14:
                return Integer.valueOf(fVar.i());
            case 15:
                return Long.valueOf(fVar.j());
            case 16:
                int iK2 = fVar.k();
                return Integer.valueOf((-(iK2 & 1)) ^ (iK2 >>> 1));
            case 17:
                long jL = fVar.l();
                return Long.valueOf((-(jL & 1)) ^ (jL >>> 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void j(ce.r0 r2, java.lang.Object r3) {
        /*
            r3.getClass()
            ce.s0 r2 = r2.f3970a
            int r2 = r2.ordinal()
            r0 = 1
            r1 = 0
            switch(r2) {
                case 0: goto L36;
                case 1: goto L33;
                case 2: goto L30;
                case 3: goto L2d;
                case 4: goto L2a;
                case 5: goto L27;
                case 6: goto L1e;
                case 7: goto L12;
                case 8: goto Lf;
                default: goto Le;
            }
        Le:
            goto L38
        Lf:
            boolean r1 = r3 instanceof ce.b
            goto L38
        L12:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L1c
            boolean r2 = r3 instanceof ce.q
            if (r2 == 0) goto L1b
            goto L1c
        L1b:
            r0 = 0
        L1c:
            r1 = r0
            goto L38
        L1e:
            boolean r2 = r3 instanceof ce.e
            if (r2 != 0) goto L1c
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L1b
            goto L1c
        L27:
            boolean r1 = r3 instanceof java.lang.String
            goto L38
        L2a:
            boolean r1 = r3 instanceof java.lang.Boolean
            goto L38
        L2d:
            boolean r1 = r3 instanceof java.lang.Double
            goto L38
        L30:
            boolean r1 = r3 instanceof java.lang.Float
            goto L38
        L33:
            boolean r1 = r3 instanceof java.lang.Long
            goto L38
        L36:
            boolean r1 = r3 instanceof java.lang.Integer
        L38:
            if (r1 == 0) goto L3b
            return
        L3b:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ce.j.j(ce.r0, java.lang.Object):void");
    }

    public static void k(g gVar, r0 r0Var, Object obj) {
        switch (r0Var.ordinal()) {
            case 0:
                double dDoubleValue = ((Double) obj).doubleValue();
                gVar.getClass();
                gVar.N(Double.doubleToRawLongBits(dDoubleValue));
                break;
            case 1:
                float fFloatValue = ((Float) obj).floatValue();
                gVar.getClass();
                gVar.M(Float.floatToRawIntBits(fFloatValue));
                break;
            case 2:
                gVar.P(((Long) obj).longValue());
                break;
            case 3:
                gVar.P(((Long) obj).longValue());
                break;
            case 4:
                gVar.G(((Integer) obj).intValue());
                break;
            case 5:
                gVar.N(((Long) obj).longValue());
                break;
            case 6:
                gVar.M(((Integer) obj).intValue());
                break;
            case 7:
                gVar.J(((Boolean) obj).booleanValue() ? 1 : 0);
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                gVar.getClass();
                byte[] bytes = ((String) obj).getBytes("UTF-8");
                gVar.O(bytes.length);
                gVar.L(bytes);
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                gVar.getClass();
                ((b) obj).f(gVar);
                break;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                gVar.I((b) obj);
                break;
            case 11:
                if (!(obj instanceof e)) {
                    byte[] bArr = (byte[]) obj;
                    gVar.getClass();
                    gVar.O(bArr.length);
                    gVar.L(bArr);
                } else {
                    e eVar = (e) obj;
                    gVar.getClass();
                    gVar.O(eVar.size());
                    gVar.K(eVar);
                }
                break;
            case 12:
                gVar.O(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof q)) {
                    gVar.G(((Integer) obj).intValue());
                } else {
                    gVar.G(((q) obj).a());
                }
                break;
            case 14:
                gVar.M(((Integer) obj).intValue());
                break;
            case 15:
                gVar.N(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                gVar.O((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                gVar.P((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void a(n nVar, Object obj) {
        List arrayList;
        if (!nVar.f3957c) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        j(nVar.f3956b, obj);
        c0 c0Var = this.f3946a;
        Object obj2 = c0Var.get(nVar);
        if (obj2 == null) {
            arrayList = new ArrayList();
            c0Var.put(nVar, arrayList);
        } else {
            arrayList = (List) obj2;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final j clone() {
        c0 c0Var;
        j jVar = new j();
        int i10 = 0;
        while (true) {
            c0Var = this.f3946a;
            if (i10 >= c0Var.f3905b.size()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c0Var.f3905b.get(i10);
            jVar.i((n) entry.getKey(), entry.getValue());
            i10++;
        }
        for (Map.Entry entry2 : c0Var.c()) {
            jVar.i((n) entry2.getKey(), entry2.getValue());
        }
        return jVar;
    }

    public final void f() {
        if (this.f3947b) {
            return;
        }
        c0 c0Var = this.f3946a;
        if (!c0Var.f3907d) {
            for (int i10 = 0; i10 < c0Var.f3905b.size(); i10++) {
                Map.Entry entry = (Map.Entry) c0Var.f3905b.get(i10);
                if (((n) entry.getKey()).f3957c) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
            for (Map.Entry entry2 : c0Var.c()) {
                if (((n) entry2.getKey()).f3957c) {
                    entry2.setValue(Collections.unmodifiableList((List) entry2.getValue()));
                }
            }
        }
        if (!c0Var.f3907d) {
            c0Var.f3906c = c0Var.f3906c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(c0Var.f3906c);
            c0Var.f3907d = true;
        }
        this.f3947b = true;
    }

    public final void g(Map.Entry entry) {
        n nVar = (n) entry.getKey();
        Object value = entry.getValue();
        boolean z10 = nVar.f3957c;
        c0 c0Var = this.f3946a;
        if (z10) {
            Object arrayList = c0Var.get(nVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            for (Object obj : (List) value) {
                List list = (List) arrayList;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj = bArr2;
                }
                list.add(obj);
            }
            c0Var.put(nVar, arrayList);
            return;
        }
        if (nVar.f3956b.f3970a != s0.f3981j) {
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            c0Var.put(nVar, value);
            return;
        }
        Object obj2 = c0Var.get(nVar);
        if (obj2 != null) {
            c0Var.put(nVar, ((b) obj2).e().e((p) ((b) value)).c());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        c0Var.put(nVar, value);
    }

    public final void i(n nVar, Object obj) {
        boolean z10 = nVar.f3957c;
        r0 r0Var = nVar.f3956b;
        if (!z10) {
            j(r0Var, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                j(r0Var, it.next());
            }
            obj = arrayList;
        }
        this.f3946a.put(nVar, obj);
    }

    public j(int i10) {
        f();
    }
}
