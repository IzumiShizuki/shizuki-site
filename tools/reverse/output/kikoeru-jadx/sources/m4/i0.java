package m4;

import android.net.Uri;
import android.os.Bundle;
import b7.c3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i0 f14278g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f14279h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f14280i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f14281j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f14282k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f14283l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f14284m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f14286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f14287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l0 f14288d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y f14289e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e0 f14290f;

    static {
        w wVar = new w();
        ya.g0 g0Var = ya.i0.f25998b;
        ya.a1 a1Var = ya.a1.f25946e;
        List list = Collections.EMPTY_LIST;
        ya.a1 a1Var2 = ya.a1.f25946e;
        b0 b0Var = new b0();
        f14278g = new i0("", new y(wVar), null, new c0(b0Var), l0.K, e0.f14187d);
        f14279h = Integer.toString(0, 36);
        f14280i = Integer.toString(1, 36);
        f14281j = Integer.toString(2, 36);
        f14282k = Integer.toString(3, 36);
        f14283l = Integer.toString(4, 36);
        f14284m = Integer.toString(5, 36);
    }

    public i0(String str, y yVar, d0 d0Var, c0 c0Var, l0 l0Var, e0 e0Var) {
        this.f14285a = str;
        this.f14286b = d0Var;
        this.f14287c = c0Var;
        this.f14288d = l0Var;
        this.f14289e = yVar;
        this.f14290f = e0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Cloneable] */
    /* JADX WARN: Type inference failed for: r1v56 */
    public static i0 a(Bundle bundle) {
        y yVar;
        e0 e0Var;
        Map mapA;
        a0 a0Var;
        v vVar;
        ya.a1 a1VarF;
        ya.a1 a1VarP;
        d0 d0Var;
        String string = bundle.getString(f14279h, "");
        string.getClass();
        Bundle bundle2 = bundle.getBundle(f14280i);
        c0 c0VarB = bundle2 == null ? c0.f14143f : c0.b(bundle2);
        Bundle bundle3 = bundle.getBundle(f14281j);
        l0 l0VarB = bundle3 == null ? l0.K : l0.b(bundle3);
        Bundle bundle4 = bundle.getBundle(f14282k);
        if (bundle4 == null) {
            yVar = y.f14640p;
        } else {
            w wVar = new w();
            String str = x.f14610i;
            x xVar = x.f14609h;
            long j10 = xVar.f14617a;
            long j11 = xVar.f14620d;
            long j12 = xVar.f14618b;
            long jN = p4.c0.N(bundle4.getLong(str, j10));
            boolean z10 = true;
            p4.c.c(jN >= 0);
            wVar.f14604a = jN;
            long jN2 = p4.c0.N(bundle4.getLong(x.f14611j, xVar.f14619c));
            p4.c.c(jN2 == Long.MIN_VALUE || jN2 >= 0);
            wVar.f14605b = jN2;
            wVar.f14606c = bundle4.getBoolean(x.f14612k, xVar.f14621e);
            wVar.f14607d = bundle4.getBoolean(x.f14613l, xVar.f14622f);
            wVar.f14608e = bundle4.getBoolean(x.f14614m, xVar.f14623g);
            long j13 = bundle4.getLong(x.f14615n, j12);
            if (j13 != j12) {
                p4.c.c(j13 >= 0);
                wVar.f14604a = j13;
            }
            long j14 = bundle4.getLong(x.f14616o, j11);
            if (j14 != j11) {
                if (j14 != Long.MIN_VALUE && j14 < 0) {
                    z10 = false;
                }
                p4.c.c(z10);
                wVar.f14605b = j14;
            }
            yVar = new y(wVar);
        }
        y yVar2 = yVar;
        Bundle bundle5 = bundle.getBundle(f14283l);
        if (bundle5 == null) {
            e0Var = e0.f14187d;
        } else {
            c7.e1 e1Var = new c7.e1(23);
            e1Var.f3618b = (Uri) bundle5.getParcelable(e0.f14188e);
            e1Var.f3619c = bundle5.getString(e0.f14189f);
            e1Var.f3620d = bundle5.getBundle(e0.f14190g);
            e0Var = new e0(e1Var);
        }
        e0 e0Var2 = e0Var;
        Bundle bundle6 = bundle.getBundle(f14284m);
        if (bundle6 == null) {
            d0Var = null;
        } else {
            Bundle bundle7 = bundle6.getBundle(d0.f14172k);
            if (bundle7 == null) {
                a0Var = null;
            } else {
                String string2 = bundle7.getString(a0.f14101i);
                string2.getClass();
                UUID uuidFromString = UUID.fromString(string2);
                Uri uri = (Uri) bundle7.getParcelable(a0.f14102j);
                String str2 = a0.f14103k;
                Bundle bundle8 = Bundle.EMPTY;
                Bundle bundle9 = bundle7.getBundle(str2);
                if (bundle9 == null) {
                    bundle9 = bundle8;
                }
                if (bundle9 == bundle8) {
                    mapA = ya.f1.f25977g;
                } else {
                    HashMap map = new HashMap();
                    if (bundle9 != bundle8) {
                        for (String str3 : bundle9.keySet()) {
                            String string3 = bundle9.getString(str3);
                            if (string3 != null) {
                                map.put(str3, string3);
                            }
                        }
                    }
                    mapA = ya.k0.a(map);
                }
                boolean z11 = bundle7.getBoolean(a0.f14104l, false);
                boolean z12 = bundle7.getBoolean(a0.f14105m, false);
                boolean z13 = bundle7.getBoolean(a0.f14106n, false);
                String str4 = a0.f14107o;
                ArrayList<Integer> arrayList = new ArrayList<>();
                ArrayList<Integer> integerArrayList = bundle7.getIntegerArrayList(str4);
                if (integerArrayList != null) {
                    arrayList = integerArrayList;
                }
                ya.i0 i0VarQ = ya.i0.q(arrayList);
                byte[] byteArray = bundle7.getByteArray(a0.f14108p);
                z zVar = new z();
                zVar.f14644d = uuidFromString;
                zVar.f14645e = uri;
                zVar.f14646f = ya.k0.a(mapA);
                zVar.f14641a = z11;
                zVar.f14643c = z13;
                zVar.f14642b = z12;
                zVar.f14647g = ya.i0.q(i0VarQ);
                zVar.f14648h = byteArray != null ? Arrays.copyOf(byteArray, byteArray.length) : 0;
                a0Var = new a0(zVar);
            }
            Bundle bundle10 = bundle6.getBundle(d0.f14173l);
            if (bundle10 == null) {
                vVar = null;
            } else {
                Uri uri2 = (Uri) bundle10.getParcelable(v.f14601b);
                uri2.getClass();
                t0 t0Var = new t0();
                t0Var.f14586a = uri2;
                vVar = new v(t0Var);
            }
            ArrayList parcelableArrayList = bundle6.getParcelableArrayList(d0.f14174m);
            if (parcelableArrayList == null) {
                ya.g0 g0Var = ya.i0.f25998b;
                a1VarF = ya.a1.f25946e;
            } else {
                ya.f0 f0VarP = ya.i0.p();
                int i10 = 0;
                while (i10 < parcelableArrayList.size()) {
                    Bundle bundle11 = (Bundle) parcelableArrayList.get(i10);
                    bundle11.getClass();
                    f0VarP.a(new b1(bundle11.getInt(b1.f14137d, 0), bundle11.getInt(b1.f14138e, 0), bundle11.getInt(b1.f14139f, 0)));
                    i10++;
                    parcelableArrayList = parcelableArrayList;
                }
                a1VarF = f0VarP.f();
            }
            ya.a1 a1Var = a1VarF;
            ArrayList parcelableArrayList2 = bundle6.getParcelableArrayList(d0.f14176o);
            if (parcelableArrayList2 == null) {
                ya.g0 g0Var2 = ya.i0.f25998b;
                a1VarP = ya.a1.f25946e;
            } else {
                a1VarP = p4.c.p(parcelableArrayList2, new c3(28));
            }
            ya.a1 a1Var2 = a1VarP;
            long j15 = bundle6.getLong(d0.f14177p, -9223372036854775807L);
            Uri uri3 = (Uri) bundle6.getParcelable(d0.f14170i);
            uri3.getClass();
            d0Var = new d0(uri3, bundle6.getString(d0.f14171j), a0Var, vVar, a1Var, bundle6.getString(d0.f14175n), a1Var2, j15);
        }
        return new i0(string, yVar2, d0Var, c0VarB, l0VarB, e0Var2);
    }

    public static i0 b(String str) {
        d0 d0Var;
        w wVar = new w();
        z zVar = new z();
        List list = Collections.EMPTY_LIST;
        ya.a1 a1Var = ya.a1.f25946e;
        b0 b0Var = new b0();
        e0 e0Var = e0.f14187d;
        Uri uri = str == null ? null : Uri.parse(str);
        p4.c.i(((Uri) zVar.f14645e) == null || ((UUID) zVar.f14644d) != null);
        a0 a0Var = null;
        if (uri != null) {
            if (((UUID) zVar.f14644d) != null) {
                a0Var = new a0(zVar);
            }
            d0Var = new d0(uri, null, a0Var, null, list, null, a1Var, -9223372036854775807L);
        } else {
            d0Var = null;
        }
        return new i0("", new y(wVar), d0Var, new c0(b0Var), l0.K, e0Var);
    }

    public final Bundle c(boolean z10) {
        d0 d0Var;
        Bundle bundle = new Bundle();
        String str = this.f14285a;
        if (!str.equals("")) {
            bundle.putString(f14279h, str);
        }
        c0 c0Var = c0.f14143f;
        c0 c0Var2 = this.f14287c;
        if (!c0Var2.equals(c0Var)) {
            bundle.putBundle(f14280i, c0Var2.c());
        }
        l0 l0Var = l0.K;
        l0 l0Var2 = this.f14288d;
        if (!l0Var2.equals(l0Var)) {
            bundle.putBundle(f14281j, l0Var2.c());
        }
        x xVar = x.f14609h;
        y yVar = this.f14289e;
        if (!yVar.equals(xVar)) {
            Bundle bundle2 = new Bundle();
            long j10 = yVar.f14617a;
            if (j10 != xVar.f14617a) {
                bundle2.putLong(x.f14610i, j10);
            }
            long j11 = yVar.f14619c;
            if (j11 != xVar.f14619c) {
                bundle2.putLong(x.f14611j, j11);
            }
            long j12 = yVar.f14618b;
            if (j12 != xVar.f14618b) {
                bundle2.putLong(x.f14615n, j12);
            }
            long j13 = yVar.f14620d;
            if (j13 != xVar.f14620d) {
                bundle2.putLong(x.f14616o, j13);
            }
            boolean z11 = yVar.f14621e;
            if (z11 != xVar.f14621e) {
                bundle2.putBoolean(x.f14612k, z11);
            }
            boolean z12 = yVar.f14622f;
            if (z12 != xVar.f14622f) {
                bundle2.putBoolean(x.f14613l, z12);
            }
            boolean z13 = yVar.f14623g;
            if (z13 != xVar.f14623g) {
                bundle2.putBoolean(x.f14614m, z13);
            }
            bundle.putBundle(f14282k, bundle2);
        }
        e0 e0Var = e0.f14187d;
        e0 e0Var2 = this.f14290f;
        if (!e0Var2.equals(e0Var)) {
            Bundle bundle3 = new Bundle();
            Uri uri = e0Var2.f14191a;
            if (uri != null) {
                bundle3.putParcelable(e0.f14188e, uri);
            }
            String str2 = e0Var2.f14192b;
            if (str2 != null) {
                bundle3.putString(e0.f14189f, str2);
            }
            Bundle bundle4 = e0Var2.f14193c;
            if (bundle4 != null) {
                bundle3.putBundle(e0.f14190g, bundle4);
            }
            bundle.putBundle(f14283l, bundle3);
        }
        if (z10 && (d0Var = this.f14286b) != null) {
            ya.i0 i0Var = d0Var.f14184g;
            List list = d0Var.f14182e;
            Bundle bundle5 = new Bundle();
            bundle5.putParcelable(d0.f14170i, d0Var.f14178a);
            String str3 = d0Var.f14179b;
            if (str3 != null) {
                bundle5.putString(d0.f14171j, str3);
            }
            a0 a0Var = d0Var.f14180c;
            if (a0Var != null) {
                String str4 = d0.f14172k;
                ya.i0 i0Var2 = a0Var.f14115g;
                ya.k0 k0Var = a0Var.f14111c;
                Bundle bundle6 = new Bundle();
                bundle6.putString(a0.f14101i, a0Var.f14109a.toString());
                Uri uri2 = a0Var.f14110b;
                if (uri2 != null) {
                    bundle6.putParcelable(a0.f14102j, uri2);
                }
                if (!k0Var.isEmpty()) {
                    String str5 = a0.f14103k;
                    Bundle bundle7 = new Bundle();
                    for (Map.Entry entry : k0Var.entrySet()) {
                        bundle7.putString((String) entry.getKey(), (String) entry.getValue());
                    }
                    bundle6.putBundle(str5, bundle7);
                }
                boolean z14 = a0Var.f14112d;
                if (z14) {
                    bundle6.putBoolean(a0.f14104l, z14);
                }
                boolean z15 = a0Var.f14113e;
                if (z15) {
                    bundle6.putBoolean(a0.f14105m, z15);
                }
                boolean z16 = a0Var.f14114f;
                if (z16) {
                    bundle6.putBoolean(a0.f14106n, z16);
                }
                if (!i0Var2.isEmpty()) {
                    bundle6.putIntegerArrayList(a0.f14107o, new ArrayList<>(i0Var2));
                }
                byte[] bArr = a0Var.f14116h;
                if (bArr != null) {
                    bundle6.putByteArray(a0.f14108p, bArr);
                }
                bundle5.putBundle(str4, bundle6);
            }
            v vVar = d0Var.f14181d;
            if (vVar != null) {
                String str6 = d0.f14173l;
                Bundle bundle8 = new Bundle();
                bundle8.putParcelable(v.f14601b, vVar.f14602a);
                bundle5.putBundle(str6, bundle8);
            }
            if (!list.isEmpty()) {
                bundle5.putParcelableArrayList(d0.f14174m, p4.c.A(list, new c3(26)));
            }
            String str7 = d0Var.f14183f;
            if (str7 != null) {
                bundle5.putString(d0.f14175n, str7);
            }
            if (!i0Var.isEmpty()) {
                bundle5.putParcelableArrayList(d0.f14176o, p4.c.A(i0Var, new c3(27)));
            }
            long j14 = d0Var.f14185h;
            if (j14 != -9223372036854775807L) {
                bundle5.putLong(d0.f14177p, j14);
            }
            bundle.putBundle(f14284m, bundle5);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        String str = i0Var.f14285a;
        int i10 = p4.c0.f16548a;
        return Objects.equals(this.f14285a, str) && this.f14289e.equals(i0Var.f14289e) && Objects.equals(this.f14286b, i0Var.f14286b) && Objects.equals(this.f14287c, i0Var.f14287c) && Objects.equals(this.f14288d, i0Var.f14288d) && Objects.equals(this.f14290f, i0Var.f14290f);
    }

    public final int hashCode() {
        int iHashCode = this.f14285a.hashCode() * 31;
        d0 d0Var = this.f14286b;
        return this.f14290f.hashCode() + ((this.f14288d.hashCode() + ((this.f14289e.hashCode() + ((this.f14287c.hashCode() + ((iHashCode + (d0Var != null ? d0Var.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }
}
