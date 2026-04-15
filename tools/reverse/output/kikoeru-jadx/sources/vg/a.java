package vg;

import b0.w1;
import b7.b1;
import ef.l;
import ef.u;
import fh.e;
import h1.z;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CountDownLatch;
import lh.f;
import ug.d0;
import ug.f0;
import ug.p;
import ug.s;
import ug.t;
import ug.v;
import ug.x;
import ug.y;
import vb.m;
import vb.r;
import vb.w;
import zg.n;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final v f22963e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f22964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f22965d;

    static {
        l lVar = v.f21877c;
        f22963e = w.h("application/dns-message");
    }

    public a(x xVar, t tVar) {
        this.f22964c = xVar;
        this.f22965d = tVar;
    }

    public static ArrayList c(String str, d0 d0Var) {
        y yVar;
        if (d0Var.f21765j == null && (yVar = d0Var.f21757b) != y.f21937f && yVar != y.f21939h) {
            e eVar = e.f7102a;
            e.f7102a.j("Incorrect protocol: " + d0Var.f21757b, 5, null);
        }
        try {
            if (!d0Var.f21772q) {
                throw new IOException("response: " + d0Var.f21759d + ' ' + d0Var.f21758c);
            }
            f0 f0Var = d0Var.f21762g;
            if (f0Var.g() <= 65536) {
                ArrayList arrayListA = b.a(str, f0Var.k().N());
                d0Var.close();
                return arrayListA;
            }
            throw new IOException("response size exceeds limit (65536 bytes): " + f0Var.g() + " bytes");
        } finally {
        }
    }

    @Override // ug.p
    public final List a(String str) throws Exception {
        jc.l.e(str, "hostname");
        if (ih.a.f9526d.a(str) == null) {
            throw new UnknownHostException("private hosts not resolved");
        }
        wb.b bVarL = ud.b.l();
        b1 b1VarB = b(1, str);
        x xVar = this.f22964c;
        bVarL.add(xVar.a(b1VarB));
        bVarL.add(xVar.a(b(28, str)));
        wb.b bVarG = ud.b.g(bVarL);
        ArrayList arrayList = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList(5);
        CountDownLatch countDownLatch = new CountDownLatch(bVarG.a());
        Object it = bVarG.iterator();
        while (true) {
            z zVar = (z) it;
            if (!zVar.hasNext()) {
                break;
            }
            ((n) zVar.next()).e(new w1(arrayList, countDownLatch, this, str, arrayList2));
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e10) {
            arrayList.add(e10);
        }
        if (!arrayList2.isEmpty()) {
            return arrayList2;
        }
        if (arrayList.isEmpty()) {
            throw new UnknownHostException(str);
        }
        Exception exc = (Exception) arrayList.get(0);
        if (exc instanceof UnknownHostException) {
            throw exc;
        }
        UnknownHostException unknownHostException = new UnknownHostException(str);
        unknownHostException.initCause(exc);
        int size = arrayList.size();
        for (int i10 = 1; i10 < size; i10++) {
            ub.a.a(unknownHostException, (Throwable) arrayList.get(i10));
        }
        throw unknownHostException;
    }

    public final b1 b(int i10, String str) {
        List<String> listD0;
        ch.l lVar = new ch.l(10);
        lVar.w("Accept", f22963e.f21879a);
        int i11 = b.f22966a;
        jc.l.e(str, "host");
        f fVar = new f();
        fVar.i0(0);
        fVar.i0(256);
        fVar.i0(1);
        fVar.i0(0);
        fVar.i0(0);
        fVar.i0(0);
        f fVar2 = new f();
        List listL0 = ef.n.L0(str, new char[]{'.'});
        if (listL0.isEmpty()) {
            listD0 = r.f22819a;
        } else {
            ListIterator listIterator = listL0.listIterator(listL0.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    listD0 = m.D0(listL0, listIterator.nextIndex() + 1);
                    break;
                }
            }
            listD0 = r.f22819a;
        }
        for (String str2 : listD0) {
            long jV = lc.b.V(str2);
            if (jV != str2.length()) {
                throw new IllegalArgumentException("non-ascii hostname: ".concat(str).toString());
            }
            fVar2.e0((int) jV);
            fVar2.k0(str2);
        }
        fVar2.e0(0);
        fVar2.g(fVar, 0L, fVar2.f12571b);
        fVar.i0(i10);
        fVar.i0(1);
        String strH0 = u.h0(fVar.j(fVar.f12571b).a(), "=", "", false);
        s sVarG = this.f22965d.g();
        sVarG.a("dns", strH0);
        lVar.f4201b = sVarG.b();
        return new b1(lVar);
    }
}
