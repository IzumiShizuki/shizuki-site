package s4;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f19452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f19453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f19454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u f19455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f19456e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f19457f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public h f19458g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public h0 f19459h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f f19460i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c0 f19461j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public h f19462k;

    public n(Context context, h hVar) {
        this.f19452a = context.getApplicationContext();
        hVar.getClass();
        this.f19454c = hVar;
        this.f19453b = new ArrayList();
    }

    public static void b(h hVar, f0 f0Var) {
        if (hVar != null) {
            hVar.t(f0Var);
        }
    }

    public final void a(h hVar) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f19453b;
            if (i10 >= arrayList.size()) {
                return;
            }
            hVar.t((f0) arrayList.get(i10));
            i10++;
        }
    }

    @Override // s4.h
    public final void close() {
        h hVar = this.f19462k;
        if (hVar != null) {
            try {
                hVar.close();
            } finally {
                this.f19462k = null;
            }
        }
    }

    @Override // s4.h
    public final long f(m mVar) {
        p4.c.i(this.f19462k == null);
        Uri uri = mVar.f19443a;
        String scheme = uri.getScheme();
        int i10 = p4.c0.f16548a;
        String scheme2 = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f19452a;
        if (zIsEmpty || "file".equals(scheme2)) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f19455d == null) {
                    u uVar = new u(false);
                    this.f19455d = uVar;
                    a(uVar);
                }
                this.f19462k = this.f19455d;
            } else {
                if (this.f19456e == null) {
                    b bVar = new b(context);
                    this.f19456e = bVar;
                    a(bVar);
                }
                this.f19462k = this.f19456e;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f19456e == null) {
                b bVar2 = new b(context);
                this.f19456e = bVar2;
                a(bVar2);
            }
            this.f19462k = this.f19456e;
        } else if ("content".equals(scheme)) {
            if (this.f19457f == null) {
                e eVar = new e(context);
                this.f19457f = eVar;
                a(eVar);
            }
            this.f19462k = this.f19457f;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            h hVar = this.f19454c;
            if (zEquals) {
                if (this.f19458g == null) {
                    try {
                        h hVar2 = (h) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.f19458g = hVar2;
                        a(hVar2);
                    } catch (ClassNotFoundException unused) {
                        p4.c.B("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e10) {
                        throw new RuntimeException("Error instantiating RTMP extension", e10);
                    }
                    if (this.f19458g == null) {
                        this.f19458g = hVar;
                    }
                }
                this.f19462k = this.f19458g;
            } else if ("udp".equals(scheme)) {
                if (this.f19459h == null) {
                    h0 h0Var = new h0();
                    this.f19459h = h0Var;
                    a(h0Var);
                }
                this.f19462k = this.f19459h;
            } else if ("data".equals(scheme)) {
                if (this.f19460i == null) {
                    f fVar = new f(false);
                    this.f19460i = fVar;
                    a(fVar);
                }
                this.f19462k = this.f19460i;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.f19461j == null) {
                    c0 c0Var = new c0(context);
                    this.f19461j = c0Var;
                    a(c0Var);
                }
                this.f19462k = this.f19461j;
            } else {
                this.f19462k = hVar;
            }
        }
        return this.f19462k.f(mVar);
    }

    @Override // s4.h
    public final Map p() {
        h hVar = this.f19462k;
        return hVar == null ? Collections.EMPTY_MAP : hVar.p();
    }

    @Override // m4.i
    public final int read(byte[] bArr, int i10, int i11) {
        h hVar = this.f19462k;
        hVar.getClass();
        return hVar.read(bArr, i10, i11);
    }

    @Override // s4.h
    public final void t(f0 f0Var) {
        f0Var.getClass();
        this.f19454c.t(f0Var);
        this.f19453b.add(f0Var);
        b(this.f19455d, f0Var);
        b(this.f19456e, f0Var);
        b(this.f19457f, f0Var);
        b(this.f19458g, f0Var);
        b(this.f19459h, f0Var);
        b(this.f19460i, f0Var);
        b(this.f19461j, f0Var);
    }

    @Override // s4.h
    public final Uri w() {
        h hVar = this.f19462k;
        if (hVar == null) {
            return null;
        }
        return hVar.w();
    }
}
