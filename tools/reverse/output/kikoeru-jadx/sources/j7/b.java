package j7;

import ac.i;
import android.os.Build;
import android.util.Log;
import b0.c1;
import i7.c0;
import i7.e;
import i7.g;
import i7.h1;
import i7.l1;
import i7.x;
import j2.h0;
import j2.t0;
import jc.l;
import lf.b1;
import lf.f;
import lf.l0;
import vb.m;
import x0.e1;
import x0.v;
import yb.h;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f10592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f10593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e1 f10594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e1 f10595d;

    public b(f fVar) {
        l.e(fVar, "flow");
        this.f10592a = fVar;
        a aVar = new a(this, (h) t0.f9992m.getValue(), fVar instanceof l0 ? (l1) m.a0(((l0) fVar).a()) : null);
        this.f10593b = aVar;
        this.f10594c = v.v(aVar.b());
        i7.l lVar = (i7.l) aVar.f10589k.f12434a.getValue();
        if (lVar == null) {
            c0 c0Var = d.f10599a;
            lVar = new i7.l(c0Var.f9056a, c0Var.f9057b, c0Var.f9058c, c0Var, null);
        }
        this.f10595d = v.v(lVar);
    }

    public final Object a(i iVar) {
        this.f10593b.f10589k.b(new g(new e(6, this), 4), iVar);
        return zb.a.f26667a;
    }

    public final Object b(int i10) {
        Object value;
        Object value2;
        a aVar = this.f10593b;
        b1 b1Var = aVar.f10588j;
        do {
            value = b1Var.getValue();
            ((Boolean) value).getClass();
        } while (!b1Var.k(value, Boolean.TRUE));
        aVar.f10586h = true;
        aVar.f10587i = i10;
        if (Build.ID != null && Log.isLoggable("Paging", 2)) {
            String str = "Accessing item index[" + i10 + ']';
            l.e(str, "message");
            Log.v("Paging", str, null);
        }
        c1 c1Var = aVar.f10580b;
        if (c1Var != null) {
            c1Var.d(aVar.f10582d.a(i10));
        }
        h1 h1Var = aVar.f10582d;
        if (i10 < 0) {
            h1Var.getClass();
        } else if (i10 < h1Var.d()) {
            int i11 = i10 - h1Var.f9149c;
            if (i11 >= 0 && i11 < h1Var.f9148b) {
                h1Var.b(i11);
            }
            b1 b1Var2 = aVar.f10588j;
            do {
                value2 = b1Var2.getValue();
                ((Boolean) value2).getClass();
            } while (!b1Var2.k(value2, Boolean.FALSE));
            return ((x) this.f10594c.getValue()).get(i10);
        }
        StringBuilder sbO = h0.o(i10, "Index: ", ", Size: ");
        sbO.append(h1Var.d());
        throw new IndexOutOfBoundsException(sbO.toString());
    }

    public final int c() {
        return ((x) this.f10594c.getValue()).a();
    }

    public final void d() {
        a aVar = this.f10593b;
        aVar.getClass();
        if (Build.ID != null && Log.isLoggable("Paging", 3)) {
            Log.d("Paging", "Retry signal received", null);
        }
        aVar.f10581c.b();
    }
}
