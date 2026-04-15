package androidx.media3.exoplayer.offline;

import android.net.Uri;
import android.util.SparseArray;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import m4.d0;
import m4.e0;
import m4.i0;
import m4.l0;
import p4.c0;
import q.t0;
import ya.a1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SparseArray f889c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t4.e f890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f891b;

    static {
        SparseArray sparseArray = new SparseArray();
        try {
            sparseArray.put(0, b(a5.b.class));
        } catch (ClassNotFoundException unused) {
        }
        try {
            sparseArray.put(2, b(d5.a.class));
        } catch (ClassNotFoundException unused2) {
        }
        try {
            sparseArray.put(1, b(Class.forName("androidx.media3.exoplayer.smoothstreaming.offline.SsDownloader")));
        } catch (ClassNotFoundException unused3) {
        }
        f889c = sparseArray;
    }

    public c(t4.e eVar, Executor executor) {
        this.f890a = eVar;
        executor.getClass();
        this.f891b = executor;
    }

    public static Constructor b(Class cls) {
        try {
            return cls.asSubclass(s.class).getConstructor(i0.class, t4.e.class, Executor.class);
        } catch (NoSuchMethodException e10) {
            throw new IllegalStateException("Downloader constructor missing", e10);
        }
    }

    public final s a(o oVar) {
        Constructor constructor;
        m4.w wVar;
        m4.b0 b0Var;
        char c3;
        char c10;
        d0 d0Var;
        m4.b0 b0Var2;
        d0 d0Var2;
        Uri uri = oVar.f946b;
        int iG = c0.G(uri, oVar.f947c);
        Executor executor = this.f891b;
        t4.e eVar = this.f890a;
        if (iG != 0 && iG != 1 && iG != 2) {
            if (iG != 4) {
                throw new IllegalArgumentException(t0.B(iG, "Unsupported type: "));
            }
            m4.w wVar2 = new m4.w();
            m4.z zVar = new m4.z();
            List list = Collections.EMPTY_LIST;
            a1 a1Var = a1.f25946e;
            m4.b0 b0Var3 = new m4.b0();
            e0 e0Var = e0.f14187d;
            String str = oVar.f950f;
            p4.c.i(((Uri) zVar.f14645e) == null || ((UUID) zVar.f14644d) != null);
            if (uri != null) {
                b0Var2 = b0Var3;
                d0Var2 = new d0(uri, null, ((UUID) zVar.f14644d) != null ? new m4.a0(zVar) : null, null, list, str, a1Var, -9223372036854775807L);
            } else {
                b0Var2 = b0Var3;
                d0Var2 = null;
            }
            return new w(new i0("", new m4.y(wVar2), d0Var2, new m4.c0(b0Var2), l0.K, e0Var), eVar, executor);
        }
        Constructor constructor2 = (Constructor) f889c.get(iG);
        if (constructor2 == null) {
            throw new IllegalStateException(t0.B(iG, "Module missing for content type "));
        }
        m4.w wVar3 = new m4.w();
        m4.z zVar2 = new m4.z();
        List listUnmodifiableList = Collections.EMPTY_LIST;
        a1 a1Var2 = a1.f25946e;
        m4.b0 b0Var4 = new m4.b0();
        e0 e0Var2 = e0.f14187d;
        List list2 = oVar.f948d;
        if (list2 != null && !list2.isEmpty()) {
            listUnmodifiableList = Collections.unmodifiableList(new ArrayList(list2));
        }
        String str2 = oVar.f950f;
        p4.c.i(((Uri) zVar2.f14645e) == null || ((UUID) zVar2.f14644d) != null);
        if (uri != null) {
            constructor = constructor2;
            wVar = wVar3;
            b0Var = b0Var4;
            c3 = 2;
            c10 = 1;
            d0Var = new d0(uri, null, ((UUID) zVar2.f14644d) != null ? new m4.a0(zVar2) : null, null, listUnmodifiableList, str2, a1Var2, -9223372036854775807L);
        } else {
            constructor = constructor2;
            wVar = wVar3;
            b0Var = b0Var4;
            c3 = 2;
            c10 = 1;
            d0Var = null;
        }
        i0 i0Var = new i0("", new m4.y(wVar), d0Var, new m4.c0(b0Var), l0.K, e0Var2);
        try {
            Object[] objArr = new Object[3];
            objArr[0] = i0Var;
            objArr[c10] = eVar;
            objArr[c3] = executor;
            return (s) constructor.newInstance(objArr);
        } catch (Exception e10) {
            throw new IllegalStateException(t0.B(iG, "Failed to instantiate downloader for content type "), e10);
        }
    }
}
