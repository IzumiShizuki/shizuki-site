package j0;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import b0.d0;
import h0.u0;
import i7.p2;
import j2.z2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import l0.l1;
import t2.k0;
import y2.y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f9635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f9636b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public u0 f9639e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public l1 f9640f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public z2 f9641g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Rect f9646l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final n f9647m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public jc.m f9637c = a.f9582d;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ic.k f9638d = a.f9583e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public y f9642h = new y(k0.f20356b, "", 4);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public y2.j f9643i = y2.j.f25409g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f9644j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f9645k = ub.a.c(ub.i.f21541b, new d0(18, this));

    public q(View view, b bVar, l lVar) {
        this.f9635a = view;
        this.f9636b = lVar;
        this.f9647m = new n(bVar, lVar);
    }

    public final r a(EditorInfo editorInfo) {
        int i10;
        int i11;
        y yVar = this.f9642h;
        String str = yVar.f25434a.f20320b;
        long j10 = yVar.f25435b;
        y2.j jVar = this.f9643i;
        int i12 = jVar.f25414e;
        int i13 = jVar.f25413d;
        boolean z10 = jVar.f25410a;
        if (i12 == 1) {
            i10 = z10 ? 6 : 0;
        } else if (i12 == 0) {
            i10 = 1;
        } else if (i12 == 2) {
            i10 = 2;
        } else if (i12 == 6) {
            i10 = 5;
        } else if (i12 == 5) {
            i10 = 7;
        } else if (i12 == 3) {
            i10 = 3;
        } else if (i12 == 4) {
            i10 = 4;
        } else {
            if (i12 != 7) {
                throw new IllegalStateException("invalid ImeAction");
            }
        }
        editorInfo.imeOptions = i10;
        if (Build.VERSION.SDK_INT >= 24) {
            a3.c cVar = jVar.f25415f;
            if (jc.l.a(cVar, a3.c.f195c)) {
                editorInfo.hintLocales = null;
            } else {
                ArrayList arrayList = new ArrayList(vb.n.K(cVar, 10));
                Iterator it = cVar.f196a.iterator();
                while (it.hasNext()) {
                    arrayList.add(((a3.b) it.next()).f194a);
                }
                Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
                editorInfo.hintLocales = a3.a.e((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
            }
        }
        if (i13 == 1) {
            i11 = 1;
        } else if (i13 == 2) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i11 = 1;
        } else if (i13 == 3) {
            i11 = 2;
        } else if (i13 == 4) {
            i11 = 3;
        } else if (i13 == 5) {
            i11 = 17;
        } else if (i13 == 6) {
            i11 = 33;
        } else if (i13 == 7) {
            i11 = 129;
        } else if (i13 == 8) {
            i11 = 18;
        } else {
            if (i13 != 9) {
                throw new IllegalStateException("Invalid Keyboard Type");
            }
            i11 = 8194;
        }
        editorInfo.inputType = i11;
        if (!z10 && (i11 & 1) == 1) {
            editorInfo.inputType = 131072 | i11;
            if (jVar.f25414e == 1) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        int i14 = editorInfo.inputType;
        if ((i14 & 1) == 1) {
            int i15 = jVar.f25411b;
            if (i15 == 1) {
                editorInfo.inputType = i14 | 4096;
            } else if (i15 == 2) {
                editorInfo.inputType = i14 | 8192;
            } else if (i15 == 3) {
                editorInfo.inputType = i14 | 16384;
            }
            if (jVar.f25412c) {
                editorInfo.inputType |= 32768;
            }
        }
        int i16 = k0.f20357c;
        editorInfo.initialSelStart = (int) (j10 >> 32);
        editorInfo.initialSelEnd = (int) (j10 & 4294967295L);
        ud.e.W(editorInfo, str);
        editorInfo.imeOptions |= 33554432;
        if (!i0.b.f8635a || i13 == 7 || i13 == 8) {
            ud.e.Y(editorInfo, false);
        } else {
            ud.e.Y(editorInfo, true);
            editorInfo.setSupportedHandwritingGestures(ud.b.x(g.o(), g.z(), g.v(), g.x(), g.B(), g.C(), g.D()));
            editorInfo.setSupportedHandwritingGesturePreviews(vb.l.N0(new Class[]{g.o(), g.z(), g.v(), g.x()}));
        }
        o oVar = p.f9634a;
        if (c4.k.d()) {
            c4.k.a().g(editorInfo);
        }
        r rVar = new r(this.f9642h, new p2(this), this.f9643i.f25412c, this.f9639e, this.f9640f, this.f9641g);
        this.f9644j.add(new WeakReference(rVar));
        return rVar;
    }
}
