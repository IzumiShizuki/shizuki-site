package j9;

import bg.j0;
import bg.k0;
import bg.n0;
import bg.o0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import x0.e1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f10753a = new u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ef.l f10754b = new ef.l(0, ".*([RBV]J\\d{6,8}).*");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e1 f10755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e1 f10756d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e1 f10757e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e1 f10758f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static String f10759g;

    static {
        vb.r rVar = vb.r.f22819a;
        f10755c = x0.v.v(rVar);
        f10756d = x0.v.v(0);
        f10757e = x0.v.v(rVar);
        f10758f = x0.v.v(ka.q.f11304b);
        f10759g = "";
        ((v4.v) h9.d.c()).f22683m.a(new i());
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0247  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(j9.u r35, java.util.List r36, yb.c r37) {
        /*
            Method dump skipped, instruction units count: 1233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j9.u.a(j9.u, java.util.List, yb.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(j9.u r16, java.util.List r17, yb.c r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j9.u.b(j9.u, java.util.List, yb.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x032f, code lost:
    
        if (hf.a0.H(r9, r0, r6) == r7) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0363, code lost:
    
        if (hf.a0.H(r8, r0, r6) == r7) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0382, code lost:
    
        if (hf.a0.H(r0, r2, r6) == r7) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0251, code lost:
    
        if (hf.a0.H(r0, r4, r6) == r7) goto L141;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, vb.r] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(j9.u r26, java.util.List r27, yb.c r28) {
        /*
            Method dump skipped, instruction units count: 902
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j9.u.c(j9.u, java.util.List, yb.c):java.lang.Object");
    }

    public static File d(InputStream inputStream, String str) {
        File parentFile;
        jc.l.e(str, "name");
        File file = new File(new File(a9.i.a().getCacheDir(), "lrc"), str);
        File parentFile2 = file.getParentFile();
        if ((parentFile2 == null || !parentFile2.exists()) && (parentFile = file.getParentFile()) != null) {
            parentFile.mkdirs();
        }
        try {
            if (file.exists()) {
                inputStream.close();
                return file;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                pc.f0.u(inputStream, fileOutputStream);
                fileOutputStream.close();
                inputStream.close();
                return file;
            } finally {
            }
        } finally {
        }
    }

    public static File e(kg.a aVar, rg.e eVar) {
        jc.l.e(aVar, "<this>");
        qg.k kVarB = aVar.b(eVar);
        String str = eVar.f19044v;
        jc.l.d(str, "getFileName(...)");
        return d(kVarB, na.w.j(str));
    }

    public static final boolean g(String str, jc.y yVar, List list) {
        List<o0> list2 = list;
        for (o0 o0Var : list2) {
            if ((o0Var instanceof k0) && jc.l.a(((k0) o0Var).b(), str)) {
                String strM = na.w.m(o0Var.a());
                String strA = o0Var.a();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list2) {
                    if (obj instanceof j0) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    ArrayList arrayList3 = v.f10760a;
                    String lowerCase = na.w.h(((j0) obj2).f2909d).toLowerCase(Locale.ROOT);
                    jc.l.d(lowerCase, "toLowerCase(...)");
                    if (arrayList3.contains(lowerCase)) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList<j0> arrayList4 = new ArrayList();
                for (Object obj3 : arrayList2) {
                    String strM2 = na.w.m(((j0) obj3).f2909d);
                    if (strM2.equals(strM) || strM2.equals(strA)) {
                        arrayList4.add(obj3);
                    }
                }
                ArrayList arrayList5 = new ArrayList(vb.n.K(arrayList4, 10));
                for (j0 j0Var : arrayList4) {
                    String upperCase = na.w.h(j0Var.f2909d).toUpperCase(Locale.ROOT);
                    jc.l.d(upperCase, "toUpperCase(...)");
                    arrayList5.add(new ub.k(c0.valueOf(upperCase), j0Var.f2910e));
                }
                yVar.f10838a = arrayList5;
                return true;
            }
            if ((o0Var instanceof n0) && g(str, yVar, ((n0) o0Var).f2932c)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00fd, code lost:
    
        if (r1 == r5) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(boolean r17, ac.c r18) {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j9.u.f(boolean, ac.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(int r7, j9.f r8, ac.c r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof j9.t
            if (r0 == 0) goto L13
            r0 = r9
            j9.t r0 = (j9.t) r0
            int r1 = r0.f10752i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10752i = r1
            goto L18
        L13:
            j9.t r0 = new j9.t
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f10750g
            int r1 = r0.f10752i
            r2 = 2
            r3 = 1
            zb.a r4 = zb.a.f26667a
            if (r1 == 0) goto L3c
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            ub.a.f(r9)
            return r9
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            int r7 = r0.f10747d
            j9.u r8 = r0.f10749f
            j9.f r1 = r0.f10748e
            ub.a.f(r9)
            goto L59
        L3c:
            ub.a.f(r9)
            x0.e1 r9 = j9.u.f10756d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r9.setValue(r1)
            r0.f10748e = r8
            r0.f10749f = r6
            r0.f10747d = r7
            r0.f10752i = r3
            java.lang.Object r9 = r8.a(r0)
            if (r9 != r4) goto L57
            goto L89
        L57:
            r1 = r8
            r8 = r6
        L59:
            java.util.List r9 = (java.util.List) r9
            r8.getClass()
            java.lang.String r8 = "<set-?>"
            jc.l.e(r9, r8)
            x0.e1 r8 = j9.u.f10757e
            r8.setValue(r9)
            j9.d0 r8 = r1.f10690d
            j9.d0 r9 = j9.d0.f10674a
            if (r8 == r9) goto L71
            ub.a0 r7 = ub.a0.f21526a
            return r7
        L71:
            pf.d r8 = pf.d.f17138c
            a9.k r9 = new a9.k
            r3 = 8
            r5 = 0
            r9.<init>(r3, r1, r5)
            r0.f10748e = r5
            r0.f10749f = r5
            r0.f10747d = r7
            r0.f10752i = r2
            java.lang.Object r7 = hf.a0.H(r8, r9, r0)
            if (r7 != r4) goto L8a
        L89:
            return r4
        L8a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j9.u.h(int, j9.f, ac.c):java.lang.Object");
    }
}
