package e7;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c extends k0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f6306k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10, boolean z10) {
        super(z10);
        this.f6306k = i10;
    }

    public static float[] f(String str) {
        return new float[]{Float.valueOf(Float.parseFloat(str)).floatValue()};
    }

    public static int[] g(String str) {
        return new int[]{((Number) k0.f6343a.d(str)).intValue()};
    }

    public static long[] h(String str) {
        return new long[]{((Number) k0.f6345c.d(str)).longValue()};
    }

    public static boolean[] i(String str) {
        return new boolean[]{((Boolean) k0.f6349g.d(str)).booleanValue()};
    }

    @Override // e7.k0
    public final Object a(String str, Bundle bundle) {
        switch (this.f6306k) {
            case 0:
                jc.l.e(bundle, "bundle");
                if (!bundle.containsKey(str) || ud.n.u(str, bundle)) {
                    return null;
                }
                boolean[] booleanArray = bundle.getBooleanArray(str);
                if (booleanArray != null) {
                    return booleanArray;
                }
                ud.s.s(str);
                throw null;
            case 1:
                jc.l.e(bundle, "bundle");
                if (!bundle.containsKey(str) || ud.n.u(str, bundle)) {
                    return null;
                }
                float[] floatArray = bundle.getFloatArray(str);
                if (floatArray != null) {
                    return floatArray;
                }
                ud.s.s(str);
                throw null;
            case 2:
                jc.l.e(bundle, "bundle");
                if (!bundle.containsKey(str) || ud.n.u(str, bundle)) {
                    return null;
                }
                int[] intArray = bundle.getIntArray(str);
                if (intArray != null) {
                    return intArray;
                }
                ud.s.s(str);
                throw null;
            case 3:
                jc.l.e(bundle, "bundle");
                if (!bundle.containsKey(str) || ud.n.u(str, bundle)) {
                    return null;
                }
                long[] longArray = bundle.getLongArray(str);
                if (longArray != null) {
                    return longArray;
                }
                ud.s.s(str);
                throw null;
            default:
                jc.l.e(bundle, "bundle");
                if (!bundle.containsKey(str) || ud.n.u(str, bundle)) {
                    return null;
                }
                String[] stringArray = bundle.getStringArray(str);
                if (stringArray != null) {
                    return stringArray;
                }
                ud.s.s(str);
                throw null;
        }
    }

    @Override // e7.k0
    public final String b() {
        switch (this.f6306k) {
            case 0:
                return "boolean[]";
            case 1:
                return "float[]";
            case 2:
                return "integer[]";
            case 3:
                return "long[]";
            default:
                return "string[]";
        }
    }

    @Override // e7.k0
    public final Object c(Object obj, String str) {
        switch (this.f6306k) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                if (zArr == null) {
                    return i(str);
                }
                boolean[] zArrI = i(str);
                int length = zArr.length;
                boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + 1);
                System.arraycopy(zArrI, 0, zArrCopyOf, length, 1);
                jc.l.b(zArrCopyOf);
                return zArrCopyOf;
            case 1:
                float[] fArr = (float[]) obj;
                if (fArr == null) {
                    return f(str);
                }
                float[] fArrF = f(str);
                int length2 = fArr.length;
                float[] fArrCopyOf = Arrays.copyOf(fArr, length2 + 1);
                System.arraycopy(fArrF, 0, fArrCopyOf, length2, 1);
                jc.l.b(fArrCopyOf);
                return fArrCopyOf;
            case 2:
                int[] iArr = (int[]) obj;
                if (iArr == null) {
                    return g(str);
                }
                int[] iArrG = g(str);
                int length3 = iArr.length;
                int[] iArrCopyOf = Arrays.copyOf(iArr, length3 + 1);
                System.arraycopy(iArrG, 0, iArrCopyOf, length3, 1);
                jc.l.b(iArrCopyOf);
                return iArrCopyOf;
            case 3:
                long[] jArr = (long[]) obj;
                if (jArr == null) {
                    return h(str);
                }
                long[] jArrH = h(str);
                int length4 = jArr.length;
                long[] jArrCopyOf = Arrays.copyOf(jArr, length4 + 1);
                System.arraycopy(jArrH, 0, jArrCopyOf, length4, 1);
                jc.l.b(jArrCopyOf);
                return jArrCopyOf;
            default:
                String[] strArr = (String[]) obj;
                if (strArr == null) {
                    return new String[]{str};
                }
                int length5 = strArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(strArr, length5 + 1);
                System.arraycopy(new String[]{str}, 0, objArrCopyOf, length5, 1);
                jc.l.b(objArrCopyOf);
                return (String[]) objArrCopyOf;
        }
    }

    @Override // e7.k0
    public final Object d(String str) {
        switch (this.f6306k) {
            case 0:
                return i(str);
            case 1:
                return f(str);
            case 2:
                return g(str);
            case 3:
                return h(str);
            default:
                return new String[]{str};
        }
    }

    @Override // e7.k0
    public final void e(Bundle bundle, String str, Object obj) {
        switch (this.f6306k) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                jc.l.e(str, "key");
                if (zArr == null) {
                    ua.j.s(str, bundle);
                } else {
                    bundle.putBooleanArray(str, zArr);
                }
                break;
            case 1:
                float[] fArr = (float[]) obj;
                jc.l.e(str, "key");
                if (fArr == null) {
                    ua.j.s(str, bundle);
                } else {
                    bundle.putFloatArray(str, fArr);
                }
                break;
            case 2:
                int[] iArr = (int[]) obj;
                jc.l.e(str, "key");
                if (iArr == null) {
                    ua.j.s(str, bundle);
                } else {
                    bundle.putIntArray(str, iArr);
                }
                break;
            case 3:
                long[] jArr = (long[]) obj;
                jc.l.e(str, "key");
                if (jArr == null) {
                    ua.j.s(str, bundle);
                } else {
                    bundle.putLongArray(str, jArr);
                }
                break;
            default:
                String[] strArr = (String[]) obj;
                jc.l.e(str, "key");
                if (strArr == null) {
                    ua.j.s(str, bundle);
                } else {
                    bundle.putStringArray(str, strArr);
                }
                break;
        }
    }
}
