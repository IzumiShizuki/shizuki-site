package j7;

import b0.c1;
import b5.d0;
import c7.e1;
import i7.h1;
import i7.i0;
import i7.l1;
import i7.p2;
import i7.q1;
import i7.q2;
import i7.r2;
import i7.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import jc.l;
import lf.b1;
import lf.k0;
import lf.o0;
import lf.p0;
import vb.m;
import yb.h;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f10579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c1 f10580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r2 f10581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h1 f10582d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e1 f10583e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CopyOnWriteArrayList f10584f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p2 f10585g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f10586h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile int f10587i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b1 f10588j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final k0 f10589k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final o0 f10590l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f10591m;

    public a(b bVar, h hVar, l1 l1Var) {
        h1 h1Var;
        i0 i0Var;
        this.f10591m = bVar;
        l.e(hVar, "mainContext");
        this.f10579a = hVar;
        this.f10581c = new q1();
        h1 h1Var2 = h1.f9146e;
        i0 i0Var2 = l1Var != null ? (i0) l1Var.f9196d.b() : null;
        if (i0Var2 != null) {
            h1Var = new h1(i0Var2);
        } else {
            h1Var = h1.f9146e;
            l.c(h1Var, "null cannot be cast to non-null type androidx.paging.PageStore<T of androidx.paging.PageStore.Companion.initial>");
        }
        this.f10582d = h1Var;
        e1 e1Var = new e1(17);
        if (l1Var != null && (i0Var = (i0) l1Var.f9196d.b()) != null) {
            e1Var.X(i0Var.f9162e, i0Var.f9163f);
        }
        this.f10583e = e1Var;
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f10584f = copyOnWriteArrayList;
        p2 p2Var = new p2();
        p2Var.f9258a = new d0(p2Var, true);
        this.f10585g = p2Var;
        this.f10588j = p0.c(Boolean.FALSE);
        this.f10589k = (k0) e1Var.f3620d;
        this.f10590l = p0.a(0, 64, kf.a.f11337b);
        copyOnWriteArrayList.add(new b0.d0(16, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(j7.a r6, java.util.List r7, int r8, int r9, boolean r10, i7.c0 r11, i7.c0 r12, b0.c1 r13, ac.c r14) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j7.a.a(j7.a, java.util.List, int, int, boolean, i7.c0, i7.c0, b0.c1, ac.c):java.lang.Object");
    }

    public final x b() {
        h1 h1Var = this.f10582d;
        int i10 = h1Var.f9149c;
        int i11 = h1Var.f9150d;
        ArrayList arrayList = h1Var.f9147a;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m.P(arrayList2, ((q2) it.next()).f9276b);
        }
        return new x(arrayList2, i10, i11);
    }
}
