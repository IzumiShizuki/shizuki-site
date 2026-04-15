package p4;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import b7.m2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import q1.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static p f16598e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f16600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f16601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f16602d;

    public p(e7.j jVar, int i10) {
        this.f16600b = jVar.f6338f;
        this.f16599a = i10;
        h7.c cVar = jVar.f6340h;
        this.f16601c = cVar.a();
        Bundle bundleC = n7.d.c((ub.k[]) Arrays.copyOf(new ub.k[0], 0));
        this.f16602d = bundleC;
        cVar.f8141h.x(bundleC);
    }

    public static void a(int i10, p pVar) {
        synchronized (pVar.f16602d) {
            try {
                if (pVar.f16599a == i10) {
                    return;
                }
                pVar.f16599a = i10;
                for (WeakReference weakReference : (CopyOnWriteArrayList) pVar.f16601c) {
                    n5.g gVar = (n5.g) weakReference.get();
                    if (gVar != null) {
                        gVar.a(i10);
                    } else {
                        ((CopyOnWriteArrayList) pVar.f16601c).remove(weakReference);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static synchronized p b(Context context) {
        try {
            if (f16598e == null) {
                f16598e = new p(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f16598e;
    }

    public int c() {
        int i10;
        synchronized (this.f16602d) {
            i10 = this.f16599a;
        }
        return i10;
    }

    public int d() {
        int i10 = this.f16599a;
        if (i10 != 2) {
            return i10 != 3 ? 0 : 512;
        }
        return 2048;
    }

    public int e() {
        Paint.Cap strokeCap = ((Paint) this.f16600b).getStrokeCap();
        int i10 = strokeCap == null ? -1 : q1.g.f17509a[strokeCap.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0 : 2;
        }
        return 1;
    }

    public int f() {
        Paint.Join strokeJoin = ((Paint) this.f16600b).getStrokeJoin();
        int i10 = strokeJoin == null ? -1 : q1.g.f17510b[strokeJoin.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0 : 1;
        }
        return 2;
    }

    public void g(float f10) {
        ((Paint) this.f16600b).setAlpha((int) Math.rint(f10 * 255.0f));
    }

    public void h(int i10) {
        if (this.f16599a == i10) {
            return;
        }
        this.f16599a = i10;
        Paint paint = (Paint) this.f16600b;
        if (Build.VERSION.SDK_INT >= 29) {
            paint.setBlendMode(h0.x(i10));
        } else {
            paint.setXfermode(new PorterDuffXfermode(h0.F(i10)));
        }
    }

    public void i(long j10) {
        ((Paint) this.f16600b).setColor(h0.B(j10));
    }

    public void j(q1.k kVar) {
        this.f16602d = kVar;
        ((Paint) this.f16600b).setColorFilter(kVar != null ? kVar.f17541a : null);
    }

    public void k(int i10) {
        ((Paint) this.f16600b).setFilterBitmap(!(i10 == 0));
    }

    public void l(Shader shader) {
        this.f16601c = shader;
        ((Paint) this.f16600b).setShader(shader);
    }

    public void m(int i10) {
        ((Paint) this.f16600b).setStrokeCap(i10 == 2 ? Paint.Cap.SQUARE : i10 == 1 ? Paint.Cap.ROUND : i10 == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    public void n(int i10) {
        ((Paint) this.f16600b).setStrokeJoin(i10 == 0 ? Paint.Join.MITER : i10 == 2 ? Paint.Join.BEVEL : i10 == 1 ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    public void o(float f10) {
        ((Paint) this.f16600b).setStrokeWidth(f10);
    }

    public void p(int i10) {
        ((Paint) this.f16600b).setStyle(i10 == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public p(Paint paint) {
        this.f16600b = paint;
        this.f16599a = 3;
    }

    public p(Bundle bundle) {
        jc.l.e(bundle, "state");
        String string = bundle.getString("nav-entry-state:id");
        if (string != null) {
            this.f16600b = string;
            this.f16599a = ud.n.n("nav-entry-state:destination-id", bundle);
            this.f16601c = ud.n.p("nav-entry-state:args", bundle);
            this.f16602d = ud.n.p("nav-entry-state:saved-state", bundle);
            return;
        }
        ud.s.s("nav-entry-state:id");
        throw null;
    }

    public p(Context context) {
        this.f16600b = new Handler(Looper.getMainLooper());
        this.f16601c = new CopyOnWriteArrayList();
        this.f16602d = new Object();
        this.f16599a = 0;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new m2(2, this), intentFilter);
    }

    public p(int i10, String str, int i11, ArrayList arrayList, byte[] bArr) {
        List listUnmodifiableList;
        this.f16600b = str;
        this.f16599a = i11;
        if (arrayList == null) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.f16601c = listUnmodifiableList;
        this.f16602d = bArr;
    }
}
