package r8;

import android.graphics.Bitmap;
import ef.l;
import ef.n;
import hd.q0;
import lh.a0;
import lh.b0;
import ua.j;
import ub.i;
import ug.d0;
import ug.g;
import ug.r;
import ug.v;
import vb.w;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f18917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f18918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f18920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f18921e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r f18922f;

    public b(b0 b0Var) {
        final int i10 = 0;
        ic.a aVar = new ic.a(this) { // from class: r8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f18916b;

            {
                this.f18916b = this;
            }

            @Override // ic.a
            public final Object b() {
                int i11 = i10;
                b bVar = this.f18916b;
                switch (i11) {
                    case 0:
                        g gVar = g.f21779n;
                        return j.r(bVar.f18922f);
                    default:
                        String strA = bVar.f18922f.a("Content-Type");
                        if (strA == null) {
                            return null;
                        }
                        l lVar = v.f21877c;
                        return w.w(strA);
                }
            }
        };
        i iVar = i.f21541b;
        this.f18917a = ub.a.c(iVar, aVar);
        final char c3 = 1 == true ? 1 : 0;
        this.f18918b = ub.a.c(iVar, new ic.a(this) { // from class: r8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f18916b;

            {
                this.f18916b = this;
            }

            @Override // ic.a
            public final Object b() {
                int i11 = c3;
                b bVar = this.f18916b;
                switch (i11) {
                    case 0:
                        g gVar = g.f21779n;
                        return j.r(bVar.f18922f);
                    default:
                        String strA = bVar.f18922f.a("Content-Type");
                        if (strA == null) {
                            return null;
                        }
                        l lVar = v.f21877c;
                        return w.w(strA);
                }
            }
        });
        this.f18919c = Long.parseLong(b0Var.x(Long.MAX_VALUE));
        this.f18920d = Long.parseLong(b0Var.x(Long.MAX_VALUE));
        this.f18921e = Integer.parseInt(b0Var.x(Long.MAX_VALUE)) > 0;
        int i11 = Integer.parseInt(b0Var.x(Long.MAX_VALUE));
        q0 q0Var = new q0((byte) 0, 5);
        for (int i12 = 0; i12 < i11; i12++) {
            String strX = b0Var.x(Long.MAX_VALUE);
            Bitmap.Config[] configArr = x8.d.f24838a;
            int iV0 = n.v0(strX, ':', 0, 6);
            if (iV0 == -1) {
                throw new IllegalArgumentException("Unexpected header: ".concat(strX).toString());
            }
            String strSubstring = strX.substring(0, iV0);
            jc.l.d(strSubstring, "substring(...)");
            String string = n.X0(strSubstring).toString();
            String strSubstring2 = strX.substring(iV0 + 1);
            jc.l.d(strSubstring2, "substring(...)");
            q0Var.j(string, strSubstring2);
        }
        this.f18922f = q0Var.k();
    }

    public final void a(a0 a0Var) {
        a0Var.b0(this.f18919c);
        a0Var.writeByte(10);
        a0Var.b0(this.f18920d);
        a0Var.writeByte(10);
        a0Var.b0(this.f18921e ? 1L : 0L);
        a0Var.writeByte(10);
        r rVar = this.f18922f;
        a0Var.b0(rVar.size());
        a0Var.writeByte(10);
        int size = rVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            a0Var.E(rVar.i(i10));
            a0Var.E(": ");
            a0Var.E(rVar.k(i10));
            a0Var.writeByte(10);
        }
    }

    public b(d0 d0Var) {
        final int i10 = 0;
        ic.a aVar = new ic.a(this) { // from class: r8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f18916b;

            {
                this.f18916b = this;
            }

            @Override // ic.a
            public final Object b() {
                int i11 = i10;
                b bVar = this.f18916b;
                switch (i11) {
                    case 0:
                        g gVar = g.f21779n;
                        return j.r(bVar.f18922f);
                    default:
                        String strA = bVar.f18922f.a("Content-Type");
                        if (strA == null) {
                            return null;
                        }
                        l lVar = v.f21877c;
                        return w.w(strA);
                }
            }
        };
        i iVar = i.f21541b;
        this.f18917a = ub.a.c(iVar, aVar);
        final int i11 = 1;
        this.f18918b = ub.a.c(iVar, new ic.a(this) { // from class: r8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f18916b;

            {
                this.f18916b = this;
            }

            @Override // ic.a
            public final Object b() {
                int i112 = i11;
                b bVar = this.f18916b;
                switch (i112) {
                    case 0:
                        g gVar = g.f21779n;
                        return j.r(bVar.f18922f);
                    default:
                        String strA = bVar.f18922f.a("Content-Type");
                        if (strA == null) {
                            return null;
                        }
                        l lVar = v.f21877c;
                        return w.w(strA);
                }
            }
        });
        this.f18919c = d0Var.f21767l;
        this.f18920d = d0Var.f21768m;
        this.f18921e = d0Var.f21760e != null;
        this.f18922f = d0Var.f21761f;
    }
}
