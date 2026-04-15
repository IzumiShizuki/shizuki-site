package m0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.media.MediaCodec;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsetsAnimation;
import com.tencent.bugly.beta.tinker.TinkerReport;
import com.tencent.bugly.crashreport.biz.UserInfoBean;
import com.tencent.bugly.proguard.P;
import com.tencent.bugly.proguard.X;
import com.tencent.bugly.proguard.qa;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w implements u.o0, z7.b, P, oe.a, oe.c, q8.h, s4.g, oe.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f13782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f13783c;

    public /* synthetic */ w(int i10, Object obj, Object obj2) {
        this.f13781a = i10;
        this.f13782b = obj;
        this.f13783c = obj2;
    }

    public static se.h0 u(List list) {
        return list.isEmpty() ? se.h0.f19951c : new se.h0(list);
    }

    public static s8.e x(s8.i iVar, Throwable th2) {
        Drawable drawableB;
        if (th2 instanceof s8.l) {
            Drawable drawable = iVar.D;
            s8.c cVar = iVar.F;
            Integer num = iVar.C;
            cVar.getClass();
            drawableB = x8.c.b(iVar, drawable, num);
            if (drawableB == null) {
                Drawable drawable2 = iVar.B;
                Integer num2 = iVar.A;
                cVar.getClass();
                drawableB = x8.c.b(iVar, drawable2, num2);
            }
        } else {
            Drawable drawable3 = iVar.B;
            Integer num3 = iVar.A;
            iVar.F.getClass();
            drawableB = x8.c.b(iVar, drawable3, num3);
        }
        return new s8.e(drawableB, iVar, th2);
    }

    public se.w0 A(qd.a aVar) {
        se.w0 w0VarT;
        se.a0 a0Var = aVar.f18143f;
        return (a0Var == null || (w0VarT = ud.e.T(a0Var)) == null) ? (ue.i) ((ub.p) this.f13782b).getValue() : w0VarT;
    }

    public se.w B(yc.q0 q0Var, qd.a aVar) {
        jc.l.e(q0Var, "typeParameter");
        jc.l.e(aVar, "typeAttr");
        return (se.w) ((re.e) this.f13783c).a(new se.m0(q0Var, aVar));
    }

    public r5.n C(Object... objArr) {
        Constructor constructorD;
        synchronized (((AtomicBoolean) this.f13783c)) {
            if (!((AtomicBoolean) this.f13783c).get()) {
                try {
                    constructorD = ((m4.d1) this.f13782b).d();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.f13783c).set(true);
                    constructorD = null;
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating extension", e10);
                }
            }
            constructorD = null;
        }
        if (constructorD == null) {
            return null;
        }
        try {
            return (r5.n) constructorD.newInstance(objArr);
        } catch (Exception e11) {
            throw new IllegalStateException("Unexpected error creating extractor", e11);
        }
    }

    public int D(String str) {
        int iIntValue;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f13782b;
        jc.l.e(concurrentHashMap, "<this>");
        Integer num = (Integer) concurrentHashMap.get(str);
        if (num != null) {
            return num.intValue();
        }
        synchronized (concurrentHashMap) {
            try {
                Integer num2 = (Integer) concurrentHashMap.get(str);
                if (num2 != null) {
                    iIntValue = num2.intValue();
                } else {
                    int andIncrement = ((AtomicInteger) this.f13783c).getAndIncrement();
                    concurrentHashMap.putIfAbsent(str, Integer.valueOf(andIncrement));
                    iIntValue = andIncrement;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iIntValue;
    }

    public synchronized Map E() {
        try {
            if (((Map) this.f13783c) == null) {
                this.f13783c = Collections.unmodifiableMap(new HashMap((HashMap) this.f13782b));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (Map) this.f13783c;
    }

    public zc.c F(wd.h hVar, yd.f fVar) {
        jc.l.e(hVar, "proto");
        jc.l.e(fVar, "nameResolver");
        return ((w) this.f13783c).v(hVar, fVar);
    }

    public void G() throws IOException {
        String str = (String) this.f13782b;
        if (((FileChannel) this.f13783c) != null) {
            return;
        }
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileChannel channel = new FileOutputStream(file).getChannel();
            this.f13783c = channel;
            if (channel != null) {
                channel.lock();
            }
        } catch (Throwable th2) {
            FileChannel fileChannel = (FileChannel) this.f13783c;
            if (fileChannel != null) {
                fileChannel.close();
            }
            this.f13783c = null;
            throw new IllegalStateException(q.t0.D("Unable to lock file: '", str, "'."), th2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public s8.m H(s8.i r17, t8.h r18) {
        /*
            r16 = this;
            r0 = r17
            r4 = r18
            java.util.List r1 = r0.f19619f
            android.graphics.Bitmap$Config r2 = r0.f19617d
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L1a
            android.graphics.Bitmap$Config[] r1 = x8.d.f24838a
            boolean r1 = vb.l.e0(r2, r1)
            if (r1 == 0) goto L17
            goto L1a
        L17:
            r1 = r16
            goto L3c
        L1a:
            boolean r1 = ud.n.t(r2)
            if (r1 != 0) goto L23
            r1 = r16
            goto L3e
        L23:
            boolean r1 = ud.n.t(r2)
            if (r1 != 0) goto L2c
        L29:
            r1 = r16
            goto L31
        L2c:
            boolean r1 = r0.f19624k
            if (r1 != 0) goto L29
            goto L17
        L31:
            java.lang.Object r3 = r1.f13783c
            x8.f r3 = (x8.f) r3
            boolean r3 = r3.a(r4)
            if (r3 == 0) goto L3c
            goto L3e
        L3c:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
        L3e:
            nh.a r3 = r4.f20563a
            t8.b r5 = t8.b.f20553q
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L55
            nh.a r3 = r4.f20564b
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L51
            goto L55
        L51:
            t8.g r3 = r0.f19636w
        L53:
            r5 = r3
            goto L58
        L55:
            t8.g r3 = t8.g.f20560b
            goto L53
        L58:
            boolean r3 = r0.f19625l
            if (r3 == 0) goto L6b
            java.util.List r3 = r0.f19619f
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L6b
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ALPHA_8
            if (r2 == r3) goto L6b
            r3 = 1
            r7 = 1
            goto L6d
        L6b:
            r3 = 0
            r7 = 0
        L6d:
            s8.m r3 = new s8.m
            android.content.Context r1 = r0.f19614a
            boolean r6 = x8.c.a(r0)
            boolean r8 = r0.f19626m
            ug.r r10 = r0.f19621h
            s8.p r11 = r0.f19622i
            s8.n r12 = r0.f19637x
            s8.b r13 = r0.f19627n
            s8.b r14 = r0.f19628o
            s8.b r15 = r0.f19629p
            r0 = r3
            r3 = 0
            r9 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.w.H(s8.i, t8.h):s8.m");
    }

    public ge.g I(se.w wVar, wd.e eVar, yd.f fVar) {
        jc.l.e(eVar, "value");
        jc.l.e(fVar, "nameResolver");
        boolean zBooleanValue = yd.d.P.d(eVar.f23644m).booleanValue();
        wd.d dVar = eVar.f23634c;
        switch (dVar == null ? -1 : oe.b.f16349a[dVar.ordinal()]) {
            case 1:
                byte b10 = (byte) eVar.f23635d;
                return zBooleanValue ? new ge.y(b10) : new ge.d(b10);
            case 2:
                return new ge.e(Character.valueOf((char) eVar.f23635d));
            case 3:
                short s10 = (short) eVar.f23635d;
                return zBooleanValue ? new ge.y(s10) : new ge.v(s10);
            case 4:
                int i10 = (int) eVar.f23635d;
                return zBooleanValue ? new ge.y(i10) : new ge.k(i10);
            case 5:
                long j10 = eVar.f23635d;
                return zBooleanValue ? new ge.y(j10) : new ge.t(j10);
            case 6:
                return new ge.c(eVar.f23636e);
            case 7:
                return new ge.c(eVar.f23637f);
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                return new ge.c(Boolean.valueOf(eVar.f23635d != 0));
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                return new ge.w(fVar.getString(eVar.f23638g));
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                return new ge.s(u3.x0.m(fVar, eVar.f23639h), eVar.f23643l);
            case 11:
                return new ge.i(u3.x0.m(fVar, eVar.f23639h), u3.x0.r(fVar, eVar.f23640i));
            case 12:
                wd.h hVar = eVar.f23641j;
                jc.l.d(hVar, "getAnnotation(...)");
                return new ge.a((Object) v(hVar, fVar));
            case 13:
                List list = eVar.f23642k;
                jc.l.d(list, "getArrayElementList(...)");
                List<wd.e> list2 = list;
                ArrayList arrayList = new ArrayList(vb.n.K(list2, 10));
                for (wd.e eVar2 : list2) {
                    se.a0 a0VarE = ((yc.y) this.f13782b).g().e();
                    jc.l.b(eVar2);
                    arrayList.add(I(a0VarE, eVar2, fVar));
                }
                return new ge.x(arrayList, wVar);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + eVar.f23634c + " (expected " + wVar + ')').toString());
        }
    }

    public p4.a J() throws IOException {
        File file = (File) this.f13783c;
        File file2 = (File) this.f13782b;
        if (file2.exists()) {
            if (file.exists()) {
                file2.delete();
            } else if (!file2.renameTo(file)) {
                p4.c.B("AtomicFile", "Couldn't rename file " + file2 + " to backup file " + file);
            }
        }
        try {
            return new p4.a(file2);
        } catch (FileNotFoundException e10) {
            File parentFile = file2.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create " + file2, e10);
            }
            try {
                return new p4.a(file2);
            } catch (FileNotFoundException e11) {
                throw new IOException("Couldn't create " + file2, e11);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public wb.g K(se.r0 r17, java.util.List r18, qd.a r19) {
        /*
            Method dump skipped, instruction units count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.w.K(se.r0, java.util.List, qd.a):wb.g");
    }

    public void L() {
        synchronized (this) {
            ((AtomicInteger) this.f13782b).decrementAndGet();
            if (((AtomicInteger) this.f13782b).get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public s8.m M(s8.m r23) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            android.graphics.Bitmap$Config r2 = r0.f19642b
            s8.b r3 = r0.f19655o
            boolean r4 = ud.n.t(r2)
            r5 = 1
            if (r4 == 0) goto L1f
            java.lang.Object r4 = r1.f13783c
            x8.f r4 = (x8.f) r4
            boolean r4 = r4.b()
            if (r4 == 0) goto L1a
            goto L1f
        L1a:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            r4 = 1
        L1d:
            r8 = r2
            goto L21
        L1f:
            r4 = 0
            goto L1d
        L21:
            s8.b r2 = r0.f19655o
            boolean r2 = r2.f19565a
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r1.f13782b
            x8.i r2 = (x8.i) r2
            monitor-enter(r2)
            r2.a()     // Catch: java.lang.Throwable -> L39
            boolean r6 = r2.f24857e     // Catch: java.lang.Throwable -> L39
            monitor-exit(r2)
            if (r6 != 0) goto L3c
            s8.b r3 = s8.b.DISABLED
        L36:
            r21 = r3
            goto L3e
        L39:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L39
            throw r0
        L3c:
            r5 = r4
            goto L36
        L3e:
            if (r5 == 0) goto L6a
            android.content.Context r7 = r0.f19641a
            android.graphics.ColorSpace r9 = r0.f19643c
            t8.h r10 = r0.f19644d
            t8.g r11 = r0.f19645e
            boolean r12 = r0.f19646f
            boolean r13 = r0.f19647g
            boolean r14 = r0.f19648h
            java.lang.String r15 = r0.f19649i
            ug.r r2 = r0.f19650j
            s8.p r3 = r0.f19651k
            s8.n r4 = r0.f19652l
            s8.b r5 = r0.f19653m
            s8.b r0 = r0.f19654n
            s8.m r6 = new s8.m
            r20 = r0
            r16 = r2
            r17 = r3
            r18 = r4
            r19 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r6
        L6a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.w.M(s8.m):s8.m");
    }

    public b0.w1 N(be.e eVar, String str) {
        jc.l.e(eVar, "name");
        String strB = eVar.b();
        jc.l.d(strB, "asString(...)");
        return new b0.w1(this, new ud.t(strB.concat(str)));
    }

    @Override // com.tencent.bugly.proguard.P
    public void a(int i10) {
    }

    @Override // q8.h
    public void b(int i10) {
        int i11;
        if (i10 >= 40) {
            ((q8.f) this.f13783c).g(-1);
            return;
        }
        if (10 > i10 || i10 >= 20) {
            return;
        }
        q8.f fVar = (q8.f) this.f13783c;
        synchronized (fVar.f16047c) {
            i11 = fVar.f16048d;
        }
        fVar.g(i11 / 2);
    }

    @Override // oe.c
    public ArrayList c(wd.y0 y0Var, yd.f fVar) {
        jc.l.e(y0Var, "proto");
        jc.l.e(fVar, "nameResolver");
        Iterable iterable = (List) y0Var.k(((ne.a) this.f13782b).f15812l);
        if (iterable == null) {
            iterable = vb.r.f22819a;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(vb.n.K(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(F((wd.h) it.next(), fVar));
        }
        return arrayList;
    }

    @Override // u.o0
    public Object d(s.v0 v0Var, ic.n nVar, yb.c cVar) {
        Object objB = ((x) this.f13783c).b(v0Var, new i7.j(this, nVar, null), cVar);
        return objB == zb.a.f26667a ? objB : ub.a0.f21526a;
    }

    @Override // oe.c
    public List e(oe.w wVar, wd.w wVar2) {
        jc.l.e(wVar, "container");
        Iterable iterable = (List) wVar2.k(((ne.a) this.f13782b).f15808h);
        if (iterable == null) {
            iterable = vb.r.f22819a;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(vb.n.K(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(F((wd.h) it.next(), wVar.f16431a));
        }
        return arrayList;
    }

    @Override // oe.a
    public Object f(oe.w wVar, wd.j0 j0Var, se.w wVar2) {
        jc.l.e(j0Var, "proto");
        return null;
    }

    @Override // oe.c
    public List g(oe.w wVar, ce.b bVar, int i10, int i11, wd.b1 b1Var) {
        jc.l.e(bVar, "callableProto");
        j2.h0.q(i10, "kind");
        List listH = b1Var != null ? h(wVar, bVar, i10, i11, b1Var) : null;
        return listH == null ? vb.r.f22819a : listH;
    }

    @Override // oe.c
    public List h(oe.w wVar, ce.b bVar, int i10, int i11, wd.b1 b1Var) {
        jc.l.e(bVar, "callableProto");
        j2.h0.q(i10, "kind");
        jc.l.e(b1Var, "proto");
        Iterable iterable = (List) b1Var.k(((ne.a) this.f13782b).f15810j);
        if (iterable == null) {
            iterable = vb.r.f22819a;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(vb.n.K(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(F((wd.h) it.next(), wVar.f16431a));
        }
        return arrayList;
    }

    @Override // oe.a
    public Object i(oe.w wVar, wd.j0 j0Var, se.w wVar2) {
        jc.l.e(j0Var, "proto");
        wd.e eVar = (wd.e) vb.w.m(j0Var, ((ne.a) this.f13782b).f15809i);
        if (eVar == null) {
            return null;
        }
        return ((w) this.f13783c).I(wVar2, eVar, wVar.f16431a);
    }

    @Override // oe.c
    public List j(oe.w wVar, wd.j0 j0Var) {
        jc.l.e(j0Var, "proto");
        ((ne.a) this.f13782b).getClass();
        vb.r rVar = vb.r.f22819a;
        ArrayList arrayList = new ArrayList(vb.n.K(rVar, 10));
        Iterator<E> it = rVar.iterator();
        while (it.hasNext()) {
            arrayList.add(F((wd.h) it.next(), wVar.f16431a));
        }
        return arrayList;
    }

    @Override // oe.c
    public ArrayList k(oe.u uVar) {
        jc.l.e(uVar, "container");
        Iterable iterable = (List) uVar.f16425d.k(((ne.a) this.f13782b).f15803c);
        if (iterable == null) {
            iterable = vb.r.f22819a;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(vb.n.K(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(F((wd.h) it.next(), uVar.f16431a));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004e A[Catch: all -> 0x00a0, TRY_LEAVE, TryCatch #2 {all -> 0x00a0, blocks: (B:20:0x004a, B:22:0x004e, B:25:0x005f, B:29:0x0066, B:31:0x006e, B:33:0x0079, B:32:0x0074, B:27:0x0063, B:28:0x0065, B:45:0x0098, B:46:0x009f, B:24:0x005a), top: B:71:0x004a, outer: #4, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0098 A[Catch: all -> 0x00a0, TRY_ENTER, TryCatch #2 {all -> 0x00a0, blocks: (B:20:0x004a, B:22:0x004e, B:25:0x005f, B:29:0x0066, B:31:0x006e, B:33:0x0079, B:32:0x0074, B:27:0x0063, B:28:0x0065, B:45:0x0098, B:46:0x009f, B:24:0x005a), top: B:71:0x004a, outer: #4, inners: #3 }] */
    @Override // z7.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public z7.a l(java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.w.l(java.lang.String):z7.a");
    }

    @Override // oe.c
    public List m(oe.w wVar, wd.j0 j0Var) {
        jc.l.e(j0Var, "proto");
        ((ne.a) this.f13782b).getClass();
        vb.r rVar = vb.r.f22819a;
        ArrayList arrayList = new ArrayList(vb.n.K(rVar, 10));
        Iterator<E> it = rVar.iterator();
        while (it.hasNext()) {
            arrayList.add(F((wd.h) it.next(), wVar.f16431a));
        }
        return arrayList;
    }

    @Override // q8.h
    public void n(q8.b bVar, Bitmap bitmap, Map map) {
        int i10;
        int iJ = ud.n.j(bitmap);
        q8.f fVar = (q8.f) this.f13783c;
        synchronized (fVar.f16047c) {
            i10 = fVar.f16045a;
        }
        if (iJ <= i10) {
            ((q8.f) this.f13783c).c(bVar, new q8.e(bitmap, map, iJ));
        } else {
            ((q8.f) this.f13783c).d(bVar);
            ((q8.i) this.f13782b).c(bVar, bitmap, map, iJ);
        }
    }

    @Override // oe.c
    public List o(oe.w wVar, ce.b bVar, int i10) {
        List list;
        ne.a aVar = (ne.a) this.f13782b;
        jc.l.e(bVar, "proto");
        j2.h0.q(i10, "kind");
        if (bVar instanceof wd.n) {
            list = (List) ((wd.n) bVar).k(aVar.f15802b);
        } else if (bVar instanceof wd.b0) {
            list = (List) ((wd.b0) bVar).k(aVar.f15804d);
        } else {
            if (!(bVar instanceof wd.j0)) {
                throw new IllegalStateException(("Unknown message: " + bVar).toString());
            }
            int iB = w0.c.b(i10);
            if (iB == 1) {
                list = (List) ((wd.j0) bVar).k(aVar.f15805e);
            } else if (iB == 2) {
                list = (List) ((wd.j0) bVar).k(aVar.f15806f);
            } else {
                if (iB != 3) {
                    throw new IllegalStateException("Unsupported callable kind with property proto");
                }
                list = (List) ((wd.j0) bVar).k(aVar.f15807g);
            }
        }
        if (list == null) {
            list = vb.r.f22819a;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(vb.n.K(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(F((wd.h) it.next(), wVar.f16431a));
        }
        return arrayList;
    }

    @Override // oe.e
    public oe.d p(be.b bVar) {
        jc.l.e(bVar, "classId");
        dd.b bVar2 = (dd.b) this.f13782b;
        ud.g gVar = (ud.g) this.f13783c;
        gVar.c().f16366c.getClass();
        dd.c cVarI = ud.n.i(bVar2, bVar, yd.e.f26197g);
        if (cVarI == null) {
            return null;
        }
        ed.d.a(cVarI.f5866a).equals(bVar);
        return gVar.g(cVarI);
    }

    @Override // s4.g
    public s4.h q() {
        return new s4.n((Context) this.f13782b, ((s4.o) this.f13783c).q());
    }

    @Override // oe.c
    public ArrayList r(wd.t0 t0Var, yd.f fVar) {
        jc.l.e(t0Var, "proto");
        jc.l.e(fVar, "nameResolver");
        Iterable iterable = (List) t0Var.k(((ne.a) this.f13782b).f15811k);
        if (iterable == null) {
            iterable = vb.r.f22819a;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(vb.n.K(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(F((wd.h) it.next(), fVar));
        }
        return arrayList;
    }

    @Override // oe.c
    public List s(oe.w wVar, ce.b bVar, int i10) {
        ne.a aVar = (ne.a) this.f13782b;
        jc.l.e(bVar, "proto");
        j2.h0.q(i10, "kind");
        if (bVar instanceof wd.b0) {
            aVar.getClass();
        } else {
            if (!(bVar instanceof wd.j0)) {
                throw new IllegalStateException(("Unknown message: " + bVar).toString());
            }
            int iB = w0.c.b(i10);
            if (iB != 1 && iB != 2 && iB != 3) {
                throw new IllegalStateException("Unsupported callable kind with property proto for receiver annotations: ".concat(i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "null" : "PROPERTY_SETTER" : "PROPERTY_GETTER" : "PROPERTY" : "FUNCTION").toString());
            }
            aVar.getClass();
        }
        vb.r rVar = vb.r.f22819a;
        ArrayList arrayList = new ArrayList(vb.n.K(rVar, 10));
        Iterator<E> it = rVar.iterator();
        while (it.hasNext()) {
            arrayList.add(F((wd.h) it.next(), wVar.f16431a));
        }
        return arrayList;
    }

    public boolean t() {
        synchronized (this) {
            if (((AtomicBoolean) this.f13783c).get()) {
                return false;
            }
            ((AtomicInteger) this.f13782b).incrementAndGet();
            return true;
        }
    }

    public String toString() {
        switch (this.f13781a) {
            case 25:
                return "Bounds{lower=" + ((p3.b) this.f13782b) + " upper=" + ((p3.b) this.f13783c) + "}";
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zc.c v(wd.h r11, yd.f r12) {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.w.v(wd.h, yd.f):zc.c");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean w(ge.g gVar, se.w wVar, wd.e eVar) {
        yc.y yVar = (yc.y) this.f13782b;
        wd.d dVar = eVar.f23634c;
        int i10 = dVar == null ? -1 : oe.b.f16349a[dVar.ordinal()];
        if (i10 == 10) {
            yc.h hVarH = wVar.t().h();
            yc.e eVar2 = hVarH instanceof yc.e ? (yc.e) hVarH : null;
            if (eVar2 == null) {
                return true;
            }
            be.e eVar3 = vc.i.f22839e;
            return vc.i.b(eVar2, vc.n.Q);
        }
        if (i10 != 13) {
            return jc.l.a(gVar.a(yVar), wVar);
        }
        if (gVar instanceof ge.b) {
            Object obj = ((ge.b) gVar).f7527a;
            if (((List) obj).size() == eVar.f23642k.size()) {
                se.w wVarG = yVar.g().g(wVar);
                if (wVarG == null) {
                    return false;
                }
                oc.d dVarQ = ud.b.q((Collection) obj);
                if ((dVarQ instanceof Collection) && ((Collection) dVarQ).isEmpty()) {
                    return true;
                }
                oc.c cVarA = dVarQ.iterator();
                while (cVarA.f16312c) {
                    int iNextInt = cVarA.nextInt();
                    ge.g gVar2 = (ge.g) ((List) obj).get(iNextInt);
                    wd.e eVar4 = (wd.e) eVar.f23642k.get(iNextInt);
                    jc.l.d(eVar4, "getArrayElement(...)");
                    if (!w(gVar2, wVarG, eVar4)) {
                        return false;
                    }
                }
                return true;
            }
        }
        throw new IllegalStateException(("Deserialized ArrayValue should have the same number of elements as the original array value: " + gVar).toString());
    }

    public View y(int i10, int i11, int i12, int i13) {
        int iS;
        int i14;
        int iT;
        View viewO;
        int left;
        int i15;
        int right;
        int i16;
        m7.l0 l0Var = (m7.l0) this.f13783c;
        m7.r rVar = (m7.r) this.f13782b;
        switch (rVar.f14922a) {
            case 0:
                iS = rVar.f14923b.s();
                break;
            default:
                iS = rVar.f14923b.u();
                break;
        }
        switch (rVar.f14922a) {
            case 0:
                m7.s sVar = rVar.f14923b;
                i14 = sVar.f14929f;
                iT = sVar.t();
                break;
            default:
                m7.s sVar2 = rVar.f14923b;
                i14 = sVar2.f14930g;
                iT = sVar2.r();
                break;
        }
        int i17 = i14 - iT;
        int i18 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            switch (rVar.f14922a) {
                case 0:
                    viewO = rVar.f14923b.o(i10);
                    break;
                default:
                    viewO = rVar.f14923b.o(i10);
                    break;
            }
            switch (rVar.f14922a) {
                case 0:
                    m7.t tVar = (m7.t) viewO.getLayoutParams();
                    left = viewO.getLeft() - ((m7.t) viewO.getLayoutParams()).f14931a.left;
                    i15 = ((ViewGroup.MarginLayoutParams) tVar).leftMargin;
                    break;
                default:
                    m7.t tVar2 = (m7.t) viewO.getLayoutParams();
                    left = viewO.getTop() - ((m7.t) viewO.getLayoutParams()).f14931a.top;
                    i15 = ((ViewGroup.MarginLayoutParams) tVar2).topMargin;
                    break;
            }
            int i19 = left - i15;
            switch (rVar.f14922a) {
                case 0:
                    m7.t tVar3 = (m7.t) viewO.getLayoutParams();
                    right = viewO.getRight() + ((m7.t) viewO.getLayoutParams()).f14931a.right;
                    i16 = ((ViewGroup.MarginLayoutParams) tVar3).rightMargin;
                    break;
                default:
                    m7.t tVar4 = (m7.t) viewO.getLayoutParams();
                    right = viewO.getBottom() + ((m7.t) viewO.getLayoutParams()).f14931a.bottom;
                    i16 = ((ViewGroup.MarginLayoutParams) tVar4).bottomMargin;
                    break;
            }
            int i20 = right + i16;
            l0Var.f14913b = iS;
            l0Var.f14914c = i17;
            l0Var.f14915d = i19;
            l0Var.f14916e = i20;
            if (i12 != 0) {
                l0Var.f14912a = i12;
                if (l0Var.a()) {
                    return viewO;
                }
            }
            if (i13 != 0) {
                l0Var.f14912a = i13;
                if (l0Var.a()) {
                    view = viewO;
                }
            }
            i10 += i18;
        }
        return view;
    }

    public void z(String str, String str2, ic.k kVar) {
        LinkedHashMap linkedHashMap = ((i4.d) this.f13783c).f9004a;
        td.o oVar = new td.o(this, str, str2);
        kVar.a(oVar);
        String str3 = (String) this.f13782b;
        ArrayList arrayList = oVar.f20707b;
        ArrayList arrayList2 = new ArrayList(vb.n.K(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((String) ((ub.k) it.next()).f21543a);
        }
        String strG = (String) oVar.f20708c.f21543a;
        jc.l.e(strG, "ret");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('(');
        sb.append(vb.m.f0(arrayList2, "", null, null, ud.u.f21603a, 30));
        sb.append(')');
        if (strG.length() > 1) {
            strG = a0.c.G(';', "L", strG);
        }
        sb.append(strG);
        String string = sb.toString();
        jc.l.e(str3, "internalName");
        jc.l.e(string, "jvmDescriptor");
        String str4 = str3 + '.' + string;
        td.r rVar = (td.r) oVar.f20708c.f21544b;
        ArrayList arrayList3 = new ArrayList(vb.n.K(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add((td.r) ((ub.k) it2.next()).f21544b);
        }
        linkedHashMap.put(str4, new td.m(rVar, arrayList3, oVar.f20706a));
    }

    public /* synthetic */ w(Object obj, Serializable serializable, Object obj2, int i10) {
        this.f13781a = i10;
        this.f13782b = obj;
        this.f13783c = serializable;
    }

    @Override // com.tencent.bugly.proguard.P
    public void a(int i10, qa qaVar, long j10, long j11, boolean z10, String str) {
        if (z10) {
            X.a("[UserInfo] Successfully uploaded user info.", new Object[0]);
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (UserInfoBean userInfoBean : (List) this.f13782b) {
                userInfoBean.f4526f = jCurrentTimeMillis;
                ((com.tencent.bugly.crashreport.biz.c) this.f13783c).a(userInfoBean, true);
            }
        }
    }

    public w(com.tencent.bugly.crashreport.biz.c cVar, List list) {
        this.f13781a = 6;
        this.f13783c = cVar;
        this.f13782b = list;
    }

    public w(yc.y yVar, b0.w1 w1Var, ne.a aVar) {
        this.f13781a = 7;
        jc.l.e(yVar, "module");
        jc.l.e(aVar, "protocol");
        this.f13782b = aVar;
        this.f13783c = new w(yVar, w1Var);
    }

    public w(qd.e eVar) {
        this.f13781a = 21;
        re.l lVar = new re.l("Type parameter upper bound erasure results");
        this.f13782b = ub.a.d(new bd.e(26, this));
        this.f13783c = lVar.b(new bd.a(24, this));
    }

    @Override // q8.h
    public q8.c a(q8.b bVar) {
        q8.e eVar = (q8.e) ((q8.f) this.f13783c).b(bVar);
        if (eVar != null) {
            return new q8.c(eVar.f17920a, eVar.f17921b);
        }
        return null;
    }

    public w(h8.h hVar, x8.i iVar) {
        Object fVar;
        this.f13781a = 18;
        this.f13782b = iVar;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            boolean z10 = x8.a.f24832a;
        } else {
            if (!x8.a.f24832a) {
                if (i10 != 26 && i10 != 27) {
                    fVar = new p4.f(true);
                } else {
                    fVar = new x8.h();
                }
            }
            this.f13783c = fVar;
        }
        fVar = new p4.f(false);
        this.f13783c = fVar;
    }

    public w(Object obj) {
        this.f13781a = 15;
        this.f13782b = obj;
        this.f13783c = Thread.currentThread();
    }

    public w(String str) {
        this.f13781a = 5;
        this.f13782b = str.concat(".lck");
    }

    public w(yc.y yVar, b0.w1 w1Var) {
        this.f13781a = 8;
        jc.l.e(yVar, "module");
        jc.l.e(w1Var, "notFoundClasses");
        this.f13782b = yVar;
        this.f13783c = w1Var;
    }

    public w(d.i0 i0Var) {
        this.f13781a = 4;
        this.f13782b = new AtomicInteger(0);
        this.f13783c = new AtomicBoolean(false);
    }

    public w(File file) {
        this.f13781a = 9;
        this.f13782b = file;
        this.f13783c = new File(file.getPath() + ".bak");
    }

    public w(n7.t tVar, z7.b bVar) {
        this.f13781a = 3;
        jc.l.e(bVar, "actual");
        this.f13783c = tVar;
        this.f13782b = bVar;
    }

    public w(int i10, q8.i iVar) {
        this.f13781a = 11;
        this.f13782b = iVar;
        this.f13783c = new q8.f(i10, this);
    }

    public w(Context context) {
        this.f13781a = 16;
        s4.o oVar = new s4.o();
        this.f13782b = context.getApplicationContext();
        this.f13783c = oVar;
    }

    public w(m7.r rVar) {
        this.f13781a = 2;
        this.f13782b = rVar;
        m7.l0 l0Var = new m7.l0();
        l0Var.f14912a = 0;
        this.f13783c = l0Var;
    }

    public w(int i10) {
        this.f13781a = i10;
        switch (i10) {
            case 17:
                this.f13782b = new HashMap();
                break;
            case 20:
                this.f13782b = new ConcurrentHashMap();
                this.f13783c = new AtomicInteger(0);
                break;
            case 23:
                this.f13782b = new d2.d(0);
                this.f13783c = new d2.d(0);
                break;
            case 24:
                this.f13782b = new LinkedHashMap();
                this.f13783c = new LinkedHashMap();
                break;
        }
    }

    public w(MediaCodec.CryptoInfo cryptoInfo) {
        this.f13781a = 26;
        this.f13782b = cryptoInfo;
        this.f13783c = p4.z.b();
    }

    public w(kf.f fVar, kf.b bVar) {
        this.f13781a = 12;
        kf.d dVar = kf.d.f11343i;
        kf.e eVar = kf.e.f11344i;
        this.f13782b = fVar;
        this.f13783c = bVar;
    }

    public w(WindowInsetsAnimation.Bounds bounds) {
        this.f13781a = 25;
        this.f13782b = p3.b.c(bounds.getLowerBound());
        this.f13783c = p3.b.c(bounds.getUpperBound());
    }

    public w(x xVar) {
        this.f13781a = 0;
        this.f13783c = xVar;
        this.f13782b = new v(0, xVar);
    }

    public w(p5.c cVar) {
        this.f13781a = 10;
        this.f13783c = cVar;
    }

    public w(i4.d dVar, String str) {
        this.f13781a = 22;
        jc.l.e(str, "className");
        this.f13783c = dVar;
        this.f13782b = str;
    }

    public w(m4.d1 d1Var) {
        this.f13781a = 13;
        this.f13782b = d1Var;
        this.f13783c = new AtomicBoolean(false);
    }
}
