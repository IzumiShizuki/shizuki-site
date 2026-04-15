package e7;

import android.net.Uri;
import android.os.Bundle;
import c7.e1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import o.v0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f6398e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h7.i f6400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public w f6401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v0 f6402d;

    static {
        new LinkedHashMap();
    }

    public u(m0 m0Var) {
        jc.l.e(m0Var, "navigator");
        LinkedHashMap linkedHashMap = n0.f6365b;
        this.f6399a = g.d(m0Var.getClass());
        h7.i iVar = new h7.i();
        iVar.f8188b = this;
        iVar.f8189c = new ArrayList();
        iVar.f8190d = new LinkedHashMap();
        this.f6400b = iVar;
        this.f6402d = new v0(0);
    }

    public final Bundle a(Bundle bundle) {
        Object obj;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f6400b.f8190d;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        Bundle bundleC = n7.d.c((ub.k[]) Arrays.copyOf(new ub.k[0], 0));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            h hVar = (h) entry.getValue();
            hVar.getClass();
            jc.l.e(str, "name");
            if (hVar.f6328b && (obj = hVar.f6329c) != null) {
                hVar.f6327a.e(bundleC, str, obj);
            }
        }
        if (bundle != null) {
            bundleC.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str2 = (String) entry2.getKey();
                h hVar2 = (h) entry2.getValue();
                hVar2.getClass();
                k0 k0Var = hVar2.f6327a;
                jc.l.e(str2, "name");
                if (!bundleC.containsKey(str2) || !ud.n.u(str2, bundleC)) {
                    try {
                        k0Var.a(str2, bundleC);
                    } catch (IllegalStateException unused) {
                    }
                }
                StringBuilder sbK = a0.c.K("Wrong argument type for '", str2, "' in argument savedState. ");
                sbK.append(k0Var.b());
                sbK.append(" expected.");
                throw new IllegalArgumentException(sbK.toString().toString());
            }
        }
        return bundleC;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.u.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        h7.i iVar = this.f6400b;
        int i10 = iVar.f8187a * 31;
        String str = (String) iVar.f8191e;
        int iHashCode = i10 + (str != null ? str.hashCode() : 0);
        Iterator it = ((ArrayList) iVar.f8189c).iterator();
        while (it.hasNext()) {
            int i11 = iHashCode * 31;
            String str2 = ((r) it.next()).f6379a;
            iHashCode = (i11 + (str2 != null ? str2.hashCode() : 0)) * 961;
        }
        v0 v0Var = this.f6402d;
        jc.l.e(v0Var, "<this>");
        if (v0Var.g() > 0) {
            v0Var.h(0).getClass();
            throw new ClassCastException();
        }
        for (String str3 : j().keySet()) {
            int iE = j2.h0.e(iHashCode * 31, 31, str3);
            Object obj = j().get(str3);
            iHashCode = iE + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int[] i(e7.u r7) {
        /*
            r6 = this;
            vb.j r0 = new vb.j
            r0.<init>()
            r1 = r6
        L6:
            h7.i r2 = r1.f6400b
            e7.w r3 = r1.f6401c
            if (r7 == 0) goto Lf
            e7.w r4 = r7.f6401c
            goto L10
        Lf:
            r4 = 0
        L10:
            if (r4 == 0) goto L25
            e7.w r4 = r7.f6401c
            jc.l.b(r4)
            int r5 = r2.f8187a
            h7.k r4 = r4.f6409f
            e7.u r4 = r4.r(r5)
            if (r4 != r1) goto L25
            r0.addFirst(r1)
            goto L3b
        L25:
            if (r3 == 0) goto L2f
            h7.k r4 = r3.f6409f
            int r4 = r4.f8197b
            int r2 = r2.f8187a
            if (r4 == r2) goto L32
        L2f:
            r0.addFirst(r1)
        L32:
            boolean r1 = jc.l.a(r3, r7)
            if (r1 == 0) goto L39
            goto L3b
        L39:
            if (r3 != 0) goto L6d
        L3b:
            java.util.List r7 = vb.m.G0(r0)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = vb.n.K(r7, r1)
            r0.<init>(r1)
            java.util.Iterator r7 = r7.iterator()
        L50:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L68
            java.lang.Object r1 = r7.next()
            e7.u r1 = (e7.u) r1
            h7.i r1 = r1.f6400b
            int r1 = r1.f8187a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            goto L50
        L68:
            int[] r7 = vb.m.F0(r0)
            return r7
        L6d:
            r1 = r3
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.u.i(e7.u):int[]");
    }

    public final Map j() {
        return vb.w.B((LinkedHashMap) this.f6400b.f8190d);
    }

    public t k(e1 e1Var) {
        boolean zD;
        ef.l lVar;
        ef.j jVarC;
        h7.i iVar = this.f6400b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) iVar.f8190d;
        String str = (String) e1Var.f3619c;
        Uri uri = (Uri) e1Var.f3618b;
        ArrayList<r> arrayList = (ArrayList) iVar.f8189c;
        if (arrayList.isEmpty()) {
            return null;
        }
        t tVar = null;
        for (r rVar : arrayList) {
            rVar.getClass();
            ub.p pVar = rVar.f6382d;
            if (((ef.l) pVar.getValue()) == null) {
                zD = true;
            } else if (uri == null) {
                zD = false;
            } else {
                ef.l lVar2 = (ef.l) pVar.getValue();
                jc.l.b(lVar2);
                zD = lVar2.d(uri.toString());
            }
            if (zD) {
                Bundle bundleD = uri != null ? rVar.d(uri, linkedHashMap) : null;
                int iB = rVar.b(uri);
                boolean z10 = str != null && str.equals(null);
                if (bundleD == null) {
                    if (z10) {
                        jc.l.e(linkedHashMap, "arguments");
                        Bundle bundleC = n7.d.c((ub.k[]) Arrays.copyOf(new ub.k[0], 0));
                        if (uri != null && (lVar = (ef.l) pVar.getValue()) != null && (jVarC = lVar.c(uri.toString())) != null) {
                            rVar.e(jVarC, bundleC, linkedHashMap);
                            if (((Boolean) rVar.f6383e.getValue()).booleanValue()) {
                                rVar.f(uri, bundleC, linkedHashMap);
                            }
                        }
                        if (g.e(linkedHashMap, new p(1, bundleC)).isEmpty()) {
                        }
                    }
                }
                t tVar2 = new t((u) iVar.f8188b, bundleD, rVar.f6390l, iB, z10, -1);
                if (tVar == null || tVar2.compareTo(tVar) > 0) {
                    tVar = tVar2;
                }
            }
        }
        return tVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(0x");
        h7.i iVar = this.f6400b;
        iVar.getClass();
        sb.append(Integer.toHexString(iVar.f8187a));
        sb.append(")");
        String str = (String) iVar.f8191e;
        if (str != null && !ef.n.y0(str)) {
            sb.append(" route=");
            sb.append((String) iVar.f8191e);
        }
        String string = sb.toString();
        jc.l.d(string, "toString(...)");
        return string;
    }
}
