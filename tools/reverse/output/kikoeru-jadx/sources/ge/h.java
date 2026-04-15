package ge;

import bd.h0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    public static b a(List list, yc.y yVar, vc.k kVar) {
        List listG0 = vb.m.G0(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = listG0.iterator();
        while (it.hasNext()) {
            g gVarB = b(null, it.next());
            if (gVarB != null) {
                arrayList.add(gVarB);
            }
        }
        return yVar != null ? new x(arrayList, yVar.g().q(kVar)) : new b(arrayList, new bd.a(6, kVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [vb.r] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v29, types: [vb.r] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v38, types: [vb.r] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v45, types: [vb.r] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v0, types: [vb.r] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    public static g b(h0 h0Var, Object obj) {
        ?? W;
        ?? W2;
        ?? W3;
        ?? W4;
        if (obj instanceof Byte) {
            return new d(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new v(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new k(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new t(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new e((Character) obj);
        }
        if (obj instanceof Float) {
            return new c(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new c(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new c((Boolean) obj);
        }
        if (obj instanceof String) {
            return new w((String) obj);
        }
        boolean z10 = obj instanceof byte[];
        ?? W5 = vb.r.f22819a;
        int i10 = 0;
        if (z10) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            if (length != 0) {
                if (length != 1) {
                    W5 = new ArrayList(bArr.length);
                    int length2 = bArr.length;
                    while (i10 < length2) {
                        W5.add(Byte.valueOf(bArr[i10]));
                        i10++;
                    }
                } else {
                    W5 = ud.b.w(Byte.valueOf(bArr[0]));
                }
            }
            return a(W5, h0Var, vc.k.f22849h);
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length3 = sArr.length;
            if (length3 != 0) {
                if (length3 != 1) {
                    W5 = new ArrayList(sArr.length);
                    int length4 = sArr.length;
                    while (i10 < length4) {
                        W5.add(Short.valueOf(sArr[i10]));
                        i10++;
                    }
                } else {
                    W5 = ud.b.w(Short.valueOf(sArr[0]));
                }
            }
            return a(W5, h0Var, vc.k.f22850i);
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            jc.l.e(iArr, "<this>");
            int length5 = iArr.length;
            if (length5 != 0) {
                if (length5 != 1) {
                    W4 = new ArrayList(iArr.length);
                    for (int i11 : iArr) {
                        W4.add(Integer.valueOf(i11));
                    }
                } else {
                    W4 = ud.b.w(Integer.valueOf(iArr[0]));
                }
            } else {
                W4 = vb.r.f22819a;
            }
            return a(W4, h0Var, vc.k.f22851j);
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            jc.l.e(jArr, "<this>");
            int length6 = jArr.length;
            if (length6 != 0) {
                if (length6 != 1) {
                    W3 = new ArrayList(jArr.length);
                    for (long j10 : jArr) {
                        W3.add(Long.valueOf(j10));
                    }
                } else {
                    W3 = ud.b.w(Long.valueOf(jArr[0]));
                }
            } else {
                W3 = vb.r.f22819a;
            }
            return a(W3, h0Var, vc.k.f22853l);
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            int length7 = cArr.length;
            if (length7 != 0) {
                if (length7 != 1) {
                    W5 = new ArrayList(cArr.length);
                    int length8 = cArr.length;
                    while (i10 < length8) {
                        W5.add(Character.valueOf(cArr[i10]));
                        i10++;
                    }
                } else {
                    W5 = ud.b.w(Character.valueOf(cArr[0]));
                }
            }
            return a(W5, h0Var, vc.k.f22848g);
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            jc.l.e(fArr, "<this>");
            int length9 = fArr.length;
            if (length9 != 0) {
                if (length9 != 1) {
                    W2 = new ArrayList(fArr.length);
                    for (float f10 : fArr) {
                        W2.add(Float.valueOf(f10));
                    }
                } else {
                    W2 = ud.b.w(Float.valueOf(fArr[0]));
                }
            } else {
                W2 = vb.r.f22819a;
            }
            return a(W2, h0Var, vc.k.f22852k);
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length10 = dArr.length;
            if (length10 != 0) {
                if (length10 != 1) {
                    W5 = new ArrayList(dArr.length);
                    int length11 = dArr.length;
                    while (i10 < length11) {
                        W5.add(Double.valueOf(dArr[i10]));
                        i10++;
                    }
                } else {
                    W5 = ud.b.w(Double.valueOf(dArr[0]));
                }
            }
            return a(W5, h0Var, vc.k.f22854m);
        }
        if (!(obj instanceof boolean[])) {
            if (obj == null) {
                return new u(null);
            }
            return null;
        }
        boolean[] zArr = (boolean[]) obj;
        jc.l.e(zArr, "<this>");
        int length12 = zArr.length;
        if (length12 != 0) {
            if (length12 != 1) {
                W = new ArrayList(zArr.length);
                for (boolean z11 : zArr) {
                    W.add(Boolean.valueOf(z11));
                }
            } else {
                W = ud.b.w(Boolean.valueOf(zArr[0]));
            }
        } else {
            W = vb.r.f22819a;
        }
        return a(W, h0Var, vc.k.f22847f);
    }
}
