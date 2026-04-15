package n7;

import com.cnl.kikoeru.data.db.AppDatabase_Impl;
import i7.p2;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import lf.p0;
import lf.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String[] f15541l = {"INSERT", "UPDATE", "DELETE"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppDatabase_Impl f15542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f15543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f15544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f15545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final de.h f15546e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String[] f15548g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b5.d0 f15549h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p2 f15550i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f15551j = new AtomicBoolean(false);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ic.a f15552k = new i9.f(20);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f15547f = new LinkedHashMap();

    public m0(AppDatabase_Impl appDatabase_Impl, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String[] strArr, boolean z10, de.h hVar) {
        String lowerCase;
        this.f15542a = appDatabase_Impl;
        this.f15543b = linkedHashMap;
        this.f15544c = linkedHashMap2;
        this.f15545d = z10;
        this.f15546e = hVar;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str = strArr[i10];
            Locale locale = Locale.ROOT;
            String lowerCase2 = str.toLowerCase(locale);
            jc.l.d(lowerCase2, "toLowerCase(...)");
            this.f15547f.put(lowerCase2, Integer.valueOf(i10));
            String str2 = (String) this.f15543b.get(strArr[i10]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(locale);
                jc.l.d(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr2[i10] = lowerCase2;
        }
        this.f15548g = strArr2;
        for (Map.Entry entry : this.f15543b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase3 = str3.toLowerCase(locale2);
            jc.l.d(lowerCase3, "toLowerCase(...)");
            if (this.f15547f.containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(locale2);
                jc.l.d(lowerCase4, "toLowerCase(...)");
                LinkedHashMap linkedHashMap3 = this.f15547f;
                linkedHashMap3.put(lowerCase4, vb.w.r(lowerCase3, linkedHashMap3));
            }
        }
        this.f15549h = new b5.d0(this.f15548g.length);
        int length2 = this.f15548g.length;
        p2 p2Var = new p2();
        p2Var.f9258a = p0.c(new int[length2]);
        this.f15550i = p2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(n7.m0 r4, n7.q r5, ac.c r6) {
        /*
            boolean r0 = r6 instanceof n7.c0
            if (r0 == 0) goto L13
            r0 = r6
            n7.c0 r0 = (n7.c0) r0
            int r1 = r0.f15438g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15438g = r1
            goto L18
        L13:
            n7.c0 r0 = new n7.c0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.f15436e
            int r6 = r0.f15438g
            r1 = 2
            r2 = 1
            zb.a r3 = zb.a.f26667a
            if (r6 == 0) goto L3e
            if (r6 == r2) goto L36
            if (r6 != r1) goto L2e
            java.lang.Object r5 = r0.f15435d
            java.util.Set r5 = (java.util.Set) r5
            ub.a.f(r4)
            return r5
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            java.lang.Object r5 = r0.f15435d
            n7.q r5 = (n7.q) r5
            ub.a.f(r4)
            goto L55
        L3e:
            ub.a.f(r4)
            m0.l3 r4 = new m0.l3
            r6 = 12
            r4.<init>(r6)
            r0.f15435d = r5
            r0.f15438g = r2
            java.lang.String r6 = "SELECT * FROM room_table_modification_log WHERE invalidated = 1"
            java.lang.Object r4 = r5.a(r6, r4, r0)
            if (r4 != r3) goto L55
            goto L6c
        L55:
            java.util.Set r4 = (java.util.Set) r4
            r6 = r4
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L6d
            r0.f15435d = r4
            r0.f15438g = r1
            java.lang.String r6 = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1"
            java.lang.Object r5 = n7.b0.j(r5, r6, r0)
            if (r5 != r3) goto L6d
        L6c:
            return r3
        L6d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: n7.m0.a(n7.m0, n7.q, ac.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0070, code lost:
    
        if (r15 == r4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e1, code lost:
    
        if (r15 == r4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e3, code lost:
    
        return r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00e1 -> B:28:0x00e4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(n7.m0 r12, n7.a0 r13, int r14, ac.c r15) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n7.m0.b(n7.m0, n7.a0, int, ac.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0080 -> B:19:0x0083). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(n7.m0 r6, n7.a0 r7, int r8, ac.c r9) {
        /*
            r6.getClass()
            boolean r0 = r9 instanceof n7.j0
            if (r0 == 0) goto L16
            r0 = r9
            n7.j0 r0 = (n7.j0) r0
            int r1 = r0.f15517k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f15517k = r1
            goto L1b
        L16:
            n7.j0 r0 = new n7.j0
            r0.<init>(r6, r9)
        L1b:
            java.lang.Object r9 = r0.f15515i
            int r1 = r0.f15517k
            r2 = 1
            if (r1 == 0) goto L3c
            if (r1 != r2) goto L34
            int r6 = r0.f15514h
            int r7 = r0.f15513g
            java.lang.String[] r8 = r0.f15512f
            java.lang.String r1 = r0.f15511e
            n7.q r3 = r0.f15510d
            ub.a.f(r9)
            r9 = r8
            r8 = r3
            goto L83
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            ub.a.f(r9)
            java.lang.String[] r6 = r6.f15548g
            r6 = r6[r8]
            java.lang.String[] r8 = n7.m0.f15541l
            r9 = 0
            r1 = 3
            r1 = r6
            r9 = r8
            r6 = 3
            r8 = r7
            r7 = 0
        L4c:
            if (r7 >= r6) goto L85
            r3 = r9[r7]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "room_table_modification_trigger_"
            r4.<init>(r5)
            r4.append(r1)
            r5 = 95
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "DROP TRIGGER IF EXISTS `"
            r5 = 96
            java.lang.String r3 = a0.c.G(r5, r4, r3)
            r0.f15510d = r8
            r0.f15511e = r1
            r0.f15512f = r9
            r0.f15513g = r7
            r0.f15514h = r6
            r0.f15517k = r2
            java.lang.Object r3 = n7.b0.j(r8, r3, r0)
            zb.a r4 = zb.a.f26667a
            if (r3 != r4) goto L83
            return r4
        L83:
            int r7 = r7 + r2
            goto L4c
        L85:
            ub.a0 r6 = ub.a0.f21526a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: n7.m0.c(n7.m0, n7.a0, int, ac.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [m0.w] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(ac.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof n7.f0
            if (r0 == 0) goto L13
            r0 = r8
            n7.f0 r0 = (n7.f0) r0
            int r1 = r0.f15483h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15483h = r1
            goto L18
        L13:
            n7.f0 r0 = new n7.f0
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f15481f
            int r1 = r0.f15483h
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            m0.w r1 = r0.f15480e
            n7.m0 r0 = r0.f15479d
            ub.a.f(r8)     // Catch: java.lang.Throwable -> L29
            goto L78
        L29:
            r8 = move-exception
            goto L91
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L33:
            ub.a.f(r8)
            com.cnl.kikoeru.data.db.AppDatabase_Impl r8 = r7.f15542a
            m0.w r1 = r8.f15581g
            boolean r3 = r1.t()
            vb.t r4 = vb.t.f22821a
            if (r3 == 0) goto L95
            java.util.concurrent.atomic.AtomicBoolean r3 = r7.f15551j     // Catch: java.lang.Throwable -> L29
            r5 = 0
            boolean r3 = r3.compareAndSet(r2, r5)     // Catch: java.lang.Throwable -> L29
            if (r3 != 0) goto L4f
            r1.L()
            return r4
        L4f:
            ic.a r3 = r7.f15552k     // Catch: java.lang.Throwable -> L29
            java.lang.Object r3 = r3.b()     // Catch: java.lang.Throwable -> L29
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L29
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L29
            if (r3 != 0) goto L61
            r1.L()
            return r4
        L61:
            n7.g0 r3 = new n7.g0     // Catch: java.lang.Throwable -> L29
            r4 = 0
            r6 = 1
            r3.<init>(r7, r4, r6)     // Catch: java.lang.Throwable -> L29
            r0.f15479d = r7     // Catch: java.lang.Throwable -> L29
            r0.f15480e = r1     // Catch: java.lang.Throwable -> L29
            r0.f15483h = r2     // Catch: java.lang.Throwable -> L29
            java.lang.Object r8 = r8.n(r5, r3, r0)     // Catch: java.lang.Throwable -> L29
            zb.a r0 = zb.a.f26667a
            if (r8 != r0) goto L77
            return r0
        L77:
            r0 = r7
        L78:
            java.util.Set r8 = (java.util.Set) r8     // Catch: java.lang.Throwable -> L29
            r2 = r8
            java.util.Collection r2 = (java.util.Collection) r2     // Catch: java.lang.Throwable -> L29
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L29
            if (r2 != 0) goto L8d
            i7.p2 r2 = r0.f15550i     // Catch: java.lang.Throwable -> L29
            r2.y(r8)     // Catch: java.lang.Throwable -> L29
            de.h r0 = r0.f15546e     // Catch: java.lang.Throwable -> L29
            r0.a(r8)     // Catch: java.lang.Throwable -> L29
        L8d:
            r1.L()
            return r8
        L91:
            r1.L()
            throw r8
        L95:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: n7.m0.d(ac.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String[] r6, ic.a r7, ic.a r8, ac.c r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof n7.h0
            if (r0 == 0) goto L13
            r0 = r9
            n7.h0 r0 = (n7.h0) r0
            int r1 = r0.f15494h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15494h = r1
            goto L18
        L13:
            n7.h0 r0 = new n7.h0
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.f15492f
            int r1 = r0.f15494h
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            int[] r6 = r0.f15491e
            ic.a r8 = r0.f15490d
            ub.a.f(r9)     // Catch: java.lang.Throwable -> L29
            goto L50
        L29:
            r6 = move-exception
            goto L7e
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            ub.a.f(r9)
            ub.k r6 = r5.h(r6)
            java.lang.Object r6 = r6.f21544b
            int[] r6 = (int[]) r6
            r7.b()
            r0.f15490d = r8     // Catch: java.lang.Throwable -> L29
            r0.f15491e = r6     // Catch: java.lang.Throwable -> L29
            r0.f15494h = r2     // Catch: java.lang.Throwable -> L29
            java.lang.Object r9 = r5.d(r0)     // Catch: java.lang.Throwable -> L29
            zb.a r7 = zb.a.f26667a
            if (r9 != r7) goto L50
            return r7
        L50:
            java.util.Set r9 = (java.util.Set) r9     // Catch: java.lang.Throwable -> L29
            int r7 = r6.length     // Catch: java.lang.Throwable -> L29
            r0 = 0
            if (r7 != 0) goto L61
            java.util.Collection r9 = (java.util.Collection) r9     // Catch: java.lang.Throwable -> L29
            boolean r6 = r9.isEmpty()     // Catch: java.lang.Throwable -> L29
            if (r6 != 0) goto L5f
            goto L76
        L5f:
            r2 = 0
            goto L76
        L61:
            int r7 = r6.length     // Catch: java.lang.Throwable -> L29
            r1 = 0
        L63:
            if (r1 >= r7) goto L5f
            r3 = r6[r1]     // Catch: java.lang.Throwable -> L29
            java.lang.Integer r4 = new java.lang.Integer     // Catch: java.lang.Throwable -> L29
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L29
            boolean r3 = r9.contains(r4)     // Catch: java.lang.Throwable -> L29
            if (r3 == 0) goto L73
            goto L76
        L73:
            int r1 = r1 + 1
            goto L63
        L76:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L29
            r8.b()
            return r6
        L7e:
            r8.b()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: n7.m0.e(java.lang.String[], ic.a, ic.a, ac.c):java.lang.Object");
    }

    public final void f(ic.a aVar, ic.a aVar2) {
        jc.l.e(aVar, "onRefreshScheduled");
        jc.l.e(aVar2, "onRefreshCompleted");
        if (this.f15551j.compareAndSet(false, true)) {
            aVar.b();
            hf.a0.y(this.f15542a.e(), new hf.x(), null, new w0(this, aVar2, null, 11), 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(ac.c r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof n7.k0
            if (r0 == 0) goto L13
            r0 = r7
            n7.k0 r0 = (n7.k0) r0
            int r1 = r0.f15528g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15528g = r1
            goto L18
        L13:
            n7.k0 r0 = new n7.k0
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f15526e
            int r1 = r0.f15528g
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            m0.w r0 = r0.f15525d
            ub.a.f(r7)     // Catch: java.lang.Throwable -> L27
            goto L54
        L27:
            r7 = move-exception
            goto L5a
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            ub.a.f(r7)
            com.cnl.kikoeru.data.db.AppDatabase_Impl r7 = r6.f15542a
            m0.w r1 = r7.f15581g
            boolean r3 = r1.t()
            if (r3 == 0) goto L5e
            n7.g0 r3 = new n7.g0     // Catch: java.lang.Throwable -> L58
            r4 = 0
            r5 = 2
            r3.<init>(r6, r4, r5)     // Catch: java.lang.Throwable -> L58
            r0.f15525d = r1     // Catch: java.lang.Throwable -> L58
            r0.f15528g = r2     // Catch: java.lang.Throwable -> L58
            r2 = 0
            java.lang.Object r7 = r7.n(r2, r3, r0)     // Catch: java.lang.Throwable -> L58
            zb.a r0 = zb.a.f26667a
            if (r7 != r0) goto L53
            return r0
        L53:
            r0 = r1
        L54:
            r0.L()
            goto L5e
        L58:
            r7 = move-exception
            r0 = r1
        L5a:
            r0.L()
            throw r7
        L5e:
            ub.a0 r7 = ub.a0.f21526a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: n7.m0.g(ac.c):java.lang.Object");
    }

    public final ub.k h(String[] strArr) {
        jc.l.e(strArr, "names");
        wb.g gVar = new wb.g();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            jc.l.d(lowerCase, "toLowerCase(...)");
            Set set = (Set) this.f15544c.get(lowerCase);
            if (set != null) {
                gVar.addAll(set);
            } else {
                gVar.add(str);
            }
        }
        String[] strArr2 = (String[]) ud.e.c(gVar).toArray(new String[0]);
        int length = strArr2.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str2 = strArr2[i10];
            String lowerCase2 = str2.toLowerCase(Locale.ROOT);
            jc.l.d(lowerCase2, "toLowerCase(...)");
            Integer num = (Integer) this.f15547f.get(lowerCase2);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name ".concat(str2));
            }
            iArr[i10] = num.intValue();
        }
        return new ub.k(strArr2, iArr);
    }
}
